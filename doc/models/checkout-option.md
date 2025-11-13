
# Checkout Option

A checkout option as a name-and-value pair.

## Structure

`CheckoutOption`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CheckoutOptionName` | `String` | Optional | The checkout option name, such as `color` or `texture`.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `200`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getCheckoutOptionName() | setCheckoutOptionName(String checkoutOptionName) |
| `CheckoutOptionValue` | `String` | Optional | The checkout option value. For example, the checkout option `color` might be `blue` or `red` while the checkout option `texture` might be `smooth` or `rippled`.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `200`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getCheckoutOptionValue() | setCheckoutOptionValue(String checkoutOptionValue) |

## Example (as JSON)

```json
{
  "checkout_option_name": "checkout_option_name6",
  "checkout_option_value": "checkout_option_value0"
}
```

