
# Payment Source

The payment source definition.

## Structure

`PaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardRequest`](../../doc/models/card-request.md) | Optional | The payment card to use to fund a payment. Can be a credit or debit card.<blockquote><strong>Note:</strong> Passing card number, cvv and expiry directly via the API requires <a href="https://www.pcisecuritystandards.org/pci_security/completing_self_assessment"> PCI SAQ D compliance</a>. <br>*PayPal offers a mechanism by which you do not have to take on the <strong>PCI SAQ D</strong> burden by using hosted fields - refer to <a href="https://developer.paypal.com/docs/checkout/advanced/integrate/">this Integration Guide</a>*.</blockquote> | CardRequest getCard() | setCard(CardRequest card) |
| `Token` | [`Token`](../../doc/models/token.md) | Optional | The tokenized payment source to fund a payment. | Token getToken() | setToken(Token token) |
| `Paypal` | [`PayPalWallet`](../../doc/models/pay-pal-wallet.md) | Optional | A resource that identifies a PayPal Wallet is used for payment. | PayPalWallet getPaypal() | setPaypal(PayPalWallet paypal) |
| `Bancontact` | [`BancontactPaymentRequest`](../../doc/models/bancontact-payment-request.md) | Optional | Information needed to pay using Bancontact. | BancontactPaymentRequest getBancontact() | setBancontact(BancontactPaymentRequest bancontact) |
| `Blik` | [`BLIKPaymentRequest`](../../doc/models/blik-payment-request.md) | Optional | Information needed to pay using BLIK. | BLIKPaymentRequest getBlik() | setBlik(BLIKPaymentRequest blik) |
| `Eps` | [`EPSPaymentRequest`](../../doc/models/eps-payment-request.md) | Optional | Information needed to pay using eps. | EPSPaymentRequest getEps() | setEps(EPSPaymentRequest eps) |
| `Giropay` | [`GiropayPaymentRequest`](../../doc/models/giropay-payment-request.md) | Optional | Information needed to pay using giropay. | GiropayPaymentRequest getGiropay() | setGiropay(GiropayPaymentRequest giropay) |
| `Ideal` | [`IDEALPaymentRequest`](../../doc/models/ideal-payment-request.md) | Optional | Information needed to pay using iDEAL. | IDEALPaymentRequest getIdeal() | setIdeal(IDEALPaymentRequest ideal) |
| `Mybank` | [`MyBankPaymentRequest`](../../doc/models/my-bank-payment-request.md) | Optional | Information needed to pay using MyBank. | MyBankPaymentRequest getMybank() | setMybank(MyBankPaymentRequest mybank) |
| `P24` | [`P24PaymentRequest`](../../doc/models/p24-payment-request.md) | Optional | Information needed to pay using P24 (Przelewy24). | P24PaymentRequest getP24() | setP24(P24PaymentRequest p24) |
| `Sofort` | [`SofortPaymentRequest`](../../doc/models/sofort-payment-request.md) | Optional | Information needed to pay using Sofort. | SofortPaymentRequest getSofort() | setSofort(SofortPaymentRequest sofort) |
| `Trustly` | [`TrustlyPaymentRequest`](../../doc/models/trustly-payment-request.md) | Optional | Information needed to pay using Trustly. | TrustlyPaymentRequest getTrustly() | setTrustly(TrustlyPaymentRequest trustly) |
| `ApplePay` | [`ApplePayRequest`](../../doc/models/apple-pay-request.md) | Optional | Information needed to pay using ApplePay. | ApplePayRequest getApplePay() | setApplePay(ApplePayRequest applePay) |
| `GooglePay` | [`GooglePayRequest`](../../doc/models/google-pay-request.md) | Optional | Information needed to pay using Google Pay. | GooglePayRequest getGooglePay() | setGooglePay(GooglePayRequest googlePay) |
| `Venmo` | [`VenmoWalletRequest`](../../doc/models/venmo-wallet-request.md) | Optional | Information needed to pay using Venmo. | VenmoWalletRequest getVenmo() | setVenmo(VenmoWalletRequest venmo) |

## Example (as JSON)

```json
{
  "card": {
    "name": "name6",
    "number": "number6",
    "expiry": "expiry4",
    "security_code": "security_code8",
    "billing_address": {
      "address_line_1": "address_line_12",
      "address_line_2": "address_line_28",
      "admin_area_2": "admin_area_28",
      "admin_area_1": "admin_area_14",
      "postal_code": "postal_code0",
      "country_code": "country_code8"
    }
  },
  "token": {
    "id": "id6",
    "type": "BILLING_AGREEMENT"
  },
  "paypal": {
    "vault_id": "vault_id0",
    "email_address": "email_address0",
    "name": {
      "given_name": "given_name2",
      "surname": "surname8"
    },
    "phone": {
      "phone_type": "OTHER",
      "phone_number": {
        "national_number": "national_number6"
      }
    },
    "birth_date": "birth_date8"
  },
  "bancontact": {
    "name": "name0",
    "country_code": "country_code0",
    "experience_context": {
      "brand_name": "brand_name2",
      "locale": "locale6",
      "shipping_preference": "NO_SHIPPING",
      "return_url": "return_url4",
      "cancel_url": "cancel_url6"
    }
  },
  "blik": {
    "name": "name2",
    "country_code": "country_code2",
    "email": "email4",
    "experience_context": {
      "brand_name": "brand_name2",
      "locale": "locale6",
      "shipping_preference": "NO_SHIPPING",
      "return_url": "return_url4",
      "cancel_url": "cancel_url6"
    },
    "level_0": {
      "auth_code": "auth_code8"
    },
    "one_click": {
      "auth_code": "auth_code0",
      "consumer_reference": "consumer_reference2",
      "alias_label": "alias_label6",
      "alias_key": "alias_key4"
    }
  }
}
```

