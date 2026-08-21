
# Giropay Payment Request

Information needed to pay using giropay.

## Structure

`GiropayPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The full name representation like Mr J Smith.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `CountryCode` | `String` | Required | The [two-character ISO 3166-1 code](https://developer.paypal.com/api/rest/reference/country-codes/) that identifies the country or region. Note: The country code for Great Britain is GB and not UK as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.<br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `ExperienceContext` | [`ExperienceContext`](../../doc/models/experience-context.md) | Optional | Customizes the payer experience during the approval process for the payment. | ExperienceContext getExperienceContext() | setExperienceContext(ExperienceContext experienceContext) |

## Example

```java
import com.paypal.sdk.models.ExperienceContext;
import com.paypal.sdk.models.ExperienceContextShippingPreference;
import com.paypal.sdk.models.GiropayPaymentRequest;

GiropayPaymentRequest giropayPaymentRequest = new GiropayPaymentRequest.Builder(
    "name4",
    "country_code4"
)
.experienceContext(new ExperienceContext.Builder()
        .brandName("brand_name2")
        .locale("locale6")
        .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
        .returnUrl("return_url4")
        .cancelUrl("cancel_url6")
        .build())
.build();
```

