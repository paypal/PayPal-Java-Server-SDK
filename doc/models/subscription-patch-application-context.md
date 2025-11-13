
# Subscription Patch Application Context

The application context, which customizes the payer experience during the subscription approval process with PayPal.

## Structure

`SubscriptionPatchApplicationContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandName` | `String` | Optional | The label that overrides the business name in the PayPal account on the PayPal site.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^.*$` | String getBrandName() | setBrandName(String brandName) |
| `Locale` | `String` | Optional | The BCP 47-formatted locale of pages that the PayPal payment experience shows. PayPal supports a five-character code. For example, `da-DK`, `he-IL`, `id-ID`, `ja-JP`, `no-NO`, `pt-BR`, `ru-RU`, `sv-SE`, `th-TH`, `zh-CN`, `zh-HK`, or `zh-TW`.<br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `10`, *Pattern*: `^[a-z]{2}(?:-[A-Z][a-z]{3})?(?:-(?:[A-Z]{2}\|[0-9]{3}))?$` | String getLocale() | setLocale(String locale) |
| `ShippingPreference` | [`ExperienceContextShippingPreference`](../../doc/models/experience-context-shipping-preference.md) | Optional | The location from which the shipping address is derived.<br><br>**Default**: `ExperienceContextShippingPreference.GET_FROM_FILE`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | ExperienceContextShippingPreference getShippingPreference() | setShippingPreference(ExperienceContextShippingPreference shippingPreference) |
| `PaymentMethod` | [`PaymentMethod`](../../doc/models/payment-method.md) | Optional | The customer and merchant payment preferences. | PaymentMethod getPaymentMethod() | setPaymentMethod(PaymentMethod paymentMethod) |
| `ReturnUrl` | `String` | Required | The URL where the customer is redirected after the customer approves the payment.<br><br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `4000` | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Required | The URL where the customer is redirected after the customer cancels the payment.<br><br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `4000` | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example (as JSON)

```json
{
  "shipping_preference": "GET_FROM_FILE",
  "return_url": "return_url4",
  "cancel_url": "cancel_url8",
  "brand_name": "brand_name4",
  "locale": "locale8",
  "payment_method": {
    "payee_preferred": "UNRESTRICTED"
  }
}
```

