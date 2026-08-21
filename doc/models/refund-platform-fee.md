
# Refund Platform Fee

The platform or partner fee, commission, or brokerage fee that is associated with the transaction. Not a separate or isolated transaction leg from the external perspective. The platform fee is limited in scope and is always associated with the original payment for the purchase unit.

## Structure

`RefundPlatformFee`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.RefundPlatformFee;

RefundPlatformFee refundPlatformFee = new RefundPlatformFee.Builder(
    new Money.Builder(
        "currency_code6",
        "value0"
    )
    .build()
)
.build();
```

