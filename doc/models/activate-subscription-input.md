
# Activate Subscription Input

Input structure for the method ActivateSubscriptionAsync

## Structure

`ActivateSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the subscription. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`ActivateSubscriptionRequest`](../../doc/models/activate-subscription-request.md) | Optional | - | ActivateSubscriptionRequest getBody() | setBody(ActivateSubscriptionRequest body) |

## Example

```java
import com.paypal.sdk.models.ActivateSubscriptionInput;
import com.paypal.sdk.models.ActivateSubscriptionRequest;

ActivateSubscriptionInput activateSubscriptionInput = new ActivateSubscriptionInput.Builder(
    "id0",
    "application/json"
)
.body(new ActivateSubscriptionRequest.Builder()
        .reason("reason8")
        .build())
.build();
```

