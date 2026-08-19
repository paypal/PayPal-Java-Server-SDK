
# Venmo Vault Response

The details about a saved venmo payment source.

## Structure

`VenmoVaultResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the saved payment source.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getId() | setId(String id) |
| `Status` | [`VenmoVaultResponseStatus`](../../doc/models/venmo-vault-response-status.md) | Optional | The vault status.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | VenmoVaultResponseStatus getStatus() | setStatus(VenmoVaultResponseStatus status) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related HATEOAS links.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `Customer` | [`CustomerInformation`](../../doc/models/customer-information.md) | Optional | This object represents a merchant’s customer, allowing them to store contact details, and track all payments associated with the same customer. | CustomerInformation getCustomer() | setCustomer(CustomerInformation customer) |

## Example

```java
import com.paypal.sdk.models.CustomerInformation;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.VenmoVaultResponse;
import com.paypal.sdk.models.VenmoVaultResponseStatus;

VenmoVaultResponse venmoVaultResponse = new VenmoVaultResponse.Builder()
    .id("id4")
    .status(VenmoVaultResponseStatus.APPROVED)
    .customer(new CustomerInformation.Builder()
        .id("id0")
        .emailAddress("email_address2")
        .phone(new PhoneWithType.Builder(
            new PhoneNumber.Builder(
                "national_number6"
            )
            .build()
        )
        .phoneType(PhoneType.OTHER)
        .build())
        .name(new Name.Builder()
            .givenName("given_name2")
            .surname("surname8")
            .build())
        .build())
    .build();
```

