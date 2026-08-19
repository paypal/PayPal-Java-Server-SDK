
# Seller Payable Breakdown

The breakdown of the refund.

## Structure

`SellerPayableBreakdown`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrossAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getGrossAmount() | setGrossAmount(Money grossAmount) |
| `PaypalFee` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getPaypalFee() | setPaypalFee(Money paypalFee) |
| `PaypalFeeInReceivableCurrency` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getPaypalFeeInReceivableCurrency() | setPaypalFeeInReceivableCurrency(Money paypalFeeInReceivableCurrency) |
| `NetAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getNetAmount() | setNetAmount(Money netAmount) |
| `NetAmountInReceivableCurrency` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getNetAmountInReceivableCurrency() | setNetAmountInReceivableCurrency(Money netAmountInReceivableCurrency) |
| `PlatformFees` | [`List<PlatformFee>`](../../doc/models/platform-fee.md) | Optional | An array of platform or partner fees, commissions, or brokerage fees for the refund.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1` | List<PlatformFee> getPlatformFees() | setPlatformFees(List<PlatformFee> platformFees) |
| `NetAmountBreakdown` | [`List<NetAmountBreakdownItem>`](../../doc/models/net-amount-breakdown-item.md) | Optional, Read-only | An array of breakdown values for the net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the payee holds their funds. | List<NetAmountBreakdownItem> getNetAmountBreakdown() | setNetAmountBreakdown(List<NetAmountBreakdownItem> netAmountBreakdown) |
| `TotalRefundedAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTotalRefundedAmount() | setTotalRefundedAmount(Money totalRefundedAmount) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.SellerPayableBreakdown;

SellerPayableBreakdown sellerPayableBreakdown = new SellerPayableBreakdown.Builder()
    .grossAmount(new Money.Builder(
        "currency_code4",
        "value0"
    )
    .build())
    .paypalFee(new Money.Builder(
        "currency_code4",
        "value2"
    )
    .build())
    .paypalFeeInReceivableCurrency(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
    .netAmount(new Money.Builder(
        "currency_code6",
        "value2"
    )
    .build())
    .netAmountInReceivableCurrency(new Money.Builder(
        "currency_code8",
        "value4"
    )
    .build())
    .build();
```

