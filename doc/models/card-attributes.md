
# Card Attributes

Additional attributes associated with the use of this card.

## Structure

`CardAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`CardCustomerInformation`](../../doc/models/card-customer-information.md) | Optional | The details about a customer in PayPal's system of record. | CardCustomerInformation getCustomer() | setCustomer(CardCustomerInformation customer) |
| `Vault` | [`VaultInstructionBase`](../../doc/models/vault-instruction-base.md) | Optional | Basic vault instruction specification that can be extended by specific payment sources that supports vaulting. | VaultInstructionBase getVault() | setVault(VaultInstructionBase vault) |
| `Verification` | [`CardVerification`](../../doc/models/card-verification.md) | Optional | The API caller can opt in to verify the card through PayPal offered verification services (e.g. Smart Dollar Auth, 3DS). | CardVerification getVerification() | setVerification(CardVerification verification) |

## Example

```java
import com.paypal.sdk.models.CardAttributes;
import com.paypal.sdk.models.CardCustomerInformation;
import com.paypal.sdk.models.CardVerification;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.OrdersCardVerificationMethod;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.StoreInVaultInstruction;
import com.paypal.sdk.models.VaultInstructionBase;

CardAttributes cardAttributes = new CardAttributes.Builder()
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
    .vault(new VaultInstructionBase.Builder()
        .storeInVault(StoreInVaultInstruction.ON_SUCCESS)
        .build())
    .verification(new CardVerification.Builder()
        .method(OrdersCardVerificationMethod.ENUM_3D_SECURE)
        .build())
    .build();
```

