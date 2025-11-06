
# Venmo Wallet Attributes Response

Additional attributes associated with the use of a Venmo Wallet.

## Structure

`VenmoWalletAttributesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Vault` | [`VenmoVaultResponse`](../../doc/models/venmo-vault-response.md) | Optional | The details about a saved venmo payment source. | VenmoVaultResponse getVault() | setVault(VenmoVaultResponse vault) |

## Example (as JSON)

```json
{
  "vault": {
    "id": "id6",
    "status": "APPROVED",
    "links": [
      {
        "href": "href6",
        "rel": "rel0",
        "method": "HEAD"
      }
    ],
    "customer": {
      "id": "id0",
      "email_address": "email_address2",
      "phone": {
        "phone_type": "OTHER",
        "phone_number": {
          "national_number": "national_number6"
        }
      },
      "name": {
        "given_name": "given_name2",
        "surname": "surname8"
      }
    }
  }
}
```

