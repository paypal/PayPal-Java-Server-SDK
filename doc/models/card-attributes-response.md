
# Card Attributes Response

Additional attributes associated with the use of this card.

## Structure

`CardAttributesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Vault` | [`CardVaultResponse`](../../doc/models/card-vault-response.md) | Optional | The details about a saved Card payment source. | CardVaultResponse getVault() | setVault(CardVaultResponse vault) |

## Example

```java
import com.paypal.sdk.models.CardAttributesResponse;
import com.paypal.sdk.models.CardCustomerInformation;
import com.paypal.sdk.models.CardVaultResponse;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.VaultStatus;

CardAttributesResponse cardAttributesResponse = new CardAttributesResponse.Builder()
    .vault(new CardVaultResponse.Builder()
        .id("id6")
        .status(VaultStatus.APPROVED)
        .customer(new CardCustomerInformation.Builder()
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
        .build())
    .build();
```

