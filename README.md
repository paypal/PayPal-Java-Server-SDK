
# Getting Started with PayPal REST APIs

## Introduction

An order represents a payment between two or more parties. Use the Orders API to create, update, retrieve, authorize, and capture orders., Call the Payments API to authorize payments, capture authorized payments, refund payments that have already been captured, and show payment information. Use the Payments API in conjunction with the <a href="/docs/api/orders/v2/">Orders API</a>. For more information, see the <a href="/docs/checkout/">PayPal Checkout Overview</a>., The Payment Method Tokens API saves payment methods so payers don't have to enter details for future transactions. Payers can check out faster or pay without being present after they agree to save a payment method.<br><br>The API associates a payment method with a temporary setup token. Pass the setup token to the API to exchange the setup token for a permanent token.<br><br>The permanent token represents a payment method that's saved to the vault. This token can be used repeatedly for checkout or recurring transactions such as subscriptions.<br><br>The Payment Method Tokens API is available in the US only.

Find out more here: [https://developer.paypal.com/docs/api/orders/v2/](https://developer.paypal.com/docs/api/orders/v2/)

## Building

Supported Java version is **8+**.

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=import3)

* After successfully building the project, the client library needs to be installed as a Maven package in your local cache. Right-click on the project, select `Show in Local Terminal -> Terminal` or use `Ctrl + Alt + T` to open Terminal.

![Importing SDK into Eclipse - Step 5](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=openTerminal)

* In the terminal dialog, run the following command to install client library.

```
mvn install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
```

![Importing SDK into Eclipse - Step 6](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=installCommand)

## Installation

The following section explains how to use the PayPalRESTAPIsLib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *PayPalRESTAPIsLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify com.paypal.sdk in `Group Id`, paypal-rest-api-sdk in `Artifact Id` and 2.16.0 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=PayPal%20REST%20APIs-Java&workspaceName=PayPalRESTAPIs&projectName=PayPalRESTAPIsLib&rootNamespace=com.paypal.api&groupId=com.paypal.sdk&artifactId=paypal-rest-api-sdk&version=2.16.0&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.SANDBOX`** |
| `httpClientConfig` | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| `loggingConfig` | [`Consumer<ApiLoggingConfiguration.Builder>`](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| `clientCredentialsAuth` | [`ClientCredentialsAuth`](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/auth/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
PayPalRESTAPIsClient client = new PayPalRESTAPIsClient.Builder()
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

API calls return an `ApiResponse` object that includes the following fields:

| Field | Description |
|  --- | --- |
| `getStatusCode` | Status code of the HTTP response |
| `getHeaders` | Headers of the HTTP response as a Hash |
| `getResult` | The deserialized body of the HTTP response as a String |

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| Production | PayPal Live Environment |
| Sandbox | **Default** PayPal Sandbox Environment |

## Authorization

This API uses the following authentication schemes.

* [`Oauth2 (OAuth 2 Client Credentials Grant)`](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/auth/oauth-2-client-credentials-grant.md)

## List of APIs

* [Orders](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/controllers/orders.md)
* [Payments](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/controllers/payments.md)
* [Vault](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/controllers/vault.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-request.md)
* [HttpResponse](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-string-response.md)
* [HttpContext](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-callback-interface.md)
* [Headers](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/headers.md)
* [ApiException](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/http-client-configuration-builder.md)
* [ApiLoggingConfiguration](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/api-logging-configuration.md)
* [ApiLoggingConfiguration.Builder](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/api-logging-configuration-builder.md)
* [ApiRequestLoggingConfiguration.Builder](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/api-request-logging-configuration-builder.md)
* [ApiResponseLoggingConfiguration.Builder](https://www.github.com/moizgillani/paypal-java-sdk/tree/1.0.3/doc/api-response-logging-configuration-builder.md)

