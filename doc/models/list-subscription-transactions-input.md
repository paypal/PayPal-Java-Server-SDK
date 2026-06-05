
# List Subscription Transactions Input

Input structure for the method ListSubscriptionTransactionsAsync

## Structure

`ListSubscriptionTransactionsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the subscription. | String getId() | setId(String id) |
| `StartTime` | `String` | Required | The start time of the range of transactions to list.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getStartTime() | setStartTime(String startTime) |
| `EndTime` | `String` | Required | The end time of the range of transactions to list.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getEndTime() | setEndTime(String endTime) |

## Example

```java
import com.paypal.sdk.models.ListSubscriptionTransactionsInput;

ListSubscriptionTransactionsInput listSubscriptionTransactionsInput = new ListSubscriptionTransactionsInput.Builder(
    "id0",
    "start_time6",
    "end_time2"
)
.build();
```

