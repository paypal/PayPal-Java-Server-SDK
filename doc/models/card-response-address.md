
# Card Response Address

Address request details.

## Structure

`CardResponseAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Optional | The first line of the address, such as number and street, for example, `173 Drury Lane`. Needed for data entry, and Compliance and Risk checks. This field needs to pass the full address.<br>**Constraints**: *Maximum Length*: `300` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | The second line of the address, for example, a suite or apartment number.<br>**Constraints**: *Maximum Length*: `300` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AdminArea2` | `String` | Optional | A city, town, or village. Smaller than `admin_area_level_1`.<br>**Constraints**: *Maximum Length*: `120` | String getAdminArea2() | setAdminArea2(String adminArea2) |
| `AdminArea1` | `String` | Optional | The highest-level sub-division in a country, which is usually a province, state, or ISO-3166-2 subdivision. This data is formatted for postal delivery, for example, `CA` and not `California`. Value, by country, is: UK. A county. US. A state. Canada. A province. Japan. A prefecture. Switzerland. A *kanton*.<br>**Constraints**: *Maximum Length*: `300` | String getAdminArea1() | setAdminArea1(String adminArea1) |
| `PostalCode` | `String` | Optional | The postal code, which is the ZIP code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).<br>**Constraints**: *Maximum Length*: `60` | String getPostalCode() | setPostalCode(String postalCode) |
| `CountryCode` | `String` | Required | The [2-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the country or region. Note: The country code for Great Britain is GB and not UK as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Id` | `String` | Optional | The resource ID of the address.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[0-9A-Za-z-_]+$` | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "address_line_1": "address_line_12",
  "address_line_2": "address_line_22",
  "admin_area_2": "admin_area_26",
  "admin_area_1": "admin_area_18",
  "postal_code": "postal_code4",
  "country_code": "country_code2"
}
```

