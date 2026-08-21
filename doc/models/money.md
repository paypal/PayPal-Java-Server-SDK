
# Money

The currency and amount for a financial transaction, such as a balance or payment due.

## Structure

`Money`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencyCode` | `String` | Required | The [three-character ISO-4217 currency code](https://developer.paypal.com/api/rest/reference/currency-codes/) that identifies the currency.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3` | String getCurrencyCode() | setCurrencyCode(String currencyCode) |
| `Value` | `String` | Required | The value, which might be: An integer for currencies like `JPY` that are not typically fractional. A decimal fraction for currencies like `TND` that are subdivided into thousandths. For the required number of decimal places for a currency code, see [Currency Codes](https://developer.paypal.com/api/rest/reference/currency-codes/).<br><br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^((-?[0-9]+)\|(-?([0-9]+)?[.][0-9]+))$` | String getValue() | setValue(String value) |

## Example

```java
import com.paypal.sdk.models.Money;

Money money = new Money.Builder(
    "currency_code4",
    "value0"
)
.build();
```

