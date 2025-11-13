
# Balance Information

The Balance information.

## Structure

`BalanceInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Required | The [three-character ISO-4217 currency code](/docs/integration/direct/rest/currency-codes/) that identifies the currency.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getCurrency() | setCurrency(String currency) |
| `Primary` | `Boolean` | Optional | Optional field representing if the currency is primary currency or not. | Boolean getPrimary() | setPrimary(Boolean primary) |
| `TotalBalance` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getTotalBalance() | setTotalBalance(Money totalBalance) |
| `AvailableBalance` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAvailableBalance() | setAvailableBalance(Money availableBalance) |
| `WithheldBalance` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getWithheldBalance() | setWithheldBalance(Money withheldBalance) |

## Example (as JSON)

```json
{
  "currency": "currency4",
  "primary": false,
  "total_balance": {
    "currency_code": "currency_code6",
    "value": "value2"
  },
  "available_balance": {
    "currency_code": "currency_code8",
    "value": "value4"
  },
  "withheld_balance": {
    "currency_code": "currency_code2",
    "value": "value8"
  }
}
```

