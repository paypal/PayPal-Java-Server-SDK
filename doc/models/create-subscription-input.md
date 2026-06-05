
# Create Subscription Input

Input structure for the method CreateSubscriptionAsync

## Structure

`CreateSubscriptionInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"` | String getPrefer() | setPrefer(String prefer) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 72 hours. | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `PaypalClientMetadataId` | `String` | Optional | The PayPal Client Metadata Id(CMID) is used to provide device-specific information to PayPal's risk engine. This is crucial for transactions that require device-specific risk assessments. Merchants typically use the Paypal SDK that automatically submits the CMID or they use tools like Fraudnet JS for web or Magnes JS for mobile to generate the CMID on the frontend and then pass it to the API as part of the request headers.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` | String getPaypalClientMetadataId() | setPaypalClientMetadataId(String paypalClientMetadataId) |
| `Body` | [`CreateSubscriptionRequest`](../../doc/models/create-subscription-request.md) | Optional | - | CreateSubscriptionRequest getBody() | setBody(CreateSubscriptionRequest body) |

## Example

```java
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.CreateSubscriptionInput;
import com.paypal.sdk.models.CreateSubscriptionRequest;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.ShippingDetails;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.ShippingOption;
import com.paypal.sdk.models.ShippingType;
import com.paypal.sdk.models.SubscriberRequest;
import com.paypal.sdk.models.SubscriptionCardRequest;
import com.paypal.sdk.models.SubscriptionPaymentSource;
import java.util.Arrays;

CreateSubscriptionInput createSubscriptionInput = new CreateSubscriptionInput.Builder(
    "application/json"
)
.prefer("return=minimal")
.paypalRequestId("PayPal-Request-Id6")
.paypalClientMetadataId("PayPal-Client-Metadata-Id2")
.body(new CreateSubscriptionRequest.Builder(
        "plan_id8"
    )
    .startTime("start_time0")
    .quantity("quantity2")
    .shippingAmount(new Money.Builder(
            "currency_code0",
            "value6"
        )
        .build())
    .subscriber(new SubscriberRequest.Builder()
            .emailAddress("email_address8")
            .payerId("payer_id8")
            .name(new Name.Builder()
                .givenName("given_name2")
                .surname("surname8")
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
            .paymentSource(new SubscriptionPaymentSource.Builder()
                .card(new SubscriptionCardRequest.Builder()
                    .name("name6")
                    .number("number6")
                    .expiry("expiry4")
                    .securityCode("security_code8")
                    .type(CardType.UNKNOWN)
                    .build())
                .build())
            .build())
    .autoRenewal(false)
    .build())
.build();
```

