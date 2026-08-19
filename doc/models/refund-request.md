
# Refund Request

Refunds a captured payment, by ID. For a full refund, include an empty request body. For a partial refund, include an amount object in the request body.

## Structure

`RefundRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports. The pattern is defined by an external party and supports Unicode.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getCustomId() | setCustomId(String customId) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice ID for this order. The pattern is defined by an external party and supports Unicode.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `NoteToPayer` | `String` | Optional | The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives. The pattern is defined by an external party and supports Unicode.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^.*$` | String getNoteToPayer() | setNoteToPayer(String noteToPayer) |
| `PaymentInstruction` | [`RefundPaymentInstruction`](../../doc/models/refund-payment-instruction.md) | Optional | Any additional payments instructions during refund payment processing. This object is only applicable to merchants that have been enabled for PayPal Commerce Platform for Marketplaces and Platforms capability. Please speak to your account manager if you want to use this capability. | RefundPaymentInstruction getPaymentInstruction() | setPaymentInstruction(RefundPaymentInstruction paymentInstruction) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.RefundPaymentInstruction;
import com.paypal.sdk.models.RefundPlatformFee;
import com.paypal.sdk.models.RefundRequest;
import java.util.Arrays;

RefundRequest refundRequest = new RefundRequest.Builder()
    .amount(new Money.Builder(
        "currency_code6",
        "value0"
    )
    .build())
    .customId("custom_id2")
    .invoiceId("invoice_id4")
    .noteToPayer("note_to_payer6")
    .paymentInstruction(new RefundPaymentInstruction.Builder()
        .platformFees(Arrays.asList(
            new RefundPlatformFee.Builder(
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .build(),
            new RefundPlatformFee.Builder(
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .build(),
            new RefundPlatformFee.Builder(
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .build()
        ))
        .build())
    .build();
```

