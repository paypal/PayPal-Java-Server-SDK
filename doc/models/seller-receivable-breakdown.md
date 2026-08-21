
# Seller Receivable Breakdown

The detailed breakdown of the capture activity. This is not available for transactions that are in pending state.

## Structure

`SellerReceivableBreakdown`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrossAmount` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getGrossAmount() | setGrossAmount(Money grossAmount) |
| `PaypalFee` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getPaypalFee() | setPaypalFee(Money paypalFee) |
| `PaypalFeeInReceivableCurrency` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getPaypalFeeInReceivableCurrency() | setPaypalFeeInReceivableCurrency(Money paypalFeeInReceivableCurrency) |
| `NetAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getNetAmount() | setNetAmount(Money netAmount) |
| `ReceivableAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getReceivableAmount() | setReceivableAmount(Money receivableAmount) |
| `ExchangeRate` | [`ExchangeRate`](../../doc/models/exchange-rate.md) | Optional, Read-only | The exchange rate that determines the amount to convert from one currency to another currency. | ExchangeRate getExchangeRate() | setExchangeRate(ExchangeRate exchangeRate) |
| `PlatformFees` | [`List<PlatformFee>`](../../doc/models/platform-fee.md) | Optional | An array of platform or partner fees, commissions, or brokerage fees that associated with the captured payment.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `1` | List<PlatformFee> getPlatformFees() | setPlatformFees(List<PlatformFee> platformFees) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.SellerReceivableBreakdown;

SellerReceivableBreakdown sellerReceivableBreakdown = new SellerReceivableBreakdown.Builder(
    new Money.Builder(
        "currency_code4",
        "value0"
    )
    .build()
)
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
.receivableAmount(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
.build();
```

