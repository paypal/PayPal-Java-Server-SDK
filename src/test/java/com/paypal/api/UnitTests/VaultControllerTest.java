package com.paypal.api.UnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.paypal.api.PayPalRESTAPIsClient;
import com.paypal.api.controllers.VaultController;
import com.paypal.api.exceptions.ApiException;
import com.paypal.api.exceptions.ErrorException;
import com.paypal.api.http.response.ApiResponse;
import com.paypal.api.models.CustomerPaymentTokensGetInput;
import com.paypal.api.models.PaymentTokenRequest;
import com.paypal.api.models.PaymentTokenRequestPaymentSource;
import com.paypal.api.models.PaymentTokensCreateInput;
import com.paypal.api.models.SetupTokenRequest;
import com.paypal.api.models.SetupTokenRequestPaymentSource;
import com.paypal.api.models.SetupTokensCreateInput;
import com.paypal.api.models.TokenType;
import com.paypal.api.models.VaultTokenRequest;

public class VaultControllerTest extends BaseControllerTest {
  /**
   * Client instance.
   */
  private static PayPalRESTAPIsClient client;

  /**
   * Controller instance (for all tests).
   */
  private static VaultController controller;

  /**
   * Non existent payment id to test 404 status code.
   */
  private static String nonExistentPaymentId = "payment-1";
  /**
   * Invalid id to test 400 status code.
   */
  private static String invalidId = "'dw";

  /**
   * Non existent customer id to test 404 status code.
   */
  private static String nonExistentCustomerId = "customer-1";

  /**
   * Setup test class.
   */
  @BeforeClass
  public static void setUpClass() {
    client = createConfiguration();
    controller = client.getVaultController();
  }

  /**
   * Tear down test class.
   */
  @AfterClass
  public static void tearDownClass() {
    controller = null;
  }

  // Test Create Setup Token for 400 status code
  @Test
  public void TestCreateSetupTokenFor400StatusCode() throws Throwable {
    // Create a setup token with invalid input
    SetupTokensCreateInput setupTokensCreateInput = new SetupTokensCreateInput.Builder(
        "",
        null,
        new SetupTokenRequest.Builder(
            new SetupTokenRequestPaymentSource.Builder()
                .build())
            .build())
        .build();

    // Call the api and catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.setupTokensCreate(setupTokensCreateInput);
    });

    // Test response code
    assertEquals("Status is not 400",
        400, exception.getResponseCode());

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());

  }

  // Test Create Payment Token for 404 status code
  @Test
  public void TestCreatePaymentTokenFor404StatusCode() throws Throwable {
    // Create a payment token with invalid input
    PaymentTokensCreateInput paymentTokensCreateInput = new PaymentTokensCreateInput.Builder(
        "",
        null,
        new PaymentTokenRequest.Builder(
            new PaymentTokenRequestPaymentSource.Builder()
                .build())
            .build())
        .build();

    // Call the api and catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.paymentTokensCreate(paymentTokensCreateInput);
    });

    // Test headers
    Map<String, String> headers = new LinkedHashMap<String, String>();
    headers.put("Content-Type", "application/json");

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());

  }

  // Test Create Payment Token for 400 status code
  @Test
  public void TestCreatePaymentTokenFor400StatusCode() throws Throwable {
    // Create request for payment token
    PaymentTokensCreateInput paymentTokensCreateInput = new PaymentTokensCreateInput.Builder(
        "",
        null,
        new PaymentTokenRequest.Builder(
            new PaymentTokenRequestPaymentSource.Builder()
                .token(new VaultTokenRequest.Builder(
                    nonExistentPaymentId,
                    TokenType.BILLING_AGREEMENT)
                    .build())
                .build())
            .build())
        .build();

    // Call the api and catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.paymentTokensCreate(paymentTokensCreateInput);
    });

    // Test response code
    assertEquals("Status is not 404",
        400, exception.getResponseCode());

    // Test headers
    Map<String, String> headers = new LinkedHashMap<String, String>();
    headers.put("Content-Type", "application/json");

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());

  }

  // Test Get Payment Token for 400 status code
  @Test
  public void TestGetSetupTokenFor400StatusCode() throws Throwable {

    // Call the api and catch the exception
    ApiException exception = assertThrows(ApiException.class, () -> {
      controller.setupTokensGet(invalidId);
    });

    // Test response code
    assertEquals("Status is not 400",
        400, exception.getResponseCode());

    // Test headers
    Map<String, String> headers = new LinkedHashMap<String, String>();
    headers.put("Content-Type", "application/json");

    // Test response body
    assertNotNull("Message is not null", exception.getMessage());
  }

  // Test Get Setup Token for 404 status code
  @Test
  public void TestGetSetupTokenFor404StatusCode() throws Throwable {

    // Call the api and catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.setupTokensGet(nonExistentPaymentId);
    });

    // Test headers
    Map<String, String> headers = new LinkedHashMap<String, String>();
    headers.put("Content-Type", "application/json");

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());
  }

  // Test Get Payment Token for 400 status code
  @Test
  public void TestGetPaymentTokenFor400StatusCode() throws Throwable {

    // Call the api and catch the exception
    ApiException exception = assertThrows(ApiException.class, () -> {
      controller.paymentTokensGet(invalidId);
    });

    // Test response code
    assertEquals("Status is not 400",
        400, exception.getResponseCode());

    // Test headers
    Map<String, String> headers = new LinkedHashMap<String, String>();
    headers.put("Content-Type", "application/json");

    assertNotNull("Message is not null", exception.getMessage());

  }

  // Test Get Customer Payment Token for 400 status code
  @Test
  public void TestGetPaymentTokenFor404StatusCode() throws Throwable {

    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.paymentTokensGet(nonExistentPaymentId);
    });

    // Test headers
    Map<String, String> headers = new LinkedHashMap<String, String>();
    headers.put("Content-Type", "application/json");

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());
  }

  // Test Get Customer Payment Token for 404 status code
  @Test
  public void TestGetCustomerPaymentTokenFor404StatusCode() throws Throwable {
    // Call the controller method
    CustomerPaymentTokensGetInput customerPaymentTokensGetInput = new CustomerPaymentTokensGetInput.Builder(
        nonExistentCustomerId)
        .pageSize(5)
        .page(1)
        .totalRequired(false)
        .build();

    // Call the api and catch the exception
    ApiException exception = assertThrows(ApiException.class, () -> {
      controller.customerPaymentTokensGet(customerPaymentTokensGetInput);
    });

    // Test headers
    Map<String, String> headers = new LinkedHashMap<String, String>();
    headers.put("Content-Type", "application/json");

    // Test response body
    assertNotNull("Message is not null", exception.getMessage());
  }

  // Test Get Customer Payment Token for 400 status code
  @Test
  public void TestGetCustomerPaymentTokenFor400StatusCode() throws Throwable {
    // Call the controller method
    CustomerPaymentTokensGetInput customerPaymentTokensGetInput = new CustomerPaymentTokensGetInput.Builder(
        invalidId)
        .pageSize(5)
        .page(1)
        .totalRequired(false)
        .build();

    // Call the API method and get the response
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.customerPaymentTokensGet(customerPaymentTokensGetInput);
    });

    // Test response code
    assertEquals("Status is not 400",
        400, exception.getResponseCode());

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());
  }

  // Test Delete Payment Token for 404 status code
  @Test
  public void TestDeletePaymentTokenFor204StatusCode() throws Throwable {
    ApiResponse<Void> pmt = controller.paymentTokensDelete(nonExistentPaymentId);

    // Test status code
    assertEquals("Status is not 204",
        204, pmt.getStatusCode());

  }
}