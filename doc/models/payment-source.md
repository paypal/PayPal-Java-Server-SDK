
# Payment Source

The payment source definition.

## Structure

`PaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardRequest`](../../doc/models/card-request.md) | Optional | The payment card to use to fund a payment. Can be a credit or debit card. Note: Passing card number, cvv and expiry directly via the API requires PCI SAQ D compliance. *PayPal offers a mechanism by which you do not have to take on the PCI SAQ D burden by using hosted fields - refer to this Integration Guide*. | CardRequest getCard() | setCard(CardRequest card) |
| `Token` | [`Token`](../../doc/models/token.md) | Optional | The tokenized payment source to fund a payment. | Token getToken() | setToken(Token token) |
| `Paypal` | [`PaypalWallet`](../../doc/models/paypal-wallet.md) | Optional | A resource that identifies a PayPal Wallet is used for payment. | PaypalWallet getPaypal() | setPaypal(PaypalWallet paypal) |
| `Bancontact` | [`BancontactPaymentRequest`](../../doc/models/bancontact-payment-request.md) | Optional | Information needed to pay using Bancontact. | BancontactPaymentRequest getBancontact() | setBancontact(BancontactPaymentRequest bancontact) |
| `Blik` | [`BlikPaymentRequest`](../../doc/models/blik-payment-request.md) | Optional | Information needed to pay using BLIK. | BlikPaymentRequest getBlik() | setBlik(BlikPaymentRequest blik) |
| `Eps` | [`EpsPaymentRequest`](../../doc/models/eps-payment-request.md) | Optional | Information needed to pay using eps. | EpsPaymentRequest getEps() | setEps(EpsPaymentRequest eps) |
| `Giropay` | [`GiropayPaymentRequest`](../../doc/models/giropay-payment-request.md) | Optional | Information needed to pay using giropay. | GiropayPaymentRequest getGiropay() | setGiropay(GiropayPaymentRequest giropay) |
| `Ideal` | [`IdealPaymentRequest`](../../doc/models/ideal-payment-request.md) | Optional | Information needed to pay using iDEAL. | IdealPaymentRequest getIdeal() | setIdeal(IdealPaymentRequest ideal) |
| `Mybank` | [`MybankPaymentRequest`](../../doc/models/mybank-payment-request.md) | Optional | Information needed to pay using MyBank. | MybankPaymentRequest getMybank() | setMybank(MybankPaymentRequest mybank) |
| `P24` | [`P24PaymentRequest`](../../doc/models/p24-payment-request.md) | Optional | Information needed to pay using P24 (Przelewy24). | P24PaymentRequest getP24() | setP24(P24PaymentRequest p24) |
| `Sofort` | [`SofortPaymentRequest`](../../doc/models/sofort-payment-request.md) | Optional | Information needed to pay using Sofort. | SofortPaymentRequest getSofort() | setSofort(SofortPaymentRequest sofort) |
| `Trustly` | [`TrustlyPaymentRequest`](../../doc/models/trustly-payment-request.md) | Optional | Information needed to pay using Trustly. | TrustlyPaymentRequest getTrustly() | setTrustly(TrustlyPaymentRequest trustly) |
| `ApplePay` | [`ApplePayRequest`](../../doc/models/apple-pay-request.md) | Optional | Information needed to pay using ApplePay. | ApplePayRequest getApplePay() | setApplePay(ApplePayRequest applePay) |
| `GooglePay` | [`GooglePayRequest`](../../doc/models/google-pay-request.md) | Optional | Information needed to pay using Google Pay. | GooglePayRequest getGooglePay() | setGooglePay(GooglePayRequest googlePay) |
| `Venmo` | [`VenmoWalletRequest`](../../doc/models/venmo-wallet-request.md) | Optional | Information needed to pay using Venmo. | VenmoWalletRequest getVenmo() | setVenmo(VenmoWalletRequest venmo) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.BancontactPaymentRequest;
import com.paypal.sdk.models.BlikExperienceContext;
import com.paypal.sdk.models.BlikLevel0PaymentObject;
import com.paypal.sdk.models.BlikOneClickPaymentRequest;
import com.paypal.sdk.models.BlikPaymentRequest;
import com.paypal.sdk.models.CardRequest;
import com.paypal.sdk.models.ExperienceContext;
import com.paypal.sdk.models.ExperienceContextShippingPreference;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PaymentSource;
import com.paypal.sdk.models.PaypalWallet;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.Token;
import com.paypal.sdk.models.TokenType;

PaymentSource paymentSource = new PaymentSource.Builder()
    .card(new CardRequest.Builder()
        .name("name6")
        .number("number6")
        .expiry("expiry4")
        .securityCode("security_code8")
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
    .token(new Token.Builder(
        "id6",
        TokenType.BILLING_AGREEMENT
    )
    .build())
    .paypal(new PaypalWallet.Builder()
        .vaultId("vault_id0")
        .emailAddress("email_address0")
        .name(new Name.Builder()
            .givenName("given_name2")
            .surname("surname8")
            .build())
        .phone(new PhoneWithType.Builder(
            new PhoneNumber.Builder(
                "national_number6"
            )
            .build()
        )
        .phoneType(PhoneType.OTHER)
        .build())
        .birthDate("birth_date8")
        .build())
    .bancontact(new BancontactPaymentRequest.Builder(
        "name0",
        "country_code0"
    )
    .experienceContext(new ExperienceContext.Builder()
            .brandName("brand_name2")
            .locale("locale6")
            .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
            .returnUrl("return_url4")
            .cancelUrl("cancel_url6")
            .build())
    .build())
    .blik(new BlikPaymentRequest.Builder(
        "name2",
        "country_code2"
    )
    .email("email4")
    .experienceContext(new BlikExperienceContext.Builder()
            .brandName("brand_name2")
            .locale("locale6")
            .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
            .returnUrl("return_url4")
            .cancelUrl("cancel_url6")
            .build())
    .level0(new BlikLevel0PaymentObject.Builder(
            "auth_code8"
        )
        .build())
    .oneClick(new BlikOneClickPaymentRequest.Builder(
            "consumer_reference2"
        )
        .authCode("auth_code0")
        .aliasLabel("alias_label6")
        .aliasKey("alias_key4")
        .build())
    .build())
    .build();
```

