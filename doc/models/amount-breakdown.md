
# Amount Breakdown

The breakdown of the amount. Breakdown provides details such as total item amount, total tax amount, shipping, handling, insurance, and discounts, if any.

## Structure

`AmountBreakdown`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ItemTotal` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getItemTotal() | setItemTotal(Money itemTotal) |
| `Shipping` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShipping() | setShipping(Money shipping) |
| `Handling` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getHandling() | setHandling(Money handling) |
| `TaxTotal` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTaxTotal() | setTaxTotal(Money taxTotal) |
| `Insurance` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getInsurance() | setInsurance(Money insurance) |
| `ShippingDiscount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingDiscount() | setShippingDiscount(Money shippingDiscount) |
| `Discount` | [`Money`](../../doc/models/money.md) | Optional | The discount amount and currency code. For list of supported currencies and decimal precision, see the PayPal REST APIs Currency Codes. | Money getDiscount() | setDiscount(Money discount) |

## Example

```java
import com.paypal.sdk.models.AmountBreakdown;
import com.paypal.sdk.models.Money;

AmountBreakdown amountBreakdown = new AmountBreakdown.Builder()
    .itemTotal(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
    .shipping(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
    .handling(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
    .taxTotal(new Money.Builder(
        "currency_code4",
        "value0"
    )
    .build())
    .insurance(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
    .build();
```

