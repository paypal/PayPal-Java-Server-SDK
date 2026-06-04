
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
| `getResponseCode()` | The HTTP Response code from the API request | `int` |
| `getHttpContext()` | The HTTP Context from the API request. | [`HttpContext`](../doc/http-context.md) |

