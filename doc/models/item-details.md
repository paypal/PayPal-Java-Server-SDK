
# Item Details

The item details.

## Structure

`ItemDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ItemCode` | `String` | Optional | An item code that identifies a merchant's goods or service.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `1000`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getItemCode() | setItemCode(String itemCode) |
| `ItemName` | `String` | Optional | The item name.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `200`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getItemName() | setItemName(String itemName) |
| `ItemDescription` | `String` | Optional | The item description.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `2000`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getItemDescription() | setItemDescription(String itemDescription) |
| `ItemOptions` | `String` | Optional | The item options. Describes option choices on the purchase of the item in some detail.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `4000`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getItemOptions() | setItemOptions(String itemOptions) |
| `ItemQuantity` | `String` | Optional | The number of purchased units of goods or a service.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `4000`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getItemQuantity() | setItemQuantity(String itemQuantity) |
| `ItemUnitPrice` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getItemUnitPrice() | setItemUnitPrice(Money itemUnitPrice) |
| `ItemAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getItemAmount() | setItemAmount(Money itemAmount) |
| `DiscountAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getDiscountAmount() | setDiscountAmount(Money discountAmount) |
| `AdjustmentAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAdjustmentAmount() | setAdjustmentAmount(Money adjustmentAmount) |
| `GiftWrapAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getGiftWrapAmount() | setGiftWrapAmount(Money giftWrapAmount) |
| `TaxPercentage` | `String` | Optional | The percentage, as a fixed-point, signed decimal number. For example, define a 19.99% interest rate as `19.99`.<br><br>**Constraints**: *Pattern*: `^((-?[0-9]+)\|(-?([0-9]+)?[.][0-9]+))$` | String getTaxPercentage() | setTaxPercentage(String taxPercentage) |
| `TaxAmounts` | [`List<TaxAmount>`](../../doc/models/tax-amount.md) | Optional | An array of tax amounts levied by a government on the purchase of goods or services.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32767` | List<TaxAmount> getTaxAmounts() | setTaxAmounts(List<TaxAmount> taxAmounts) |
| `BasicShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getBasicShippingAmount() | setBasicShippingAmount(Money basicShippingAmount) |
| `ExtraShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getExtraShippingAmount() | setExtraShippingAmount(Money extraShippingAmount) |
| `HandlingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getHandlingAmount() | setHandlingAmount(Money handlingAmount) |
| `InsuranceAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getInsuranceAmount() | setInsuranceAmount(Money insuranceAmount) |
| `TotalItemAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTotalItemAmount() | setTotalItemAmount(Money totalItemAmount) |
| `InvoiceNumber` | `String` | Optional | The invoice number. An alphanumeric string that identifies a billing for a merchant.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `200`, *Pattern*: `^[a-zA-Z0-9_'\-., ":;\!?]*$` | String getInvoiceNumber() | setInvoiceNumber(String invoiceNumber) |
| `CheckoutOptions` | [`List<CheckoutOption>`](../../doc/models/checkout-option.md) | Optional | An array of checkout options. Each option has a name and value.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32767` | List<CheckoutOption> getCheckoutOptions() | setCheckoutOptions(List<CheckoutOption> checkoutOptions) |

## Example (as JSON)

```json
{
  "item_code": "item_code4",
  "item_name": "item_name2",
  "item_description": "item_description0",
  "item_options": "item_options4",
  "item_quantity": "item_quantity4"
}
```

