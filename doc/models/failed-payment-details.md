
# Failed Payment Details

The details for the failed payment of the subscription.

## Structure

`FailedPaymentDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |
| `Time` | `String` | Required | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getTime() | setTime(String time) |
| `ReasonCode` | [`ReasonCode`](../../doc/models/reason-code.md) | Optional, Read-only | The reason code for the payment failure.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `120`, *Pattern*: `^[A-Z_]+$` | ReasonCode getReasonCode() | setReasonCode(ReasonCode reasonCode) |
| `NextPaymentRetryTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getNextPaymentRetryTime() | setNextPaymentRetryTime(String nextPaymentRetryTime) |

## Example

```java
import com.paypal.sdk.models.FailedPaymentDetails;
import com.paypal.sdk.models.Money;

FailedPaymentDetails failedPaymentDetails = new FailedPaymentDetails.Builder(
    new Money.Builder(
        "currency_code6",
        "value0"
    )
    .build(),
    "time2"
)
.nextPaymentRetryTime("next_payment_retry_time8")
.build();
```

