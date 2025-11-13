
# Plan Details

The plan details.

## Structure

`PlanDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `String` | Optional | The ID for the product.<br><br>**Constraints**: *Minimum Length*: `22`, *Maximum Length*: `22`, *Pattern*: `^PROD-[A-Z0-9]*$` | String getProductId() | setProductId(String productId) |
| `Name` | `String` | Optional | The plan name.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getName() | setName(String name) |
| `Description` | `String` | Optional | The detailed description of the plan.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getDescription() | setDescription(String description) |
| `BillingCycles` | [`List<SubscriptionBillingCycle>`](../../doc/models/subscription-billing-cycle.md) | Optional | An array of billing cycles for trial billing and regular billing. A plan can have at most two trial cycles and only one regular cycle.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `12` | List<SubscriptionBillingCycle> getBillingCycles() | setBillingCycles(List<SubscriptionBillingCycle> billingCycles) |
| `PaymentPreferences` | [`PaymentPreferences`](../../doc/models/payment-preferences.md) | Optional | The payment preferences for a subscription. | PaymentPreferences getPaymentPreferences() | setPaymentPreferences(PaymentPreferences paymentPreferences) |
| `MerchantPreferences` | [`MerchantPreferences`](../../doc/models/merchant-preferences.md) | Optional | The merchant preferences for a subscription. | MerchantPreferences getMerchantPreferences() | setMerchantPreferences(MerchantPreferences merchantPreferences) |
| `Taxes` | [`Taxes`](../../doc/models/taxes.md) | Optional | The tax details. | Taxes getTaxes() | setTaxes(Taxes taxes) |
| `QuantitySupported` | `Boolean` | Optional | Indicates whether you can subscribe to this plan by providing a quantity for the goods or service.<br><br>**Default**: `false` | Boolean getQuantitySupported() | setQuantitySupported(Boolean quantitySupported) |

## Example (as JSON)

```json
{
  "quantity_supported": false,
  "product_id": "product_id6",
  "name": "name8",
  "description": "description2",
  "billing_cycles": [
    {
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
      },
      "frequency": {
        "interval_unit": "DAY",
        "interval_count": 94
      },
      "tenure_type": "REGULAR",
      "sequence": 8,
      "total_cycles": 198
    },
    {
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
      },
      "frequency": {
        "interval_unit": "DAY",
        "interval_count": 94
      },
      "tenure_type": "REGULAR",
      "sequence": 8,
      "total_cycles": 198
    },
    {
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
      },
      "frequency": {
        "interval_unit": "DAY",
        "interval_count": 94
      },
      "tenure_type": "REGULAR",
      "sequence": 8,
      "total_cycles": 198
    }
  ],
  "payment_preferences": {
    "auto_bill_outstanding": false,
    "setup_fee": {
      "currency_code": "currency_code8",
      "value": "value4"
    },
    "setup_fee_failure_action": "CONTINUE",
    "payment_failure_threshold": 104
  }
}
```

