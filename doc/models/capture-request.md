
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

## Example

```java
import com.paypal.sdk.models.CapturePaymentInstruction;
import com.paypal.sdk.models.CaptureRequest;
import com.paypal.sdk.models.DisbursementMode;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PayeeBase;
import com.paypal.sdk.models.PlatformFee;
import java.util.Arrays;

CaptureRequest captureRequest = new CaptureRequest.Builder()
    .amount(new Money.Builder(
        "currency_code6",
        "value0"
    )
    .build())
    .invoiceId("invoice_id8")
    .finalCapture(false)
    .paymentInstruction(new CapturePaymentInstruction.Builder()
        .platformFees(Arrays.asList(
            new PlatformFee.Builder(
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .payee(new PayeeBase.Builder()
                    .emailAddress("email_address4")
                    .merchantId("merchant_id6")
                    .build())
            .build(),
            new PlatformFee.Builder(
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .payee(new PayeeBase.Builder()
                    .emailAddress("email_address4")
                    .merchantId("merchant_id6")
                    .build())
            .build(),
            new PlatformFee.Builder(
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .payee(new PayeeBase.Builder()
                    .emailAddress("email_address4")
                    .merchantId("merchant_id6")
                    .build())
            .build()
        ))
        .disbursementMode(DisbursementMode.INSTANT)
        .payeeReceivableFxRateId("payee_receivable_fx_rate_id0")
        .build())
    .noteToPayer("note_to_payer0")
    .build();
```

