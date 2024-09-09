
# Assurance Details

Information about cardholder possession validation and cardholder identification and verifications (ID&V).

## Structure

`AssuranceDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountVerified` | `Boolean` | Optional | If true, indicates that Cardholder possession validation has been performed on returned payment credential.<br>**Default**: `false` | Boolean getAccountVerified() | setAccountVerified(Boolean accountVerified) |
| `CardHolderAuthenticated` | `Boolean` | Optional | If true, indicates that identification and verifications (ID&V) was performed on the returned payment credential.If false, the same risk-based authentication can be performed as you would for card transactions. This risk-based authentication can include, but not limited to, step-up with 3D Secure protocol if applicable.<br>**Default**: `false` | Boolean getCardHolderAuthenticated() | setCardHolderAuthenticated(Boolean cardHolderAuthenticated) |

## Example (as JSON)

```json
{
  "account_verified": false,
  "card_holder_authenticated": false
}
```

