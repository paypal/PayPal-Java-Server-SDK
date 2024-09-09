
# Line Item

The line items for this purchase. If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf.

## Structure

`LineItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The item name or title.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127` | String getName() | setName(String name) |
| `Quantity` | `String` | Required | The item quantity. Must be a whole number.<br>**Constraints**: *Maximum Length*: `10`, *Pattern*: `^[1-9][0-9]{0,9}$` | String getQuantity() | setQuantity(String quantity) |
| `Description` | `String` | Optional | The detailed item description.<br>**Constraints**: *Maximum Length*: `127` | String getDescription() | setDescription(String description) |
| `Sku` | `String` | Optional | The stock keeping unit (SKU) for the item.<br>**Constraints**: *Maximum Length*: `127` | String getSku() | setSku(String sku) |
| `Url` | `String` | Optional | The URL to the item being purchased. Visible to buyer and used in buyer experiences.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2048` | String getUrl() | setUrl(String url) |
| `ImageUrl` | `String` | Optional | The URL of the item's image. File type and size restrictions apply. An image that violates these restrictions will not be honored.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2048`, *Pattern*: `^(https:)([/\|.\|\w\|\s\|-])*\.(?:jpg\|gif\|png\|jpeg\|JPG\|GIF\|PNG\|JPEG)` | String getImageUrl() | setImageUrl(String imageUrl) |
| `Upc` | [`UniversalProductCode`](../../doc/models/universal-product-code.md) | Optional | The Universal Product Code of the item. | UniversalProductCode getUpc() | setUpc(UniversalProductCode upc) |
| `UnitAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getUnitAmount() | setUnitAmount(Money unitAmount) |
| `Tax` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTax() | setTax(Money tax) |
| `CommodityCode` | `String` | Optional | Code used to classify items purchased and track the total amount spent across various categories of products and services. Different corporate purchasing organizations may use different standards, but the United Nations Standard Products and Services Code (UNSPSC) is frequently used.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `12`, *Pattern*: `^[a-zA-Z0-9_'.-]*$` | String getCommodityCode() | setCommodityCode(String commodityCode) |
| `DiscountAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getDiscountAmount() | setDiscountAmount(Money discountAmount) |
| `TotalAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTotalAmount() | setTotalAmount(Money totalAmount) |
| `UnitOfMeasure` | `String` | Optional | Unit of measure is a standard used to express the magnitude of a quantity in international trade. Most commonly used (but not limited to) examples are: Acre (ACR), Ampere (AMP), Centigram (CGM), Centimetre (CMT), Cubic inch (INQ), Cubic metre (MTQ), Fluid ounce (OZA), Foot (FOT), Hour (HUR), Item (ITM), Kilogram (KGM), Kilometre (KMT), Kilowatt (KWT), Liquid gallon (GLL), Liter (LTR), Pounds (LBS), Square foot (FTK).<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `12`, *Pattern*: `^[a-zA-Z0-9_'.-]*$` | String getUnitOfMeasure() | setUnitOfMeasure(String unitOfMeasure) |

## Example (as JSON)

```json
{
  "name": "name8",
  "quantity": "quantity4",
  "description": "description8",
  "sku": "sku6",
  "url": "url2",
  "image_url": "image_url4",
  "upc": {
    "type": "UPC-B",
    "code": "code0"
  }
}
```
