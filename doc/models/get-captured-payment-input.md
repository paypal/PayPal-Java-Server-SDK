
# Get Captured Payment Input

Input structure for the method GetCapturedPaymentAsync

## Structure

`GetCapturedPaymentInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CaptureId` | `String` | Required | The PayPal-generated ID for the captured payment for which to show details. | String getCaptureId() | setCaptureId(String captureId) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |

## Example

```java
import com.paypal.sdk.models.GetCapturedPaymentInput;

GetCapturedPaymentInput getCapturedPaymentInput = new GetCapturedPaymentInput.Builder(
    "capture_id2"
)
.paypalMockResponse("PayPal-Mock-Response0")
.build();
```

