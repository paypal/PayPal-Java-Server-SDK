
# Activate Subscription Request

The activate subscription request details.

## Structure

`ActivateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Optional | The reason for activation of a subscription. Required to reactivate the subscription.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128`, *Pattern*: `^.*$` | String getReason() | setReason(String reason) |

## Example

```java
import com.paypal.sdk.models.ActivateSubscriptionRequest;

ActivateSubscriptionRequest activateSubscriptionRequest = new ActivateSubscriptionRequest.Builder()
    .reason("reason6")
    .build();
```

