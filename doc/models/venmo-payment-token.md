
# Venmo Payment Token

Full representation of a Venmo Payment Token.

## Structure

`VenmoPaymentToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | The description displayed to the consumer on the approval flow for a digital wallet, as well as on the merchant view of the payment token management experience. exp: PayPal.com.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128`, *Pattern*: `^.*$` | String getDescription() | setDescription(String description) |
| `UsagePattern` | [`UsagePattern`](../../doc/models/usage-pattern.md) | Optional | Expected business/charge model for the billing agreement.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `30`, *Pattern*: `^[0-9A-Z_]+$` | UsagePattern getUsagePattern() | setUsagePattern(UsagePattern usagePattern) |
| `Shipping` | [`VaultedDigitalWalletShippingDetails`](../../doc/models/vaulted-digital-wallet-shipping-details.md) | Optional | The shipping details. | VaultedDigitalWalletShippingDetails getShipping() | setShipping(VaultedDigitalWalletShippingDetails shipping) |
| `PermitMultiplePaymentTokens` | `Boolean` | Optional | Create multiple payment tokens for the same payer, merchant/platform combination. Use this when the customer has not logged in at merchant/platform. The payment token thus generated, can then also be used to create the customer account at merchant/platform. Use this also when multiple payment tokens are required for the same payer, different customer at merchant/platform. This helps to identify customers distinctly even though they may share the same PayPal account. This only applies to PayPal payment source.<br><br>**Default**: `false` | Boolean getPermitMultiplePaymentTokens() | setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) |
| `UsageType` | [`PaypalPaymentTokenUsageType`](../../doc/models/paypal-payment-token-usage-type.md) | Optional | The usage type associated with a digital wallet payment token.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaypalPaymentTokenUsageType getUsageType() | setUsageType(PaypalPaymentTokenUsageType usageType) |
| `CustomerType` | [`PaypalPaymentTokenCustomerType`](../../doc/models/paypal-payment-token-customer-type.md) | Optional | The customer type associated with a digital wallet payment token. This is to indicate whether the customer acting on the merchant / platform is either a business or a consumer.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaypalPaymentTokenCustomerType getCustomerType() | setCustomerType(PaypalPaymentTokenCustomerType customerType) |
| `EmailAddress` | `String` | Optional | The internationalized email address.<blockquote><strong>Note:</strong> Up to 64 characters are allowed before and 255 characters are allowed after the <code>@</code> sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted <code>@</code> sign exists.</blockquote><br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: ``(?:[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\|\[(?:(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9])\|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])`` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PayerId` | `String` | Optional | The account identifier for a PayPal account.<br><br>**Constraints**: *Minimum Length*: `13`, *Maximum Length*: `13`, *Pattern*: `^[2-9A-HJ-NP-Z]{13}$` | String getPayerId() | setPayerId(String payerId) |
| `Name` | [`Name`](../../doc/models/name.md) | Optional | The name of the party. | Name getName() | setName(Name name) |
| `Phone` | [`PhoneWithType`](../../doc/models/phone-with-type.md) | Optional | The phone information. | PhoneWithType getPhone() | setPhone(PhoneWithType phone) |
| `Address` | [`Address`](../../doc/models/address.md) | Optional | The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute). | Address getAddress() | setAddress(Address address) |
| `UserName` | `String` | Optional | The Venmo username, as chosen by the user.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[-a-zA-Z0-9_]*$` | String getUserName() | setUserName(String userName) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.PaypalPaymentTokenUsageType;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.UsagePattern;
import com.paypal.sdk.models.VaultedDigitalWalletShippingDetails;
import com.paypal.sdk.models.VenmoPaymentToken;

VenmoPaymentToken venmoPaymentToken = new VenmoPaymentToken.Builder()
    .description("description6")
    .usagePattern(UsagePattern.IMMEDIATE)
    .shipping(new VaultedDigitalWalletShippingDetails.Builder()
        .name(new ShippingName.Builder()
            .fullName("full_name6")
            .build())
        .emailAddress("email_address2")
        .phoneNumber(new PhoneNumberWithCountryCode.Builder(
            "country_code2",
            "national_number6"
        )
        .build())
        .type(FulfillmentType.SHIPPING)
        .address(new Address.Builder(
            "country_code6"
        )
        .addressLine1("address_line_16")
        .addressLine2("address_line_26")
        .adminArea2("admin_area_20")
        .adminArea1("admin_area_12")
        .postalCode("postal_code8")
        .build())
        .build())
    .permitMultiplePaymentTokens(false)
    .usageType(PaypalPaymentTokenUsageType.MERCHANT)
    .build();
```

