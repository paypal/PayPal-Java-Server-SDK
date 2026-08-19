
# Apple Pay Attributes

Additional attributes associated with apple pay.

## Structure

`ApplePayAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`CustomerInformation`](../../doc/models/customer-information.md) | Optional | This object represents a merchant’s customer, allowing them to store contact details, and track all payments associated with the same customer. | CustomerInformation getCustomer() | setCustomer(CustomerInformation customer) |
| `Vault` | [`VaultInstruction`](../../doc/models/vault-instruction.md) | Optional | Base vaulting specification. The object can be extended for specific use cases within each payment_source that supports vaulting. | VaultInstruction getVault() | setVault(VaultInstruction vault) |

## Example

```java
import com.paypal.sdk.models.ApplePayAttributes;
import com.paypal.sdk.models.CustomerInformation;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.StoreInVaultInstruction;
import com.paypal.sdk.models.VaultInstruction;

ApplePayAttributes applePayAttributes = new ApplePayAttributes.Builder()
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
    .vault(new VaultInstruction.Builder(
        StoreInVaultInstruction.ON_SUCCESS
    )
    .build())
    .build();
```

