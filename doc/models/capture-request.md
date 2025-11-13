
# Capture Request

Captures either a portion or the full authorized amount of an authorized payment.

## Structure

`CaptureRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives.<br><br>**Constraints**: *Maximum Length*: `127` | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `FinalCapture` | `Boolean` | Optional | Indicates whether you can make additional captures against the authorized payment. Set to `true` if you do not intend to capture additional payments against the authorization. Set to `false` if you intend to capture additional payments against the authorization.<br><br>**Default**: `false` | Boolean getFinalCapture() | setFinalCapture(Boolean finalCapture) |
| `PaymentInstruction` | [`CapturePaymentInstruction`](../../doc/models/capture-payment-instruction.md) | Optional | Any additional payment instructions to be consider during payment processing. This processing instruction is applicable for Capturing an order or Authorizing an Order. | CapturePaymentInstruction getPaymentInstruction() | setPaymentInstruction(CapturePaymentInstruction paymentInstruction) |
| `NoteToPayer` | `String` | Optional | An informational note about this settlement. Appears in both the payer's transaction history and the emails that the payer receives.<br><br>**Constraints**: *Maximum Length*: `255` | String getNoteToPayer() | setNoteToPayer(String noteToPayer) |
| `SoftDescriptor` | `String` | Optional | The payment descriptor on the payer's account statement.<br><br>**Constraints**: *Maximum Length*: `22` | String getSoftDescriptor() | setSoftDescriptor(String softDescriptor) |

## Example (as JSON)

```json
{
  "final_capture": false,
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id4",
  "payment_instruction": {
    "platform_fees": [
      {
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        },
        "payee": {
          "email_address": "email_address4",
          "merchant_id": "merchant_id6"
        }
      },
      {
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        },
        "payee": {
          "email_address": "email_address4",
          "merchant_id": "merchant_id6"
        }
      },
      {
        "amount": {
          "currency_code": "currency_code6",
          "value": "value0"
        },
        "payee": {
          "email_address": "email_address4",
          "merchant_id": "merchant_id6"
        }
      }
    ],
    "disbursement_mode": "INSTANT",
    "payee_receivable_fx_rate_id": "payee_receivable_fx_rate_id0"
  },
  "note_to_payer": "note_to_payer6"
}
```

