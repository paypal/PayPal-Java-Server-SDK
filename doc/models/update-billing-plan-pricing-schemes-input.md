
# Update Billing Plan Pricing Schemes Input

Input structure for the method UpdateBillingPlanPricingSchemesAsync

## Structure

`UpdateBillingPlanPricingSchemesInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID for the plan. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`UpdatePricingSchemesRequest`](../../doc/models/update-pricing-schemes-request.md) | Optional | - | UpdatePricingSchemesRequest getBody() | setBody(UpdatePricingSchemesRequest body) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PricingTier;
import com.paypal.sdk.models.SubscriptionPricingModel;
import com.paypal.sdk.models.SubscriptionPricingScheme;
import com.paypal.sdk.models.UpdateBillingPlanPricingSchemesInput;
import com.paypal.sdk.models.UpdatePricingScheme;
import com.paypal.sdk.models.UpdatePricingSchemesRequest;
import java.util.Arrays;

UpdateBillingPlanPricingSchemesInput updateBillingPlanPricingSchemesInput = new UpdateBillingPlanPricingSchemesInput.Builder(
    "id0",
    "application/json"
)
.body(new UpdatePricingSchemesRequest.Builder(
        Arrays.asList(
            new UpdatePricingScheme.Builder(
                34,
                new SubscriptionPricingScheme.Builder()
                    .version(10)
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
    .build())
.build();
```

