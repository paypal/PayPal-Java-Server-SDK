
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
| `Discount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getDiscount() | setDiscount(Money discount) |

## Example (as JSON)

```json
{
  "item_total": {
    "currency_code": "currency_code0",
    "value": "value6"
  },
  "shipping": {
    "currency_code": "currency_code0",
    "value": "value6"
  },
  "handling": {
    "currency_code": "currency_code2",
    "value": "value8"
  },
  "tax_total": {
    "currency_code": "currency_code4",
    "value": "value0"
  },
  "insurance": {
    "currency_code": "currency_code2",
    "value": "value8"
  }
}
```

