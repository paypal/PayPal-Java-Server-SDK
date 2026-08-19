
# Subscriber Request

The subscriber request information .

## Structure

`SubscriberRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EmailAddress` | `String` | Optional | The internationalized email address. Note: Up to 64 characters are allowed before and 255 characters are allowed after the @ sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted @ sign exists.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: ``(?:[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[a-zA-Z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?\|\[(?:(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9]))\.){3}(?:(2(5[0-5]\|[0-4][0-9])\|1[0-9][0-9]\|[1-9]?[0-9])\|[a-zA-Z0-9-]*[a-zA-Z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])`` | String getEmailAddress() | setEmailAddress(String emailAddress) |
| `PayerId` | `String` | Optional | The account identifier for a PayPal account.<br><br>**Constraints**: *Minimum Length*: `13`, *Maximum Length*: `13`, *Pattern*: `^[2-9A-HJ-NP-Z]{13}$` | String getPayerId() | setPayerId(String payerId) |
| `Name` | [`Name`](../../doc/models/name.md) | Optional | The name of the party. | Name getName() | setName(Name name) |
| `ShippingAddress` | [`ShippingDetails`](../../doc/models/shipping-details.md) | Optional | The shipping details. | ShippingDetails getShippingAddress() | setShippingAddress(ShippingDetails shippingAddress) |
| `PaymentSource` | [`SubscriptionPaymentSource`](../../doc/models/subscription-payment-source.md) | Optional | The payment source definition. To be eligible to create subscription using debit or credit card, you will need to sign up here (https://www.paypal.com/bizsignup/entry/product/ppcp). Please note, its available only for non-3DS cards and for merchants in US and AU regions. | SubscriptionPaymentSource getPaymentSource() | setPaymentSource(SubscriptionPaymentSource paymentSource) |
| `Phone` | [`PhoneWithType`](../../doc/models/phone-with-type.md) | Optional | The phone information. | PhoneWithType getPhone() | setPhone(PhoneWithType phone) |

## Example

```java
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.ShippingDetails;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.ShippingOption;
import com.paypal.sdk.models.ShippingType;
import com.paypal.sdk.models.SubscriberRequest;
import com.paypal.sdk.models.SubscriptionCardRequest;
import com.paypal.sdk.models.SubscriptionPaymentSource;
import java.util.Arrays;

SubscriberRequest subscriberRequest = new SubscriberRequest.Builder()
    .emailAddress("email_address4")
    .payerId("payer_id4")
    .name(new Name.Builder()
        .givenName("given_name2")
        .surname("surname8")
        .build())
    .shippingAddress(new ShippingDetails.Builder()
        .name(new ShippingName.Builder()
            .fullName("full_name6")
            .build())
        .emailAddress("email_address8")
        .phoneNumber(new PhoneNumberWithCountryCode.Builder(
            "country_code2",
            "national_number6"
        )
        .build())
        .type(FulfillmentType.PICKUP_IN_STORE)
        .options(Arrays.asList(
            new ShippingOption.Builder(
                "id2",
                "label2",
                false
            )
            .type(ShippingType.SHIPPING)
            .amount(new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build())
            .build()
        ))
        .build())
    .paymentSource(new SubscriptionPaymentSource.Builder()
        .card(new SubscriptionCardRequest.Builder()
            .name("name6")
            .number("number6")
            .expiry("expiry4")
            .securityCode("security_code8")
            .type(CardType.UNKNOWN)
            .build())
        .build())
    .build();
```

