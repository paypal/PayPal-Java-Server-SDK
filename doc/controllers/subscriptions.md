# Subscriptions

Use the `/subscriptions` resource to create, update, retrieve, and cancel subscriptions and their associated plans.

```java
SubscriptionsController subscriptionsController = client.getSubscriptionsController();
```

## Class Name

`SubscriptionsController`

## Methods

* [Create Billing Plan](../../doc/controllers/subscriptions.md#create-billing-plan)
* [List Billing Plans](../../doc/controllers/subscriptions.md#list-billing-plans)
* [Get Billing Plan](../../doc/controllers/subscriptions.md#get-billing-plan)
* [Patch Billing Plan](../../doc/controllers/subscriptions.md#patch-billing-plan)
* [Activate Billing Plan](../../doc/controllers/subscriptions.md#activate-billing-plan)
* [Deactivate Billing Plan](../../doc/controllers/subscriptions.md#deactivate-billing-plan)
* [Update Billing Plan Pricing Schemes](../../doc/controllers/subscriptions.md#update-billing-plan-pricing-schemes)
* [Create Subscription](../../doc/controllers/subscriptions.md#create-subscription)
* [List Subscriptions](../../doc/controllers/subscriptions.md#list-subscriptions)
* [Get Subscription](../../doc/controllers/subscriptions.md#get-subscription)
* [Patch Subscription](../../doc/controllers/subscriptions.md#patch-subscription)
* [Revise Subscription](../../doc/controllers/subscriptions.md#revise-subscription)
* [Suspend Subscription](../../doc/controllers/subscriptions.md#suspend-subscription)
* [Cancel Subscription](../../doc/controllers/subscriptions.md#cancel-subscription)
* [Activate Subscription](../../doc/controllers/subscriptions.md#activate-subscription)
* [Capture Subscription](../../doc/controllers/subscriptions.md#capture-subscription)
* [List Subscription Transactions](../../doc/controllers/subscriptions.md#list-subscription-transactions)


# Create Billing Plan

Creates a plan that defines pricing and billing cycle details for subscriptions.

```java
CompletableFuture<ApiResponse<BillingPlan>> createBillingPlanAsync(
    final CreateBillingPlanInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` |
| `paypalRequestId` | `String` | Header, Optional | The server stores keys for 72 hours. |
| `body` | [`PlanRequest`](../../doc/models/plan-request.md) | Body, Optional | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`BillingPlan`](../../doc/models/billing-plan.md).

## Example Usage

```java
CreateBillingPlanInput createBillingPlanInput = new CreateBillingPlanInput.Builder(
    null
)
.prefer("return=minimal")
.body(new PlanRequest.Builder(
        "product_id2",
        "name6",
        Arrays.asList(
            new SubscriptionBillingCycle.Builder(
                new Frequency.Builder(
                    IntervalUnit.DAY
                )
                .intervalCount(1)
                .build(),
                TenureType.REGULAR,
                8
            )
            .totalCycles(1)
            .build()
        ),
        new PaymentPreferences.Builder()
            .autoBillOutstanding(true)
            .setupFeeFailureAction(SetupFeeFailureAction.CANCEL)
            .paymentFailureThreshold(0)
            .build()
    )
    .status(PlanRequestStatus.ACTIVE)
    .quantitySupported(false)
    .build())
.build();

subscriptionsController.createBillingPlanAsync(createBillingPlanInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# List Billing Plans

Lists billing plans.

```java
CompletableFuture<ApiResponse<PlanCollection>> listBillingPlansAsync(
    final ListBillingPlansInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, name, description and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` |
| `productId` | `String` | Query, Optional | Filters the response by a Product ID.<br><br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `50` |
| `pageSize` | `Integer` | Query, Optional | The number of items to return in the response.<br><br>**Default**: `10`<br><br>**Constraints**: `>= 1`, `<= 20` |
| `page` | `Integer` | Query, Optional | A non-zero integer which is the start index of the entire list of items to return in the response. The combination of `page=1` and `page_size=20` returns the first 20 items. The combination of `page=2` and `page_size=20` returns the next 20 items.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1`, `<= 100000` |
| `totalRequired` | `Boolean` | Query, Optional | Indicates whether to show the total count in the response.<br><br>**Default**: `false` |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`PlanCollection`](../../doc/models/plan-collection.md).

## Example Usage

```java
ListBillingPlansInput listBillingPlansInput = new ListBillingPlansInput.Builder()
    .prefer("return=minimal")
    .pageSize(10)
    .page(1)
    .totalRequired(false)
    .build();

subscriptionsController.listBillingPlansAsync(listBillingPlansInput).thenAccept(result -> {
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
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Get Billing Plan

Shows details for a plan, by ID.

```java
CompletableFuture<ApiResponse<BillingPlan>> getBillingPlanAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the plan. |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`BillingPlan`](../../doc/models/billing-plan.md).

## Example Usage

```java
String id = "id0";

subscriptionsController.getBillingPlanAsync(id).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Patch Billing Plan

Updates a plan with the `CREATED` or `ACTIVE` status. For an `INACTIVE` plan, you can make only status updates. You can patch these attributes and objects: Attribute or object Operations description replace payment_preferences.auto_bill_outstanding replace taxes.percentage replace payment_preferences.payment_failure_threshold replace payment_preferences.setup_fee replace payment_preferences.setup_fee_failure_action replace name replace

```java
CompletableFuture<ApiResponse<Void>> patchBillingPlanAsync(
    final PatchBillingPlanInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the plan. |
| `body` | [`List<Patch>`](../../doc/models/patch.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
PatchBillingPlanInput patchBillingPlanInput = new PatchBillingPlanInput.Builder(
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

subscriptionsController.patchBillingPlanAsync(patchBillingPlanInput).thenAccept(result -> {
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
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Activate Billing Plan

Activates a plan, by ID.

```java
CompletableFuture<ApiResponse<Void>> activateBillingPlanAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the plan. |

## Response Type

`void`

## Example Usage

```java
String id = "id0";

subscriptionsController.activateBillingPlanAsync(id).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Deactivate Billing Plan

Deactivates a plan, by ID.

```java
CompletableFuture<ApiResponse<Void>> deactivateBillingPlanAsync(
    final String id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the plan. |

## Response Type

`void`

## Example Usage

```java
String id = "id0";

subscriptionsController.deactivateBillingPlanAsync(id).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Update Billing Plan Pricing Schemes

Updates pricing for a plan. For example, you can update a regular billing cycle from $5 per month to $7 per month.

```java
CompletableFuture<ApiResponse<Void>> updateBillingPlanPricingSchemesAsync(
    final UpdateBillingPlanPricingSchemesInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID for the plan. |
| `body` | [`UpdatePricingSchemesRequest`](../../doc/models/update-pricing-schemes-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
UpdateBillingPlanPricingSchemesInput updateBillingPlanPricingSchemesInput = new UpdateBillingPlanPricingSchemesInput.Builder(
    "id0",
    null
)
.body(new UpdatePricingSchemesRequest.Builder(
        Arrays.asList(
            new UpdatePricingScheme.Builder(
                34,
                new SubscriptionPricingScheme.Builder()
                    .build()
            )
            .build()
        )
    )
    .build())
.build();

subscriptionsController.updateBillingPlanPricingSchemesAsync(updateBillingPlanPricingSchemesInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Create Subscription

Creates a subscription.

```java
CompletableFuture<ApiResponse<Subscription>> createSubscriptionAsync(
    final CreateSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `prefer` | `String` | Header, Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` |
| `paypalRequestId` | `String` | Header, Optional | The server stores keys for 72 hours. |
| `paypalClientMetadataId` | `String` | Header, Optional | The PayPal Client Metadata Id(CMID) is used to provide device-specific information to PayPal's risk engine. This is crucial for transactions that require device-specific risk assessments. Merchants typically use the Paypal SDK that automatically submits the CMID or they use tools like Fraudnet JS for web or Magnes JS for mobile to generate the CMID on the frontend and then pass it to the API as part of the request headers.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` |
| `body` | [`CreateSubscriptionRequest`](../../doc/models/create-subscription-request.md) | Body, Optional | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Subscription`](../../doc/models/subscription.md).

## Example Usage

```java
CreateSubscriptionInput createSubscriptionInput = new CreateSubscriptionInput.Builder(
    null
)
.prefer("return=minimal")
.body(new CreateSubscriptionRequest.Builder(
        "plan_id8"
    )
    .autoRenewal(false)
    .build())
.build();

subscriptionsController.createSubscriptionAsync(createSubscriptionInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# List Subscriptions

List all subscriptions for merchant account.

```java
CompletableFuture<ApiResponse<SubscriptionCollection>> listSubscriptionsAsync(
    final ListSubscriptionsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planIds` | `String` | Query, Optional | Filters the response by list of plan IDs. Filter supports upto 70 plan IDs. URLs should not exceed a length of 2000 characters. |
| `statuses` | `String` | Query, Optional | Filters the response by list of subscription statuses.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `70`, *Pattern*: `^[A-Z_,]+$` |
| `createdAfter` | `String` | Query, Optional | Filters the response by subscription creation start time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` |
| `createdBefore` | `String` | Query, Optional | Filters the response by subscription creation end time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` |
| `statusUpdatedBefore` | `String` | Query, Optional | Filters the response by status update start time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` |
| `statusUpdatedAfter` | `String` | Query, Optional | Filters the response by status update end time for a range of subscriptions.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` |
| `filter` | `String` | Query, Optional | Filter the response using complex expressions that could use comparison operators like ge, gt, le, lt and logical operators such as 'and' and 'or'.<br><br>**Constraints**: *Minimum Length*: `0`, *Maximum Length*: `100` |
| `pageSize` | `Integer` | Query, Optional | The number of items to return in the response.<br><br>**Default**: `10`<br><br>**Constraints**: `>= 1`, `<= 20` |
| `page` | `Integer` | Query, Optional | A non-zero integer which is the start index of the entire list of items to return in the response. The combination of `page=1` and `page_size=20` returns the first 20 items. The combination of `page=2` and `page_size=20` returns the next 20 items.<br><br>**Default**: `1`<br><br>**Constraints**: `>= 1`, `<= 10000000` |
| `customerIds` | `List<String>` | Query, Optional | Filters the response by comma separated vault customer IDs (FSS subscriptions only).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10`, *Minimum Length*: `1`, *Maximum Length*: `22`, *Pattern*: `^[0-9a-zA-Z_-]+$` |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`SubscriptionCollection`](../../doc/models/subscription-collection.md).

## Example Usage

```java
ListSubscriptionsInput listSubscriptionsInput = new ListSubscriptionsInput.Builder()
    .pageSize(10)
    .page(1)
    .build();

subscriptionsController.listSubscriptionsAsync(listSubscriptionsInput).thenAccept(result -> {
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
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Get Subscription

Shows details for a subscription, by ID.

```java
CompletableFuture<ApiResponse<Subscription>> getSubscriptionAsync(
    final GetSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the subscription. |
| `fields` | `String` | Query, Optional | List of fields that are to be returned in the response. Possible value for fields are last_failed_payment and plan.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Subscription`](../../doc/models/subscription.md).

## Example Usage

```java
GetSubscriptionInput getSubscriptionInput = new GetSubscriptionInput.Builder(
    "id0"
)
.build();

subscriptionsController.getSubscriptionAsync(getSubscriptionInput).thenAccept(result -> {
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
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Patch Subscription

Updates a subscription which could be in ACTIVE or SUSPENDED status. You can override plan level default attributes by providing customised values for plan path in the patch request. You cannot update attributes that have already completed (Example - trial cycles can’t be updated if completed). Once overridden, changes to plan resource will not impact subscription. Any price update will not impact billing cycles within next 10 days (Applicable only for subscriptions funded by PayPal account). Following are the fields eligible for patch. Attribute or object Operations billing_info.outstanding_balance replace custom_id add,replace plan.billing_cycles[@sequence==n]. pricing_scheme.fixed_price add,replace plan.billing_cycles[@sequence==n]. pricing_scheme.tiers replace plan.billing_cycles[@sequence==n]. total_cycles replace plan.payment_preferences. auto_bill_outstanding replace plan.payment_preferences. payment_failure_threshold replace plan.taxes.inclusive add,replace plan.taxes.percentage add,replace shipping_amount add,replace start_time replace subscriber.shipping_address add,replace subscriber.payment_source (for subscriptions funded by card payments) replace

```java
CompletableFuture<ApiResponse<Void>> patchSubscriptionAsync(
    final PatchSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID for the subscription. |
| `body` | [`List<Patch>`](../../doc/models/patch.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
PatchSubscriptionInput patchSubscriptionInput = new PatchSubscriptionInput.Builder(
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

subscriptionsController.patchSubscriptionAsync(patchSubscriptionInput).thenAccept(result -> {
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
| 400 | Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Revise Subscription

Updates the quantity of the product or service in a subscription. You can also use this method to switch the plan and update the `shipping_amount`, `shipping_address` values for the subscription. This type of update requires the buyer's consent.

```java
CompletableFuture<ApiResponse<ModifySubscriptionResponse>> reviseSubscriptionAsync(
    final ReviseSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the subscription. |
| `body` | [`ModifySubscriptionRequest`](../../doc/models/modify-subscription-request.md) | Body, Optional | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`ModifySubscriptionResponse`](../../doc/models/modify-subscription-response.md).

## Example Usage

```java
ReviseSubscriptionInput reviseSubscriptionInput = new ReviseSubscriptionInput.Builder(
    "id0",
    null
)
.build();

subscriptionsController.reviseSubscriptionAsync(reviseSubscriptionInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Suspend Subscription

Suspends the subscription.

```java
CompletableFuture<ApiResponse<Void>> suspendSubscriptionAsync(
    final SuspendSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the subscription. |
| `body` | [`SuspendSubscription`](../../doc/models/suspend-subscription.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
SuspendSubscriptionInput suspendSubscriptionInput = new SuspendSubscriptionInput.Builder(
    "id0",
    null
)
.build();

subscriptionsController.suspendSubscriptionAsync(suspendSubscriptionInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Cancel Subscription

Cancels the subscription.

```java
CompletableFuture<ApiResponse<Void>> cancelSubscriptionAsync(
    final CancelSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the subscription. |
| `body` | [`CancelSubscriptionRequest`](../../doc/models/cancel-subscription-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
CancelSubscriptionInput cancelSubscriptionInput = new CancelSubscriptionInput.Builder(
    "id0",
    null
)
.build();

subscriptionsController.cancelSubscriptionAsync(cancelSubscriptionInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Activate Subscription

Activates the subscription.

```java
CompletableFuture<ApiResponse<Void>> activateSubscriptionAsync(
    final ActivateSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the subscription. |
| `body` | [`ActivateSubscriptionRequest`](../../doc/models/activate-subscription-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
ActivateSubscriptionInput activateSubscriptionInput = new ActivateSubscriptionInput.Builder(
    "id0",
    null
)
.build();

subscriptionsController.activateSubscriptionAsync(activateSubscriptionInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# Capture Subscription

Captures an authorized payment from the subscriber on the subscription.

```java
CompletableFuture<ApiResponse<SubscriptionTransactionDetails>> captureSubscriptionAsync(
    final CaptureSubscriptionInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the subscription. |
| `paypalRequestId` | `String` | Header, Optional | The server stores keys for 72 hours. |
| `body` | [`CaptureSubscriptionRequest`](../../doc/models/capture-subscription-request.md) | Body, Optional | - |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`SubscriptionTransactionDetails`](../../doc/models/subscription-transaction-details.md).

## Example Usage

```java
CaptureSubscriptionInput captureSubscriptionInput = new CaptureSubscriptionInput.Builder(
    "id0",
    null
)
.build();

subscriptionsController.captureSubscriptionAsync(captureSubscriptionInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 422 | The requested action could not be performed, semantically incorrect, or failed business validation. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |


# List Subscription Transactions

Lists transactions for a subscription.

```java
CompletableFuture<ApiResponse<TransactionsList>> listSubscriptionTransactionsAsync(
    final ListSubscriptionTransactionsInput input)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | The ID of the subscription. |
| `startTime` | `String` | Query, Required | The start time of the range of transactions to list.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` |
| `endTime` | `String` | Query, Required | The end time of the range of transactions to list.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` |

## Response Type

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`TransactionsList`](../../doc/models/transactions-list.md).

## Example Usage

```java
ListSubscriptionTransactionsInput listSubscriptionTransactionsInput = new ListSubscriptionTransactionsInput.Builder(
    "id0",
    "start_time6",
    "end_time2"
)
.build();

subscriptionsController.listSubscriptionTransactionsAsync(listSubscriptionTransactionsInput).thenAccept(result -> {
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
| 400 | Bad Request. Request is not well-formed, syntactically incorrect, or violates schema. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 401 | Authentication failed due to missing authorization header, or invalid authentication credentials. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 403 | Authorization failed due to insufficient permissions. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 404 | The specified resource does not exist. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| 500 | An internal server error has occurred. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |
| Default | The error response. | [`SubscriptionErrorException`](../../doc/models/subscription-error-exception.md) |

