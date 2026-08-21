
# Modify Subscription Response

The response to a request to update the quantity of the product or service in a subscription. You can also use this method to switch the plan and update the `shipping_amount` and `shipping_address` values for the subscription. This type of update requires the buyer's consent.

## Structure

`ModifySubscriptionResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanId` | `String` | Optional | The unique PayPal-generated ID for the plan.<br><br>**Constraints**: *Minimum Length*: `26`, *Maximum Length*: `26`, *Pattern*: `^P-[A-Z0-9]*$` | String getPlanId() | setPlanId(String planId) |
| `Quantity` | `String` | Optional | The quantity of the product or service in the subscription.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^([0-9]+\|([0-9]+)?[.][0-9]+)$` | String getQuantity() | setQuantity(String quantity) |
| `ShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingAmount() | setShippingAmount(Money shippingAmount) |
| `ShippingAddress` | [`ShippingDetails`](../../doc/models/shipping-details.md) | Optional | The shipping details. | ShippingDetails getShippingAddress() | setShippingAddress(ShippingDetails shippingAddress) |
| `Plan` | [`PlanOverride`](../../doc/models/plan-override.md) | Optional | An inline plan object to customise the subscription. You can override plan level default attributes by providing customised values for the subscription in this object. | PlanOverride getPlan() | setPlan(PlanOverride plan) |
| `PlanOverridden` | `Boolean` | Optional, Read-only | Indicates whether the subscription has overridden any plan attributes. | Boolean getPlanOverridden() | setPlanOverridden(Boolean planOverridden) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.BillingCycleOverride;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.ModifySubscriptionResponse;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PaymentPreferencesOverride;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.PlanOverride;
import com.paypal.sdk.models.PricingTier;
import com.paypal.sdk.models.SetupFeeFailureAction;
import com.paypal.sdk.models.ShippingDetails;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.ShippingOption;
import com.paypal.sdk.models.ShippingType;
import com.paypal.sdk.models.SubscriptionPricingModel;
import com.paypal.sdk.models.SubscriptionPricingScheme;
import com.paypal.sdk.models.TaxesOverride;
import java.util.Arrays;

ModifySubscriptionResponse modifySubscriptionResponse = new ModifySubscriptionResponse.Builder()
    .planId("plan_id4")
    .quantity("quantity8")
    .shippingAmount(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
    .shippingAddress(new ShippingDetails.Builder()
        .name(new ShippingName.Builder()
            .fullName("full_name6")
            .build())
        .emailAddress("email_address8")
        .phoneNumber(new PhoneNumberWithCountryCode.Builder(
            "country_code2",
            "national_number6"
        )
        .build())
        .type(FulfillmentType.PICKUP_IN_STORE)
        .options(Arrays.asList(
            new ShippingOption.Builder(
                "id2",
                "label2",
                false
            )
            .type(ShippingType.SHIPPING)
            .amount(new Money.Builder(
                    "currency_code6",
                    "value0"
                )
                .build())
            .build()
        ))
        .build())
    .plan(new PlanOverride.Builder()
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
        .build())
    .build();
```

