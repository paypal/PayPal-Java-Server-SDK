
# Shipping Option

The options that the payee or merchant offers to the payer to ship or pick up their items.

## Structure

`ShippingOption`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | A unique ID that identifies a payer-selected shipping option.<br><br>**Constraints**: *Maximum Length*: `127` | String getId() | setId(String id) |
| `Label` | `String` | Required | A description that the payer sees, which helps them choose an appropriate shipping option. For example, `Free Shipping`, `USPS Priority Shipping`, `Expédition prioritaire USPS`, or `USPS yōuxiān fā huò`. Localize this description to the payer's locale.<br><br>**Constraints**: *Maximum Length*: `127` | String getLabel() | setLabel(String label) |
| `Type` | [`ShippingType`](../../doc/models/shipping-type.md) | Optional | A classification for the method of purchase fulfillment. | ShippingType getType() | setType(ShippingType type) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |
| `Selected` | `boolean` | Required | If the API request sets `selected = true`, it represents the shipping option that the payee or merchant expects to be pre-selected for the payer when they first view the `shipping.options` in the PayPal Checkout experience. As part of the response if a `shipping.option` contains `selected=true`, it represents the shipping option that the payer selected during the course of checkout with PayPal. Only one `shipping.option` can be set to `selected=true`. | boolean getSelected() | setSelected(boolean selected) |

## Example (as JSON)

```json
{
  "id": "id4",
  "label": "label4",
  "type": "SHIPPING",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "selected": false
}
```

