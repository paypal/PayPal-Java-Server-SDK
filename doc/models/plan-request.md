
# Plan Request

The create plan request details.

## Structure

`PlanRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ProductId` | `String` | Required | The ID of the product created through Catalog Products API.<br><br>**Constraints**: *Minimum Length*: `22`, *Maximum Length*: `22`, *Pattern*: `^PROD-[A-Z0-9]*$` | String getProductId() | setProductId(String productId) |
| `Name` | `String` | Required | The plan name.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getName() | setName(String name) |
| `Status` | [`PlanRequestStatus`](../../doc/models/plan-request-status.md) | Optional | The initial state of the plan. Allowed input values are CREATED and ACTIVE.<br><br>**Default**: `PlanRequestStatus.ACTIVE`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | PlanRequestStatus getStatus() | setStatus(PlanRequestStatus status) |
| `Description` | `String` | Optional | The detailed description of the plan.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getDescription() | setDescription(String description) |
| `BillingCycles` | [`List<SubscriptionBillingCycle>`](../../doc/models/subscription-billing-cycle.md) | Required | An array of billing cycles for trial billing and regular billing. A plan can have at most two trial cycles and only one regular cycle.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `12` | List<SubscriptionBillingCycle> getBillingCycles() | setBillingCycles(List<SubscriptionBillingCycle> billingCycles) |
| `PaymentPreferences` | [`PaymentPreferences`](../../doc/models/payment-preferences.md) | Required | The payment preferences for a subscription. | PaymentPreferences getPaymentPreferences() | setPaymentPreferences(PaymentPreferences paymentPreferences) |
| `MerchantPreferences` | [`MerchantPreferences`](../../doc/models/merchant-preferences.md) | Optional | The merchant preferences for a subscription. | MerchantPreferences getMerchantPreferences() | setMerchantPreferences(MerchantPreferences merchantPreferences) |
| `Taxes` | [`Taxes`](../../doc/models/taxes.md) | Optional | The tax details. | Taxes getTaxes() | setTaxes(Taxes taxes) |
| `QuantitySupported` | `Boolean` | Optional | Indicates whether you can subscribe to this plan by providing a quantity for the goods or service.<br><br>**Default**: `false` | Boolean getQuantitySupported() | setQuantitySupported(Boolean quantitySupported) |

## Example

```java
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

PlanRequest planRequest = new PlanRequest.Builder(
    "product_id4",
    "name0",
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
.description("description0")
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
.build();
```

