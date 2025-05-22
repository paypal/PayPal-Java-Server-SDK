
# Related Identifiers

Identifiers related to a specific resource.

## Structure

`RelatedIdentifiers`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrderId` | `String` | Optional | Order ID related to the resource.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `20`, *Pattern*: `^[A-Z0-9]+$` | String getOrderId() | setOrderId(String orderId) |
| `AuthorizationId` | `String` | Optional | Authorization ID related to the resource.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `20`, *Pattern*: `^[A-Z0-9]+$` | String getAuthorizationId() | setAuthorizationId(String authorizationId) |
| `CaptureId` | `String` | Optional | Capture ID related to the resource.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `20`, *Pattern*: `^[A-Z0-9]+$` | String getCaptureId() | setCaptureId(String captureId) |

## Example (as JSON)

```json
{
  "order_id": "order_id0",
  "authorization_id": "authorization_id8",
  "capture_id": "capture_id8"
}
```

