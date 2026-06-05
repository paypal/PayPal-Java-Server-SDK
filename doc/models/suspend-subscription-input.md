
# Suspend Subscription Input

Input structure for the method SuspendSubscriptionAsync

## Structure

`SuspendSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the subscription. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`SuspendSubscription`](../../doc/models/suspend-subscription.md) | Optional | - | SuspendSubscription getBody() | setBody(SuspendSubscription body) |

## Example

```java
import com.paypal.sdk.models.SuspendSubscription;
import com.paypal.sdk.models.SuspendSubscriptionInput;

SuspendSubscriptionInput suspendSubscriptionInput = new SuspendSubscriptionInput.Builder(
    "id0",
    "application/json"
)
.body(new SuspendSubscription.Builder(
        "reason8"
    )
    .build())
.build();
```

