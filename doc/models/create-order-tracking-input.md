
# Create Order Tracking Input

Input structure for the method CreateOrderTrackingAsync

## Structure

`CreateOrderTrackingInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the order that the tracking information is associated with.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`OrderTrackerRequest`](../../doc/models/order-tracker-request.md) | Required | - | OrderTrackerRequest getBody() | setBody(OrderTrackerRequest body) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see PayPal-Auth-Assertion. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |

## Example

```java
import com.paypal.sdk.models.CreateOrderTrackingInput;
import com.paypal.sdk.models.OrderTrackerItem;
import com.paypal.sdk.models.OrderTrackerRequest;
import com.paypal.sdk.models.ShipmentCarrier;
import java.util.Arrays;

CreateOrderTrackingInput createOrderTrackingInput = new CreateOrderTrackingInput.Builder(
    "id0",
    "application/json",
    new OrderTrackerRequest.Builder(
        "capture_id8"
    )
    .trackingNumber("tracking_number4")
    .carrier(ShipmentCarrier.PIGGYSHIP)
    .carrierNameOther("carrier_name_other8")
    .notifyPayer(false)
    .items(Arrays.asList(
            new OrderTrackerItem.Builder()
                .name("name8")
                .quantity("quantity4")
                .sku("sku6")
                .url("url2")
                .imageUrl("image_url4")
                .build(),
            new OrderTrackerItem.Builder()
                .name("name8")
                .quantity("quantity4")
                .sku("sku6")
                .url("url2")
                .imageUrl("image_url4")
                .build(),
            new OrderTrackerItem.Builder()
                .name("name8")
                .quantity("quantity4")
                .sku("sku6")
                .url("url2")
                .imageUrl("image_url4")
                .build()
        ))
    .build()
)
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.build();
```

