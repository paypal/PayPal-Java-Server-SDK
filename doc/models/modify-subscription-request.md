
# Modify Subscription Request

The request to update the quantity of the product or service in a subscription. You can also use this method to switch the plan and update the `shipping_amount` and `shipping_address` values for the subscription. This type of update requires the buyer's consent.

## Structure

`ModifySubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanId` | `String` | Optional | The unique PayPal-generated ID for the plan.<br><br>**Constraints**: *Minimum Length*: `26`, *Maximum Length*: `26`, *Pattern*: `^P-[A-Z0-9]*$` | String getPlanId() | setPlanId(String planId) |
| `Quantity` | `String` | Optional | The quantity of the product or service in the subscription.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^([0-9]+\|([0-9]+)?[.][0-9]+)$` | String getQuantity() | setQuantity(String quantity) |
| `ShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingAmount() | setShippingAmount(Money shippingAmount) |
| `ShippingAddress` | [`ShippingDetails`](../../doc/models/shipping-details.md) | Optional | The shipping details. | ShippingDetails getShippingAddress() | setShippingAddress(ShippingDetails shippingAddress) |
| `ApplicationContext` | [`SubscriptionPatchApplicationContext`](../../doc/models/subscription-patch-application-context.md) | Optional | The application context, which customizes the payer experience during the subscription approval process with PayPal. | SubscriptionPatchApplicationContext getApplicationContext() | setApplicationContext(SubscriptionPatchApplicationContext applicationContext) |
| `Plan` | [`PlanOverride`](../../doc/models/plan-override.md) | Optional | An inline plan object to customise the subscription. You can override plan level default attributes by providing customised values for the subscription in this object. | PlanOverride getPlan() | setPlan(PlanOverride plan) |

## Example

```java
import com.paypal.sdk.models.ExperienceContextShippingPreference;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.ModifySubscriptionRequest;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PayeePaymentMethodPreference;
import com.paypal.sdk.models.PaymentMethod;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.ShippingDetails;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.ShippingOption;
import com.paypal.sdk.models.ShippingType;
import com.paypal.sdk.models.SubscriptionPatchApplicationContext;
import java.util.Arrays;

ModifySubscriptionRequest modifySubscriptionRequest = new ModifySubscriptionRequest.Builder()
    .planId("plan_id0")
    .quantity("quantity4")
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
    .applicationContext(new SubscriptionPatchApplicationContext.Builder(
        "return_url0",
        "cancel_url2"
    )
    .brandName("brand_name8")
    .locale("locale2")
    .shippingPreference(ExperienceContextShippingPreference.SET_PROVIDED_ADDRESS)
    .paymentMethod(new PaymentMethod.Builder()
            .payeePreferred(PayeePaymentMethodPreference.UNRESTRICTED)
            .build())
    .build())
    .build();
```

