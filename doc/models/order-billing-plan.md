
# Order Billing Plan

Metadata for merchant-managed recurring billing plans. Valid only during the saved payment method token or billing agreement creation.

## Structure

`OrderBillingPlan`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingCycles` | [`List<BillingCycle>`](../../doc/models/billing-cycle.md) | Required | An array of billing cycles for trial billing and regular billing. A plan can have at most two trial cycles and only one regular cycle.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `3` | List<BillingCycle> getBillingCycles() | setBillingCycles(List<BillingCycle> billingCycles) |
| `SetupFee` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getSetupFee() | setSetupFee(Money setupFee) |
| `Name` | `String` | Optional | Name of the recurring plan.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^[A-Za-z0-9() +',.:-]+$` | String getName() | setName(String name) |

## Example

```java
import com.paypal.sdk.models.BillingCycle;
import com.paypal.sdk.models.CycleFrequency;
import com.paypal.sdk.models.FrequencyIntervalUnit;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.OrderBillingPlan;
import com.paypal.sdk.models.PricingModel;
import com.paypal.sdk.models.PricingScheme;
import com.paypal.sdk.models.TenureType;
import java.util.Arrays;

OrderBillingPlan orderBillingPlan = new OrderBillingPlan.Builder(
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
    )
)
.setupFee(new Money.Builder(
        "currency_code8",
        "value4"
    )
    .build())
.name("name6")
.build();
```

