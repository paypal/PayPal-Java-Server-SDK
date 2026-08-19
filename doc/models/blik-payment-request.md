
# Blik Payment Request

Information needed to pay using BLIK.

## Structure

`BlikPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The full name representation like Mr J Smith.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `CountryCode` | `String` | Required | The [two-character ISO 3166-1 code](https://developer.paypal.com/api/rest/reference/country-codes/) that identifies the country or region. Note: The country code for Great Britain is GB and not UK as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.<br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Email` | `String` | Optional | The internationalized email address. Note: Up to 64 characters are allowed before and 255 characters are allowed after the @ sign. However, the generally accepted maximum length for an email address is 254 characters. The pattern verifies that an unquoted @ sign exists.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `254`, *Pattern*: ``^(?:[A-Za-z0-9!#$%&'*+/=?^_`{\|}~-]+(?:\.[A-Za-z0-9!#$%&'*+/=?^_`{\|}~-]+)*\|"(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21\x23-\x5b\x5d-\x7f]\|\\[\x01-\x09\x0b\x0c\x0e-\x7f])*")@(?:(?:[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\.)+[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\|\[(?:(?:25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?)\.){3}(?:25[0-5]\|2[0-4][0-9]\|[01]?[0-9][0-9]?\|[A-Za-z0-9-]*[A-Za-z0-9]:(?:[\x01-\x08\x0b\x0c\x0e-\x1f\x21-\x5a\x53-\x7f]\|\\[\x01-\x09\x0b\x0c\x0e-\x7f])+)\])$`` | String getEmail() | setEmail(String email) |
| `ExperienceContext` | [`BlikExperienceContext`](../../doc/models/blik-experience-context.md) | Optional | Customizes the payer experience during the approval process for the BLIK payment. | BlikExperienceContext getExperienceContext() | setExperienceContext(BlikExperienceContext experienceContext) |
| `Level0` | [`BlikLevel0PaymentObject`](../../doc/models/blik-level-0-payment-object.md) | Optional | Information used to pay using BLIK level_0 flow. | BlikLevel0PaymentObject getLevel0() | setLevel0(BlikLevel0PaymentObject level0) |
| `OneClick` | [`BlikOneClickPaymentRequest`](../../doc/models/blik-one-click-payment-request.md) | Optional | Information used to pay using BLIK one-click flow. | BlikOneClickPaymentRequest getOneClick() | setOneClick(BlikOneClickPaymentRequest oneClick) |

## Example

```java
import com.paypal.sdk.models.BlikExperienceContext;
import com.paypal.sdk.models.BlikLevel0PaymentObject;
import com.paypal.sdk.models.BlikOneClickPaymentRequest;
import com.paypal.sdk.models.BlikPaymentRequest;
import com.paypal.sdk.models.ExperienceContextShippingPreference;

BlikPaymentRequest blikPaymentRequest = new BlikPaymentRequest.Builder(
    "name6",
    "country_code6"
)
.email("email0")
.experienceContext(new BlikExperienceContext.Builder()
        .brandName("brand_name2")
        .locale("locale6")
        .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
        .returnUrl("return_url4")
        .cancelUrl("cancel_url6")
        .build())
.level0(new BlikLevel0PaymentObject.Builder(
        "auth_code8"
    )
    .build())
.oneClick(new BlikOneClickPaymentRequest.Builder(
        "consumer_reference2"
    )
    .authCode("auth_code0")
    .aliasLabel("alias_label6")
    .aliasKey("alias_key4")
    .build())
.build();
```

