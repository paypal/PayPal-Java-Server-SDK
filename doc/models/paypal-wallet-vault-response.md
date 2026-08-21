
# Paypal Wallet Vault Response

The details about a saved PayPal Wallet payment source.

## Structure

`PaypalWalletVaultResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the saved payment source.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getId() | setId(String id) |
| `Status` | [`PaypalWalletVaultStatus`](../../doc/models/paypal-wallet-vault-status.md) | Optional | The vault status.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaypalWalletVaultStatus getStatus() | setStatus(PaypalWalletVaultStatus status) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related HATEOAS links.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `Customer` | [`PaypalWalletCustomer`](../../doc/models/paypal-wallet-customer.md) | Optional | The details about a customer in PayPal's system of record. | PaypalWalletCustomer getCustomer() | setCustomer(PaypalWalletCustomer customer) |

## Example

```java
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PaypalWalletCustomer;
import com.paypal.sdk.models.PaypalWalletVaultResponse;
import com.paypal.sdk.models.PaypalWalletVaultStatus;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;

PaypalWalletVaultResponse paypalWalletVaultResponse = new PaypalWalletVaultResponse.Builder()
    .id("id0")
    .status(PaypalWalletVaultStatus.APPROVED)
    .customer(new PaypalWalletCustomer.Builder()
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
        .merchantCustomerId("merchant_customer_id2")
        .build())
    .build();
```

