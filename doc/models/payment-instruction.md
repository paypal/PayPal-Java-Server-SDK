
# Payment Instruction

Any additional payment instructions to be consider during payment processing. This processing instruction is applicable for Capturing an order or Authorizing an Order.

## Structure

`PaymentInstruction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlatformFees` | [`List<PlatformFee>`](../../doc/models/platform-fee.md) | Optional | An array of various fees, commissions, tips, or donations. This field is only applicable to merchants that been enabled for PayPal Complete Payments Platform for Marketplaces and Platforms capability.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1` | List<PlatformFee> getPlatformFees() | setPlatformFees(List<PlatformFee> platformFees) |
| `DisbursementMode` | [`DisbursementMode`](../../doc/models/disbursement-mode.md) | Optional | The funds that are held on behalf of the merchant.<br><br>**Default**: `DisbursementMode.INSTANT`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16`, *Pattern*: `^[A-Z_]+$` | DisbursementMode getDisbursementMode() | setDisbursementMode(DisbursementMode disbursementMode) |
| `PayeePricingTierId` | `String` | Optional | This field is only enabled for selected merchants/partners to use and provides the ability to trigger a specific pricing rate/plan for a payment transaction. The list of eligible 'payee_pricing_tier_id' would be provided to you by your Account Manager. Specifying values other than the one provided to you by your account manager would result in an error.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `20`, *Pattern*: `^.*$` | String getPayeePricingTierId() | setPayeePricingTierId(String payeePricingTierId) |
| `PayeeReceivableFxRateId` | `String` | Optional | FX identifier generated returned by PayPal to be used for payment processing in order to honor FX rate (for eligible integrations) to be used when amount is settled/received into the payee account.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `4000`, *Pattern*: `^.*$` | String getPayeeReceivableFxRateId() | setPayeeReceivableFxRateId(String payeeReceivableFxRateId) |

## Example

```java
import com.paypal.sdk.models.DisbursementMode;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PayeeBase;
import com.paypal.sdk.models.PaymentInstruction;
import com.paypal.sdk.models.PlatformFee;
import java.util.Arrays;

PaymentInstruction paymentInstruction = new PaymentInstruction.Builder()
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
    .payeePricingTierId("payee_pricing_tier_id0")
    .payeeReceivableFxRateId("payee_receivable_fx_rate_id2")
    .build();
```

