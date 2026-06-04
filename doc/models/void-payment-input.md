
# Void Payment Input

Input structure for the method VoidPaymentAsync

## Structure

`VoidPaymentInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorizationId` | `String` | Required | The PayPal-generated ID for the authorized payment to void. | String getAuthorizationId() | setAuthorizationId(String authorizationId) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion). Note:For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 45 days. | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` | String getPrefer() | setPrefer(String prefer) |

## Example

```java
import com.paypal.sdk.models.VoidPaymentInput;

VoidPaymentInput voidPaymentInput = new VoidPaymentInput.Builder(
    "authorization_id8"
)
.paypalMockResponse("PayPal-Mock-Response0")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.paypalRequestId("PayPal-Request-Id6")
.prefer("return=minimal")
.build();
```

