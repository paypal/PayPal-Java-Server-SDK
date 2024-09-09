# Vault

Use the `/vault` resource to create, retrieve, and delete payment and setup tokens.

```java
VaultController vaultController = client.getVaultController();
```

## Class Name

`VaultController`

## Methods

* [Payment-Tokens Create](../../doc/controllers/vault.md#payment-tokens-create)
* [Customer Payment-Tokens Get](../../doc/controllers/vault.md#customer-payment-tokens-get)
* [Payment-Tokens Get](../../doc/controllers/vault.md#payment-tokens-get)
* [Payment-Tokens Delete](../../doc/controllers/vault.md#payment-tokens-delete)
* [Setup-Tokens Create](../../doc/controllers/vault.md#setup-tokens-create)
* [Setup-Tokens Get](../../doc/controllers/vault.md#setup-tokens-get)


# Payment-Tokens Create

Creates a Payment Token from the given payment source and adds it to the Vault of the associated customer.

```java
CompletableFuture<ApiResponse<PaymentTokenResponse>> paymentTokensCreateAsync(
    final PaymentTokensCreateInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 3 hours. |
| `body` | [`PaymentTokenRequest`](../../doc/models/payment-token-request.md) | Body, Required | Payment Token creation with a financial instrument and an optional customer_id. |

## Response Type

[`PaymentTokenResponse`](../../doc/models/payment-token-response.md)

## Example Usage

```java
PaymentTokensCreateInput paymentTokensCreateInput = new PaymentTokensCreateInput.Builder(
    "PayPal-Request-Id6",
    null,
    new PaymentTokenRequest.Builder(
        new PaymentTokenRequestPaymentSource.Builder()
            .build()
    )
    .build()
)
.build();

vaultController.paymentTokensCreateAsync(paymentTokensCreateInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
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


# Customer Payment-Tokens Get

Returns all payment tokens for a customer.

```java
CompletableFuture<ApiResponse<CustomerVaultPaymentTokensResponse>> customerPaymentTokensGetAsync(
    final CustomerPaymentTokensGetInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Query, Required | A unique identifier representing a specific customer in merchant's/partner's system or records.<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` |
| `pageSize` | `Integer` | Query, Optional | A non-negative, non-zero integer indicating the maximum number of results to return at one time.<br>**Default**: `5`<br>**Constraints**: `>= 1` |
| `page` | `Integer` | Query, Optional | A non-negative, non-zero integer representing the page of the results.<br>**Default**: `1`<br>**Constraints**: `>= 1` |
| `totalRequired` | `Boolean` | Query, Optional | A boolean indicating total number of items (total_items) and pages (total_pages) are expected to be returned in the response.<br>**Default**: `false` |

## Response Type

[`CustomerVaultPaymentTokensResponse`](../../doc/models/customer-vault-payment-tokens-response.md)

## Example Usage

```java
CustomerPaymentTokensGetInput customerPaymentTokensGetInput = new CustomerPaymentTokensGetInput.Builder(
    "customer_id8"
)
.pageSize(5)
.page(1)
.totalRequired(false)
.build();

vaultController.customerPaymentTokensGetAsync(customerPaymentTokensGetInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Payment-Tokens Get

Returns a readable representation of vaulted payment source associated with the payment token id.

```java
CompletableFuture<ApiResponse<PaymentTokenResponse>> paymentTokensGetAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | ID of the payment token.<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` |

## Response Type

[`PaymentTokenResponse`](../../doc/models/payment-token-response.md)

## Example Usage

```java
String id = "id0";

vaultController.paymentTokensGetAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
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


# Payment-Tokens Delete

Delete the payment token associated with the payment token id.

```java
CompletableFuture<ApiResponse<Void>> paymentTokensDeleteAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | ID of the payment token.<br>**Constraints**: *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` |

## Response Type

`void`

## Example Usage

```java
String id = "id0";

vaultController.paymentTokensDeleteAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |


# Setup-Tokens Create

Creates a Setup Token from the given payment source and adds it to the Vault of the associated customer.

```java
CompletableFuture<ApiResponse<SetupTokenResponse>> setupTokensCreateAsync(
    final SetupTokensCreateInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `payPalRequestId` | `String` | Header, Required | The server stores keys for 3 hours. |
| `body` | [`SetupTokenRequest`](../../doc/models/setup-token-request.md) | Body, Required | Setup Token creation with a instrument type optional financial instrument details and customer_id. |

## Response Type

[`SetupTokenResponse`](../../doc/models/setup-token-response.md)

## Example Usage

```java
SetupTokensCreateInput setupTokensCreateInput = new SetupTokensCreateInput.Builder(
    "PayPal-Request-Id6",
    null,
    new SetupTokenRequest.Builder(
        new SetupTokenRequestPaymentSource.Builder()
            .build()
    )
    .build()
)
.build();

vaultController.setupTokensCreateAsync(setupTokensCreateInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
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


# Setup-Tokens Get

Returns a readable representation of temporarily vaulted payment source associated with the setup token id.

```java
CompletableFuture<ApiResponse<SetupTokenResponse>> setupTokensGetAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | ID of the setup token.<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `36`, *Pattern*: `^[0-9a-zA-Z_-]+$` |

## Response Type

[`SetupTokenResponse`](../../doc/models/setup-token-response.md)

## Example Usage

```java
String id = "id0";

vaultController.setupTokensGetAsync(id).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
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

