
# Payer Name

The name of the party.

## Structure

`PayerName`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Prefix` | `String` | Optional | The prefix, or title, to the party's name.<br><br>**Constraints**: *Maximum Length*: `140` | String getPrefix() | setPrefix(String prefix) |
| `GivenName` | `String` | Optional | When the party is a person, the party's given, or first, name.<br><br>**Constraints**: *Maximum Length*: `140` | String getGivenName() | setGivenName(String givenName) |
| `Surname` | `String` | Optional | When the party is a person, the party's surname or family name. Also known as the last name. Required when the party is a person. Use also to store multiple surnames including the matronymic, or mother's, surname.<br><br>**Constraints**: *Maximum Length*: `140` | String getSurname() | setSurname(String surname) |
| `MiddleName` | `String` | Optional | When the party is a person, the party's middle name. Use also to store multiple middle names including the patronymic, or father's, middle name.<br><br>**Constraints**: *Maximum Length*: `140` | String getMiddleName() | setMiddleName(String middleName) |
| `Suffix` | `String` | Optional | The suffix for the party's name.<br><br>**Constraints**: *Maximum Length*: `140` | String getSuffix() | setSuffix(String suffix) |
| `AlternateFullName` | `String` | Optional | DEPRECATED. The party's alternate name. Can be a business name, nickname, or any other name that cannot be split into first, last name. Required when the party is a business.<br><br>**Constraints**: *Maximum Length*: `300` | String getAlternateFullName() | setAlternateFullName(String alternateFullName) |
| `FullName` | `String` | Optional | When the party is a person, the party's full name.<br><br>**Constraints**: *Maximum Length*: `300` | String getFullName() | setFullName(String fullName) |

## Example (as JSON)

```json
{
  "prefix": "prefix4",
  "given_name": "given_name8",
  "surname": "surname8",
  "middle_name": "middle_name6",
  "suffix": "suffix6"
}
```

