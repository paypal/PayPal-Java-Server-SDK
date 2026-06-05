
# Request Token Input

Input structure for the method RequestTokenAsync

## Structure

`RequestTokenInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GrantType` | `String` | Required, Constant | Grant Type<br><br>**Value**: `"client_credentials"` | String getGrantType() | setGrantType(String grantType) |
| `Authorization` | `String` | Required | Authorization header in Basic auth format | String getAuthorization() | setAuthorization(String authorization) |
| `Scope` | `String` | Optional | Requested scopes as a space-delimited list. | String getScope() | setScope(String scope) |

## Example

```java
import com.paypal.sdk.models.RequestTokenInput;

RequestTokenInput requestTokenInput = new RequestTokenInput.Builder(
    "client_credentials",
    "Authorization8"
)
.scope("scope2")
.build();
```

