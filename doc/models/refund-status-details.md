
# Refund Status Details

The details of the refund status.

## Structure

`RefundStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`RefundIncompleteReason`](../../doc/models/refund-incomplete-reason.md) | Optional | The reason why the refund has the `PENDING` or `FAILED` status. | RefundIncompleteReason getReason() | setReason(RefundIncompleteReason reason) |

## Example (as JSON)

```json
{
  "reason": "ECHECK"
}
```

