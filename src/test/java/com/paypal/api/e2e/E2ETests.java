package com.paypal.api.e2e;

import com.paypal.sdk.PaypalServerSDKClient;
import com.paypal.sdk.controllers.OrdersController;
import com.paypal.sdk.controllers.PaymentsController;
import com.paypal.sdk.controllers.VaultController;
import com.paypal.sdk.exceptions.ApiException;
import com.paypal.sdk.exceptions.ErrorException;
import com.paypal.sdk.http.response.ApiResponse;
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.AmountBreakdown;
import com.paypal.sdk.models.AmountWithBreakdown;
import com.paypal.sdk.models.AuthorizationStatus;
import com.paypal.sdk.models.AuthorizationsCaptureInput;
import com.paypal.sdk.models.AuthorizationsVoidInput;
import com.paypal.sdk.models.CaptureRequest;
import com.paypal.sdk.models.CaptureStatus;
import com.paypal.sdk.models.CapturedPayment;
import com.paypal.sdk.models.CapturesRefundInput;
import com.paypal.sdk.models.CardAttributes;
import com.paypal.sdk.models.CardExperienceContext;
import com.paypal.sdk.models.CardRequest;
import com.paypal.sdk.models.CardVerification;
import com.paypal.sdk.models.CardVerificationMethod;
import com.paypal.sdk.models.CheckoutPaymentIntent;
import com.paypal.sdk.models.ConfirmOrderRequest;
import com.paypal.sdk.models.Item;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.OrderRequest;
import com.paypal.sdk.models.OrderStatus;
import com.paypal.sdk.models.OrderTrackerItem;
import com.paypal.sdk.models.OrderTrackerRequest;
import com.paypal.sdk.models.OrdersAuthorizeInput;
import com.paypal.sdk.models.OrdersCaptureInput;
import com.paypal.sdk.models.OrdersConfirmInput;
import com.paypal.sdk.models.OrdersCreateInput;
import com.paypal.sdk.models.OrdersGetInput;
import com.paypal.sdk.models.OrdersTrackCreateInput;
import com.paypal.sdk.models.OrdersTrackersPatchInput;
import com.paypal.sdk.models.Patch;
import com.paypal.sdk.models.PatchOp;
import com.paypal.sdk.models.OrdersPatchInput;
import com.paypal.sdk.models.PayPalExperienceLandingPage;
import com.paypal.sdk.models.PayPalExperienceUserAction;
import com.paypal.sdk.models.PayPalWallet;
import com.paypal.sdk.models.PayPalWalletExperienceContext;
import com.paypal.sdk.models.PayeePaymentMethodPreference;
import com.paypal.sdk.models.PaymentAuthorization;
import com.paypal.sdk.models.PaymentSource;
import com.paypal.sdk.models.PaymentTokenRequest;
import com.paypal.sdk.models.PaymentTokenRequestPaymentSource;
import com.paypal.sdk.models.PaymentTokenResponse;
import com.paypal.sdk.models.PaymentTokensCreateInput;
import com.paypal.sdk.models.Order;
import com.paypal.sdk.models.OrderAuthorizeResponse;
import com.paypal.sdk.models.OrderCaptureRequest;
import com.paypal.sdk.models.OrderCaptureRequestPaymentSource;
import com.paypal.sdk.models.PurchaseUnitRequest;
import com.paypal.sdk.models.Refund;
import com.paypal.sdk.models.RefundStatus;
import com.paypal.sdk.models.ShipmentCarrier;
import com.paypal.sdk.models.ShippingDetails;
import com.paypal.sdk.models.ShippingPreference;
import com.paypal.sdk.models.UPCType;
import com.paypal.sdk.models.UniversalProductCode;
import com.paypal.sdk.models.SetupTokenRequest;
import com.paypal.sdk.models.SetupTokenRequestPaymentSource;
import com.paypal.sdk.models.SetupTokenResponse;
import com.paypal.sdk.models.SetupTokensCreateInput;
import com.paypal.sdk.models.TokenRequestType;
import com.paypal.sdk.models.VaultExperienceContext;
import com.paypal.sdk.models.VaultPayPalWalletRequest;
import com.paypal.sdk.models.VaultTokenRequest;
import com.paypal.sdk.utilities.JsonValue;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class E2ETests extends E2ETestsBase {
  private static PaypalServerSDKClient client;
  private static OrdersController controller;
  private static PaymentsController paymentsController;
  private static VaultController vaultController;
  private static PlaywrightFlows playwrightFlows;

  @BeforeEach
  public void setUpClass() throws Exception {
    client = createConfiguration();
    controller = client.getOrdersController();
    paymentsController = client.getPaymentsController();
    vaultController = client.getVaultController();
    playwrightFlows = new PlaywrightFlows();
  }

  @AfterEach
  public void tearDownClass() {
    controller = null;
    paymentsController = null;
    vaultController = null;
    playwrightFlows = null;
  }

  // Refund Flow
  @Test
  void refundFlow() throws ApiException, IOException {
    String randomString = String.valueOf(Math.floor(Math.random() * 1000000));

    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "100.00")
                        .build())
                    .referenceId("d9f80740-38f0-11e8-b467-0ed5f89f718b")
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .landingPage(PayPalExperienceLandingPage.LOGIN)
                            .build())
                    .build())
                .build())
            .build())
        .payPalRequestId(randomString)
        .payPalPartnerAttributionId("PayPal-Partner-Attribution-Id")
        .payPalClientMetadataId("PayPal-Client-Metadata-Id")
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> order = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(order.getStatusCode(), 200);

    // Get the approval URL
    String paypalRequestId = order.getResult().getLinks().get(1).getHref();

    // Complete the payment
    assertTrue(playwrightFlows.completePayment(paypalRequestId));

    // Capture the order
    OrdersCaptureInput ordersCaptureInput = new OrdersCaptureInput.Builder(
        order.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> captureOrder = controller.ordersCapture(ordersCaptureInput);
    // Verify the status code
    assertEquals(captureOrder.getStatusCode(), 201);

    // Refund the order
    String captureId = captureOrder.getResult().getPurchaseUnits().get(0).getPayments().getCaptures().get(0)
        .getId();
    CapturesRefundInput capturesRefundInput = new CapturesRefundInput.Builder(
        captureId,
        null)
        .payPalRequestId(randomString)
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Refund> refund = paymentsController.capturesRefund(capturesRefundInput);
    // Verify the status code
    assertEquals(refund.getStatusCode(), 201);

    String refundId = refund.getResult().getId();

    // Get the refund
    ApiResponse<Refund> getRefund = paymentsController.refundsGet(refundId);
    // Verify the status code
    assertEquals(getRefund.getStatusCode(), 200);
    // Verify the refund status
    assertEquals(getRefund.getResult().getStatus(), RefundStatus.COMPLETED);

  }

  // Confirm Order Flow
  @Test
  void Secure3DAuthenticationSingleStep() throws ApiException, IOException {
    String randomString = String.valueOf(Math.floor(Math.random() * 999999));

    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "10.00")
                        .breakdown(new AmountBreakdown.Builder()
                            .itemTotal(new Money.Builder(
                                "USD",
                                "10.00")
                                .build())
                            .build())
                        .build())
                    .description("Camera Shop")
                    .customId("testcustom_id")
                    .invoiceId("invoice_number"
                        .concat(randomString))
                    .items(Arrays.asList(
                        new Item.Builder(
                            "Levis 501 Selvedge STF",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("5158936")
                            .build(),
                        new Item.Builder(
                            "T-Shirt",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("1457432")
                            .build()))
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .card(new CardRequest.Builder()
                    .name("John Doe")
                    .number("4868719995056080")
                    .expiry("2027-02")
                    .billingAddress(new Address.Builder(
                        "US")
                        .addressLine1("2211 N First Street")
                        .adminArea2("San Jose")
                        .adminArea1("CA")
                        .postalCode("95131")
                        .build())
                    .attributes(new CardAttributes.Builder()
                        .verification(new CardVerification.Builder()
                            .method(CardVerificationMethod.SCA_ALWAYS)
                            .build())
                        .build())
                    .experienceContext(
                        new CardExperienceContext.Builder()
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .build())
                    .build())
                .build())
            .build())
        .payPalRequestId(randomString)
        .payPalPartnerAttributionId("PayPal-Partner-Attribution-Id")
        .payPalClientMetadataId("PayPal-Client-Metadata-Id")
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> order = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(order.getStatusCode(), 201);

    // Get the approval URL
    String paypalRequestId = order.getResult().getLinks().get(1).getHref();

    // Create a playwright Flows object
    assertTrue(playwrightFlows.completeHeliosVerification(paypalRequestId, true));

    // Capture the order
    OrdersCaptureInput ordersCaptureInput = new OrdersCaptureInput.Builder(
        order.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> capturedOrder = controller.ordersCapture(ordersCaptureInput);
    // Verify the status code
    assertEquals(capturedOrder.getStatusCode(), 201);

    // Get the order
    OrdersGetInput ordersGetInput = new OrdersGetInput.Builder(
        order.getResult().getId())
        .build();

    // Calling the API
    ApiResponse<Order> getOrder = controller.ordersGet(ordersGetInput);
    // Verify the status code
    assertEquals(getOrder.getStatusCode(), 200);
    // Verify the order status
    assertEquals(getOrder.getResult().getStatus(), OrderStatus.COMPLETED);

  }

  // Secure 3D Authentication Multi-Step
  @Test
  void secure3DAuthenticationMultiStep() throws ApiException, IOException {
    String randomString = String.valueOf(Math.floor(Math.random() * 1000000));
    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "10.00")
                        .breakdown(new AmountBreakdown.Builder()
                            .itemTotal(new Money.Builder(
                                "USD",
                                "10.00")
                                .build())
                            .build())
                        .build())
                    .description("Camera Shop")
                    .customId("testcustom_id")
                    .invoiceId("invoic_number"
                        .concat(randomString))
                    .items(Arrays.asList(
                        new Item.Builder(
                            "Levis 501 Selvedge STF",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("5158936")
                            .build(),
                        new Item.Builder(
                            "T-Shirt",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("1457432")
                            .build()))
                    .build()))
            .build())
        .payPalRequestId(randomString)
        .payPalPartnerAttributionId("PayPal-Partner-Attribution-Id")
        .payPalClientMetadataId("PayPal-Client-Metadata-Id")
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> order = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(order.getStatusCode(), 201);
    // Capture the order
    OrdersCaptureInput ordersCaptureInput = new OrdersCaptureInput.Builder(
        order.getResult().getId(),
        null)
        .prefer("return=representation")
        .payPalClientMetadataId("PayPal-Client-Metadata-Id")
        .payPalRequestId(randomString)
        .body(new OrderCaptureRequest.Builder()
            .paymentSource(new OrderCaptureRequestPaymentSource.Builder()
                .card(new CardRequest.Builder()
                    .name("John Doe")
                    .number("4868719460707704")
                    .expiry("2027-02")
                    .billingAddress(new Address.Builder(
                        "US")
                        .addressLine1("2211 N First Street")
                        .adminArea2("San Jose")
                        .adminArea1("CA")
                        .postalCode("95131")
                        .build())
                    .attributes(new CardAttributes.Builder()
                        .verification(new CardVerification.Builder()
                            .method(CardVerificationMethod.SCA_ALWAYS)
                            .build())
                        .build())
                    .experienceContext(
                        new CardExperienceContext.Builder()
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .build())
                    .build())
                .build())
            .build())
        .build();

    // Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.ordersCapture(ordersCaptureInput);
    });
    // Verify the status code
    assertEquals(exception.getResponseCode(), 422);
    // complete helios verification
    assertTrue(playwrightFlows.completeHeliosVerification(exception.getLinks().get(0).getHref(), false));
    // Get the order
    OrdersGetInput ordersGetInput = new OrdersGetInput.Builder(
        order.getResult().getId())
        .build();

    // Calling the API
    ApiResponse<Order> getOrder = controller.ordersGet(ordersGetInput);

    // Verify the status code
    assertEquals(getOrder.getStatusCode(), 200);
    // verifty get order has property payment source
    assertNotNull(getOrder.getResult().getPaymentSource());

    // Capture the order
    OrdersCaptureInput ordersCaptureInputAfterVerifying = new OrdersCaptureInput.Builder(
        order.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> captureOrder = controller.ordersCapture(ordersCaptureInputAfterVerifying);

    // Verify the status code
    assertEquals(captureOrder.getStatusCode(), 201);

    // assert order status is completed
    assertEquals(captureOrder.getResult().getStatus(), OrderStatus.COMPLETED);

  }

  // payment method without purchase flow
  @Test
  void paymentMethodwithoutpurchaseflow() throws ApiException, IOException {
    String randomString = String.valueOf(Math.floor(Math.random() * 1000000));

    // Create a setup token
    SetupTokensCreateInput setupTokensCreateInput = new SetupTokensCreateInput.Builder(
        randomString,
        null,
        new SetupTokenRequest.Builder(
            new SetupTokenRequestPaymentSource.Builder()
                .paypal(new VaultPayPalWalletRequest.Builder()
                    .description("Description for PayPal to be shown to PayPal payer")
                    .permitMultiplePaymentTokens(true)
                    .usageType("MERCHANT")
                    .customerType("CONSUMER")
                    .experienceContext(
                        new VaultExperienceContext.Builder()
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .build())
                    .build())
                .build())
            .build())
        .build();

    // Calling the API
    ApiResponse<SetupTokenResponse> setupresponse = vaultController
        .setupTokensCreate(setupTokensCreateInput);
    // Verify the status code
    assertEquals(setupresponse.getStatusCode(), 201);
    // Save the payment method
    assertTrue(playwrightFlows.savePaymentMethod(setupresponse.getResult().getLinks().get(1).getHref()));
    // create payment token
    PaymentTokensCreateInput paymentTokensCreateInput = new PaymentTokensCreateInput.Builder(
        randomString,
        null,
        new PaymentTokenRequest.Builder(
            new PaymentTokenRequestPaymentSource.Builder()
                .token(new VaultTokenRequest.Builder(
                    setupresponse.getResult().getId(),
                    TokenRequestType.SETUP_TOKEN)
                    .build())
                .build())
            .build())
        .build();
    // Calling the API
    ApiResponse<PaymentTokenResponse> pmtToken = vaultController
        .paymentTokensCreate(paymentTokensCreateInput);
    // Verify the status code
    assertEquals(pmtToken.getStatusCode(), 201);
    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "10.00")
                        .build())
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .vaultId(pmtToken.getResult().getId())
                    .build())
                .build())
            .build())
        .payPalRequestId(randomString)
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> order = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(order.getStatusCode(), 201);

    // Get the setup token
    String setupTokenId = setupresponse.getResult().getId();
    // Get the payment token
    String paymentTokenId = pmtToken.getResult().getId();
    // calling the API
    ApiResponse<SetupTokenResponse> setup = vaultController.setupTokensGet(setupTokenId);
    // Verify the status code
    assertEquals(setup.getStatusCode(), 200);
    // Verify the status
    assertEquals(setup.getResult().getStatus(), "VAULTED");
    // calling the API
    ApiResponse<PaymentTokenResponse> getPmtToken = vaultController.paymentTokensGet(paymentTokenId);
    // Verify the status code
    assertEquals(getPmtToken.getStatusCode(), 200);
    // Verify payment token is not null
    assertNotNull(getPmtToken);

  }

  // Payment Method with Purchase Flow
  @Test
  void paymentMethodWithPuchaseFlow() throws ApiException, IOException {
    String randomString = String.valueOf(Math.floor(Math.random() * 1000000));
    // Create order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "10.00")
                        .breakdown(new AmountBreakdown.Builder()
                            .itemTotal(new Money.Builder(
                                "USD",
                                "10.0")
                                .build())
                            .shipping(new Money.Builder(
                                "USD",
                                "0.0")
                                .build())
                            .taxTotal(new Money.Builder(
                                "USD",
                                "0")
                                .build())
                            .build())
                        .build())
                    .description("Camera Shop")
                    .items(Arrays.asList(
                        new Item.Builder(
                            "Levis 501 Selvedge STF",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("5158936")
                            .build(),
                        new Item.Builder(
                            "T-Shirt",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("1457432")
                            .build()))
                    .shipping(new ShippingDetails.Builder()
                        .address(new Address.Builder(
                            "US")
                            .addressLine1("123 Main Street")
                            .adminArea2("San Jose")
                            .adminArea1("CA")
                            .postalCode("95131")
                            .build())
                        .build())
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .build())
                    .build())
                .build())
            .build())
        .payPalRequestId(randomString)
        .payPalPartnerAttributionId("PayPal-Partner-Attribution-Id")
        .payPalClientMetadataId("PayPal-Client-Metadata-Id")
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> order = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(order.getStatusCode(), 200);
    // Complete the payment
    assertTrue(playwrightFlows.completePayment(order.getResult().getLinks().get(1).getHref()));

    // Capture the order
    OrdersCaptureInput ordersCaptureInput = new OrdersCaptureInput.Builder(
        order.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> captureOrder = controller.ordersCapture(ordersCaptureInput);

    // Verify the status code
    assertEquals(captureOrder.getStatusCode(), 201);

  }

  // Patch Order Flow
  @Test
  void patchOrderFlow() throws ApiException, IOException {
    String randomString = String.valueOf(Math.random() * 1000000);

    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "10.00")
                        .breakdown(new AmountBreakdown.Builder()
                            .itemTotal(new Money.Builder(
                                "USD",
                                "10.0")
                                .build())
                            .shipping(new Money.Builder(
                                "USD",
                                "0.0")
                                .build())
                            .taxTotal(new Money.Builder(
                                "USD",
                                "0")
                                .build())
                            .build())
                        .build())
                    .description("Camera Shop")
                    .items(Arrays.asList(
                        new Item.Builder(
                            "Levis 501 Selvedge STF",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("5158936")
                            .build(),
                        new Item.Builder(
                            "T-Shirt",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("1457432")
                            .build()))
                    .shipping(new ShippingDetails.Builder()
                        .address(new Address.Builder(
                            "US")
                            .addressLine1("123 Main Street")
                            .adminArea2("San Jose")
                            .adminArea1("CA")
                            .postalCode("95131")
                            .build())
                        .build())
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .build())
                    .build())
                .build())
            .build())
        .payPalRequestId(randomString)
        .payPalPartnerAttributionId("PayPal-Partner-Attribution-Id")
        .payPalClientMetadataId("PayPal-Client-Metadata-Id")
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> order = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(order.getStatusCode(), 200);

    // Complete the payment
    assertTrue(playwrightFlows.completePayment(order.getResult().getLinks().get(1).getHref()));

    Map<String, String> addressMap = new HashMap<>();
    addressMap.put("address_line_1", "1234 Main St");
    addressMap.put("address_line_2", "Floor 6");
    addressMap.put("admin_area_2", "San Francisco");
    addressMap.put("admin_area_1", "CA");
    addressMap.put("postal_code", "94107");
    addressMap.put("country_code", "US");

    OrdersPatchInput ordersPatchInput = new OrdersPatchInput.Builder(
        order.getResult().getId(),
        null)
        .body(Arrays.asList(
            new Patch.Builder(
                PatchOp.REPLACE)
                .path("/purchase_units/@reference_id=='default'/shipping/address")
                .value(JsonValue.fromObject(
                    addressMap))
                .build()))
        .build();

    // Calling the API
    ApiResponse<Void> patchOrder = controller.ordersPatch(ordersPatchInput);
    // Verify the status code
    assertEquals(patchOrder.getStatusCode(), 204);
    // Get the order
    OrdersGetInput ordersGetInput = new OrdersGetInput.Builder(
        order.getResult().getId())
        .build();
    // Calling the API
    ApiResponse<Order> getOrder = controller.ordersGet(ordersGetInput);
    // Verify the status code
    assertEquals(getOrder.getStatusCode(), 200);
    // verify if the address is updated
    assertEquals(getOrder.getResult().getPurchaseUnits().get(0).getShipping().getAddress()
        .getAddressLine1(),
        "1234 Main St");

  }

  // Authorize and Capture Flow
  @Test
  void authorizeAndCaptureFlow() throws ApiException, IOException {
    String randomString = String.valueOf(Math.random() * 1000000);

    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.AUTHORIZE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "25.00")
                        .breakdown(new AmountBreakdown.Builder()
                            .itemTotal(new Money.Builder(
                                "USD",
                                "25.00")
                                .build())
                            .shipping(new Money.Builder(
                                "USD",
                                "0")
                                .build())
                            .taxTotal(new Money.Builder(
                                "USD",
                                "0")
                                .build())
                            .build())
                        .build())
                    .description("Clothing Shop")
                    .items(Arrays.asList(
                        new Item.Builder(
                            "Levis 501",
                            new Money.Builder(
                                "USD",
                                "25.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("5158936")
                            .build()))
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .landingPage(PayPalExperienceLandingPage.LOGIN)
                            .build())
                    .build())
                .build())
            .build())
        .payPalRequestId(randomString)
        .payPalPartnerAttributionId("PayPal-Partner-Attribution-Id")
        .payPalClientMetadataId("PayPal-Client-Metadata-Id")
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<Order> order = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(order.getStatusCode(), 200);
    // Complete the payment
    assertTrue(playwrightFlows.completePayment(order.getResult().getLinks().get(1).getHref()));

    // Authorize the order
    OrdersAuthorizeInput ordersAuthorizeInput = new OrdersAuthorizeInput.Builder(
        order.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();

    // Calling the API
    ApiResponse<OrderAuthorizeResponse> authorizeOrder = controller.ordersAuthorize(ordersAuthorizeInput);
    // Verify the status code
    assertEquals(authorizeOrder.getStatusCode(), 201);

    // Capture Authorization
    AuthorizationsCaptureInput authorizationsCaptureInput = new AuthorizationsCaptureInput.Builder(
        authorizeOrder.getResult().getPurchaseUnits().get(0).getPayments().getAuthorizations()
            .get(0)
            .getId(),
        null)
        .prefer("return=representation")
        .body(new CaptureRequest.Builder()
            .finalCapture(false)
            .build())
        .build();

    // Calling the API
    ApiResponse<CapturedPayment> captured = paymentsController
        .authorizationsCapture(authorizationsCaptureInput);

    // Verify the status code
    assertEquals(captured.getStatusCode(), 201);

    // Get Authorization
    ApiResponse<PaymentAuthorization> authorize = paymentsController
        .authorizationsGet(authorizeOrder.getResult().getPurchaseUnits().get(0).getPayments()
            .getAuthorizations().get(0).getId());

    // Verify the status code
    assertEquals(authorize.getStatusCode(), 200);
    // Verify the authorization status
    assertEquals(authorize.getResult().getStatus(), AuthorizationStatus.CAPTURED);
    // Get Capture
    String captureId = captured.getResult().getId();
    // Get the capture
    ApiResponse<CapturedPayment> capture = paymentsController.capturesGet(captureId);
    // Verify the status code
    assertEquals(capture.getStatusCode(), 200);
    // Verify the capture status
    assertEquals(capture.getResult().getStatus(), CaptureStatus.COMPLETED);
  }

  // Standard Checkout Flow
  @Test
  void standardCheckoutFlow() throws ApiException, IOException {
    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "100.00")
                        .build())
                    .referenceId("d9f80740-38f0-11e8-b467-0ed5f89f718b")
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .landingPage(PayPalExperienceLandingPage.LOGIN)
                            .build())
                    .build())
                .build())
            .build())
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> orderDetails = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(orderDetails.getStatusCode(), 200);
    // Get the approval URL
    String url = orderDetails.getResult().getLinks().get(1).getHref();

    // Complete the payment
    assertTrue(playwrightFlows.completePayment(url));

    // Capture the order
    OrdersCaptureInput ordersCaptureInput = new OrdersCaptureInput.Builder(
        orderDetails.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> captureOrder = controller.ordersCapture(ordersCaptureInput);
    // Verify the status code
    assertEquals(captureOrder.getStatusCode(), 201);

    // Get Order Details
    OrdersGetInput ordersGetInput = new OrdersGetInput.Builder(
        orderDetails.getResult().getId())
        .build();
    // Calling the API
    ApiResponse<Order> getOrder = controller.ordersGet(ordersGetInput);
    // Verify the status code
    assertEquals(getOrder.getStatusCode(), 200);

  }

  // Void Authorization Flow
  @Test
  void voidAuthorizationFlow() throws ApiException, IOException {
    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.AUTHORIZE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "25.00")
                        .breakdown(new AmountBreakdown.Builder()
                            .itemTotal(new Money.Builder(
                                "USD",
                                "25.00")
                                .build())
                            .shipping(new Money.Builder(
                                "USD",
                                "0")
                                .build())
                            .taxTotal(new Money.Builder(
                                "USD",
                                "0")
                                .build())
                            .build())
                        .build())
                    .description("Clothing Shop")
                    .items(Arrays.asList(
                        new Item.Builder(
                            "Levis 501",
                            new Money.Builder(
                                "USD",
                                "25.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("5158936")
                            .build()))
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .landingPage(PayPalExperienceLandingPage.LOGIN)
                            .build())
                    .build())
                .build())
            .build())
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> orderDetails = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(orderDetails.getStatusCode(), 200);
    // Get the approval URL
    String url = orderDetails.getResult().getLinks().get(1).getHref();

    // Complete the payment
    assertTrue(playwrightFlows.completePayment(url));

    // Authorize the order
    OrdersAuthorizeInput ordersAuthorizeInput = new OrdersAuthorizeInput.Builder(
        orderDetails.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<OrderAuthorizeResponse> authResponse = controller.ordersAuthorize(ordersAuthorizeInput);
    // Verify the status code
    assertEquals(authResponse.getStatusCode(), 201);

    // Void Authorization
    AuthorizationsVoidInput authorizationsVoidInput = new AuthorizationsVoidInput.Builder(
        authResponse.getResult().getPurchaseUnits().get(0).getPayments().getAuthorizations()
            .get(0).getId())
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<PaymentAuthorization> authVoid = paymentsController
        .authorizationsVoid(authorizationsVoidInput);
    // Verify the status code
    assertEquals(authVoid.getStatusCode(), 200);

  }

  // Confirm Order Flow
  @Test
  void confirmOrderFlow() throws ApiException, IOException {
    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "100.00")
                        .build())
                    .referenceId("d9f80740-38f0-11e8-b467-0ed5f89f718b")
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .landingPage(PayPalExperienceLandingPage.LOGIN)
                            .build())
                    .build())
                .build())
            .build())
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> orderDetails = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(orderDetails.getStatusCode(), 200);
    // Get the approval URL
    String url = orderDetails.getResult().getLinks().get(1).getHref();

    // Complete the payment
    assertTrue(playwrightFlows.completePayment(url));

    // Capture the order
    OrdersConfirmInput ordersConfirmInput = new OrdersConfirmInput.Builder(
        orderDetails.getResult().getId(),
        null)
        .prefer("return=representation")
        .body(new ConfirmOrderRequest.Builder(
            new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .emailAddress("customer@example.com")
                    .name(new Name.Builder()
                        .givenName("John")
                        .surname("Doe")
                        .build())
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .brandName("EXAMPLE INC")
                            .locale("en-US")
                            .shippingPreference(
                                ShippingPreference.SET_PROVIDED_ADDRESS)
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .landingPage(PayPalExperienceLandingPage.LOGIN)
                            .userAction(PayPalExperienceUserAction.PAY_NOW)
                            .paymentMethodPreference(
                                PayeePaymentMethodPreference.IMMEDIATE_PAYMENT_REQUIRED)
                            .build())
                    .build())
                .build())
            .build())
        .build();
    // Calling the API
    ApiResponse<Order> confirmOrder = controller.ordersConfirm(ordersConfirmInput);
    // Verify the status code
    assertEquals(confirmOrder.getStatusCode(), 200);

  }

  // Add Shipping Tracker Information to Order Flow
  @Test
  void addShippingTrackerFlow() throws ApiException, IOException {
    // Create an order
    OrdersCreateInput ordersCreateInput = new OrdersCreateInput.Builder(
        null,
        new OrderRequest.Builder(
            CheckoutPaymentIntent.CAPTURE,
            Arrays.asList(
                new PurchaseUnitRequest.Builder(
                    new AmountWithBreakdown.Builder(
                        "USD",
                        "10.00")
                        .breakdown(new AmountBreakdown.Builder()
                            .itemTotal(new Money.Builder(
                                "USD",
                                "10.0")
                                .build())
                            .shipping(new Money.Builder(
                                "USD",
                                "0.0")
                                .build())
                            .taxTotal(new Money.Builder(
                                "USD",
                                "0")
                                .build())
                            .build())
                        .build())
                    .description("Camera Shop")
                    .items(Arrays.asList(
                        new Item.Builder(
                            "Levis 501 Selvedge STF",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("5158936")
                            .build(),
                        new Item.Builder(
                            "T-Shirt",
                            new Money.Builder(
                                "USD",
                                "5.00")
                                .build(),
                            "1")
                            .tax(new Money.Builder(
                                "USD",
                                "0.00")
                                .build())
                            .sku("1457432")
                            .build()))
                    .shipping(new ShippingDetails.Builder()
                        .address(new Address.Builder(
                            "US")
                            .addressLine1("123 Main Street")
                            .adminArea2("San Jose")
                            .adminArea1("CA")
                            .postalCode("95131")
                            .build())
                        .build())
                    .build()))
            .paymentSource(new PaymentSource.Builder()
                .paypal(new PayPalWallet.Builder()
                    .experienceContext(
                        new PayPalWalletExperienceContext.Builder()
                            .locale("en-US")
                            .returnUrl("https://example.com/returnUrl")
                            .cancelUrl("https://example.com/cancelUrl")
                            .build())
                    .build())
                .build())
            .build())
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> orderDetails = controller.ordersCreate(ordersCreateInput);
    // Verify the status code
    assertEquals(orderDetails.getStatusCode(), 200);
    // Get the approval URL
    String url = orderDetails.getResult().getLinks().get(1).getHref();

    // Complete the payment
    assertTrue(playwrightFlows.completePayment(url));

    // Capture the order
    OrdersCaptureInput ordersCaptureInput = new OrdersCaptureInput.Builder(
        orderDetails.getResult().getId(),
        null)
        .prefer("return=representation")
        .build();
    // Calling the API
    ApiResponse<Order> captureResponse = controller.ordersCapture(ordersCaptureInput);
    // Verify the status code
    assertEquals(captureResponse.getStatusCode(), 201);

    // create track order
    OrdersTrackCreateInput ordersTrackCreateInput = new OrdersTrackCreateInput.Builder(
        orderDetails.getResult().getId(),
        null,
        new OrderTrackerRequest.Builder(
            captureResponse.getResult().getPurchaseUnits().get(0).getPayments()
                .getCaptures().get(0)
                .getId())
            .trackingNumber("443844607820")
            .carrier(ShipmentCarrier.FEDEX)
            .notifyPayer(false)
            .items(Arrays.asList(
                new OrderTrackerItem.Builder()
                    .name("T-Shirt")
                    .quantity("1")
                    .sku("sku02")
                    .url("https://www.example.com/example")
                    .imageUrl("https://www.example.com/example.jpg")
                    .upc(new UniversalProductCode.Builder(
                        UPCType.UPCA,
                        "upc001")
                        .build())
                    .build()))
            .build())
        .build();
    // Calling the API
    ApiResponse<Order> orderTrackResponse = controller.ordersTrackCreate(ordersTrackCreateInput);
    // Verify the status code
    assertEquals(orderTrackResponse.getStatusCode(), 201);

    // update track order
    OrdersTrackersPatchInput ordersTrackersPatchInput = new OrdersTrackersPatchInput.Builder(
        orderDetails.getResult().getId(),
        orderTrackResponse.getResult().getPurchaseUnits().get(0).getShipping().getTrackers()
            .get(0).getId(),
        null)
        .body(Arrays.asList(
            new Patch.Builder(
                PatchOp.REPLACE)
                .path("/notify_payer")
                .value(JsonValue.fromBoolean(true))
                .build()))
        .build();
    // Calling the API
    ApiResponse<Void> patchOrderTrack = controller.ordersTrackersPatch(ordersTrackersPatchInput);
    // Verify the status code
    assertEquals(patchOrderTrack.getStatusCode(), 204);

  }

}
