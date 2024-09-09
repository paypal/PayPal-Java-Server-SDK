
# Payment Token Response Payment Source

The vaulted payment method details.

## Structure

`PaymentTokenResponsePaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardPaymentToken`](../../doc/models/card-payment-token.md) | Optional | Full representation of a Card Payment Token including network token. | CardPaymentToken getCard() | setCard(CardPaymentToken card) |
| `Paypal` | [`PayPalPaymentToken`](../../doc/models/pay-pal-payment-token.md) | Optional | - | PayPalPaymentToken getPaypal() | setPaypal(PayPalPaymentToken paypal) |
| `Venmo` | [`VenmoPaymentToken`](../../doc/models/venmo-payment-token.md) | Optional | - | VenmoPaymentToken getVenmo() | setVenmo(VenmoPaymentToken venmo) |
| `ApplePay` | [`ApplePayPaymentToken`](../../doc/models/apple-pay-payment-token.md) | Optional | A resource representing a response for Apple Pay. | ApplePayPaymentToken getApplePay() | setApplePay(ApplePayPaymentToken applePay) |
| `Bank` | `JsonObject` | Optional | Full representation of a Bank Payment Token. | JsonObject getBank() | setBank(JsonObject bank) |

## Example (as JSON)

```json
{
  "card": {
    "name": "name6",
    "last_digits": "last_digits0",
    "brand": "RUPAY",
    "expiry": "expiry4",
    "billing_address": {
      "address_line_1": "address_line_12",
      "address_line_2": "address_line_28",
      "admin_area_2": "admin_area_28",
      "admin_area_1": "admin_area_14",
      "postal_code": "postal_code0",
      "country_code": "country_code8"
    }
  },
  "paypal": {
    "description": "description2",
    "shipping": {
      "name": {
        "full_name": "full_name6"
      },
      "type": "SHIPPING",
      "address": {
        "address_line_1": "address_line_16",
        "address_line_2": "address_line_26",
        "admin_area_2": "admin_area_20",
        "admin_area_1": "admin_area_12",
        "postal_code": "postal_code8",
        "country_code": "country_code6"
      }
    },
    "permit_multiple_payment_tokens": false,
    "usage_type": "usage_type2",
    "customer_type": "customer_type6"
  },
  "venmo": {
    "description": "description6",
    "shipping": {
      "name": {
        "full_name": "full_name6"
      },
      "type": "SHIPPING",
      "address": {
        "address_line_1": "address_line_16",
        "address_line_2": "address_line_26",
        "admin_area_2": "admin_area_20",
        "admin_area_1": "admin_area_12",
        "postal_code": "postal_code8",
        "country_code": "country_code6"
      }
    },
    "permit_multiple_payment_tokens": false,
    "usage_type": "usage_type6",
    "customer_type": "customer_type0"
  },
  "apple_pay": {
    "card": {
      "name": "name6",
      "last_digits": "last_digits0",
      "type": "UNKNOWN",
      "brand": "RUPAY",
      "billing_address": {
        "address_line_1": "address_line_12",
        "address_line_2": "address_line_28",
        "admin_area_2": "admin_area_28",
        "admin_area_1": "admin_area_14",
        "postal_code": "postal_code0",
        "country_code": "country_code8"
      }
    }
  },
  "bank": {
    "key1": "val1",
    "key2": "val2"
  }
}
```
