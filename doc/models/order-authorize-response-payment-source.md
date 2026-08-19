
# Order Authorize Response Payment Source

The payment source used to fund the payment.

## Structure

`OrderAuthorizeResponsePaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardResponse`](../../doc/models/card-response.md) | Optional | The payment card to use to fund a payment. Card can be a credit or debit card. | CardResponse getCard() | setCard(CardResponse card) |
| `Paypal` | [`PaypalWalletResponse`](../../doc/models/paypal-wallet-response.md) | Optional | The PayPal Wallet response. | PaypalWalletResponse getPaypal() | setPaypal(PaypalWalletResponse paypal) |
| `ApplePay` | [`ApplePayPaymentObject`](../../doc/models/apple-pay-payment-object.md) | Optional | Information needed to pay using ApplePay. | ApplePayPaymentObject getApplePay() | setApplePay(ApplePayPaymentObject applePay) |
| `GooglePay` | [`GooglePayWalletResponse`](../../doc/models/google-pay-wallet-response.md) | Optional | Google Pay Wallet payment data. | GooglePayWalletResponse getGooglePay() | setGooglePay(GooglePayWalletResponse googlePay) |
| `Venmo` | [`VenmoWalletResponse`](../../doc/models/venmo-wallet-response.md) | Optional | Venmo wallet response. | VenmoWalletResponse getVenmo() | setVenmo(VenmoWalletResponse venmo) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayPaymentObject;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardResponse;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.GooglePayCardResponse;
import com.paypal.sdk.models.GooglePayWalletResponse;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.OrderAuthorizeResponsePaymentSource;
import com.paypal.sdk.models.PaypalWalletResponse;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.VenmoWalletResponse;

OrderAuthorizeResponsePaymentSource orderAuthorizeResponsePaymentSource = new OrderAuthorizeResponsePaymentSource.Builder()
    .card(new CardResponse.Builder()
        .name("name6")
        .brand(CardBrand.CB_NATIONALE)
        .type(CardType.UNKNOWN)
        .build())
    .paypal(new PaypalWalletResponse.Builder()
        .emailAddress("email_address0")
        .accountId("account_id4")
        .name(new Name.Builder()
            .givenName("given_name2")
            .surname("surname8")
            .build())
        .phoneType(PhoneType.FAX)
        .build())
    .applePay(new ApplePayPaymentObject.Builder()
        .id("id0")
        .token("token6")
        .name("name0")
        .emailAddress("email_address8")
        .phoneNumber(new PhoneNumber.Builder(
            "national_number6"
        )
        .build())
        .build())
    .googlePay(new GooglePayWalletResponse.Builder()
        .name("name8")
        .emailAddress("email_address6")
        .phoneNumber(new PhoneNumberWithCountryCode.Builder(
            "country_code2",
            "national_number6"
        )
        .build())
        .card(new GooglePayCardResponse.Builder()
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
        .build())
    .venmo(new VenmoWalletResponse.Builder()
        .emailAddress("email_address4")
        .accountId("account_id8")
        .userName("user_name2")
        .name(new Name.Builder()
            .givenName("given_name2")
            .surname("surname8")
            .build())
        .phoneNumber(new PhoneNumber.Builder(
            "national_number6"
        )
        .build())
        .build())
    .build();
```

