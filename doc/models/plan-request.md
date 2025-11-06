
# Plan Request

The create plan request details.

## Structure

`PlanRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `String` | Required | The ID of the product created through Catalog Products API.<br><br>**Constraints**: *Minimum Length*: `22`, *Maximum Length*: `22`, *Pattern*: `^PROD-[A-Z0-9]*$` | String getProductId() | setProductId(String productId) |
| `Name` | `String` | Required | The plan name.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getName() | setName(String name) |
| `Status` | [`PlanRequestStatus`](../../doc/models/plan-request-status.md) | Optional | The initial state of the plan. Allowed input values are CREATED and ACTIVE.<br><br>**Default**: `PlanRequestStatus.ACTIVE`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | PlanRequestStatus getStatus() | setStatus(PlanRequestStatus status) |
| `Description` | `String` | Optional | The detailed description of the plan.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getDescription() | setDescription(String description) |
| `BillingCycles` | [`List<SubscriptionBillingCycle>`](../../doc/models/subscription-billing-cycle.md) | Required | An array of billing cycles for trial billing and regular billing. A plan can have at most two trial cycles and only one regular cycle.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `12` | List<SubscriptionBillingCycle> getBillingCycles() | setBillingCycles(List<SubscriptionBillingCycle> billingCycles) |
| `PaymentPreferences` | [`PaymentPreferences`](../../doc/models/payment-preferences.md) | Required | The payment preferences for a subscription. | PaymentPreferences getPaymentPreferences() | setPaymentPreferences(PaymentPreferences paymentPreferences) |
| `MerchantPreferences` | [`MerchantPreferences`](../../doc/models/merchant-preferences.md) | Optional | The merchant preferences for a subscription. | MerchantPreferences getMerchantPreferences() | setMerchantPreferences(MerchantPreferences merchantPreferences) |
| `Taxes` | [`Taxes`](../../doc/models/taxes.md) | Optional | The tax details. | Taxes getTaxes() | setTaxes(Taxes taxes) |
| `QuantitySupported` | `Boolean` | Optional | Indicates whether you can subscribe to this plan by providing a quantity for the goods or service.<br><br>**Default**: `false` | Boolean getQuantitySupported() | setQuantitySupported(Boolean quantitySupported) |

## Example (as JSON)

```json
{
  "product_id": "product_id2",
  "name": "name2",
  "status": "ACTIVE",
  "billing_cycles": [
    {
      "frequency": {
        "interval_unit": "DAY",
        "interval_count": 1
      },
      "tenure_type": "REGULAR",
      "sequence": 8,
      "total_cycles": 1,
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
  ],
  "payment_preferences": {
    "auto_bill_outstanding": true,
    "setup_fee_failure_action": "CANCEL",
    "payment_failure_threshold": 0,
    "setup_fee": {
      "currency_code": "currency_code8",
      "value": "value4"
    }
  },
  "quantity_supported": false,
  "description": "description8",
  "merchant_preferences": {
    "return_url": "return_url4",
    "cancel_url": "cancel_url6"
  },
  "taxes": {
    "percentage": "percentage8",
    "inclusive": false
  }
}
```

