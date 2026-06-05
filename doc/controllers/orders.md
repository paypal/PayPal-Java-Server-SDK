# Orders

Use the `/orders` resource to create, update, retrieve, authorize, capture and track orders.

```java
OrdersController ordersController = client.getOrdersController();
```

## Class Name

`OrdersController`

## Methods

* [Create Order](../../doc/controllers/orders.md#create-order)
* [Get Order](../../doc/controllers/orders.md#get-order)
* [Patch Order](../../doc/controllers/orders.md#patch-order)
* [Confirm Order](../../doc/controllers/orders.md#confirm-order)
* [Authorize Order](../../doc/controllers/orders.md#authorize-order)
* [Capture Order](../../doc/controllers/orders.md#capture-order)
* [Create Order Tracking](../../doc/controllers/orders.md#create-order-tracking)
* [Update Order Tracking](../../doc/controllers/orders.md#update-order-tracking)


# Create Order

Creates an order. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see checkout or multiparty checkout. Note: For error handling and troubleshooting, see Orders v2 errors.

```java
CompletableFuture<ApiResponse<Order>> createOrderAsync(
    final CreateOrderInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`CreateOrderInput`](../../doc/models/create-order-input.md) | Required | Input structure for the method CreateOrderAsync |

## Response Type

**200**: A successful response to an idempotent request returns the HTTP `200 OK` status code with a JSON response body that shows order details.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Order`](../../doc/models/order.md).

## Example Usage

```java
CreateOrderInput createOrderInput = new CreateOrderInput.Builder(
    null,
    new OrderRequest.Builder(
        CheckoutPaymentIntent.CAPTURE,
        Arrays.asList(
            new PurchaseUnitRequest.Builder(
                new AmountWithBreakdown.Builder(
                    "currency_code6",
                    "value0"
                )
                .build()
            )
            .build()
        )
    )
    .build()
)
.prefer("return=minimal")
.build();

ordersController.createOrderAsync(createOrderInput).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Get Order

Shows details for an order, by ID. Note: For error handling and troubleshooting, see Orders v2 errors.

```java
CompletableFuture<ApiResponse<Order>> getOrderAsync(
    final GetOrderInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`GetOrderInput`](../../doc/models/get-order-input.md) | Required | Input structure for the method GetOrderAsync |

## Response Type

**200**: A successful request returns the HTTP `200 OK` status code and a JSON response body that shows order details.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Order`](../../doc/models/order.md).

## Example Usage

```java
GetOrderInput getOrderInput = new GetOrderInput.Builder(
    "id0"
)
.build();

ordersController.getOrderAsync(getOrderInput).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Patch Order

Updates an order with a `CREATED` or `APPROVED` status. You cannot update an order with the `COMPLETED` status.<br/><br/>To make an update, you must provide a `reference_id`. If you omit this value with an order that contains only one purchase unit, PayPal sets the value to `default` which enables you to use the path: <code>\"/purchase_units/@reference_id=='default'/{attribute-or-object}\"</code>. Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see <a href="https://developer.paypal.com/docs/checkout/advanced/processing/">checkout</a> or <a href="https://developer.paypal.com/docs/multiparty/checkout/advanced/processing/">multiparty checkout</a>.<blockquote><strong>Note:</strong> For error handling and troubleshooting, see <a href="https://developer.paypal.com/api/rest/reference/orders/v2/errors/#patch-order">Orders v2 errors</a>.</blockquote>Patchable attributes or objects:<br/><br/><table><thead><th>Attribute</th><th>Op</th><th>Notes</th></thead><tbody><tr><td><code>intent</code></td><td>replace</td><td></td></tr><tr><td><code>payer</code></td><td>replace, add</td><td>Using replace op for <code>payer</code> will replace the whole <code>payer</code> object with the value sent in request.</td></tr><tr><td><code>purchase_units</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].custom_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].description</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payee.email</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].shipping.name</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.email_address</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.phone_number</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.options</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.address</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].shipping.type</code></td><td>replace, add</td><td></td></tr><tr><td><code>purchase_units[].soft_descriptor</code></td><td>replace, remove</td><td></td></tr><tr><td><code>purchase_units[].amount</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].items</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].invoice_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction</code></td><td>replace</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction.disbursement_mode</code></td><td>replace</td><td>By default, <code>disbursement_mode</code> is <code>INSTANT</code>.</td></tr><tr><td><code>purchase_units[].payment_instruction.payee_receivable_fx_rate_id</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].payment_instruction.platform_fees</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].supplementary_data.airline</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>purchase_units[].supplementary_data.card</code></td><td>replace, add, remove</td><td></td></tr><tr><td><code>application_context.client_configuration</code></td><td>replace, add</td><td></td></tr></tbody></table>

```java
CompletableFuture<ApiResponse<Void>> patchOrderAsync(
    final PatchOrderInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`PatchOrderInput`](../../doc/models/patch-order-input.md) | Required | Input structure for the method PatchOrderAsync |

## Response Type

**204**: A successful request returns the HTTP `204 No Content` status code with an empty object in the JSON response body.

`void`

## Example Usage

```java
PatchOrderInput patchOrderInput = new PatchOrderInput.Builder(
    "id0",
    null
)
.body(Arrays.asList(
        new Patch.Builder(
            PatchOp.ADD
        )
        .build()
    ))
.build();

ordersController.patchOrderAsync(patchOrderInput).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Confirm Order

Payer confirms their intent to pay for the the Order with the given payment source.

```java
CompletableFuture<ApiResponse<Order>> confirmOrderAsync(
    final ConfirmOrderInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`ConfirmOrderInput`](../../doc/models/confirm-order-input.md) | Required | Input structure for the method ConfirmOrderAsync |

## Response Type

**200**: A successful request indicates that the payment source was added to the Order. A successful request returns the HTTP `200 OK` status code with a JSON response body that shows order details.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Order`](../../doc/models/order.md).

## Example Usage

```java
ConfirmOrderInput confirmOrderInput = new ConfirmOrderInput.Builder(
    "id0",
    null
)
.prefer("return=minimal")
.build();

ordersController.confirmOrderAsync(confirmOrderInput).thenAccept(result -> {
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
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Authorize Order

Authorizes payment for an order. To successfully authorize payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response. Note: For error handling and troubleshooting, see Orders v2 errors.

```java
CompletableFuture<ApiResponse<OrderAuthorizeResponse>> authorizeOrderAsync(
    final AuthorizeOrderInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`AuthorizeOrderInput`](../../doc/models/authorize-order-input.md) | Required | Input structure for the method AuthorizeOrderAsync |

## Response Type

**200**: A successful response to an idempotent request returns the HTTP `200 OK` status code with a JSON response body that shows authorized payment details.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`OrderAuthorizeResponse`](../../doc/models/order-authorize-response.md).

## Example Usage

```java
AuthorizeOrderInput authorizeOrderInput = new AuthorizeOrderInput.Builder(
    "id0",
    null
)
.prefer("return=minimal")
.build();

ordersController.authorizeOrderAsync(authorizeOrderInput).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | The authorized payment failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Capture Order

Captures payment for an order. To successfully capture payment for an order, the buyer must first approve the order or a valid payment_source must be provided in the request. A buyer can approve the order upon being redirected to the rel:approve URL that was returned in the HATEOAS links in the create order response. Note: For error handling and troubleshooting, see Orders v2 errors.

```java
CompletableFuture<ApiResponse<Order>> captureOrderAsync(
    final CaptureOrderInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`CaptureOrderInput`](../../doc/models/capture-order-input.md) | Required | Input structure for the method CaptureOrderAsync |

## Response Type

**200**: A successful response to an idempotent request returns the HTTP `200 OK` status code with a JSON response body that shows captured payment details.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Order`](../../doc/models/order.md).

## Example Usage

```java
CaptureOrderInput captureOrderInput = new CaptureOrderInput.Builder(
    "id0",
    null
)
.prefer("return=minimal")
.build();

ordersController.captureOrderAsync(captureOrderInput).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`ErrorException`](../../doc/models/error-exception.md) |
| 403 | The authorized payment failed due to insufficient permissions. | [`ErrorException`](../../doc/models/error-exception.md) |
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Create Order Tracking

Adds tracking information for an Order.

```java
CompletableFuture<ApiResponse<Order>> createOrderTrackingAsync(
    final CreateOrderTrackingInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`CreateOrderTrackingInput`](../../doc/models/create-order-tracking-input.md) | Required | Input structure for the method CreateOrderTrackingAsync |

## Response Type

**200**: A successful response to an idempotent request returns the HTTP `200 OK` status code with a JSON response body that shows tracker details.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Order`](../../doc/models/order.md).

## Example Usage

```java
CreateOrderTrackingInput createOrderTrackingInput = new CreateOrderTrackingInput.Builder(
    "id0",
    null,
    new OrderTrackerRequest.Builder(
        "capture_id8"
    )
    .notifyPayer(false)
    .build()
)
.build();

ordersController.createOrderTrackingAsync(createOrderTrackingInput).thenAccept(result -> {
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
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |


# Update Order Tracking

Updates or cancels the tracking information for a PayPal order, by ID. Updatable attributes or objects: Attribute Op Notes items replace Using replace op for items will replace the entire items object with the value sent in request. notify_payer replace, add status replace Only patching status to CANCELLED is currently supported.

```java
CompletableFuture<ApiResponse<Void>> updateOrderTrackingAsync(
    final UpdateOrderTrackingInput input)
```

## Authentication

This endpoint requires [Oauth2](../../doc/auth/oauth-2-client-credentials-grant.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `input` | [`UpdateOrderTrackingInput`](../../doc/models/update-order-tracking-input.md) | Required | Input structure for the method UpdateOrderTrackingAsync |

## Response Type

**204**: A successful request returns the HTTP `204 No Content` status code with an empty object in the JSON response body.

`void`

## Example Usage

```java
UpdateOrderTrackingInput updateOrderTrackingInput = new UpdateOrderTrackingInput.Builder(
    "id0",
    "tracker_id2",
    null
)
.body(Arrays.asList(
        new Patch.Builder(
            PatchOp.ADD
        )
        .build()
    ))
.build();

ordersController.updateOrderTrackingAsync(updateOrderTrackingInput).thenAccept(result -> {
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
| 404 | The specified resource does not exist. | [`ErrorException`](../../doc/models/error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`ErrorException`](../../doc/models/error-exception.md) |
| 500 | An internal server error has occurred. | [`ErrorException`](../../doc/models/error-exception.md) |
| Default | The error response. | [`ErrorException`](../../doc/models/error-exception.md) |

