
# Card Experience Context

Customizes the payer experience during the 3DS Approval for payment.

## Structure

`CardExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReturnUrl` | `String` | Optional | Describes the URL. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Optional | Describes the URL. | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example (as JSON)

```json
{
  "return_url": "return_url2",
  "cancel_url": "cancel_url0"
}
```

