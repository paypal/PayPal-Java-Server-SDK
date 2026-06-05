
# List Customer Payment Tokens Input

Input structure for the method ListCustomerPaymentTokensAsync

## Structure

`ListCustomerPaymentTokensInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerId` | `String` | Required | A unique identifier representing a specific customer in merchant's/partner's system or records.<br><br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getCustomerId() | setCustomerId(String customerId) |
| `PageSize` | `Integer` | Optional | A non-negative, non-zero integer indicating the maximum number of results to return at one time.<br><br>**Default**: `5`<br><br>**Constraints**: `>= 1`, `<= 5` | Integer getPageSize() | setPageSize(Integer pageSize) |
| `Page` | `Integer` | Optional | A non-negative, non-zero integer representing the page of the results.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1`, `<= 10` | Integer getPage() | setPage(Integer page) |
| `TotalRequired` | `Boolean` | Optional | A boolean indicating total number of items (total_items) and pages (total_pages) are expected to be returned in the response.<br><br>**Default**: `false` | Boolean getTotalRequired() | setTotalRequired(Boolean totalRequired) |

## Example

```java
import com.paypal.sdk.models.ListCustomerPaymentTokensInput;

ListCustomerPaymentTokensInput listCustomerPaymentTokensInput = new ListCustomerPaymentTokensInput.Builder(
    "customer_id8"
)
.pageSize(5)
.page(1)
.totalRequired(false)
.build();
```

