
# Patch Billing Plan Input

Input structure for the method PatchBillingPlanAsync

## Structure

`PatchBillingPlanInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the plan. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`List<Patch>`](../../doc/models/patch.md) | Optional | - | List<Patch> getBody() | setBody(List<Patch> body) |

## Example

```java
import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.models.Patch;
import com.paypal.sdk.models.PatchBillingPlanInput;
import com.paypal.sdk.models.PatchOp;
import com.paypal.sdk.utilities.JsonValue;
import java.io.IOException;
import java.util.Arrays;

PatchBillingPlanInput patchBillingPlanInput = new PatchBillingPlanInput.Builder(
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

