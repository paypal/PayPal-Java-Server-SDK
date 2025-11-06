
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
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "plans": [
    {
      "id": "id4",
      "product_id": "product_id0",
      "name": "name4",
      "status": "INACTIVE",
      "description": "description4"
    }
  ],
  "total_items": 158,
  "total_pages": 194,
  "links": [
    {
      "href": "href6",
      "rel": "rel0",
      "method": "HEAD"
    },
    {
      "href": "href6",
      "rel": "rel0",
      "method": "HEAD"
    },
    {
      "href": "href6",
      "rel": "rel0",
      "method": "HEAD"
    }
  ]
}
```

