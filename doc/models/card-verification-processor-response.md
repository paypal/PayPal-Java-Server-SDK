
# Card Verification Processor Response

The processor response information for payment requests, such as direct credit card transactions.

## Structure

`CardVerificationProcessorResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AvsCode` | [`AvsCode`](../../doc/models/avs-code.md) | Optional | The address verification code for Visa, Discover, Mastercard, or American Express transactions. | AvsCode getAvsCode() | setAvsCode(AvsCode avsCode) |
| `CvvCode` | [`CvvCode`](../../doc/models/cvv-code.md) | Optional | The card verification value code for for Visa, Discover, Mastercard, or American Express. | CvvCode getCvvCode() | setCvvCode(CvvCode cvvCode) |

## Example (as JSON)

```json
{
  "avs_code": "E",
  "cvv_code": "All others"
}
```

