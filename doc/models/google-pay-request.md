
# Google Pay Request

Information needed to pay using Google Pay.

## Structure

`GooglePayRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The full name representation like Mr J Smith.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `EmailAddress` | `String` | Optional | The internationalized email address. Note: Up to 64 characters are allowed before and 255 characters are allowed after the @ sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted @ sign exists.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: ``^(?:[A-Za-z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[A-Za-z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\.)+[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\|\[(?:(?:25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?\|[A-Za-z0-9-]*[A-Za-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])$`` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PhoneNumber` | [`PhoneNumberWithCountryCode`](../../doc/models/phone-number-with-country-code.md) | Optional | The phone number in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). | PhoneNumberWithCountryCode getPhoneNumber() | setPhoneNumber(PhoneNumberWithCountryCode phoneNumber) |
| `Card` | [`GooglePayRequestCard`](../../doc/models/google-pay-request-card.md) | Optional | The payment card used to fund a Google Pay payment. Can be a credit or debit card. | GooglePayRequestCard getCard() | setCard(GooglePayRequestCard card) |
| `DecryptedToken` | [`GooglePayDecryptedTokenData`](../../doc/models/google-pay-decrypted-token-data.md) | Optional | Details shared by Google for the merchant to be shared with PayPal. This is required to process the transaction using the Google Pay payment method. | GooglePayDecryptedTokenData getDecryptedToken() | setDecryptedToken(GooglePayDecryptedTokenData decryptedToken) |
| `AssuranceDetails` | [`AssuranceDetails`](../../doc/models/assurance-details.md) | Optional | Information about cardholder possession validation and cardholder identification and verifications (ID&V). | AssuranceDetails getAssuranceDetails() | setAssuranceDetails(AssuranceDetails assuranceDetails) |
| `ExperienceContext` | [`GooglePayExperienceContext`](../../doc/models/google-pay-experience-context.md) | Optional | Customizes the payer experience during the approval process for the payment. | GooglePayExperienceContext getExperienceContext() | setExperienceContext(GooglePayExperienceContext experienceContext) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.GooglePayAuthenticationMethod;
import com.paypal.sdk.models.GooglePayCard;
import com.paypal.sdk.models.GooglePayDecryptedTokenData;
import com.paypal.sdk.models.GooglePayPaymentMethod;
import com.paypal.sdk.models.GooglePayRequest;
import com.paypal.sdk.models.GooglePayRequestCard;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;

GooglePayRequest googlePayRequest = new GooglePayRequest.Builder()
    .name("name6")
    .emailAddress("email_address6")
    .phoneNumber(new PhoneNumberWithCountryCode.Builder(
        "country_code2",
        "national_number6"
    )
    .build())
    .card(new GooglePayRequestCard.Builder()
        .name("name6")
        .type(CardType.UNKNOWN)
        .brand(CardBrand.CB_NATIONALE)
        .billingAddress(new Address.Builder(
            "country_code8"
        )
        .addressLine1("address_line_12")
        .addressLine2("address_line_28")
        .adminArea2("admin_area_28")
        .adminArea1("admin_area_14")
        .postalCode("postal_code0")
        .build())
        .build())
    .decryptedToken(new GooglePayDecryptedTokenData.Builder(
        GooglePayPaymentMethod.CARD,
        new GooglePayCard.Builder()
            .name("name6")
            .number("number6")
            .expiry("expiry4")
            .type(CardType.UNKNOWN)
            .build(),
        GooglePayAuthenticationMethod.PAN_ONLY
    )
    .messageId("message_id0")
    .messageExpiration("message_expiration2")
    .cryptogram("cryptogram6")
    .eciIndicator("eci_indicator0")
    .build())
    .build();
```

