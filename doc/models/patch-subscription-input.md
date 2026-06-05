
# Patch Subscription Input

Input structure for the method PatchSubscriptionAsync

## Structure

`PatchSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID for the subscription. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`List<Patch>`](../../doc/models/patch.md) | Optional | - | List<Patch> getBody() | setBody(List<Patch> body) |

## Example

```java
import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.models.Patch;
import com.paypal.sdk.models.PatchOp;
import com.paypal.sdk.models.PatchSubscriptionInput;
import com.paypal.sdk.utilities.JsonValue;
import java.io.IOException;
import java.util.Arrays;

PatchSubscriptionInput patchSubscriptionInput = new PatchSubscriptionInput.Builder(
    "id0",
    "application/json"
)
.body(Arrays.asList(
        new Patch.Builder(
            PatchOp.ADD
        )
        .path("path0")
        .value(ApiHelper.tryDeserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class))
        .from("from6")
        .build()
    ))
.build();
```

