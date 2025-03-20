
# Payment Token Request

Payment Token Request where the `source` defines the type of instrument to be stored.

## Structure

`PaymentTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`Customer`](../../doc/models/customer.md) | Optional | This object defines a customer in your system. Use it to manage customer profiles, save payment methods and contact details. | Customer getCustomer() | setCustomer(Customer customer) |
| `PaymentSource` | [`PaymentTokenRequestPaymentSource`](../../doc/models/payment-token-request-payment-source.md) | Required | The payment method to vault with the instrument details. | PaymentTokenRequestPaymentSource getPaymentSource() | setPaymentSource(PaymentTokenRequestPaymentSource paymentSource) |

## Example (as JSON)

```json
{
  "customer": {
    "id": "id0",
    "merchant_customer_id": "merchant_customer_id2"
  },
  "payment_source": {
    "card": {
      "name": "name6",
      "number": "number6",
      "expiry": "expiry4",
      "security_code": "security_code8",
      "brand": "RUPAY"
    },
    "token": {
      "id": "id6",
      "type": "SETUP_TOKEN"
    }
  }
}
```

