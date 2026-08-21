
# Subscription Collection

The list of subscriptions.

## Structure

`SubscriptionCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscriptions` | [`List<Subscription>`](../../doc/models/subscription.md) | Optional | An array of subscriptions.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `32767` | List<Subscription> getSubscriptions() | setSubscriptions(List<Subscription> subscriptions) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Subscription;
import com.paypal.sdk.models.SubscriptionCollection;
import java.util.Arrays;

SubscriptionCollection subscriptionCollection = new SubscriptionCollection.Builder()
    .subscriptions(Arrays.asList(
        new Subscription.Builder()
            .planId("plan_id8")
            .startTime("start_time0")
            .quantity("quantity2")
            .shippingAmount(new Money.Builder(
                "currency_code0",
                "value6"
            )
            .build())
            .build(),
        new Subscription.Builder()
            .planId("plan_id8")
            .startTime("start_time0")
            .quantity("quantity2")
            .shippingAmount(new Money.Builder(
                "currency_code0",
                "value6"
            )
            .build())
            .build()
    ))
    .build();
```

