
# Refund Payment Instruction

Any additional payments instructions during refund payment processing. This object is only applicable to merchants that have been enabled for PayPal Commerce Platform for Marketplaces and Platforms capability. Please speak to your account manager if you want to use this capability.

## Structure

`RefundPaymentInstruction`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlatformFees` | [`List<RefundPlatformFee>`](../../doc/models/refund-platform-fee.md) | Optional | Specifies the amount that the API caller will contribute to the refund being processed. The amount needs to be lower than platform_fees amount originally captured or the amount that is remaining if multiple refunds have been processed. This field is only applicable to merchants that have been enabled for PayPal Commerce Platform for Marketplaces and Platforms capability. Please speak to your account manager if you want to use this capability.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1` | List<RefundPlatformFee> getPlatformFees() | setPlatformFees(List<RefundPlatformFee> platformFees) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.RefundPaymentInstruction;
import com.paypal.sdk.models.RefundPlatformFee;
import java.util.Arrays;

RefundPaymentInstruction refundPaymentInstruction = new RefundPaymentInstruction.Builder()
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
    .build();
```

