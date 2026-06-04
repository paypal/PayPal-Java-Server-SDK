
# ApiResponse

Represents the result of an API call, including response metadata and the returned data of type `T`.

## Methods

| Name | Description | Type |
|  --- | --- | --- |
| `getStatusCode()` | Returns the response status code. | `int` |
| `getHeaders()` | Returns the response headers. | [`Headers`](../doc/headers.md) |
| `getResult()` | `T` | Returns the response data. |

## Usage Example

```java
import java.io.IOException;
import com.paypal.sdk.exceptions;

exampleController.getExampleTypeAsync(body).thenAccept(result -> {
    // success callback handler
    System.out.println("Success! Result: " + result.getResult());
    System.out.println("Status Code: " + result.getStatusCode());
    System.out.println("Response Headers: " + result.getHeaders());
}).exceptionally(exception -> {
    Throwable cause = exception.getCause() != null ? exception.getCause() : exception;

    if (cause instanceof ApiException) {
        ApiException apiException = (ApiException) cause;
        System.out.println("Error: " + apiException.getMessage());
        System.out.println("Result: " + apiException.getHttpContext()
            .getResponse()
            .getBody());
        System.out.println("Status Code: " + apiException.getResponseCode());

    } else if (cause instanceof IOException) {
        IOException ioException = (IOException) cause;
        System.out.println("IO Error: " + ioException.getMessage());

    } else {
        cause.printStackTrace();
    }

    return null;
});
```

