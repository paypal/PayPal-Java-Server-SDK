
# Authorization Status Details

The details of the authorized payment status.

## Structure

`AuthorizationStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`AuthorizationIncompleteReason`](../../doc/models/authorization-incomplete-reason.md) | Optional | The reason why the authorized status is `PENDING`.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[A-Z_]+$` | AuthorizationIncompleteReason getReason() | setReason(AuthorizationIncompleteReason reason) |

## Example (as JSON)

```json
{
  "reason": "PENDING_REVIEW"
}
```

