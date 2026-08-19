
# Pricing Tier

The pricing tier details.

## Structure

`PricingTier`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartingQuantity` | `String` | Required | The starting quantity for the tier.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^([0-9]+\|([0-9]+)?[.][0-9]+)$` | String getStartingQuantity() | setStartingQuantity(String startingQuantity) |
| `EndingQuantity` | `String` | Optional | The ending quantity for the tier. Optional for the last tier.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^([0-9]+\|([0-9]+)?[.][0-9]+)$` | String getEndingQuantity() | setEndingQuantity(String endingQuantity) |
| `Amount` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PricingTier;

PricingTier pricingTier = new PricingTier.Builder(
    "starting_quantity6",
    new Money.Builder(
        "currency_code6",
        "value0"
    )
    .build()
)
.endingQuantity("ending_quantity8")
.build();
```

