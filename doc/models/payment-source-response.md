
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

## Example (as JSON)

```json
{
  "card": {
    "name": "name6",
    "last_digits": "last_digits0",
    "brand": "RUPAY",
    "available_networks": [
      "SYNCHRONY"
    ],
    "type": "UNKNOWN"
  },
  "paypal": {
    "email_address": "email_address0",
    "account_id": "account_id4",
    "account_status": "VERIFIED",
    "name": {
      "given_name": "given_name2",
      "surname": "surname8"
    },
    "phone_type": "FAX"
  },
  "bancontact": {
    "name": "name0",
    "country_code": "country_code0",
    "bic": "bic2",
    "iban_last_chars": "iban_last_chars8",
    "card_last_digits": "card_last_digits4"
  },
  "blik": {
    "name": "name2",
    "country_code": "country_code2",
    "email": "email4",
    "one_click": {
      "consumer_reference": "consumer_reference2"
    }
  },
  "eps": {
    "name": "name6",
    "country_code": "country_code6",
    "bic": "bic8"
  }
}
```

