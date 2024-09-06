
# Card Response

The payment card to use to fund a payment. Card can be a credit or debit card.

## Structure

`CardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The card holder's name as it appears on the card.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `300` | String getName() | setName(String name) |
| `LastDigits` | `String` | Optional | The last digits of the payment card.<br>**Constraints**: *Pattern*: `[0-9]{2,}` | String getLastDigits() | setLastDigits(String lastDigits) |
| `Brand` | [`CardBrand`](../../doc/models/card-brand.md) | Optional | The card network or brand. Applies to credit, debit, gift, and payment cards.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardBrand getBrand() | setBrand(CardBrand brand) |
| `AvailableNetworks` | [`List<CardBrand>`](../../doc/models/card-brand.md) | Optional | Array of brands or networks associated with the card.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `256`, *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | List<CardBrand> getAvailableNetworks() | setAvailableNetworks(List<CardBrand> availableNetworks) |
| `Type` | [`CardType`](../../doc/models/card-type.md) | Optional | Type of card. i.e Credit, Debit and so on.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Z_]+$` | CardType getType() | setType(CardType type) |
| `AuthenticationResult` | [`AuthenticationResponse`](../../doc/models/authentication-response.md) | Optional | Results of Authentication such as 3D Secure. | AuthenticationResponse getAuthenticationResult() | setAuthenticationResult(AuthenticationResponse authenticationResult) |
| `Attributes` | [`CardAttributesResponse`](../../doc/models/card-attributes-response.md) | Optional | Additional attributes associated with the use of this card. | CardAttributesResponse getAttributes() | setAttributes(CardAttributesResponse attributes) |
| `FromRequest` | [`CardFromRequest`](../../doc/models/card-from-request.md) | Optional | Representation of card details as received in the request. | CardFromRequest getFromRequest() | setFromRequest(CardFromRequest fromRequest) |
| `Expiry` | `String` | Optional | The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])$` | String getExpiry() | setExpiry(String expiry) |
| `BinDetails` | [`BinDetails`](../../doc/models/bin-details.md) | Optional | Bank Identification Number (BIN) details used to fund a payment. | BinDetails getBinDetails() | setBinDetails(BinDetails binDetails) |

## Example (as JSON)

```json
{
  "name": "name0",
  "last_digits": "last_digits4",
  "brand": "CONFIDIS",
  "available_networks": [
    "ELO",
    "DINERS",
    "CHINA_UNION_PAY"
  ],
  "type": "CREDIT"
}
```

