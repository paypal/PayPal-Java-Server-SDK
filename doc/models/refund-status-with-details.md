
# Refund Status with Details

The refund status with details.

## Structure

`RefundStatusWithDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`RefundStatus`](../../doc/models/refund-status.md) | Optional, Read-only | The status of the refund. | RefundStatus getStatus() | setStatus(RefundStatus status) |
| `StatusDetails` | [`RefundStatusDetails`](../../doc/models/refund-status-details.md) | Optional | The details of the refund status. | RefundStatusDetails getStatusDetails() | setStatusDetails(RefundStatusDetails statusDetails) |

## Example

```java
import com.paypal.sdk.models.RefundIncompleteReason;
import com.paypal.sdk.models.RefundStatusDetails;
import com.paypal.sdk.models.RefundStatusWithDetails;

RefundStatusWithDetails refundStatusWithDetails = new RefundStatusWithDetails.Builder()
    .statusDetails(new RefundStatusDetails.Builder()
        .reason(RefundIncompleteReason.ECHECK)
        .build())
    .build();
```

