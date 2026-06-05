
# Revise Subscription Input

Input structure for the method ReviseSubscriptionAsync

## Structure

`ReviseSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the subscription. | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`ModifySubscriptionRequest`](../../doc/models/modify-subscription-request.md) | Optional | - | ModifySubscriptionRequest getBody() | setBody(ModifySubscriptionRequest body) |

## Example

```java
import com.paypal.sdk.models.ExperienceContextShippingPreference;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.ModifySubscriptionRequest;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PayeePaymentMethodPreference;
import com.paypal.sdk.models.PaymentMethod;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.ReviseSubscriptionInput;
import com.paypal.sdk.models.ShippingDetails;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.ShippingOption;
import com.paypal.sdk.models.ShippingType;
import com.paypal.sdk.models.SubscriptionPatchApplicationContext;
import java.util.Arrays;

ReviseSubscriptionInput reviseSubscriptionInput = new ReviseSubscriptionInput.Builder(
    "id0",
    "application/json"
)
.body(new ModifySubscriptionRequest.Builder()
        .planId("plan_id8")
        .quantity("quantity2")
        .shippingAmount(new Money.Builder(
            "currency_code0",
            "value6"
        )
        .build())
        .shippingAddress(new ShippingDetails.Builder()
            .name(new ShippingName.Builder()
                .fullName("full_name6")
                .build())
            .emailAddress("email_address8")
            .phoneNumber(new PhoneNumberWithCountryCode.Builder(
                "country_code2",
                "national_number6"
            )
            .build())
            .type(FulfillmentType.PICKUP_IN_STORE)
            .options(Arrays.asList(
                new ShippingOption.Builder(
                    "id2",
                    "label2",
                    false
                )
                .type(ShippingType.SHIPPING)
                .amount(new Money.Builder(
                        "currency_code6",
                        "value0"
                    )
                    .build())
                .build()
            ))
            .build())
        .applicationContext(new SubscriptionPatchApplicationContext.Builder(
            "return_url0",
            "cancel_url2"
        )
        .brandName("brand_name8")
        .locale("locale2")
        .shippingPreference(ExperienceContextShippingPreference.SET_PROVIDED_ADDRESS)
        .paymentMethod(new PaymentMethod.Builder()
                .payeePreferred(PayeePaymentMethodPreference.UNRESTRICTED)
                .build())
        .build())
        .build())
.build();
```

