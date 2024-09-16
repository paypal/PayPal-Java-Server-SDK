/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.UnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.paypal.sdk.PaypalServerSDKClient;
import com.paypal.sdk.controllers.PaymentsController;
import com.paypal.sdk.exceptions.ErrorException;
import com.paypal.sdk.models.AuthorizationsCaptureInput;
import com.paypal.sdk.models.AuthorizationsReauthorizeInput;
import com.paypal.sdk.models.AuthorizationsVoidInput;
import com.paypal.sdk.models.CaptureRequest;
import com.paypal.sdk.models.CapturesRefundInput;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.RefundRequest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PaymentsControllerTest extends BaseControllerTest {

  /**
   * Client instance.
   */
  private static PaypalServerSDKClient client;

  /**
   * Controller instance (for all tests).
   */
  private static PaymentsController controller;
  /**
   * Non existent authorization id to test 404 status code.
   */
  private static String nonExistentAuthorizationId = "authorization_id8";
  /**
   * Non existent capture id to test 404 status code.
   */
  private static String nonExistentCaptureId = "capture_id";
  /**
   * Non existent refund id to test 404 status code.
   */
  private static String nonExistentRefundId = "refund_id";

  /**
   * Setup test class.
   */
  @BeforeClass
  public static void setUpClass() {
    client = createConfiguration();
    controller = client.getPaymentsController();
  }

  /**
   * Tear down test class.
   */
  @AfterClass
  public static void tearDownClass() {
    controller = null;
  }

  // Test Get Authorization for 404 status code
  @Test
  public void TestGetAuthorizationFor404StatusCode() throws Exception {

    // Call the API and Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.authorizationsGet(nonExistentAuthorizationId);
    });

    // Test response code
    assertEquals("Status is not 404", 404, exception.getResponseCode());
    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());
  }

  // Test Get Capture Refund for 404 status code
  @Test
  public void TestGetCaptureRefundFor404StatusCode() throws Exception {
    // Input for API call
    CapturesRefundInput input = new CapturesRefundInput();
    input.setCaptureId(
        nonExistentCaptureId);
    input.setPayPalRequestId(
        "");
    input.setPrefer(
        "return=minimal");

    // Call the API and Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.capturesRefund(input);
    });

    // Test response code
    assertEquals("Status is not 404",
        404, exception.getResponseCode());

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());

  }

  // Test Get Refund for 404 status code
  @Test
  public void TestGetRefundRequestFor404StatusCode() throws Exception {

    // Call the API and Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.refundsGet(nonExistentRefundId);
    });

    // Test response code
    assertEquals("Status is not 404", 404, exception.getResponseCode());
    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());
  }

  // Test Capture Authorization for 404 status code
  @Test
  public void TestCaptureAuthorizationFor404StatusCode() throws Exception {
    // Input for API call
    AuthorizationsCaptureInput authorizationsCaptureInput = new AuthorizationsCaptureInput.Builder(
        nonExistentAuthorizationId,
        null)
        .prefer("return=minimal")
        .body(new CaptureRequest.Builder()
            .finalCapture(false)
            .build())
        .build();

    // Call the API and Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.authorizationsCapture(authorizationsCaptureInput);
    });

    // Test response code
    assertEquals("Status is not 404",
        404, exception.getResponseCode());

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());

  }

  // Test ReAuthorization for 404 status code
  @Test
  public void TestReAuthorizationFor404StatusCode() throws Exception {
    // Input for API call
    AuthorizationsReauthorizeInput authorizationsReauthorizeInput = new AuthorizationsReauthorizeInput.Builder(
        nonExistentAuthorizationId,
        null)
        .prefer("return=representation")
        .build();

    // Call the API and Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.authorizationsReauthorize(authorizationsReauthorizeInput);
    });

    // Test response code
    assertEquals("Status is not 404",
        404, exception.getResponseCode());

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());

  }

  // Test Void Authorization for 404 status code
  @Test
  public void TestAuthorizationVoidFor404StatusCode() throws Exception {
    // Input for API call
    AuthorizationsVoidInput authorizationsVoidInput = new AuthorizationsVoidInput.Builder(
        nonExistentAuthorizationId)
        .prefer("return=minimal")
        .build();

    // Call the API and Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.authorizationsVoid(authorizationsVoidInput);
    });

    // Test response code
    assertEquals("Status is not 404",
        404, exception.getResponseCode());

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());

  }

  // Test Capture Refund for 404 status code
  @Test
  public void TestCaptureRefundFor404StatusCode() throws Exception {
    // Input for API call
    CapturesRefundInput capturesRefundInput = new CapturesRefundInput.Builder(
        nonExistentCaptureId,
        null)
        .payPalRequestId("")
        .prefer("return=minimal")
        .body(new RefundRequest.Builder()
            .amount(new Money.Builder(
                "USD",
                "1.44")
                .build())
            .noteToPayer("Defective product")
            .build())
        .build();

    // Call the API and Catch the exception
    ErrorException exception = assertThrows(ErrorException.class, () -> {
      controller.capturesRefund(capturesRefundInput);
    });

    // Test response code
    assertEquals("Status is not 404",
        404, exception.getResponseCode());

    // Test response body
    assertNotNull("Debug Id is not null", exception.getDebugId());
    assertNotNull("Details is not null", exception.getDetails());
    assertNotNull("Message is not null", exception.getMessage());
    assertNotNull("Name is not null", exception.getName());
    assertNotNull("Information Link is not null", exception.getLinks());
  }
}