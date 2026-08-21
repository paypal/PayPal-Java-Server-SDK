
# Net Amount Breakdown Item

The net amount. Returned when the currency of the refund is different from the currency of the PayPal account where the merchant holds their funds.

## Structure

`NetAmountBreakdownItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayableAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getPayableAmount() | setPayableAmount(Money payableAmount) |
| `ConvertedAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getConvertedAmount() | setConvertedAmount(Money convertedAmount) |
| `ExchangeRate` | [`ExchangeRate`](../../doc/models/exchange-rate.md) | Optional, Read-only | The exchange rate that determines the amount to convert from one currency to another currency. | ExchangeRate getExchangeRate() | setExchangeRate(ExchangeRate exchangeRate) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.NetAmountBreakdownItem;

NetAmountBreakdownItem netAmountBreakdownItem = new NetAmountBreakdownItem.Builder()
    .payableAmount(new Money.Builder(
        "currency_code8",
        "value4"
    )
    .build())
    .convertedAmount(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
    .build();
```

