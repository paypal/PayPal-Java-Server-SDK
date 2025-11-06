
# Merchant Preferences

The merchant preferences for a subscription.

## Structure

`MerchantPreferences`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ReturnUrl` | `String` | Optional | The URL where the customer is redirected after the customer approves the payment.<br><br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `4000` | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Optional | The URL where the customer is redirected after the customer cancels the payment.<br><br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `4000` | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example (as JSON)

```json
{
  "return_url": "return_url8",
  "cancel_url": "cancel_url0"
}
```

