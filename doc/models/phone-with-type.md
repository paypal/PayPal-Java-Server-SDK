
# Phone with Type

The phone information.

## Structure

`PhoneWithType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PhoneType` | [`PhoneType`](../../doc/models/phone-type.md) | Optional | The phone type. | PhoneType getPhoneType() | setPhoneType(PhoneType phoneType) |
| `PhoneNumber` | [`PhoneNumber`](../../doc/models/phone-number.md) | Required | The phone number in its canonical international [E.164 numbering plan format](https://www.itu.int/rec/T-REC-E.164/en). | PhoneNumber getPhoneNumber() | setPhoneNumber(PhoneNumber phoneNumber) |

## Example

```java
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;

PhoneWithType phoneWithType = new PhoneWithType.Builder(
    new PhoneNumber.Builder(
        "national_number6"
    )
    .build()
)
.phoneType(PhoneType.FAX)
.build();
```

