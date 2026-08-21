
# Paypal Wallet Attributes

Additional attributes associated with the use of this PayPal Wallet.

## Structure

`PaypalWalletAttributes`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`PaypalWalletCustomerRequest`](../../doc/models/paypal-wallet-customer-request.md) | Optional | - | PaypalWalletCustomerRequest getCustomer() | setCustomer(PaypalWalletCustomerRequest customer) |
| `Vault` | [`PaypalWalletVaultInstruction`](../../doc/models/paypal-wallet-vault-instruction.md) | Optional | - | PaypalWalletVaultInstruction getVault() | setVault(PaypalWalletVaultInstruction vault) |

## Example

```java
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PaypalPaymentTokenCustomerType;
import com.paypal.sdk.models.PaypalPaymentTokenUsageType;
import com.paypal.sdk.models.PaypalWalletAttributes;
import com.paypal.sdk.models.PaypalWalletCustomerRequest;
import com.paypal.sdk.models.PaypalWalletVaultInstruction;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.StoreInVaultInstruction;
import com.paypal.sdk.models.UsagePattern;

PaypalWalletAttributes paypalWalletAttributes = new PaypalWalletAttributes.Builder()
    .customer(new PaypalWalletCustomerRequest.Builder()
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
    .vault(new PaypalWalletVaultInstruction.Builder(
        PaypalPaymentTokenUsageType.MERCHANT
    )
    .storeInVault(StoreInVaultInstruction.ON_SUCCESS)
    .description("description6")
    .usagePattern(UsagePattern.THRESHOLD_PREPAID)
    .customerType(PaypalPaymentTokenCustomerType.CONSUMER)
    .permitMultiplePaymentTokens(false)
    .build())
    .build();
```

