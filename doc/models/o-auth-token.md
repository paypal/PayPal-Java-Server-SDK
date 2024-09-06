
# O Auth Token

OAuth 2 Authorization endpoint response

## Structure

`OAuthToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccessToken` | `String` | Required | Access token | String getAccessToken() | setAccessToken(String accessToken) |
| `TokenType` | `String` | Required | Type of access token | String getTokenType() | setTokenType(String tokenType) |
| `ExpiresIn` | `Long` | Optional | Time in seconds before the access token expires | Long getExpiresIn() | setExpiresIn(Long expiresIn) |
| `Scope` | `String` | Optional | List of scopes granted<br>This is a space-delimited list of strings. | String getScope() | setScope(String scope) |
| `Expiry` | `Long` | Optional | Time of token expiry as unix timestamp (UTC) | Long getExpiry() | setExpiry(Long expiry) |
| `RefreshToken` | `String` | Optional | Refresh token<br>Used to get a new access token when it expires. | String getRefreshToken() | setRefreshToken(String refreshToken) |
| `IdToken` | `String` | Optional | An ID token response type is of JSON Web Token (JWT) that contains claims about the identity of the authenticated user. | String getIdToken() | setIdToken(String idToken) |

## Example (as JSON)

```json
{
  "access_token": "access_token4",
  "token_type": "token_type6",
  "expires_in": 74,
  "scope": "scope6",
  "expiry": 88,
  "refresh_token": "refresh_token6",
  "id_token": "id_token6"
}
```

