
# Google Pay Card Response

The payment card to use to fund a Google Pay payment response. Can be a credit or debit card.

## Structure

`GooglePayCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The card holder's name as it appears on the card.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `300`, *Pattern*: `^.{1,300}$` | String getName() | setName(String name) |
| `LastDigits` | `String` | Optional | The last digits of the payment card.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `4`, *Pattern*: `^[0-9]{2,4}$` | String getLastDigits() | setLastDigits(String lastDigits) |
| `Type` | [`CardType`](../../doc/models/card-type.md) | Optional | Type of card. i.e Credit, Debit and so on.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardType getType() | setType(CardType type) |
| `Brand` | [`CardBrand`](../../doc/models/card-brand.md) | Optional | The card network or brand. Applies to credit, debit, gift, and payment cards.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardBrand getBrand() | setBrand(CardBrand brand) |
| `BillingAddress` | [`Address`](../../doc/models/address.md) | Optional | The portable international postal address. Maps to [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata) and HTML 5.1 [Autofilling form controls: the autocomplete attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute). | Address getBillingAddress() | setBillingAddress(Address billingAddress) |
| `AuthenticationResult` | [`AuthenticationResponse`](../../doc/models/authentication-response.md) | Optional | Results of Authentication such as 3D Secure. | AuthenticationResponse getAuthenticationResult() | setAuthenticationResult(AuthenticationResponse authenticationResult) |

## Example (as JSON)

```json
{
  "name": "name4",
  "last_digits": "last_digits8",
  "type": "DEBIT",
  "brand": "ELECTRON",
  "billing_address": {
    "address_line_1": "address_line_12",
    "address_line_2": "address_line_28",
    "admin_area_2": "admin_area_28",
    "admin_area_1": "admin_area_14",
    "postal_code": "postal_code0",
    "country_code": "country_code8"
  }
}
```
