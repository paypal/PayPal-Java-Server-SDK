
# Subscriptions Card Attributes

Additional attributes associated with the use of this card.

## Structure

`SubscriptionsCardAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`CardCustomer`](../../doc/models/card-customer.md) | Optional | The details about a customer in PayPal's system of record. | CardCustomer getCustomer() | setCustomer(CardCustomer customer) |
| `Vault` | [`VaultInstructionBase`](../../doc/models/vault-instruction-base.md) | Optional | Basic vault instruction specification that can be extended by specific payment sources that supports vaulting. | VaultInstructionBase getVault() | setVault(VaultInstructionBase vault) |
| `Verification` | [`CardVerification`](../../doc/models/card-verification.md) | Optional | The API caller can opt in to verify the card through PayPal offered verification services (e.g. Smart Dollar Auth, 3DS). | CardVerification getVerification() | setVerification(CardVerification verification) |

## Example

```java
import com.paypal.sdk.models.CardCustomer;
import com.paypal.sdk.models.CardVerification;
import com.paypal.sdk.models.OrdersCardVerificationMethod;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.StoreInVaultInstruction;
import com.paypal.sdk.models.SubscriptionsCardAttributes;
import com.paypal.sdk.models.VaultInstructionBase;

SubscriptionsCardAttributes subscriptionsCardAttributes = new SubscriptionsCardAttributes.Builder()
    .customer(new CardCustomer.Builder()
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

