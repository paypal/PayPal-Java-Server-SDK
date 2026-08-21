
# Pricing Model

The pricing model for the billing cycle.

## Enumeration

`PricingModel`

## Fields

| Name | Description |
|  --- | --- |
| `FIXED` | A fixed pricing scheme where the customer is charged a fixed amount. |
| `VARIABLE` | A variable pricing scheme where the customer is charged a variable amount. |
| `AUTO_RELOAD` | A auto-reload pricing scheme where the customer is charged a fixed amount for reload. |

## Example

```java
import com.paypal.sdk.models.PricingModel;

PricingModel pricingModel = PricingModel.AUTO_RELOAD;
```

