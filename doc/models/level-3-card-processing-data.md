
# Level 3 Card Processing Data

The level 3 card processing data collections, If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf. Please contact your PayPal Technical Account Manager to define level 3 data for your business.

## Structure

`Level3CardProcessingData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingAmount() | setShippingAmount(Money shippingAmount) |
| `DutyAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getDutyAmount() | setDutyAmount(Money dutyAmount) |
| `DiscountAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getDiscountAmount() | setDiscountAmount(Money discountAmount) |
| `ShippingAddress` | [`Address`](../../doc/models/address.md) | Optional | The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute). | Address getShippingAddress() | setShippingAddress(Address shippingAddress) |
| `ShipsFromPostalCode` | `String` | Optional | Use this field to specify the postal code of the shipping location.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `60`, *Pattern*: `^[a-zA-Z0-9_'.-]*$` | String getShipsFromPostalCode() | setShipsFromPostalCode(String shipsFromPostalCode) |
| `LineItems` | [`List<LineItem>`](../../doc/models/line-item.md) | Optional | A list of the items that were purchased with this payment. If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `100` | List<LineItem> getLineItems() | setLineItems(List<LineItem> lineItems) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.Level3CardProcessingData;
import com.paypal.sdk.models.Money;

Level3CardProcessingData level3CardProcessingData = new Level3CardProcessingData.Builder()
    .shippingAmount(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
    .dutyAmount(new Money.Builder(
        "currency_code6",
        "value2"
    )
    .build())
    .discountAmount(new Money.Builder(
        "currency_code2",
        "value8"
    )
    .build())
    .shippingAddress(new Address.Builder(
        "country_code0"
    )
    .addressLine1("address_line_10")
    .addressLine2("address_line_20")
    .adminArea2("admin_area_24")
    .adminArea1("admin_area_16")
    .postalCode("postal_code2")
    .build())
    .shipsFromPostalCode("ships_from_postal_code8")
    .build();
```

