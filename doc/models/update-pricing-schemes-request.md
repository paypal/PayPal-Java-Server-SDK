
# Update Pricing Schemes Request

The update pricing scheme request details.

## Structure

`UpdatePricingSchemesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PricingSchemes` | [`List<UpdatePricingScheme>`](../../doc/models/update-pricing-scheme.md) | Required | An array of pricing schemes.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `99` | List<UpdatePricingScheme> getPricingSchemes() | setPricingSchemes(List<UpdatePricingScheme> pricingSchemes) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PricingTier;
import com.paypal.sdk.models.SubscriptionPricingModel;
import com.paypal.sdk.models.SubscriptionPricingScheme;
import com.paypal.sdk.models.UpdatePricingScheme;
import com.paypal.sdk.models.UpdatePricingSchemesRequest;
import java.util.Arrays;

UpdatePricingSchemesRequest updatePricingSchemesRequest = new UpdatePricingSchemesRequest.Builder(
    Arrays.asList(
        new UpdatePricingScheme.Builder(
            34,
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
        .build()
    )
)
.build();
```

