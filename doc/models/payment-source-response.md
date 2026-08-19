
# Payment Source Response

The payment source used to fund the payment.

## Structure

`PaymentSourceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardResponse`](../../doc/models/card-response.md) | Optional | The payment card to use to fund a payment. Card can be a credit or debit card. | CardResponse getCard() | setCard(CardResponse card) |
| `Paypal` | [`PaypalWalletResponse`](../../doc/models/paypal-wallet-response.md) | Optional | The PayPal Wallet response. | PaypalWalletResponse getPaypal() | setPaypal(PaypalWalletResponse paypal) |
| `Bancontact` | [`BancontactPaymentObject`](../../doc/models/bancontact-payment-object.md) | Optional | Information used to pay Bancontact. | BancontactPaymentObject getBancontact() | setBancontact(BancontactPaymentObject bancontact) |
| `Blik` | [`BlikPaymentObject`](../../doc/models/blik-payment-object.md) | Optional | Information used to pay using BLIK. | BlikPaymentObject getBlik() | setBlik(BlikPaymentObject blik) |
| `Eps` | [`EpsPaymentObject`](../../doc/models/eps-payment-object.md) | Optional | Information used to pay using eps. | EpsPaymentObject getEps() | setEps(EpsPaymentObject eps) |
| `Giropay` | [`GiropayPaymentObject`](../../doc/models/giropay-payment-object.md) | Optional | Information needed to pay using giropay. | GiropayPaymentObject getGiropay() | setGiropay(GiropayPaymentObject giropay) |
| `Ideal` | [`IdealPaymentObject`](../../doc/models/ideal-payment-object.md) | Optional | Information used to pay using iDEAL. | IdealPaymentObject getIdeal() | setIdeal(IdealPaymentObject ideal) |
| `Mybank` | [`MybankPaymentObject`](../../doc/models/mybank-payment-object.md) | Optional | Information used to pay using MyBank. | MybankPaymentObject getMybank() | setMybank(MybankPaymentObject mybank) |
| `P24` | [`P24PaymentObject`](../../doc/models/p24-payment-object.md) | Optional | Information used to pay using P24(Przelewy24). | P24PaymentObject getP24() | setP24(P24PaymentObject p24) |
| `Sofort` | [`SofortPaymentObject`](../../doc/models/sofort-payment-object.md) | Optional | Information used to pay using Sofort. | SofortPaymentObject getSofort() | setSofort(SofortPaymentObject sofort) |
| `Trustly` | [`TrustlyPaymentObject`](../../doc/models/trustly-payment-object.md) | Optional | Information needed to pay using Trustly. | TrustlyPaymentObject getTrustly() | setTrustly(TrustlyPaymentObject trustly) |
| `ApplePay` | [`ApplePayPaymentObject`](../../doc/models/apple-pay-payment-object.md) | Optional | Information needed to pay using ApplePay. | ApplePayPaymentObject getApplePay() | setApplePay(ApplePayPaymentObject applePay) |
| `GooglePay` | [`GooglePayWalletResponse`](../../doc/models/google-pay-wallet-response.md) | Optional | Google Pay Wallet payment data. | GooglePayWalletResponse getGooglePay() | setGooglePay(GooglePayWalletResponse googlePay) |
| `Venmo` | [`VenmoWalletResponse`](../../doc/models/venmo-wallet-response.md) | Optional | Venmo wallet response. | VenmoWalletResponse getVenmo() | setVenmo(VenmoWalletResponse venmo) |

## Example

```java
import com.paypal.sdk.models.BancontactPaymentObject;
import com.paypal.sdk.models.BlikOneClickPaymentObject;
import com.paypal.sdk.models.BlikPaymentObject;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardResponse;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.EpsPaymentObject;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PaymentSourceResponse;
import com.paypal.sdk.models.PaypalWalletResponse;
import com.paypal.sdk.models.PhoneType;

PaymentSourceResponse paymentSourceResponse = new PaymentSourceResponse.Builder()
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
    .bancontact(new BancontactPaymentObject.Builder()
        .name("name0")
        .countryCode("country_code0")
        .bic("bic2")
        .ibanLastChars("iban_last_chars8")
        .cardLastDigits("card_last_digits4")
        .build())
    .blik(new BlikPaymentObject.Builder()
        .name("name2")
        .countryCode("country_code2")
        .email("email4")
        .oneClick(new BlikOneClickPaymentObject.Builder()
            .consumerReference("consumer_reference2")
            .build())
        .build())
    .eps(new EpsPaymentObject.Builder()
        .name("name6")
        .countryCode("country_code6")
        .bic("bic8")
        .build())
    .build();
```

