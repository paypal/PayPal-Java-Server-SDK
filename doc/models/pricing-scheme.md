
# Pricing Scheme

The pricing scheme details.

## Structure

`PricingScheme`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Price` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getPrice() | setPrice(Money price) |
| `PricingModel` | [`PricingModel`](../../doc/models/pricing-model.md) | Required | The pricing model for the billing cycle.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | PricingModel getPricingModel() | setPricingModel(PricingModel pricingModel) |
| `ReloadThresholdAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getReloadThresholdAmount() | setReloadThresholdAmount(Money reloadThresholdAmount) |

## Example (as JSON)

```json
{
  "price": {
    "currency_code": "currency_code8",
    "value": "value4"
  },
  "pricing_model": "FIXED",
  "reload_threshold_amount": {
    "currency_code": "currency_code0",
    "value": "value6"
  }
}
```

