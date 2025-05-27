
# HttpCallback Interface

Callback to be called before and after the HTTP call for an endpoint is made.

## Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| <code>onBeforeRequest([`HttpRequest`](../doc/http-request.md) request)</code> | Callback called just before the HTTP request is sent. | `void` |
| <code>onAfterResponse([`HttpContext`](../doc/http-context.md) context)</code> | Callback called just after the HTTP response is received. | `void` |

