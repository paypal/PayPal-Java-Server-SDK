
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

## Example

```java
import com.paypal.sdk.models.ShippingInformation;
import com.paypal.sdk.models.SimplePostalAddressCoarseGrained;

ShippingInformation shippingInformation = new ShippingInformation.Builder()
    .name("name2")
    .method("method4")
    .address(new SimplePostalAddressCoarseGrained.Builder(
        "line18",
        "city6",
        "country_code6"
    )
    .line2("line20")
    .state("state2")
    .postalCode("postal_code8")
    .build())
    .secondaryShippingAddress(new SimplePostalAddressCoarseGrained.Builder(
        "line16",
        "city4",
        "country_code4"
    )
    .line2("line28")
    .state("state0")
    .postalCode("postal_code6")
    .build())
    .build();
```

