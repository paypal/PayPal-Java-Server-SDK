
# Order Request

The order request details.

## Structure

`OrderRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Intent` | [`CheckoutPaymentIntent`](../../doc/models/checkout-payment-intent.md) | Required | The intent to either capture payment immediately or authorize a payment for an order after order creation. | CheckoutPaymentIntent getIntent() | setIntent(CheckoutPaymentIntent intent) |
| `ProcessingInstruction` | [`ProcessingInstruction`](../../doc/models/processing-instruction.md) | Optional | The instruction to process an order. | ProcessingInstruction getProcessingInstruction() | setProcessingInstruction(ProcessingInstruction processingInstruction) |
| `Payer` | [`Payer`](../../doc/models/payer.md) | Optional | DEPRECATED. The customer is also known as the payer. The Payer object was intended to only be used with the `payment_source.paypal` object. In order to make this design more clear, the details in the `payer` object are now available under `payment_source.paypal`. Please use `payment_source.paypal`. | Payer getPayer() | setPayer(Payer payer) |
| `PurchaseUnits` | [`List<PurchaseUnitRequest>`](../../doc/models/purchase-unit-request.md) | Required | An array of purchase units. Each purchase unit establishes a contract between a payer and the payee. Each purchase unit represents either a full or partial order that the payer intends to purchase from the payee.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<PurchaseUnitRequest> getPurchaseUnits() | setPurchaseUnits(List<PurchaseUnitRequest> purchaseUnits) |
| `PaymentSource` | [`PaymentSource`](../../doc/models/payment-source.md) | Optional | The payment source definition. | PaymentSource getPaymentSource() | setPaymentSource(PaymentSource paymentSource) |
| `ApplicationContext` | [`OrderApplicationContext`](../../doc/models/order-application-context.md) | Optional | Customizes the payer experience during the approval process for the payment with PayPal. Note: Partners and Marketplaces might configure brand_name and shipping_preference during partner account setup, which overrides the request values. | OrderApplicationContext getApplicationContext() | setApplicationContext(OrderApplicationContext applicationContext) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.AmountBreakdown;
import com.paypal.sdk.models.AmountWithBreakdown;
import com.paypal.sdk.models.BancontactPaymentRequest;
import com.paypal.sdk.models.BlikExperienceContext;
import com.paypal.sdk.models.BlikLevel0PaymentObject;
import com.paypal.sdk.models.BlikOneClickPaymentRequest;
import com.paypal.sdk.models.BlikPaymentRequest;
import com.paypal.sdk.models.CardRequest;
import com.paypal.sdk.models.CheckoutPaymentIntent;
import com.paypal.sdk.models.DisbursementMode;
import com.paypal.sdk.models.ExperienceContext;
import com.paypal.sdk.models.ExperienceContextShippingPreference;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.OrderApplicationContext;
import com.paypal.sdk.models.OrderApplicationContextLandingPage;
import com.paypal.sdk.models.OrderApplicationContextShippingPreference;
import com.paypal.sdk.models.OrderApplicationContextUserAction;
import com.paypal.sdk.models.OrderRequest;
import com.paypal.sdk.models.PayeeBase;
import com.paypal.sdk.models.Payer;
import com.paypal.sdk.models.PaymentInstruction;
import com.paypal.sdk.models.PaymentSource;
import com.paypal.sdk.models.PaypalWallet;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.PlatformFee;
import com.paypal.sdk.models.ProcessingInstruction;
import com.paypal.sdk.models.PurchaseUnitRequest;
import com.paypal.sdk.models.Token;
import com.paypal.sdk.models.TokenType;
import java.util.Arrays;

