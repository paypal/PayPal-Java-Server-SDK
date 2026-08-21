
# Blik Level 0 Payment Object

Information used to pay using BLIK level_0 flow.

## Structure

`BlikLevel0PaymentObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthCode` | `String` | Required | The 6-digit code used to authenticate a consumer within BLIK.<br><br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `6`, *Pattern*: `^[0-9]{6}$` | String getAuthCode() | setAuthCode(String authCode) |

## Example

```java
import com.paypal.sdk.models.BlikLevel0PaymentObject;

BlikLevel0PaymentObject blikLevel0PaymentObject = new BlikLevel0PaymentObject.Builder(
    "auth_code4"
)
.build();
```

