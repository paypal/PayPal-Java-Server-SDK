
# Plan Override

An inline plan object to customise the subscription. You can override plan level default attributes by providing customised values for the subscription in this object.

## Structure

`PlanOverride`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingCycles` | [`List<BillingCycleOverride>`](../../doc/models/billing-cycle-override.md) | Optional | An array of billing cycles for trial billing and regular billing. The subscription billing cycle definition has to adhere to the plan billing cycle definition.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `12` | List<BillingCycleOverride> getBillingCycles() | setBillingCycles(List<BillingCycleOverride> billingCycles) |
| `PaymentPreferences` | [`PaymentPreferencesOverride`](../../doc/models/payment-preferences-override.md) | Optional | The payment preferences to override at subscription level. | PaymentPreferencesOverride getPaymentPreferences() | setPaymentPreferences(PaymentPreferencesOverride paymentPreferences) |
| `Taxes` | [`TaxesOverride`](../../doc/models/taxes-override.md) | Optional | The tax details. | TaxesOverride getTaxes() | setTaxes(TaxesOverride taxes) |

## Example

```java
import com.paypal.sdk.models.BillingCycleOverride;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PaymentPreferencesOverride;
import com.paypal.sdk.models.PlanOverride;
import com.paypal.sdk.models.PricingTier;
import com.paypal.sdk.models.SetupFeeFailureAction;
import com.paypal.sdk.models.SubscriptionPricingModel;
import com.paypal.sdk.models.SubscriptionPricingScheme;
import com.paypal.sdk.models.TaxesOverride;
import java.util.Arrays;

PlanOverride planOverride = new PlanOverride.Builder()
    .billingCycles(Arrays.asList(
        new BillingCycleOverride.Builder(
            8
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
        .totalCycles(198)
        .build(),
        new BillingCycleOverride.Builder(
            8
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
        .totalCycles(198)
        .build(),
        new BillingCycleOverride.Builder(
            8
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
        .totalCycles(198)
        .build()
    ))
    .paymentPreferences(new PaymentPreferencesOverride.Builder()
        .autoBillOutstanding(false)
        .setupFee(new Money.Builder(
            "currency_code8",
            "value4"
        )
        .build())
        .setupFeeFailureAction(SetupFeeFailureAction.CONTINUE)
        .paymentFailureThreshold(104)
        .build())
    .taxes(new TaxesOverride.Builder()
        .percentage("percentage8")
        .inclusive(false)
        .build())
    .build();
```