OrderRequest orderRequest = new OrderRequest.Builder(
    CheckoutPaymentIntent.CAPTURE,
    Arrays.asList(
        new PurchaseUnitRequest.Builder(
            new AmountWithBreakdown.Builder(
                "currency_code6",
                "value0"
            )
            .breakdown(new AmountBreakdown.Builder()
                    .itemTotal(new Money.Builder(
                        "currency_code0",
                        "value6"
                    )
                    .build())
                    .shipping(new Money.Builder(
                        "currency_code0",
                        "value6"
                    )
                    .build())
                    .handling(new Money.Builder(
                        "currency_code2",
                        "value8"
                    )
                    .build())
                    .taxTotal(new Money.Builder(
                        "currency_code4",
                        "value0"
                    )
                    .build())
                    .insurance(new Money.Builder(
                        "currency_code2",
                        "value8"
                    )
                    .build())
                    .build())
            .build()
        )
        .referenceId("reference_id4")
        .payee(new PayeeBase.Builder()
                .emailAddress("email_address4")
                .merchantId("merchant_id6")
                .build())
        .paymentInstruction(new PaymentInstruction.Builder()
                .platformFees(Arrays.asList(
                    new PlatformFee.Builder(
                        new Money.Builder(
                            "currency_code6",
                            "value0"
                        )
                        .build()
                    )
                    .payee(new PayeeBase.Builder()
                            .emailAddress("email_address4")
                            .merchantId("merchant_id6")
                            .build())
                    .build(),
                    new PlatformFee.Builder(
                        new Money.Builder(
                            "currency_code6",
                            "value0"
                        )
                        .build()
                    )
                    .payee(new PayeeBase.Builder()
                            .emailAddress("email_address4")
                            .merchantId("merchant_id6")
                            .build())
                    .build(),
                    new PlatformFee.Builder(
                        new Money.Builder(
                            "currency_code6",
                            "value0"
                        )
                        .build()
                    )
                    .payee(new PayeeBase.Builder()
                            .emailAddress("email_address4")
                            .merchantId("merchant_id6")
                            .build())
                    .build()
                ))
                .disbursementMode(DisbursementMode.INSTANT)
                .payeePricingTierId("payee_pricing_tier_id2")
                .payeeReceivableFxRateId("payee_receivable_fx_rate_id0")
                .build())
        .description("description6")
        .customId("custom_id4")
        .build()
    )
)
.processingInstruction(ProcessingInstruction.ORDER_COMPLETE_ON_PAYMENT_APPROVAL)
.payer(new Payer.Builder()
        .emailAddress("email_address6")
        .payerId("payer_id6")
        .name(new Name.Builder()
            .givenName("given_name2")
            .surname("surname8")
            .build())
        .phone(new PhoneWithType.Builder(
            new PhoneNumber.Builder(
                "national_number6"
            )
            .build()
        )
        .phoneType(PhoneType.OTHER)
        .build())
        .birthDate("birth_date4")
        .build())
.paymentSource(new PaymentSource.Builder()
        .card(new CardRequest.Builder()
            .name("name6")
            .number("number6")
            .expiry("expiry4")
            .securityCode("security_code8")
            .billingAddress(new Address.Builder(
                "country_code8"
            )
            .addressLine1("address_line_12")
            .addressLine2("address_line_28")
            .adminArea2("admin_area_28")
            .adminArea1("admin_area_14")
            .postalCode("postal_code0")
            .build())
            .build())
        .token(new Token.Builder(
            "id6",
            TokenType.BILLING_AGREEMENT
        )
        .build())
        .paypal(new PaypalWallet.Builder()
            .vaultId("vault_id0")
            .emailAddress("email_address0")
            .name(new Name.Builder()
                .givenName("given_name2")
                .surname("surname8")
                .build())
            .phone(new PhoneWithType.Builder(
                new PhoneNumber.Builder(
                    "national_number6"
                )
                .build()
            )
            .phoneType(PhoneType.OTHER)
            .build())
            .birthDate("birth_date8")
            .build())
        .bancontact(new BancontactPaymentRequest.Builder(
            "name0",
            "country_code0"
        )
        .experienceContext(new ExperienceContext.Builder()
                .brandName("brand_name2")
                .locale("locale6")
                .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
                .returnUrl("return_url4")
                .cancelUrl("cancel_url6")
                .build())
        .build())
        .blik(new BlikPaymentRequest.Builder(
            "name2",
            "country_code2"
        )
        .email("email4")
        .experienceContext(new BlikExperienceContext.Builder()
                .brandName("brand_name2")
                .locale("locale6")
                .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
                .returnUrl("return_url4")
                .cancelUrl("cancel_url6")
                .build())
        .level0(new BlikLevel0PaymentObject.Builder(
                "auth_code8"
            )
            .build())
        .oneClick(new BlikOneClickPaymentRequest.Builder(
                "consumer_reference2"
            )
            .authCode("auth_code0")
            .aliasLabel("alias_label6")
            .aliasKey("alias_key4")
            .build())
        .build())
        .build())
.applicationContext(new OrderApplicationContext.Builder()
        .brandName("brand_name8")
        .locale("locale2")
        .landingPage(OrderApplicationContextLandingPage.BILLING)
        .shippingPreference(OrderApplicationContextShippingPreference.SET_PROVIDED_ADDRESS)
        .userAction(OrderApplicationContextUserAction.CONTINUE)
        .build())
.build();
```

