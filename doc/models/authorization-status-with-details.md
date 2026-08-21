
# Authorization Status with Details

The status fields and status details for an authorized payment.

## Structure

`AuthorizationStatusWithDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AuthorizationStatus`](../../doc/models/authorization-status.md) | Optional, Read-only | The status for the authorized payment. | AuthorizationStatus getStatus() | setStatus(AuthorizationStatus status) |
| `StatusDetails` | [`AuthorizationStatusDetails`](../../doc/models/authorization-status-details.md) | Optional | The details of the authorized payment status. | AuthorizationStatusDetails getStatusDetails() | setStatusDetails(AuthorizationStatusDetails statusDetails) |

## Example

```java
import com.paypal.sdk.models.AuthorizationIncompleteReason;
import com.paypal.sdk.models.AuthorizationStatusDetails;
import com.paypal.sdk.models.AuthorizationStatusWithDetails;

AuthorizationStatusWithDetails authorizationStatusWithDetails = new AuthorizationStatusWithDetails.Builder()
    .statusDetails(new AuthorizationStatusDetails.Builder()
        .reason(AuthorizationIncompleteReason.PENDING_REVIEW)
        .build())
    .build();
```

