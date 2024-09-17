
# Mybank Payment Request

Information needed to pay using MyBank.

## Structure

`MybankPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The full name representation like Mr J Smith.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `CountryCode` | `String` | Required | The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `ExperienceContext` | [`ExperienceContext`](../../doc/models/experience-context.md) | Optional | Customizes the payer experience during the approval process for the payment. | ExperienceContext getExperienceContext() | setExperienceContext(ExperienceContext experienceContext) |

## Example (as JSON)

```json
{
  "name": "name0",
  "country_code": "country_code0",
  "experience_context": {
    "brand_name": "brand_name2",
    "locale": "locale6",
    "shipping_preference": "NO_SHIPPING",
    "return_url": "return_url4",
    "cancel_url": "cancel_url6"
  }
}
```
