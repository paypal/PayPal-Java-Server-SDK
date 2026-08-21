
# Create Subscription Request

The create subscription request details.

## Structure

`CreateSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanId` | `String` | Required | The ID of the plan.<br><br>**Constraints**: *Minimum Length*: `26`, *Maximum Length*: `26`, *Pattern*: `^P-[A-Z0-9]*$` | String getPlanId() | setPlanId(String planId) |
| `StartTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getStartTime() | setStartTime(String startTime) |
| `Quantity` | `String` | Optional | The quantity of the product in the subscription.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^([0-9]+\|([0-9]+)?[.][0-9]+)$` | String getQuantity() | setQuantity(String quantity) |
| `ShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingAmount() | setShippingAmount(Money shippingAmount) |
| `Subscriber` | [`SubscriberRequest`](../../doc/models/subscriber-request.md) | Optional | The subscriber request information . | SubscriberRequest getSubscriber() | setSubscriber(SubscriberRequest subscriber) |
| `AutoRenewal` | `Boolean` | Optional | DEPRECATED. Indicates whether the subscription auto-renews after the billing cycles complete.<br><br>**Default**: `false` | Boolean getAutoRenewal() | setAutoRenewal(Boolean autoRenewal) |
| `ApplicationContext` | [`SubscriptionApplicationContext`](../../doc/models/subscription-application-context.md) | Optional | DEPRECATED. The application context, which customizes the payer experience during the subscription approval process with PayPal. | SubscriptionApplicationContext getApplicationContext() | setApplicationContext(SubscriptionApplicationContext applicationContext) |
| `CustomId` | `String` | Optional | The custom id for the subscription. Can be invoice id.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^[\x20-\x7E]+` | String getCustomId() | setCustomId(String customId) |
| `Plan` | [`PlanOverride`](../../doc/models/plan-override.md) | Optional | An inline plan object to customise the subscription. You can override plan level default attributes by providing customised values for the subscription in this object. | PlanOverride getPlan() | setPlan(PlanOverride plan) |

## Example

```java
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.CreateSubscriptionRequest;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.ShippingDetails;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.ShippingOption;
import com.paypal.sdk.models.ShippingType;
import com.paypal.sdk.models.SubscriberRequest;
import com.paypal.sdk.models.SubscriptionCardRequest;
import com.paypal.sdk.models.SubscriptionPaymentSource;
import java.util.Arrays;

CreateSubscriptionRequest createSubscriptionRequest = new CreateSubscriptionRequest.Builder(
    "plan_id8"
)
.startTime("start_time0")
.quantity("quantity2")
.shippingAmount(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
.subscriber(new SubscriberRequest.Builder()
        .emailAddress("email_address8")
        .payerId("payer_id8")
        .name(new Name.Builder()
            .givenName("given_name2")
            .surname("surname8")
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
        .paymentSource(new SubscriptionPaymentSource.Builder()
            .card(new SubscriptionCardRequest.Builder()
                .name("name6")
                .number("number6")
                .expiry("expiry4")
                .securityCode("security_code8")
                .type(CardType.UNKNOWN)
                .build())
            .build())
        .build())
.autoRenewal(false)
.build();
```

