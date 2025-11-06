
# Cancel Subscription Request

The cancel subscription request details.

## Structure

`CancelSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | The reason for the cancellation of a subscription.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128`, *Pattern*: `^.*$` | String getReason() | setReason(String reason) |

## Example (as JSON)

```json
{
  "reason": "reason8"
}
```

