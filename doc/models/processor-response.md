
# Processor Response

The processor response information for payment requests, such as direct credit card transactions.

## Structure

`ProcessorResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AvsCode` | [`AvsCode`](../../doc/models/avs-code.md) | Optional, Read-only | The address verification code for Visa, Discover, Mastercard, or American Express transactions. | AvsCode getAvsCode() | setAvsCode(AvsCode avsCode) |
| `CvvCode` | [`CvvCode`](../../doc/models/cvv-code.md) | Optional, Read-only | The card verification value code for for Visa, Discover, Mastercard, or American Express. | CvvCode getCvvCode() | setCvvCode(CvvCode cvvCode) |
| `ResponseCode` | [`ProcessorResponseCode`](../../doc/models/processor-response-code.md) | Optional, Read-only | Processor response code for the non-PayPal payment processor errors. | ProcessorResponseCode getResponseCode() | setResponseCode(ProcessorResponseCode responseCode) |
| `PaymentAdviceCode` | [`PaymentAdviceCode`](../../doc/models/payment-advice-code.md) | Optional, Read-only | The declined payment transactions might have payment advice codes. The card networks, like Visa and Mastercard, return payment advice codes. | PaymentAdviceCode getPaymentAdviceCode() | setPaymentAdviceCode(PaymentAdviceCode paymentAdviceCode) |

## Example (as JSON)

```json
{
  "avs_code": "M",
  "cvv_code": "U",
  "response_code": "PPII",
  "payment_advice_code": "03"
}
```

