
# Incentive Information

The incentive details.

## Structure

`IncentiveInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IncentiveDetails` | [`List<IncentiveDetails>`](../../doc/models/incentive-details.md) | Optional | An array of incentive details.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32767` | List<IncentiveDetails> getIncentiveDetails() | setIncentiveDetails(List<IncentiveDetails> incentiveDetails) |

## Example

```java
import com.paypal.sdk.models.IncentiveDetails;
import com.paypal.sdk.models.IncentiveInformation;
import com.paypal.sdk.models.Money;
import java.util.Arrays;

IncentiveInformation incentiveInformation = new IncentiveInformation.Builder()
    .incentiveDetails(Arrays.asList(
        new IncentiveDetails.Builder()
            .incentiveType("incentive_type4")
            .incentiveCode("incentive_code0")
            .incentiveAmount(new Money.Builder(
                "currency_code4",
                "value0"
            )
            .build())
            .incentiveProgramCode("incentive_program_code4")
            .build()
    ))
    .build();
```

