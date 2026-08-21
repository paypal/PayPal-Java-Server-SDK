
# Tax Amount

The tax levied by a government on the purchase of goods or services.

## Structure

`TaxAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTaxAmount() | setTaxAmount(Money taxAmount) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.TaxAmount;

TaxAmount taxAmount = new TaxAmount.Builder()
    .taxAmount(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
    .build();
```

