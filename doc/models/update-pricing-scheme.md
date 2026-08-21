
# Update Pricing Scheme

The update pricing scheme request details.

## Structure

`UpdatePricingScheme`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingCycleSequence` | `int` | Required | The billing cycle sequence.<br><br>**Constraints**: `>= 1`, `<= 99` | int getBillingCycleSequence() | setBillingCycleSequence(int billingCycleSequence) |
| `PricingScheme` | [`SubscriptionPricingScheme`](../../doc/models/subscription-pricing-scheme.md) | Required | The pricing scheme details. | SubscriptionPricingScheme getPricingScheme() | setPricingScheme(SubscriptionPricingScheme pricingScheme) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PricingTier;
import com.paypal.sdk.models.SubscriptionPricingModel;
import com.paypal.sdk.models.SubscriptionPricingScheme;
import com.paypal.sdk.models.UpdatePricingScheme;
import java.util.Arrays;

UpdatePricingScheme updatePricingScheme = new UpdatePricingScheme.Builder(
    99,
    new SubscriptionPricingScheme.Builder()
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
        .build()
)
.build();
```

