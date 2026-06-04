# Transaction Search

Use the `/transactions` resource to list transactions and the `/balances` resource to list balances.

```java
TransactionSearchController transactionSearchController = client.getTransactionSearchController();
```

## Class Name

`TransactionSearchController`

## Methods

* [Search Transactions](../../doc/controllers/transaction-search.md#search-transactions)
* [Search Balances](../../doc/controllers/transaction-search.md#search-balances)


# Search Transactions

Lists transactions. Specify one or more query parameters to filter the transaction that appear in the response. Notes: If you specify one or more optional query parameters, the ending_balance response field is empty. It takes a maximum of three hours for executed transactions to appear in the list transactions call. This call lists transaction for the previous three years.

```java
CompletableFuture<ApiResponse<SearchResponse>> searchTransactionsAsync(
    final SearchTransactionsInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`SearchTransactionsInput`](../../doc/models/search-transactions-input.md) | Required | Input structure for the method SearchTransactionsAsync |

## Response Type

**200**: A successful request returns the HTTP `200 OK` status code and a JSON response body that lists transactions .

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`SearchResponse`](../../doc/models/search-response.md).

## Example Usage

```java
SearchTransactionsInput searchTransactionsInput = new SearchTransactionsInput.Builder(
    "start_date6",
    "end_date0"
)
.fields("transaction_info")
.balanceAffectingRecordsOnly("Y")
.pageSize(100)
.page(1)
.build();

transactionSearchController.searchTransactionsAsync(searchTransactionsInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof SearchErrorException) {
        SearchErrorException searchErrorException = (SearchErrorException) cause;
        searchErrorException.printStackTrace();
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
| Default | The error response. | [`SearchErrorException`](../../doc/models/search-error-exception.md) |


# Search Balances

List all balances. Specify date time to list balances for that time that appear in the response. Notes: It takes a maximum of three hours for balances to appear in the list balances call. This call lists balances upto the previous three years.

```java
CompletableFuture<ApiResponse<BalancesResponse>> searchBalancesAsync(
    final SearchBalancesInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`SearchBalancesInput`](../../doc/models/search-balances-input.md) | Required | Input structure for the method SearchBalancesAsync |

## Response Type

**200**: A successful request returns the HTTP `200 OK` status code and a JSON response body that lists balances .

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`BalancesResponse`](../../doc/models/balances-response.md).

## Example Usage

```java
SearchBalancesInput searchBalancesInput = new SearchBalancesInput.Builder()
    .build();

transactionSearchController.searchBalancesAsync(searchBalancesInput).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof DefaultErrorException) {
        DefaultErrorException defaultErrorException = (DefaultErrorException) cause;
        defaultErrorException.printStackTrace();
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
| 400 | The request is not well-formed, is syntactically incorrect, or violates schema. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| 500 | An internal server error occurred. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |
| Default | The error response. | [`DefaultErrorException`](../../doc/models/default-error-exception.md) |

