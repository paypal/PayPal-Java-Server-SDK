
# Token

The tokenized payment source to fund a payment.

## Structure

`Token`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The PayPal-generated ID for the token.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getId() | setId(String id) |
| `Type` | [`TokenType`](../../doc/models/token-type.md) | Required | The tokenization method that generated the ID.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_-]+$` | TokenType getType() | setType(TokenType type) |

## Example

```java
import com.paypal.sdk.models.Token;
import com.paypal.sdk.models.TokenType;

Token token = new Token.Builder(
    "id6",
    TokenType.BILLING_AGREEMENT
)
.build();
```

