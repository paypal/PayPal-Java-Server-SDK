
# Venmo Wallet Attributes Response

Additional attributes associated with the use of a Venmo Wallet.

## Structure

`VenmoWalletAttributesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Vault` | [`VenmoVaultResponse`](../../doc/models/venmo-vault-response.md) | Optional | The details about a saved venmo payment source. | VenmoVaultResponse getVault() | setVault(VenmoVaultResponse vault) |

## Example

```java
import com.paypal.sdk.models.CustomerInformation;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.VenmoVaultResponse;
import com.paypal.sdk.models.VenmoVaultResponseStatus;
import com.paypal.sdk.models.VenmoWalletAttributesResponse;

VenmoWalletAttributesResponse venmoWalletAttributesResponse = new VenmoWalletAttributesResponse.Builder()
    .vault(new VenmoVaultResponse.Builder()
        .id("id6")
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
        .build())
    .build();
```

