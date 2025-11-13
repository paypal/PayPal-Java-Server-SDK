
# Update Pricing Scheme

The update pricing scheme request details.

## Structure

`UpdatePricingScheme`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingCycleSequence` | `int` | Required | The billing cycle sequence.<br><br>**Constraints**: `>= 1`, `<= 99` | int getBillingCycleSequence() | setBillingCycleSequence(int billingCycleSequence) |
| `PricingScheme` | [`SubscriptionPricingScheme`](../../doc/models/subscription-pricing-scheme.md) | Required | The pricing scheme details. | SubscriptionPricingScheme getPricingScheme() | setPricingScheme(SubscriptionPricingScheme pricingScheme) |

## Example (as JSON)

```json
{
  "billing_cycle_sequence": 99,
  "pricing_scheme": {
    "version": 10,
    "fixed_price": {
      "currency_code": "currency_code4",
      "value": "value0"
    },
    "pricing_model": "VOLUME",
    "tiers": [
      {
        "starting_quantity": "starting_quantity8",
        "ending_quantity": "ending_quantity6",
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        }
      },
      {
        "starting_quantity": "starting_quantity8",
        "ending_quantity": "ending_quantity6",
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        }
      },
      {
        "starting_quantity": "starting_quantity8",
        "ending_quantity": "ending_quantity6",
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        }
      }
    ],
    "create_time": "create_time4"
  }
}
```

