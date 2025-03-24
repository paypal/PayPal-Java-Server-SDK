
# Getting Started with PayPal Server SDK

## Introduction

### Important Notes

- **Available Features:** This SDK currently contains only 3 of PayPal's API endpoints. Additional endpoints and functionality will be added in the future.
- **API Changes:** Expect potential changes in APIs and features as we finalize the product.

### Information

The PayPal Server SDK provides integration access to the PayPal REST APIs. The API endpoints are divided into distinct controllers:

- Orders Controller: <a href="https://developer.paypal.com/docs/api/orders/v2/">Orders API v2</a>
- Payments Controller: <a href="https://developer.paypal.com/docs/api/payments/v2/">Payments API v2</a>
- Vault Controller: <a href="https://developer.paypal.com/docs/api/payment-tokens/v3/">Payment Method Tokens API v3</a> *Available in the US only.*

Find out more here: [https://developer.paypal.com/docs/api/orders/v2/](https://developer.paypal.com/docs/api/orders/v2/)

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>com.paypal.sdk</groupId>
  <artifactId>paypal-server-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/com.paypal.sdk/paypal-server-sdk/1.0.0

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.SANDBOX`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `loggingConfig` | [`Consumer<ApiLoggingConfiguration.Builder>`](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| `clientCredentialsAuth` | [`ClientCredentialsAuth`](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
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
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| Production | PayPal Live Environment |
| Sandbox | **Default** PayPal Sandbox Environment |

## Authorization

This API uses the following authentication schemes.

* [`Oauth2 (OAuth 2 Client Credentials Grant)`](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [Orders](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/controllers/orders.md)
* [Payments](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/controllers/payments.md)
* [Vault](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/controllers/vault.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-callback-interface.md)
* [Headers](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/headers.md)
* [ApiException](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/api-exception.md)
* [ApiResponse](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/api-response.md)
* [Configuration Interface](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/http-client-configuration-builder.md)
* [ApiLoggingConfiguration](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/api-logging-configuration.md)
* [ApiLoggingConfiguration.Builder](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/api-logging-configuration-builder.md)
* [ApiRequestLoggingConfiguration.Builder](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/api-request-logging-configuration-builder.md)
* [ApiResponseLoggingConfiguration.Builder](https://www.github.com/paypal/PayPal-Java-Server-SDK/tree/1.0.0/doc/api-response-logging-configuration-builder.md)

