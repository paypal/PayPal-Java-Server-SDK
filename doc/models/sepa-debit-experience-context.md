
# Sepa Debit Experience Context

Customizes the payer experience during the approval process for the SEPA Debit payment.

## Structure

`SepaDebitExperienceContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Locale` | `String` | Optional | The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to localize the error-related strings, such as messages, issues, and suggested actions. The tag is made up of the [ISO 639-2 language code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924 script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2 country code](/api/rest/reference/country-codes/) or [M49 region code](https://unstats.un.org/unsd/methodology/m49/).<br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `10`, *Pattern*: `^[a-z]{2}(?:-[A-Z][a-z]{3})?(?:-(?:[A-Z]{2}\|[0-9]{3}))?$` | String getLocale() | setLocale(String locale) |
| `ReturnUrl` | `String` | Required | Describes the URL. | String getReturnUrl() | setReturnUrl(String returnUrl) |
| `CancelUrl` | `String` | Required | Describes the URL. | String getCancelUrl() | setCancelUrl(String cancelUrl) |

## Example (as JSON)

```json
{
  "locale": "locale8",
  "return_url": "return_url6",
  "cancel_url": "cancel_url8"
}
```

