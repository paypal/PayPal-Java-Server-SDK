
# Shipping Information

The shipping information.

## Structure

`ShippingInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The recipient's name.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getName() | setName(String name) |
| `Method` | `String` | Optional | The shipping method that is associated with this order.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getMethod() | setMethod(String method) |
| `Address` | [`SimplePostalAddressCoarseGrained`](../../doc/models/simple-postal-address-coarse-grained.md) | Optional | A simple postal address with coarse-grained fields. Do not use for an international address. Use for backward compatibility only. Does not contain phone. | SimplePostalAddressCoarseGrained getAddress() | setAddress(SimplePostalAddressCoarseGrained address) |
| `SecondaryShippingAddress` | [`SimplePostalAddressCoarseGrained`](../../doc/models/simple-postal-address-coarse-grained.md) | Optional | A simple postal address with coarse-grained fields. Do not use for an international address. Use for backward compatibility only. Does not contain phone. | SimplePostalAddressCoarseGrained getSecondaryShippingAddress() | setSecondaryShippingAddress(SimplePostalAddressCoarseGrained secondaryShippingAddress) |

## Example (as JSON)

```json
{
  "name": "name8",
  "method": "method2",
  "address": {
    "line1": "line18",
    "line2": "line20",
    "city": "city6",
    "state": "state2",
    "country_code": "country_code6",
    "postal_code": "postal_code8"
  },
  "secondary_shipping_address": {
    "line1": "line16",
    "line2": "line28",
    "city": "city4",
    "state": "state0",
    "country_code": "country_code4",
    "postal_code": "postal_code6"
  }
}
```

