
# ApiException

This is the base class for all exceptions that represent an error response from the server.

## Constructors

| Name | Description |
|  --- | --- |
| `ApiException(String reason)` | Initialization constructor. |
| <code>ApiException(String reason, [`HttpContext`](../doc/http-context.md) context)</code> | Initialization constructor. |

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `getResponseCode()` | The HTTP response code from the API request | `int` |
| `getHeaders()` | The HTTP response body from the API request. | [`Headers`](../doc/headers.md) |

