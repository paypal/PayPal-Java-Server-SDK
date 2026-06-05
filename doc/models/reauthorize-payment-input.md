
# Reauthorize Payment Input

Input structure for the method ReauthorizePaymentAsync

## Structure

`ReauthorizePaymentInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthorizationId` | `String` | Required | The PayPal-generated ID for the authorized payment to reauthorize. | String getAuthorizationId() | setAuthorizationId(String authorizationId) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 45 days. | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` | String getPrefer() | setPrefer(String prefer) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see [PayPal-Auth-Assertion](/docs/api/reference/api-requests/#paypal-auth-assertion). Note:For three party transactions in which a partner is managing the API calls on behalf of a merchant, the partner must identify the merchant using either a PayPal-Auth-Assertion header or an access token with target_subject. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Body` | [`ReauthorizeRequest`](../../doc/models/reauthorize-request.md) | Optional | - | ReauthorizeRequest getBody() | setBody(ReauthorizeRequest body) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.ReauthorizePaymentInput;
import com.paypal.sdk.models.ReauthorizeRequest;

ReauthorizePaymentInput reauthorizePaymentInput = new ReauthorizePaymentInput.Builder(
    "authorization_id8",
    "application/json"
)
.paypalRequestId("PayPal-Request-Id6")
.prefer("return=minimal")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.body(new ReauthorizeRequest.Builder()
        .amount(new Money.Builder(
            "currency_code6",
            "value0"
        )
        .build())
        .build())
.build();
```

