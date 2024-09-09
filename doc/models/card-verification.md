
# Card Verification

The API caller can opt in to verify the card through PayPal offered verification services (e.g. Smart Dollar Auth, 3DS).

## Structure

`CardVerification`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Method` | [`CardVerificationMethod`](../../doc/models/card-verification-method.md) | Optional | The method used for card verification.<br>**Default**: `CardVerificationMethod.SCA_WHEN_REQUIRED`<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | CardVerificationMethod getMethod() | setMethod(CardVerificationMethod method) |

## Example (as JSON)

```json
{
  "method": "SCA_WHEN_REQUIRED"
}
```
