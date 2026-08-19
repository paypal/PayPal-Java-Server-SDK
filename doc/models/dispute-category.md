
# Dispute Category

The condition that is covered for the transaction.

## Enumeration

`DisputeCategory`

## Fields

| Name | Description |
|  --- | --- |
| `ITEM_NOT_RECEIVED` | The payer paid for an item that they did not receive. |
| `UNAUTHORIZED_TRANSACTION` | The payer did not authorize the payment. |

## Example

```java
import com.paypal.sdk.models.DisputeCategory;

DisputeCategory disputeCategory = DisputeCategory.ITEM_NOT_RECEIVED;
```

