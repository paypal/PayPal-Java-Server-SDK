
# Plan Collection

The list of plans with details.

## Structure

`PlanCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Plans` | [`List<BillingPlan>`](../../doc/models/billing-plan.md) | Optional | An array of plans.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `32767` | List<BillingPlan> getPlans() | setPlans(List<BillingPlan> plans) |
| `TotalItems` | `Integer` | Optional | The total number of items.<br><br>**Constraints**: `>= 0`, `<= 500000000` | Integer getTotalItems() | setTotalItems(Integer totalItems) |
| `TotalPages` | `Integer` | Optional | The total number of pages.<br><br>**Constraints**: `>= 0`, `<= 100000000` | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.BillingPlan;
import com.paypal.sdk.models.PlanCollection;
import com.paypal.sdk.models.SubscriptionPlanStatus;
import java.util.Arrays;

PlanCollection planCollection = new PlanCollection.Builder()
    .plans(Arrays.asList(
        new BillingPlan.Builder()
            .productId("product_id0")
            .name("name4")
            .status(SubscriptionPlanStatus.INACTIVE)
            .description("description4")
            .build(),
        new BillingPlan.Builder()
            .productId("product_id0")
            .name("name4")
            .status(SubscriptionPlanStatus.INACTIVE)
            .description("description4")
            .build(),
        new BillingPlan.Builder()
            .productId("product_id0")
            .name("name4")
            .status(SubscriptionPlanStatus.INACTIVE)
            .description("description4")
            .build()
    ))
    .totalItems(244)
    .totalPages(24)
    .build();
```

