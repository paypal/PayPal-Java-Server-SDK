
# Paypal Wallet Vault Response

The details about a saved PayPal Wallet payment source.

## Structure

`PaypalWalletVaultResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the saved payment source.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getId() | setId(String id) |
| `Status` | [`PaypalWalletVaultStatus`](../../doc/models/paypal-wallet-vault-status.md) | Optional | The vault status.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaypalWalletVaultStatus getStatus() | setStatus(PaypalWalletVaultStatus status) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related HATEOAS links.<br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `Customer` | [`PaypalWalletCustomer`](../../doc/models/paypal-wallet-customer.md) | Optional | The details about a customer in PayPal's system of record. | PaypalWalletCustomer getCustomer() | setCustomer(PaypalWalletCustomer customer) |

## Example (as JSON)

```json
{
  "id": "id0",
  "status": "CREATED",
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
    "merchant_customer_id": "merchant_customer_id2"
  }
}
```

