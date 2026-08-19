
# Venmo Wallet Additional Attributes

Additional attributes associated with the use of this Venmo Wallet.

## Structure

`VenmoWalletAdditionalAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`VenmoWalletCustomerInformation`](../../doc/models/venmo-wallet-customer-information.md) | Optional | The details about a customer in PayPal's system of record. | VenmoWalletCustomerInformation getCustomer() | setCustomer(VenmoWalletCustomerInformation customer) |
| `Vault` | [`VenmoWalletVaultAttributes`](../../doc/models/venmo-wallet-vault-attributes.md) | Optional | Resource consolidating common request and response attirbutes for vaulting Venmo Wallet. | VenmoWalletVaultAttributes getVault() | setVault(VenmoWalletVaultAttributes vault) |

## Example

```java
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.StoreInVaultInstruction;
import com.paypal.sdk.models.VenmoPaymentTokenCustomerType;
import com.paypal.sdk.models.VenmoPaymentTokenUsagePattern;
import com.paypal.sdk.models.VenmoPaymentTokenUsageType;
import com.paypal.sdk.models.VenmoWalletAdditionalAttributes;
import com.paypal.sdk.models.VenmoWalletCustomerInformation;
import com.paypal.sdk.models.VenmoWalletVaultAttributes;

VenmoWalletAdditionalAttributes venmoWalletAdditionalAttributes = new VenmoWalletAdditionalAttributes.Builder()
    .customer(new VenmoWalletCustomerInformation.Builder()
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
    .vault(new VenmoWalletVaultAttributes.Builder(
        StoreInVaultInstruction.ON_SUCCESS,
        VenmoPaymentTokenUsageType.MERCHANT
    )
    .description("description6")
    .usagePattern(VenmoPaymentTokenUsagePattern.THRESHOLD_PREPAID)
    .customerType(VenmoPaymentTokenCustomerType.CONSUMER)
    .permitMultiplePaymentTokens(false)
    .build())
    .build();
```

