
# Get Order Input

Input structure for the method GetOrderAsync

## Structure

`GetOrderInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the order for which to show details.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` | String getId() | setId(String id) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see PayPal-Auth-Assertion. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Fields` | `String` | Optional | A comma-separated list of fields that should be returned for the order. Valid filter field is `payment_source`.<br><br>**Constraints**: *Pattern*: `^[a-z_]*$` | String getFields() | setFields(String fields) |

## Example

```java
import com.paypal.sdk.models.GetOrderInput;

GetOrderInput getOrderInput = new GetOrderInput.Builder(
    "id0"
)
.paypalMockResponse("PayPal-Mock-Response0")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.fields("fields8")
.build();
```

