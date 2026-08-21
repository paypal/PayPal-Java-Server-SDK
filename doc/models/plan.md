
# Plan

The merchant level Recurring Billing plan metadata for the Billing Agreement.

## Structure

`Plan`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingCycles` | [`List<BillingCycle>`](../../doc/models/billing-cycle.md) | Required | An array of billing cycles for trial billing and regular billing. A plan can have at most two trial cycles and only one regular cycle.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `3` | List<BillingCycle> getBillingCycles() | setBillingCycles(List<BillingCycle> billingCycles) |
| `OneTimeCharges` | [`OneTimeCharge`](../../doc/models/one-time-charge.md) | Required | The one-time charge info at the time of checkout. | OneTimeCharge getOneTimeCharges() | setOneTimeCharges(OneTimeCharge oneTimeCharges) |
| `Name` | `String` | Optional | Name of the recurring plan.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^[A-Za-z0-9() +',.:-]+$` | String getName() | setName(String name) |

## Example

```java
import com.paypal.sdk.models.BillingCycle;
import com.paypal.sdk.models.CycleFrequency;
import com.paypal.sdk.models.FrequencyIntervalUnit;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.OneTimeCharge;
import com.paypal.sdk.models.Plan;
import com.paypal.sdk.models.PricingModel;
import com.paypal.sdk.models.PricingScheme;
import com.paypal.sdk.models.TenureType;
import java.util.Arrays;

Plan plan = new Plan.Builder(
    Arrays.asList(
        new BillingCycle.Builder(
            TenureType.REGULAR
        )
        .pricingScheme(new PricingScheme.Builder(
                PricingModel.AUTO_RELOAD
            )
            .price(new Money.Builder(
                    "currency_code8",
                    "value4"
                )
                .build())
            .reloadThresholdAmount(new Money.Builder(
                    "currency_code0",
                    "value6"
                )
                .build())
            .build())
        .totalCycles(1)
        .sequence(1)
        .startDate("start_date6")
        .frequency(new CycleFrequency.Builder(
                FrequencyIntervalUnit.LIFETIME
            )
            .intervalCount(94)
            .build())
        .build()
    ),
    new OneTimeCharge.Builder(
        new Money.Builder(
            "currency_code2",
            "value8"
        )
        .build()
    )
    .setupFee(new Money.Builder(
            "currency_code8",
            "value4"
        )
        .build())
    .shippingAmount(new Money.Builder(
            "currency_code0",
            "value6"
        )
        .build())
    .taxes(new Money.Builder(
            "currency_code6",
            "value2"
        )
        .build())
    .productPrice(new Money.Builder(
            "currency_code6",
            "value2"
        )
        .build())
    .subtotal(new Money.Builder(
            "currency_code2",
            "value8"
        )
        .build())
    .build()
)
.name("name4")
.build();
```

