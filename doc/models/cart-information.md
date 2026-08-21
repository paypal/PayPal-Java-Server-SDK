
# Cart Information

The cart information.

## Structure

`CartInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ItemDetails` | [`List<ItemDetails>`](../../doc/models/item-details.md) | Optional | An array of item details.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32767` | List<ItemDetails> getItemDetails() | setItemDetails(List<ItemDetails> itemDetails) |
| `TaxInclusive` | `Boolean` | Optional | Indicates whether the item amount or the shipping amount already includes tax.<br><br>**Default**: `false` | Boolean getTaxInclusive() | setTaxInclusive(Boolean taxInclusive) |
| `PaypalInvoiceId` | `String` | Optional | The ID of the invoice. Appears for only PayPal-generated invoices.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getPaypalInvoiceId() | setPaypalInvoiceId(String paypalInvoiceId) |

## Example

```java
import com.paypal.sdk.models.CartInformation;
import com.paypal.sdk.models.ItemDetails;
import java.util.Arrays;

CartInformation cartInformation = new CartInformation.Builder()
    .itemDetails(Arrays.asList(
        new ItemDetails.Builder()
            .itemCode("item_code0")
            .itemName("item_name8")
            .itemDescription("item_description4")
            .itemOptions("item_options2")
            .itemQuantity("item_quantity2")
            .build()
    ))
    .taxInclusive(false)
    .paypalInvoiceId("paypal_invoice_id4")
    .build();
```

