
# Address Details

Address request details.

## Structure

`AddressDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AddressLine1` | `String` | Optional | The first line of the address, such as number and street, for example, `173 Drury Lane`. Needed for data entry, and Compliance and Risk checks. This field needs to pass the full address.<br>**Constraints**: *Maximum Length*: `300` | String getAddressLine1() | setAddressLine1(String addressLine1) |
| `AddressLine2` | `String` | Optional | The second line of the address, for example, a suite or apartment number.<br>**Constraints**: *Maximum Length*: `300` | String getAddressLine2() | setAddressLine2(String addressLine2) |
| `AdminArea2` | `String` | Optional | A city, town, or village. Smaller than `admin_area_level_1`.<br>**Constraints**: *Maximum Length*: `120` | String getAdminArea2() | setAdminArea2(String adminArea2) |
| `AdminArea1` | `String` | Optional | The highest-level sub-division in a country, which is usually a province, state, or ISO-3166-2 subdivision. This data is formatted for postal delivery, for example, `CA` and not `California`. Value, by country, is:<ul><li>UK. A county.</li><li>US. A state.</li><li>Canada. A province.</li><li>Japan. A prefecture.</li><li>Switzerland. A *kanton*.</li></ul><br>**Constraints**: *Maximum Length*: `300` | String getAdminArea1() | setAdminArea1(String adminArea1) |
| `PostalCode` | `String` | Optional | The postal code, which is the ZIP code or equivalent. Typically required for countries with a postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).<br>**Constraints**: *Maximum Length*: `60` | String getPostalCode() | setPostalCode(String postalCode) |
| `CountryCode` | `String` | Required | The [2-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the country or region.<blockquote><strong>Note:</strong> The country code for Great Britain is <code>GB</code> and not <code>UK</code> as used in the top-level domain names for that country. Use the `C2` country code for China worldwide for comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.</blockquote><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^([A-Z]{2}\|C2)$` | String getCountryCode() | setCountryCode(String countryCode) |
| `Name` | [`Name`](../../doc/models/name.md) | Optional | The name of the party. | Name getName() | setName(Name name) |
| `Id` | `String` | Optional | The resource ID of the address.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[0-9A-Za-z-_]+$` | String getId() | setId(String id) |
| `Company` | `String` | Optional | The name of the company or business associated to the address.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100`, *Pattern*: `^.*$` | String getCompany() | setCompany(String company) |
| `Phone` | `String` | Optional | The phone number that can go on the mailing label with the address to track the shipping. Phone number is in E.164 format.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `16`, *Pattern*: `^\+[1-9]\d{1,14}$` | String getPhone() | setPhone(String phone) |
| `PhoneNumber` | [`Phone`](../../doc/models/phone.md) | Optional | The phone number, in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). | Phone getPhoneNumber() | setPhoneNumber(Phone phoneNumber) |

## Example (as JSON)

```json
{
  "address_line_1": "address_line_10",
  "address_line_2": "address_line_20",
  "admin_area_2": "admin_area_24",
  "admin_area_1": "admin_area_16",
  "postal_code": "postal_code2",
  "country_code": "country_code0"
}
```

