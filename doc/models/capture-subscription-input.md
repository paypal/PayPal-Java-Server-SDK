
# Capture Subscription Input

Input structure for the method CaptureSubscriptionAsync

## Structure

`CaptureSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the subscription. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 72 hours. | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `Body` | [`CaptureSubscriptionRequest`](../../doc/models/capture-subscription-request.md) | Optional | - | CaptureSubscriptionRequest getBody() | setBody(CaptureSubscriptionRequest body) |

## Example

```java
import com.paypal.sdk.models.CaptureSubscriptionInput;
import com.paypal.sdk.models.CaptureSubscriptionRequest;
import com.paypal.sdk.models.CaptureType;
import com.paypal.sdk.models.Money;

CaptureSubscriptionInput captureSubscriptionInput = new CaptureSubscriptionInput.Builder(
    "id0",
    "application/json"
)
.paypalRequestId("PayPal-Request-Id6")
.body(new CaptureSubscriptionRequest.Builder(
        "note8",
        CaptureType.OUTSTANDING_BALANCE,
        new Money.Builder(
            "currency_code6",
            "value0"
        )
        .build()
    )
    .build())
.build();
```

