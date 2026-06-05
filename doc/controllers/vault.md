# Vault

Use the `/vault` resource to create, retrieve, and delete payment and setup tokens.

```java
VaultController vaultController = client.getVaultController();
```

## Class Name

`VaultController`

## Methods

* [Create Payment Token](../../doc/controllers/vault.md#create-payment-token)
* [List Customer Payment Tokens](../../doc/controllers/vault.md#list-customer-payment-tokens)
* [Get Payment Token](../../doc/controllers/vault.md#get-payment-token)
* [Delete Payment Token](../../doc/controllers/vault.md#delete-payment-token)
* [Create Setup Token](../../doc/controllers/vault.md#create-setup-token)
* [Get Setup Token](../../doc/controllers/vault.md#get-setup-token)


# Create Payment Token

Creates a Payment Token from the given payment source and adds it to the Vault of the associated customer.

```java
CompletableFuture<ApiResponse<PaymentTokenResponse>> createPaymentTokenAsync(
    final CreatePaymentTokenInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`CreatePaymentTokenInput`](../../doc/models/create-payment-token-input.md) | Required | Input structure for the method CreatePaymentTokenAsync |

## Response Type

**200**: Idempotent response for a successful creation of payment token.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`PaymentTokenResponse`](../../doc/models/payment-token-response.md).

## Example Usage

```java
CreatePaymentTokenInput createPaymentTokenInput = new CreatePaymentTokenInput.Builder(
    null,
    new PaymentTokenRequest.Builder(
        new PaymentTokenRequestPaymentSource.Builder()
            .build()
    )
    .build()
)
.build();

vaultController.createPaymentTokenAsync(createPaymentTokenInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | Request contains reference to resources that do not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# List Customer Payment Tokens

Returns all payment tokens for a customer.

```java
CompletableFuture<ApiResponse<CustomerVaultPaymentTokensResponse>> listCustomerPaymentTokensAsync(
    final ListCustomerPaymentTokensInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ListCustomerPaymentTokensInput`](../../doc/models/list-customer-payment-tokens-input.md) | Required | Input structure for the method ListCustomerPaymentTokensAsync |

## Response Type

**200**: Successful execution.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`CustomerVaultPaymentTokensResponse`](../../doc/models/customer-vault-payment-tokens-response.md).

## Example Usage

```java
ListCustomerPaymentTokensInput listCustomerPaymentTokensInput = new ListCustomerPaymentTokensInput.Builder(
    "customer_id8"
)
.pageSize(5)
.page(1)
.totalRequired(false)
.build();

vaultController.listCustomerPaymentTokensAsync(listCustomerPaymentTokensInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Get Payment Token

Returns a readable representation of vaulted payment source associated with the payment token id.

```java
CompletableFuture<ApiResponse<PaymentTokenResponse>> getPaymentTokenAsync(
    final String id)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | ID of the payment token.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` |

## Response Type

**200**: Successful execution.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`PaymentTokenResponse`](../../doc/models/payment-token-response.md).

## Example Usage

```java
String id = "id0";

vaultController.getPaymentTokenAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Delete Payment Token

Delete the payment token associated with the payment token id.

```java
CompletableFuture<ApiResponse<Void>> deletePaymentTokenAsync(
    final String id)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | ID of the payment token.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` |

## Response Type

**204**: The server has successfully executed the method, but there is no entity body to return.

`void`

## Example Usage

```java
String id = "id0";

vaultController.deletePaymentTokenAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Create Setup Token

Creates a Setup Token from the given payment source and adds it to the Vault of the associated customer.

```java
CompletableFuture<ApiResponse<SetupTokenResponse>> createSetupTokenAsync(
    final CreateSetupTokenInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`CreateSetupTokenInput`](../../doc/models/create-setup-token-input.md) | Required | Input structure for the method CreateSetupTokenAsync |

## Response Type

**200**: Idempotent response for a successful creation of setup token.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`SetupTokenResponse`](../../doc/models/setup-token-response.md).

## Example Usage

```java
CreateSetupTokenInput createSetupTokenInput = new CreateSetupTokenInput.Builder(
    null,
    new SetupTokenRequest.Builder(
        new SetupTokenRequestPaymentSource.Builder()
            .build()
    )
    .build()
)
.build();

vaultController.createSetupTokenAsync(createSetupTokenInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Get Setup Token

Returns a readable representation of temporarily vaulted payment source associated with the setup token id.

```java
CompletableFuture<ApiResponse<SetupTokenResponse>> getSetupTokenAsync(
    final String id)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | ID of the setup token.<br><br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` |

## Response Type

**200**: Found requested setup-token, returned a payment method associated with the token.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`SetupTokenResponse`](../../doc/models/setup-token-response.md).

## Example Usage

```java
String id = "id0";

vaultController.getSetupTokenAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |

