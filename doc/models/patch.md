
# Patch

The JSON patch object to apply partial updates to resources.

## Structure

`Patch`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Op` | [`PatchOp`](../../doc/models/patch-op.md) | Required | The operation. | PatchOp getOp() | setOp(PatchOp op) |
| `Path` | `String` | Optional | The JSON Pointer to the target document location at which to complete the operation. | String getPath() | setPath(String path) |
| `Value` | `JsonValue` | Optional | The value to apply. The remove, copy, and move operations do not require a value. Since JSON Patch allows any type for value, the type property is not specified. | JsonValue getValue() | setValue(JsonValue value) |
| `From` | `String` | Optional | The JSON Pointer to the target document location from which to move the value. Required for the move operation. | String getFrom() | setFrom(String from) |

## Example (as JSON)

```json
{
  "op": "add",
  "path": "path6",
  "value": {
    "key1": "val1",
    "key2": "val2"
  },
  "from": "from0"
}
```

