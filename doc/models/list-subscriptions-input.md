
# List Subscriptions Input

Input structure for the method ListSubscriptionsAsync

## Structure

`ListSubscriptionsInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanIds` | `String` | Optional | Filters the response by list of plan IDs. Filter supports upto 70 plan IDs. URLs should not exceed a length of 2000 characters. | String getPlanIds() | setPlanIds(String planIds) |
| `Statuses` | `String` | Optional | Filters the response by list of subscription statuses.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70`, *Pattern*: `^[A-Z_,]+$` | String getStatuses() | setStatuses(String statuses) |
| `CreatedAfter` | `String` | Optional | Filters the response by subscription creation start time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreatedAfter() | setCreatedAfter(String createdAfter) |
| `CreatedBefore` | `String` | Optional | Filters the response by subscription creation end time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreatedBefore() | setCreatedBefore(String createdBefore) |
| `StatusUpdatedBefore` | `String` | Optional | Filters the response by status update start time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getStatusUpdatedBefore() | setStatusUpdatedBefore(String statusUpdatedBefore) |
| `StatusUpdatedAfter` | `String` | Optional | Filters the response by status update end time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getStatusUpdatedAfter() | setStatusUpdatedAfter(String statusUpdatedAfter) |
| `Filter` | `String` | Optional | Filter the response using complex expressions that could use comparison operators like ge, gt, le, lt and logical operators such as 'and' and 'or'.<br><br>**Constraints**: *Minimum Length*: `0`, *Maximum Length*: `100` | String getFilter() | setFilter(String filter) |
| `PageSize` | `Integer` | Optional | The number of items to return in the response.<br><br>**Default**: `10`<br><br>**Constraints**: `>= 1`, `<= 20` | Integer getPageSize() | setPageSize(Integer pageSize) |
| `Page` | `Integer` | Optional | A non-zero integer which is the start index of the entire list of items to return in the response. The combination of `page=1` and `page_size=20` returns the first 20 items. The combination of `page=2` and `page_size=20` returns the next 20 items.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1`, `<= 10000000` | Integer getPage() | setPage(Integer page) |
| `CustomerIds` | `List<String>` | Optional | Filters the response by comma separated vault customer IDs (FSS subscriptions only).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Minimum Length*: `1`, *Maximum Length*: `22`, *Pattern*: `^[0-9a-zA-Z_-]+$` | List<String> getCustomerIds() | setCustomerIds(List<String> customerIds) |

## Example

```java
import com.paypal.sdk.models.ListSubscriptionsInput;
import java.util.Arrays;

ListSubscriptionsInput listSubscriptionsInput = new ListSubscriptionsInput.Builder()
    .planIds("plan_ids0")
    .statuses("statuses8")
    .createdAfter("created_after4")
    .createdBefore("created_before0")
    .statusUpdatedBefore("status_updated_before8")
    .statusUpdatedAfter("status_updated_after2")
    .filter("filter4")
    .pageSize(10)
    .page(1)
    .customerIds(Arrays.asList(
        "customer_ids1",
        "customer_ids2"
    ))
    .build();
```

