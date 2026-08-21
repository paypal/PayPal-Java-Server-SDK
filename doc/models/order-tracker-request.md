
# Order Tracker Request

The tracking details of an order.

## Structure

`OrderTrackerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TrackingNumber` | `String` | Optional | The tracking number for the shipment. This property supports Unicode.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getTrackingNumber() | setTrackingNumber(String trackingNumber) |
| `Carrier` | [`ShipmentCarrier`](../../doc/models/shipment-carrier.md) | Optional | The carrier for the shipment. Some carriers have a global version as well as local subsidiaries. The subsidiaries are repeated over many countries and might also have an entry in the global list. Choose the carrier for your country. If the carrier is not available for your country, choose the global version of the carrier. If your carrier name is not in the list, set `carrier` to `OTHER` and set carrier name in `carrier_name_other`. For allowed values, see Carriers.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64`, *Pattern*: `^[0-9A-Z_]+$` | ShipmentCarrier getCarrier() | setCarrier(ShipmentCarrier carrier) |
| `CarrierNameOther` | `String` | Optional | The name of the carrier for the shipment. Provide this value only if the carrier parameter is OTHER. This property supports Unicode.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getCarrierNameOther() | setCarrierNameOther(String carrierNameOther) |
| `CaptureId` | `String` | Required | The PayPal capture ID.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50`, *Pattern*: `^[a-zA-Z0-9]*$` | String getCaptureId() | setCaptureId(String captureId) |
| `NotifyPayer` | `Boolean` | Optional | If true, PayPal will send an email notification to the payer of the PayPal transaction. The email contains the tracking details provided through the Orders tracking API request. Independent of any value passed for `notify_payer`, the payer may receive tracking notifications within the PayPal app, based on the user's notification preferences.<br><br>**Default**: `false` | Boolean getNotifyPayer() | setNotifyPayer(Boolean notifyPayer) |
| `Items` | [`List<OrderTrackerItem>`](../../doc/models/order-tracker-item.md) | Optional | An array of details of items in the shipment. | List<OrderTrackerItem> getItems() | setItems(List<OrderTrackerItem> items) |

## Example

```java
import com.paypal.sdk.models.OrderTrackerItem;
import com.paypal.sdk.models.OrderTrackerRequest;
import com.paypal.sdk.models.ShipmentCarrier;
import java.util.Arrays;

OrderTrackerRequest orderTrackerRequest = new OrderTrackerRequest.Builder(
    "capture_id2"
)
.trackingNumber("tracking_number8")
.carrier(ShipmentCarrier.POSTA_RO)
.carrierNameOther("carrier_name_other2")
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
            .build()
    ))
.build();
```

