
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

## Example (as JSON)

```json
{
  "tax_inclusive": false,
  "item_details": [
    {
      "item_code": "item_code0",
      "item_name": "item_name8",
      "item_description": "item_description4",
      "item_options": "item_options2",
      "item_quantity": "item_quantity2"
    }
  ],
  "paypal_invoice_id": "paypal_invoice_id2"
}
```

