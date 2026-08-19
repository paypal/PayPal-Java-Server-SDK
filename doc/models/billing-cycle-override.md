
# Billing Cycle Override

The billing cycle details to override at subscription level. The subscription billing cycle definition has to adhere to the plan billing cycle definition.

## Structure

`BillingCycleOverride`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingScheme` | [`SubscriptionPricingScheme`](../../doc/models/subscription-pricing-scheme.md) | Optional | The pricing scheme details. | SubscriptionPricingScheme getPricingScheme() | setPricingScheme(SubscriptionPricingScheme pricingScheme) |
| `Sequence` | `int` | Required | The order in which this cycle is to run among other billing cycles. For example, a trial billing cycle has a `sequence` of `1` while a regular billing cycle has a `sequence` of `2`, so that trial cycle runs before the regular cycle.<br><br>**Constraints**: `>= 1`, `<= 99` | int getSequence() | setSequence(int sequence) |
| `TotalCycles` | `Integer` | Optional | The number of times this billing cycle gets executed. Trial billing cycles can only be executed a finite number of times (value between 1 and 999 for total_cycles). Regular billing cycles can be executed infinite times (value of 0 for total_cycles) or a finite number of times (value between 1 and 999 for total_cycles).<br><br>**Constraints**: `>= 0`, `<= 999` | Integer getTotalCycles() | setTotalCycles(Integer totalCycles) |

## Example

```java
import com.paypal.sdk.models.BillingCycleOverride;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PricingTier;
import com.paypal.sdk.models.SubscriptionPricingModel;
import com.paypal.sdk.models.SubscriptionPricingScheme;
import java.util.Arrays;

BillingCycleOverride billingCycleOverride = new BillingCycleOverride.Builder(
    20
)
.pricingScheme(new SubscriptionPricingScheme.Builder()
        .fixedPrice(new Money.Builder(
            "currency_code4",
            "value0"
        )
        .build())
        .pricingModel(SubscriptionPricingModel.VOLUME)
        .tiers(Arrays.asList(
            new PricingTier.Builder(
                "starting_quantity8",
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .endingQuantity("ending_quantity6")
            .build(),
            new PricingTier.Builder(
                "starting_quantity8",
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .endingQuantity("ending_quantity6")
            .build(),
            new PricingTier.Builder(
                "starting_quantity8",
                new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .endingQuantity("ending_quantity6")
            .build()
        ))
        .createTime("create_time4")
        .build())
.totalCycles(210)
.build();
```

