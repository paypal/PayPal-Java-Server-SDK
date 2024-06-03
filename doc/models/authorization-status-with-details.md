
# Authorization Status With Details

The status fields and status details for an authorized payment.

## Structure

`AuthorizationStatusWithDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AuthorizationStatus`](../../doc/models/authorization-status.md) | Optional | The status for the authorized payment. | AuthorizationStatus getStatus() | setStatus(AuthorizationStatus status) |
| `StatusDetails` | [`AuthorizationStatusDetails`](../../doc/models/authorization-status-details.md) | Optional | The details of the authorized payment status. | AuthorizationStatusDetails getStatusDetails() | setStatusDetails(AuthorizationStatusDetails statusDetails) |

## Example (as JSON)

```json
{
  "status": "VOIDED",
  "status_details": {
    "reason": "PENDING_REVIEW"
  }
}
```

