
# Get Subscription Input

Input structure for the method GetSubscriptionAsync

## Structure

`GetSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the subscription. | String getId() | setId(String id) |
| `Fields` | `String` | Optional | List of fields that are to be returned in the response. Possible value for fields are last_failed_payment and plan.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` | String getFields() | setFields(String fields) |

## Example

```java
import com.paypal.sdk.models.GetSubscriptionInput;

GetSubscriptionInput getSubscriptionInput = new GetSubscriptionInput.Builder(
    "id0"
)
.fields("fields8")
.build();
```

