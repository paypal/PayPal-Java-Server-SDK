
# One Time Charge

The one-time charge info at the time of checkout.

## Structure

`OneTimeCharge`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SetupFee` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getSetupFee() | setSetupFee(Money setupFee) |
| `ShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingAmount() | setShippingAmount(Money shippingAmount) |
| `Taxes` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTaxes() | setTaxes(Money taxes) |
| `ProductPrice` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getProductPrice() | setProductPrice(Money productPrice) |
| `Subtotal` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getSubtotal() | setSubtotal(Money subtotal) |
| `TotalAmount` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTotalAmount() | setTotalAmount(Money totalAmount) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.OneTimeCharge;

OneTimeCharge oneTimeCharge = new OneTimeCharge.Builder(
    new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build()
)
.setupFee(new Money.Builder(
        "currency_code8",
        "value4"
    )
    .build())
.shippingAmount(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
.taxes(new Money.Builder(
        "currency_code6",
        "value2"
    )
    .build())
.productPrice(new Money.Builder(
        "currency_code6",
        "value2"
    )
    .build())
.subtotal(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
.build();
```

