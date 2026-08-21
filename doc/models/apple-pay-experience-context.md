
# Apple Pay Experience Context

Customizes the payer experience during the approval process for the payment.

## Structure

`ApplePayExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReturnUrl` | `String` | Required | Describes the URL. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Required | Describes the URL. | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example

```java
import com.paypal.sdk.models.ApplePayExperienceContext;

ApplePayExperienceContext applePayExperienceContext = new ApplePayExperienceContext.Builder(
    "return_url4",
    "cancel_url6"
)
.build();
```

