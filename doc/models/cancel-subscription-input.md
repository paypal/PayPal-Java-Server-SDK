
# Cancel Subscription Input

Input structure for the method CancelSubscriptionAsync

## Structure

`CancelSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the subscription. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`CancelSubscriptionRequest`](../../doc/models/cancel-subscription-request.md) | Optional | - | CancelSubscriptionRequest getBody() | setBody(CancelSubscriptionRequest body) |

## Example

```java
import com.paypal.sdk.models.CancelSubscriptionInput;
import com.paypal.sdk.models.CancelSubscriptionRequest;

CancelSubscriptionInput cancelSubscriptionInput = new CancelSubscriptionInput.Builder(
    "id0",
    "application/json"
)
.body(new CancelSubscriptionRequest.Builder(
        "reason8"
    )
    .build())
.build();
```

