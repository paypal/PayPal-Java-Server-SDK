
# Update Order Tracking Input

Input structure for the method UpdateOrderTrackingAsync

## Structure

`UpdateOrderTrackingInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the order that the tracking information is associated with.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` | String getId() | setId(String id) |
| `TrackerId` | `String` | Required | The order tracking ID.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` | String getTrackerId() | setTrackerId(String trackerId) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see PayPal-Auth-Assertion. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Body` | [`List<Patch>`](../../doc/models/patch.md) | Optional | **Constraints**: *Minimum Items*: `0`, *Maximum Items*: `32767` | List<Patch> getBody() | setBody(List<Patch> body) |

## Example

```java
import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.models.Patch;
import com.paypal.sdk.models.PatchOp;
import com.paypal.sdk.models.UpdateOrderTrackingInput;
import com.paypal.sdk.utilities.JsonValue;
import java.io.IOException;
import java.util.Arrays;

UpdateOrderTrackingInput updateOrderTrackingInput = new UpdateOrderTrackingInput.Builder(
    "id0",
    "tracker_id2",
    "application/json"
)
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

