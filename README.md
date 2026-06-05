
# Getting Started with PayPal Server SDK

## Introduction

### Important Notes

- **Available Features:** This SDK currently contains only 5 of PayPal's API endpoints. Additional endpoints and functionality will be added in the future.

### Information

The PayPal Server SDK provides integration access to the PayPal REST APIs. The API endpoints are divided into distinct controllers:

- Orders Controller: [Orders API v2](https://developer.paypal.com/docs/api/orders/v2/)
- Payments Controller: [Payments API v2](https://developer.paypal.com/docs/api/payments/v2)
- Vault Controller: [Payment Method Tokens API v3](https://developer.paypal.com/docs/api/payment-tokens/v3/) *Available in the US only.*
- Transaction Search Controller: [Transaction Search API v1](https://developer.paypal.com/docs/api/transaction-search/v1/)
- Subscriptions Controller: [Subscriptions API v1](https://developer.paypal.com/docs/api/subscriptions/v1/)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>com.paypal.sdk</groupId>
  <artifactId>paypal-server-sdk</artifactId>
  <version>2.3.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/com.paypal.sdk/paypal-server-sdk/2.3.0

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| environment | [`Environment`](README.md#environments) | The API environment. <br> **Default: `Environment.SANDBOX`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| loggingConfig | [`Consumer<ApiLoggingConfiguration.Builder>`](doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| clientCredentialsAuth | [`ClientCredentialsAuth`](doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
import com.paypal.sdk.Environment;
import com.paypal.sdk.PaypalServerSdkClient;
import com.paypal.sdk.authentication.ClientCredentialsAuthModel;
import com.paypal.sdk.exceptions.ApiException;
import com.paypal.sdk.http.response.ApiResponse;
import com.paypal.sdk.models.OAuthToken;
import java.io.IOException;
import org.slf4j.event.Level;

public class Program {
    public static void main(String[] args) {
        PaypalServerSdkClient client = new PaypalServerSdkClient.Builder()
            .loggingConfig(builder -> builder
                    .level(Level.DEBUG)
                    .requestConfig(logConfigBuilder -> logConfigBuilder.body(true))
                    .responseConfig(logConfigBuilder -> logConfigBuilder.headers(true)))
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .build())
            .environment(Environment.SANDBOX)
            .build();

    }
}
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| PRODUCTION | PayPal Live Environment |
| SANDBOX | **Default** PayPal Sandbox Environment |

## Authorization

This API uses the following authentication schemes.

* [`Oauth2 (OAuth 2 Client Credentials Grant)`](doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [Orders](doc/controllers/orders.md)
* [Payments](doc/controllers/payments.md)
* [Vault](doc/controllers/vault.md)
* [Transaction Search](doc/controllers/transaction-search.md)
* [Subscriptions](doc/controllers/subscriptions.md)

## SDK Infrastructure

### Configuration

* [ApiLoggingConfiguration](doc/api-logging-configuration.md)
* [ApiLoggingConfiguration.Builder](doc/api-logging-configuration-builder.md)
* [ApiRequestLoggingConfiguration.Builder](doc/api-request-logging-configuration-builder.md)
* [ApiResponseLoggingConfiguration.Builder](doc/api-response-logging-configuration-builder.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)
* [HttpProxyConfiguration](doc/http-proxy-configuration.md)
* [HttpProxyConfiguration.Builder](doc/http-proxy-configuration-builder.md)

### HTTP

* [Headers](doc/headers.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)

### Utilities

* [ApiException](doc/api-exception.md)
* [ApiResponse](doc/api-response.md)
* [ApiHelper](doc/api-helper.md)
* [FileWrapper](doc/file-wrapper.md)
* [JsonObject](doc/json-object.md)
* [JsonValue](doc/json-value.md)

