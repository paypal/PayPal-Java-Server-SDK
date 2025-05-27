
# Card From Request

Representation of card details as received in the request.

## Structure

`CardFromRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Expiry` | `String` | Optional | The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6).<br><br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])$` | String getExpiry() | setExpiry(String expiry) |
| `LastDigits` | `String` | Optional | The last digits of the payment card.<br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `4`, *Pattern*: `[0-9]{2,}` | String getLastDigits() | setLastDigits(String lastDigits) |

## Example (as JSON)

```json
{
  "expiry": "expiry6",
  "last_digits": "last_digits2"
}
```

