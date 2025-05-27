
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
try {
    ApiResponse<ExampleType> response = client.getExampleController().getExampleType(body);
    System.out.println("Success! Result: " + response.getResult());
    System.out.println("Status Code: " + response.getStatusCode());
} catch (ApiException exp) {
    System.out.println("Error: " + exp.getMessage());
    System.out.println("Result: " + exp.getHttpContext().getResponse().getBody());
    System.out.println("Status Code: " + exp.getResponseCode());
} catch (IOException exp) {
    System.out.println("Error: " + exp.getMessage());
}
```

