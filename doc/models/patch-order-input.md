
# Patch Order Input

Input structure for the method PatchOrderAsync

## Structure

`PatchOrderInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the order to update.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see PayPal-Auth-Assertion. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Body` | [`List<Patch>`](../../doc/models/patch.md) | Optional | **Constraints**: *Minimum Items*: `0`, *Maximum Items*: `32767` | List<Patch> getBody() | setBody(List<Patch> body) |

## Example

```java
import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.models.Patch;
import com.paypal.sdk.models.PatchOp;
import com.paypal.sdk.models.PatchOrderInput;
import com.paypal.sdk.utilities.JsonValue;
import java.io.IOException;
import java.util.Arrays;

PatchOrderInput patchOrderInput = new PatchOrderInput.Builder(
    "id0",
    "application/json"
)
.paypalMockResponse("PayPal-Mock-Response0")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
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

