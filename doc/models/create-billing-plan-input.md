
# Create Billing Plan Input

Input structure for the method CreateBillingPlanAsync

## Structure

`CreateBillingPlanInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` | String getPrefer() | setPrefer(String prefer) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 72 hours. | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `Body` | [`PlanRequest`](../../doc/models/plan-request.md) | Optional | - | PlanRequest getBody() | setBody(PlanRequest body) |

## Example

```java
import com.paypal.sdk.models.CreateBillingPlanInput;
import com.paypal.sdk.models.Frequency;
import com.paypal.sdk.models.IntervalUnit;
import com.paypal.sdk.models.MerchantPreferences;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PaymentPreferences;
import com.paypal.sdk.models.PlanRequest;
import com.paypal.sdk.models.PlanRequestStatus;
import com.paypal.sdk.models.PricingTier;
import com.paypal.sdk.models.SetupFeeFailureAction;
import com.paypal.sdk.models.SubscriptionBillingCycle;
import com.paypal.sdk.models.SubscriptionPricingModel;
import com.paypal.sdk.models.SubscriptionPricingScheme;
import com.paypal.sdk.models.Taxes;
import com.paypal.sdk.models.TenureType;
import java.util.Arrays;

CreateBillingPlanInput createBillingPlanInput = new CreateBillingPlanInput.Builder(
    "application/json"
)
.prefer("return=minimal")
.paypalRequestId("PayPal-Request-Id6")
.body(new PlanRequest.Builder(
        "product_id2",
        "name6",
        Arrays.asList(
            new SubscriptionBillingCycle.Builder(
                new Frequency.Builder(
                    IntervalUnit.DAY
                )
                .intervalCount(1)
                .build(),
                TenureType.REGULAR,
                8
            )
            .pricingScheme(new SubscriptionPricingScheme.Builder()
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
                    .build())
            .totalCycles(1)
            .build()
        ),
        new PaymentPreferences.Builder()
            .autoBillOutstanding(true)
            .setupFee(new Money.Builder(
                "currency_code8",
                "value4"
            )
            .build())
            .setupFeeFailureAction(SetupFeeFailureAction.CANCEL)
            .paymentFailureThreshold(0)
            .build()
    )
    .status(PlanRequestStatus.ACTIVE)
    .description("description4")
    .merchantPreferences(new MerchantPreferences.Builder()
            .returnUrl("return_url4")
            .cancelUrl("cancel_url6")
            .build())
    .taxes(new Taxes.Builder(
            "percentage8"
        )
        .inclusive(false)
        .build())
    .quantitySupported(false)
    .build())
.build();
```

