
# Incentive Details

The incentive details.

## Structure

`IncentiveDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IncentiveType` | `String` | Optional | The type of incentive, such as a special offer or coupon.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `500`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getIncentiveType() | setIncentiveType(String incentiveType) |
| `IncentiveCode` | `String` | Optional | The code that identifies an incentive, such as a coupon.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `200`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getIncentiveCode() | setIncentiveCode(String incentiveCode) |
| `IncentiveAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getIncentiveAmount() | setIncentiveAmount(Money incentiveAmount) |
| `IncentiveProgramCode` | `String` | Optional | The incentive program code that identifies a merchant loyalty or incentive program.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getIncentiveProgramCode() | setIncentiveProgramCode(String incentiveProgramCode) |

## Example

```java
import com.paypal.sdk.models.IncentiveDetails;
import com.paypal.sdk.models.Money;

IncentiveDetails incentiveDetails = new IncentiveDetails.Builder()
    .incentiveType("incentive_type0")
    .incentiveCode("incentive_code6")
    .incentiveAmount(new Money.Builder(
        "currency_code4",
        "value0"
    )
    .build())
    .incentiveProgramCode("incentive_program_code0")
    .build();
```

