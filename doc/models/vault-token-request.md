
# Vault Token Request

The Tokenized Payment Source representing a Request to Vault a Token.

## Structure

`VaultTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The PayPal-generated ID for the token.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Za-z_-]+$` | String getId() | setId(String id) |
| `Type` | [`TokenRequestType`](../../doc/models/token-request-type.md) | Required | The tokenization method that generated the ID.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_-]+$` | TokenRequestType getType() | setType(TokenRequestType type) |

## Example (as JSON)

```json
{
  "id": "id8",
  "type": "SETUP_TOKEN"
}
```
