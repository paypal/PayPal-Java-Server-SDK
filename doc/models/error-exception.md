
# Error Exception

The error details.

## Structure

`ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The human-readable, unique name of the error. | String getName() | setName(String name) |
| `Message` | `String` | Required | The message that describes the error. | String getMessageField() | setMessageField(String messageField) |
| `DebugId` | `String` | Required | The PayPal internal ID. Used for correlation purposes. | String getDebugId() | setDebugId(String debugId) |
| `Details` | [`List<ErrorDetails>`](../../doc/models/error-details.md) | Optional | An array of additional details about the error. | List<ErrorDetails> getDetails() | setDetails(List<ErrorDetails> details) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related [HATEOAS links](https://developer.paypal.com/api/rest/responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
try {
    // make the API call
} catch (ErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

