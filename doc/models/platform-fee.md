
# Platform Fee

The platform or partner fee, commission, or brokerage fee that is associated with the transaction. Not a separate or isolated transaction leg from the external perspective. The platform fee is limited in scope and is always associated with the original payment for the purchase unit.

## Structure

`PlatformFee`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | [`Money`](../../doc/models/money.md) | Required | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |
| `Payee` | [`PayeeBase`](../../doc/models/payee-base.md) | Optional | The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee. | PayeeBase getPayee() | setPayee(PayeeBase payee) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PayeeBase;
import com.paypal.sdk.models.PlatformFee;

PlatformFee platformFee = new PlatformFee.Builder(
    new Money.Builder(
        "currency_code6",
        "value0"
    )
    .build()
)
.payee(new PayeeBase.Builder()
        .emailAddress("email_address4")
        .merchantId("merchant_id6")
        .build())
.build();
```

