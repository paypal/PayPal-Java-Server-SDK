
# Subscription Amount with Breakdown

The breakdown details for the amount. Includes the gross, tax, fee, and shipping amounts.

## Structure

`SubscriptionAmountWithBreakdown`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrossAmount` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getGrossAmount() | setGrossAmount(Money grossAmount) |
| `TotalItemAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTotalItemAmount() | setTotalItemAmount(Money totalItemAmount) |
| `FeeAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getFeeAmount() | setFeeAmount(Money feeAmount) |
| `ShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingAmount() | setShippingAmount(Money shippingAmount) |
| `TaxAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTaxAmount() | setTaxAmount(Money taxAmount) |
| `NetAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getNetAmount() | setNetAmount(Money netAmount) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.SubscriptionAmountWithBreakdown;

SubscriptionAmountWithBreakdown subscriptionAmountWithBreakdown = new SubscriptionAmountWithBreakdown.Builder(
    new Money.Builder(
        "currency_code4",
        "value0"
    )
    .build()
)
.totalItemAmount(new Money.Builder(
        "currency_code8",
        "value4"
    )
    .build())
.feeAmount(new Money.Builder(
        "currency_code2",
        "value4"
    )
    .build())
.shippingAmount(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
.taxAmount(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
.netAmount(new Money.Builder(
        "currency_code6",
        "value2"
    )
    .build())
.build();
```

