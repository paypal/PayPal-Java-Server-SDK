
# Google Pay Experience Context

Customizes the payer experience during the approval process for the payment.

## Structure

`GooglePayExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReturnUrl` | `String` | Required | Describes the URL. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Required | Describes the URL. | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example

```java
import com.paypal.sdk.models.GooglePayExperienceContext;

GooglePayExperienceContext googlePayExperienceContext = new GooglePayExperienceContext.Builder(
    "return_url6",
    "cancel_url8"
)
.build();
```

