
# Get Authorized Payment Input

Input structure for the method GetAuthorizedPaymentAsync

## Structure

`GetAuthorizedPaymentInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorizationId` | `String` | Required | The ID of the authorized payment for which to show details. | String getAuthorizationId() | setAuthorizationId(String authorizationId) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion). Note:For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |

## Example

```java
import com.paypal.sdk.models.GetAuthorizedPaymentInput;

GetAuthorizedPaymentInput getAuthorizedPaymentInput = new GetAuthorizedPaymentInput.Builder(
    "authorization_id8"
)
.paypalMockResponse("PayPal-Mock-Response0")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.build();
```

