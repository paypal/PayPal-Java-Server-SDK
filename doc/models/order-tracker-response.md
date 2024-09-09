
# Order Tracker Response

The tracking response on creation of tracker.

## Structure

`OrderTrackerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The tracker id. | String getId() | setId(String id) |
| `Status` | [`OrderTrackerStatus`](../../doc/models/order-tracker-status.md) | Optional | The status of the item shipment.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[0-9A-Z_]+$` | OrderTrackerStatus getStatus() | setStatus(OrderTrackerStatus status) |
| `Items` | [`List<OrderTrackerItem>`](../../doc/models/order-tracker-item.md) | Optional | An array of details of items in the shipment. | List<OrderTrackerItem> getItems() | setItems(List<OrderTrackerItem> items) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related HATEOAS links. | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `CreateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |

## Example (as JSON)

```json
{
  "id": "id2",
  "status": "CANCELLED",
  "items": [
    {
      "name": "name8",
      "quantity": "quantity4",
      "sku": "sku6",
      "url": "url2",
      "image_url": "image_url4"
    },
    {
      "name": "name8",
      "quantity": "quantity4",
      "sku": "sku6",
      "url": "url2",
      "image_url": "image_url4"
    }
  ],
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
  ],
  "create_time": "create_time8"
}
```
