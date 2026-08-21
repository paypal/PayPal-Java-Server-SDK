
# Card Experience Context

Customizes the payer experience during the 3DS Approval for payment.

## Structure

`CardExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReturnUrl` | `String` | Optional | Describes the URL. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Optional | Describes the URL. | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example

```java
import com.paypal.sdk.models.CardExperienceContext;

CardExperienceContext cardExperienceContext = new CardExperienceContext.Builder()
    .returnUrl("return_url0")
    .cancelUrl("cancel_url2")
    .build();
```

