
# Pricing Scheme

The pricing scheme details.

## Structure

`PricingScheme`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Price` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getPrice() | setPrice(Money price) |
| `PricingModel` | [`PricingModel`](../../doc/models/pricing-model.md) | Required | The pricing model for the billing cycle.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `24`, *Pattern*: `^[A-Z_]+$` | PricingModel getPricingModel() | setPricingModel(PricingModel pricingModel) |
| `ReloadThresholdAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getReloadThresholdAmount() | setReloadThresholdAmount(Money reloadThresholdAmount) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PricingModel;
import com.paypal.sdk.models.PricingScheme;

PricingScheme pricingScheme = new PricingScheme.Builder(
    PricingModel.AUTO_RELOAD
)
.price(new Money.Builder(
        "currency_code8",
        "value4"
    )
    .build())
.reloadThresholdAmount(new Money.Builder(
        "currency_code0",
        "value6"
    )
    .build())
.build();
```

