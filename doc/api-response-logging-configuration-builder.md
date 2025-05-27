
# ApiResponseLoggingConfiguration.Builder

Class to build instances of ResponseLoggingConfiguration.

## Constructors

| Name | Description |
|  --- | --- |
| `Builder()` | Default Constructor to initiate builder with default properties. |

## Methods

| Name | Description |
|  --- | --- |
| `body(boolean logBody)` | Sets whether to log the response body. Default value is false. |
| `headers(boolean logHeaders)` | Sets whether to log the response headers. Default value is false. |
| `excludeHeaders(String... excludeHeaders)` | Sets the headers to be excluded from logging. |
| `includeHeaders(String... includeHeaders)` | Sets the headers to be included in logging. |
| `unmaskHeaders(String... unmaskHeaders)` | Sets the headers to be unmasked in logging. |
| `build()` | Constructs a ResponseLoggingConfiguration object with the set values. |

