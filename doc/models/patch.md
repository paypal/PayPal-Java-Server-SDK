
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

## Example

```java
import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.models.Patch;
import com.paypal.sdk.models.PatchOp;
import com.paypal.sdk.utilities.JsonValue;
import java.io.IOException;

Patch patch = new Patch.Builder(
    PatchOp.COPY
)
.path("path4")
.value(ApiHelper.tryDeserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class))
.from("from2")
.build();
```

