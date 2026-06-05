
# List Billing Plans Input

Input structure for the method ListBillingPlansAsync

## Structure

`ListBillingPlansInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, name, description and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` | String getPrefer() | setPrefer(String prefer) |
| `ProductId` | `String` | Optional | Filters the response by a Product ID.<br><br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `50` | String getProductId() | setProductId(String productId) |
| `PageSize` | `Integer` | Optional | The number of items to return in the response.<br><br>**Default**: `10`<br><br>**Constraints**: `>= 1`, `<= 20` | Integer getPageSize() | setPageSize(Integer pageSize) |
| `Page` | `Integer` | Optional | A non-zero integer which is the start index of the entire list of items to return in the response. The combination of `page=1` and `page_size=20` returns the first 20 items. The combination of `page=2` and `page_size=20` returns the next 20 items.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1`, `<= 100000` | Integer getPage() | setPage(Integer page) |
| `TotalRequired` | `Boolean` | Optional | Indicates whether to show the total count in the response.<br><br>**Default**: `false` | Boolean getTotalRequired() | setTotalRequired(Boolean totalRequired) |

## Example

```java
import com.paypal.sdk.models.ListBillingPlansInput;

ListBillingPlansInput listBillingPlansInput = new ListBillingPlansInput.Builder()
    .prefer("return=minimal")
    .productId("product_id4")
    .pageSize(10)
    .page(1)
    .totalRequired(false)
    .build();
```

