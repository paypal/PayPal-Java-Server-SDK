
# Phone With Type

The phone information.

## Structure

`PhoneWithType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PhoneType` | [`PhoneType`](../../doc/models/phone-type.md) | Optional | The phone type. | PhoneType getPhoneType() | setPhoneType(PhoneType phoneType) |
| `PhoneNumber` | [`PhoneNumber`](../../doc/models/phone-number.md) | Required | The phone number in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). | PhoneNumber getPhoneNumber() | setPhoneNumber(PhoneNumber phoneNumber) |

## Example (as JSON)

```json
{
  "phone_type": "PAGER",
  "phone_number": {
    "national_number": "national_number6"
  }
}
```

