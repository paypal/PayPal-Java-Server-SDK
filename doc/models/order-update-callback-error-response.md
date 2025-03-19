
# Order Update Callback Error Response

The error details.

## Structure

`OrderUpdateCallbackErrorResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The human-readable, unique name of the error.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `256`, *Pattern*: `^.*$` | String getName() | setName(String name) |
| `Message` | `String` | Optional | The message that describes the error.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2048`, *Pattern*: `^.*$` | String getMessage() | setMessage(String message) |
| `Details` | [`List<OrderUpdateCallbackErrorResponseDetails>`](../../doc/models/order-update-callback-error-response-details.md) | Optional | An array of additional details about the error.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `100` | List<OrderUpdateCallbackErrorResponseDetails> getDetails() | setDetails(List<OrderUpdateCallbackErrorResponseDetails> details) |

## Example (as JSON)

```json
{
  "name": "name2",
  "message": "message8",
  "details": [
    {
      "field": "field4",
      "value": "value2",
      "issue": "issue6"
    },
    {
      "field": "field4",
      "value": "value2",
      "issue": "issue6"
    }
  ]
}
```

