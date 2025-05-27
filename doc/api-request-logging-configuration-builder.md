
# ApiRequestLoggingConfiguration.Builder

Class to build instances of RequestLoggingConfiguration.

## Constructors

| Name | Description |
|  --- | --- |
| `Builder()` | Default Constructor to initiate builder with default properties. |

## Methods

| Name | Description |
|  --- | --- |
| `body(boolean logBody)` | Sets whether to log the body of the request. Default value is false. |
| `headers(boolean logHeaders)` | Sets whether to log the headers of the request. Default value is false. |
| `excludeHeaders(String... excludeHeaders)` | Sets the headers to be excluded from logging. |
| `includeHeaders(String... includeHeaders)` | Sets the headers to be included in logging. |
| `unmaskHeaders(String... unmaskHeaders)` | Sets the headers to be unmasked in logging. |
| `includeQueryInPath(boolean includeQueryInPath)` | Sets whether to include query parameters in the request path. Default value is true. |
| `build()` | Constructs a RequestLoggingConfiguration object with the set values. |

