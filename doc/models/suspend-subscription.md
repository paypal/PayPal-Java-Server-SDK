
# Suspend Subscription

The suspend subscription request details.

## Structure

`SuspendSubscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | `String` | Required | The reason for suspension of the Subscription.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128`, *Pattern*: `^.*$` | String getReason() | setReason(String reason) |

## Example (as JSON)

```json
{
  "reason": "reason4"
}
```

