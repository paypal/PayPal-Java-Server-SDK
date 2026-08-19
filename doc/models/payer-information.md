
# Payer Information

The payer information.

## Structure

`PayerInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountId` | `String` | Optional | The PayPal` customer account ID.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `13`, *Pattern*: `^[a-zA-Z0-9]*$` | String getAccountId() | setAccountId(String accountId) |
| `EmailAddress` | `String` | Optional | The internationalized email address. Note: Up to 64 characters are allowed before and 255 characters are allowed after the @ sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted @ sign exists.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: `^.+@[^"\-].+$` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PhoneNumber` | [`Phone`](../../doc/models/phone.md) | Optional | The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). | Phone getPhoneNumber() | setPhoneNumber(Phone phoneNumber) |
| `AddressStatus` | `String` | Optional | The address status of the payer. Value is either: Y. Verified. N. Not verified.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1`, *Pattern*: `^[N\|Y]$` | String getAddressStatus() | setAddressStatus(String addressStatus) |
| `PayerStatus` | `String` | Optional | The status of the payer. Value is `Y` or `N`.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1`, *Pattern*: `^[N\|Y]$` | String getPayerStatus() | setPayerStatus(String payerStatus) |
| `PayerName` | [`PayerName`](../../doc/models/payer-name.md) | Optional | The name of the party. | PayerName getPayerName() | setPayerName(PayerName payerName) |
| `CountryCode` | `String` | Optional | The [two-character ISO 3166-1 code](/docs/integration/direct/rest/country-codes/) that identifies the country or region. Note: The country code for Great Britain is GB and not UK as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.<br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Address` | [`SimplePostalAddressCoarseGrained`](../../doc/models/simple-postal-address-coarse-grained.md) | Optional | A simple postal address with coarse-grained fields. Do not use for an international address. Use for backward compatibility only. Does not contain phone. | SimplePostalAddressCoarseGrained getAddress() | setAddress(SimplePostalAddressCoarseGrained address) |

## Example

```java
import com.paypal.sdk.models.PayerInformation;
import com.paypal.sdk.models.Phone;

PayerInformation payerInformation = new PayerInformation.Builder()
    .accountId("account_id4")
    .emailAddress("email_address0")
    .phoneNumber(new Phone.Builder(
        "country_code2",
        "national_number6"
    )
    .extensionNumber("extension_number8")
    .build())
    .addressStatus("address_status0")
    .payerStatus("payer_status0")
    .build();
```

