
# Search Error Exception

The error details.

## Structure

`SearchErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The human-readable, unique name of the error. | String getName() | setName(String name) |
| `Message` | `String` | Required | The message that describes the error. | String getMessageField() | setMessageField(String messageField) |
| `DebugId` | `String` | Required | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `InformationLink` | `String` | Optional, Read-only | The information link, or URI, that shows detailed information about this error for the developer. | String getInformationLink() | setInformationLink(String informationLink) |
| `Details` | [`List<TransactionSearchErrorDetails>`](../../doc/models/transaction-search-error-details.md) | Optional | An array of additional details about the error. | List<TransactionSearchErrorDetails> getDetails() | setDetails(List<TransactionSearchErrorDetails> details) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `TotalItems` | `Integer` | Optional | The total number of transactions. Valid only for `RESULTSET_TOO_LARGE`.<br><br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getTotalItems() | setTotalItems(Integer totalItems) |
| `MaximumItems` | `Integer` | Optional | The maximum number of transactions. Valid only for `RESULTSET_TOO_LARGE`.<br><br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getMaximumItems() | setMaximumItems(Integer maximumItems) |

## Example

```java
try {
    // make the API call
} catch (SearchErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

