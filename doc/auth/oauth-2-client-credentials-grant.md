
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for Oauth2.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oAuthClientId` | `getOAuthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oAuthClientSecret` | `getOAuthClientSecret()` |
| OAuthToken | `OAuthToken` | Object for storing information about the OAuth token | `oAuthToken` | `getOAuthToken()` |
| OAuthScopes | `List<OAuthScope>` | List of scopes that apply to the OAuth token | `oAuthScopes` | `getOAuthScopes()` |
| OAuthTokenProvider | `BiFunction<OAuthToken, ClientCredentialsAuth, OAuthToken>` | Registers a callback for oAuth Token Provider used for automatic token fetching/refreshing. | `oAuthTokenProvider` | `getOAuthTokenProvider()` |
| OAuthOnTokenUpdate | `Consumer<OAuthToken>` | Registers a callback for token update event. | `oAuthOnTokenUpdate` | `getOAuthOnTokenUpdate()` |



**Note:** Auth credentials can be set using `clientCredentialsAuth` in the client builder and accessed through `getClientCredentialsAuth` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet. This will fetch the OAuth token automatically when any of the endpoints, requiring *OAuth 2.0 Client Credentials Grant* autentication, are called.

```java
PayPalRESTAPIsClient client = new PayPalRESTAPIsClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScope.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT,
                OAuthScope.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION
            ))
        .build())
    .build();
```



Your application can also manually provide an OAuthToken using the setter `oAuthToken` in `ClientCredentialsAuthModel` object. This function takes in an instance of OAuthToken containing information for authorizing client requests and refreshing the token itself.

You must have initialized the client with scopes for which you need permission to access.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the [`OAuthScope`](../../doc/models/o-auth-scope.md) enumeration.

| Scope Name | Description |
|  --- | --- |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT` | Manage payments and checkout workflow. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION` | Permission to initiate reference transaction |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_INITIATEPAYMENT` | Initiates payments and checkout workflows. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_ORDERS_DEPRECATING_JSSDK_MIGRATION_FOR_LIMITED_MERCHANTS` | Allows client-side integration on Create, Get, Patch, Authorize & Capture Order endpoints. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_AUTHCAPTURE` | Permission to do non-real time payments like capture on authorization |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_REFUND` | Permission to initiate a refund on a capture transaction |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_NON_REFERENCED_CREDIT` | Permission to initiate non referenced credit |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_REALTIMEPAYMENT` | Permission to do any real time payment, with support for sale/authorize/order intents |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_REVERSEPAYMENT` | Permission to do any reverse payment |
| `HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENTS_READY` | Permission to get information about payment readiness. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READWRITE` | Manage payment instruments |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_PAYMENT_TOKENS_READ` | Permission to only read from vault |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_CUSTOMERS_READ` | Permission to read customer information. |
| `HTTPS_URI_PAYPAL_COM_SERVICES_VAULT_CUSTOMERS_READWRITE` | Permission to create/update customer information. |

### Adding OAuth Token Update Callback

Whenever the OAuth Token gets updated, the provided callback implementation will be executed. For instance, you may use it store your access token whenever it gets updated.

```java
PayPalRESTAPIsClient client = new PayPalRESTAPIsClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScope.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT,
                OAuthScope.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION
            ))
        .oAuthOnTokenUpdate(oAuthToken -> {
                // Add the callback handler to perform operations like save to DB or file etc.
                // It will be triggered whenever the token gets updated
                System.out.println(oAuthToken);
        })
        .build())
    .build();
```

### Adding Custom OAuth Token Provider

To authorize a client from a stored access token, set up the `oAuthTokenProvider` in `ClientCredentialsAuthModel` builder along with the other auth parameters before creating the client:

```java
PayPalRESTAPIsClient client = new PayPalRESTAPIsClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oAuthScopes(Arrays.asList(
                OAuthScope.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT,
                OAuthScope.HTTPS_URI_PAYPAL_COM_SERVICES_PAYMENTS_PAYMENT_REFERENCE_TRANSACTION
            ))
        .oAuthTokenProvider((lastOAuthToken, credentialsManager) -> {
                // Add the callback handler to provide a new OAuth token
                // It will be triggered whenever the lastOAuthToken is undefined or expired
                return lastOAuthToken.toBuilder()
                        .expiry(lastOAuthToken.getExpiry() + 60)
                        .build();
        })
        .build())
    .build();
```


