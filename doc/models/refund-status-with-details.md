
# Refund Status With Details

The refund status with details.

## Structure

`RefundStatusWithDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`RefundStatus`](../../doc/models/refund-status.md) | Optional | The status of the refund. | RefundStatus getStatus() | setStatus(RefundStatus status) |
| `StatusDetails` | [`RefundStatusDetails`](../../doc/models/refund-status-details.md) | Optional | The details of the refund status. | RefundStatusDetails getStatusDetails() | setStatusDetails(RefundStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "PENDING",
  "status_details": {
    "reason": "ECHECK"
  }
}
```

