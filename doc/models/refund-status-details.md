
# Refund Status Details

The details of the refund status.

## Structure

`RefundStatusDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Reason` | [`RefundIncompleteReason`](../../doc/models/refund-incomplete-reason.md) | Optional | The reason why the refund has the `PENDING` or `FAILED` status. | RefundIncompleteReason getReason() | setReason(RefundIncompleteReason reason) |

## Example

```java
import com.paypal.sdk.models.RefundIncompleteReason;
import com.paypal.sdk.models.RefundStatusDetails;

RefundStatusDetails refundStatusDetails = new RefundStatusDetails.Builder()
    .reason(RefundIncompleteReason.ECHECK)
    .build();
```

