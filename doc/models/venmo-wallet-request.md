
# Venmo Wallet Request

Information needed to pay using Venmo.

## Structure

`VenmoWalletRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VaultId` | `String` | Optional | The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant's server so the saved payment source can be used for future transactions.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getVaultId() | setVaultId(String vaultId) |
| `EmailAddress` | `String` | Optional | The internationalized email address. Note: Up to 64 characters are allowed before and 255 characters are allowed after the @ sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted @ sign exists.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: ``(?:[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\|\[(?:(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9])\|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])`` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `ExperienceContext` | [`VenmoWalletExperienceContext`](../../doc/models/venmo-wallet-experience-context.md) | Optional | Customizes the buyer experience during the approval process for payment with Venmo. Note: Partners and Marketplaces might configure shipping_preference during partner account setup, which overrides the request values. | VenmoWalletExperienceContext getExperienceContext() | setExperienceContext(VenmoWalletExperienceContext experienceContext) |
| `Attributes` | [`VenmoWalletAdditionalAttributes`](../../doc/models/venmo-wallet-additional-attributes.md) | Optional | Additional attributes associated with the use of this Venmo Wallet. | VenmoWalletAdditionalAttributes getAttributes() | setAttributes(VenmoWalletAdditionalAttributes attributes) |

## Example

```java
import com.paypal.sdk.models.CallbackConfiguration;
import com.paypal.sdk.models.CallbackEvents;
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
import com.paypal.sdk.models.VenmoWalletExperienceContext;
import com.paypal.sdk.models.VenmoWalletExperienceContextShippingPreference;
import com.paypal.sdk.models.VenmoWalletExperienceContextUserAction;
import com.paypal.sdk.models.VenmoWalletRequest;
import com.paypal.sdk.models.VenmoWalletVaultAttributes;
import java.util.Arrays;

VenmoWalletRequest venmoWalletRequest = new VenmoWalletRequest.Builder()
    .vaultId("vault_id8")
    .emailAddress("email_address8")
    .experienceContext(new VenmoWalletExperienceContext.Builder()
        .brandName("brand_name2")
        .shippingPreference(VenmoWalletExperienceContextShippingPreference.NO_SHIPPING)
        .orderUpdateCallbackConfig(new CallbackConfiguration.Builder(
            Arrays.asList(
                CallbackEvents.SHIPPING_OPTIONS,
                CallbackEvents.SHIPPING_ADDRESS,
                CallbackEvents.SHIPPING_OPTIONS
            ),
            "callback_url6"
        )
        .build())
        .userAction(VenmoWalletExperienceContextUserAction.CONTINUE)
        .build())
    .attributes(new VenmoWalletAdditionalAttributes.Builder()
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
        .build())
    .build();
```

