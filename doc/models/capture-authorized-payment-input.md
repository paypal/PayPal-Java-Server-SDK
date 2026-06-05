
# Capture Authorized Payment Input

Input structure for the method CaptureAuthorizedPaymentAsync

## Structure

`CaptureAuthorizedPaymentInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorizationId` | `String` | Required | The PayPal-generated ID for the authorized payment to capture. | String getAuthorizationId() | setAuthorizationId(String authorizationId) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 45 days. | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` | String getPrefer() | setPrefer(String prefer) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion). Note:For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Body` | [`CaptureRequest`](../../doc/models/capture-request.md) | Optional | - | CaptureRequest getBody() | setBody(CaptureRequest body) |

## Example

```java
import com.paypal.sdk.models.CaptureAuthorizedPaymentInput;
import com.paypal.sdk.models.CapturePaymentInstruction;
import com.paypal.sdk.models.CaptureRequest;
import com.paypal.sdk.models.DisbursementMode;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PayeeBase;
import com.paypal.sdk.models.PlatformFee;
import java.util.Arrays;

CaptureAuthorizedPaymentInput captureAuthorizedPaymentInput = new CaptureAuthorizedPaymentInput.Builder(
    "authorization_id8",
    "application/json"
)
.paypalMockResponse("PayPal-Mock-Response0")
.paypalRequestId("PayPal-Request-Id6")
.prefer("return=minimal")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.body(new CaptureRequest.Builder()
        .amount(new Money.Builder(
            "currency_code6",
            "value0"
        )
        .build())
        .invoiceId("invoice_id6")
        .finalCapture(false)
        .paymentInstruction(new CapturePaymentInstruction.Builder()
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
            .payeeReceivableFxRateId("payee_receivable_fx_rate_id0")
            .build())
        .noteToPayer("note_to_payer8")
        .build())
.build();
```

