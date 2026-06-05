
# Refund Captured Payment Input

Input structure for the method RefundCapturedPaymentAsync

## Structure

`RefundCapturedPaymentInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CaptureId` | `String` | Required | The PayPal-generated ID for the captured payment to refund. | String getCaptureId() | setCaptureId(String captureId) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 45 days. | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` | String getPrefer() | setPrefer(String prefer) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion). Note:For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Body` | [`RefundRequest`](../../doc/models/refund-request.md) | Optional | - | RefundRequest getBody() | setBody(RefundRequest body) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.RefundCapturedPaymentInput;
import com.paypal.sdk.models.RefundPaymentInstruction;
import com.paypal.sdk.models.RefundPlatformFee;
import com.paypal.sdk.models.RefundRequest;
import java.util.Arrays;

RefundCapturedPaymentInput refundCapturedPaymentInput = new RefundCapturedPaymentInput.Builder(
    "capture_id2",
    "application/json"
)
.paypalMockResponse("PayPal-Mock-Response0")
.paypalRequestId("PayPal-Request-Id6")
.prefer("return=minimal")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.body(new RefundRequest.Builder()
        .amount(new Money.Builder(
            "currency_code6",
            "value0"
        )
        .build())
        .customId("custom_id4")
        .invoiceId("invoice_id6")
        .noteToPayer("note_to_payer8")
        .paymentInstruction(new RefundPaymentInstruction.Builder()
            .platformFees(Arrays.asList(
                new RefundPlatformFee.Builder(
                    new Money.Builder(
                        "currency_code6",
                        "value0"
                    )
                    .build()
                )
                .build(),
                new RefundPlatformFee.Builder(
                    new Money.Builder(
                        "currency_code6",
                        "value0"
                    )
                    .build()
                )
                .build(),
                new RefundPlatformFee.Builder(
                    new Money.Builder(
                        "currency_code6",
                        "value0"
                    )
                    .build()
                )
                .build()
            ))
            .build())
        .build())
.build();
```

