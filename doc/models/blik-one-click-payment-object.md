
# Blik One Click Payment Object

Information used to pay using BLIK one-click flow.

## Structure

`BlikOneClickPaymentObject`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ConsumerReference` | `String` | Optional | The merchant generated, unique reference serving as a primary identifier for accounts connected between Blik and a merchant.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `64`, *Pattern*: `^[ -~]{3,64}$` | String getConsumerReference() | setConsumerReference(String consumerReference) |

## Example (as JSON)

```json
{
  "consumer_reference": "consumer_reference0"
}
```

