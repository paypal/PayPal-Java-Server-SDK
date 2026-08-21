
# Cobranded Card

Details about the merchant cobranded card used for order purchase.

## Structure

`CobrandedCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Labels` | `List<String>` | Optional | Array of labels for the cobranded card.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `25`, *Minimum Length*: `1`, *Maximum Length*: `256` | List<String> getLabels() | setLabels(List<String> labels) |
| `Payee` | [`PayeeBase`](../../doc/models/payee-base.md) | Optional | The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee. | PayeeBase getPayee() | setPayee(PayeeBase payee) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |

## Example

```java
import com.paypal.sdk.models.CobrandedCard;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.PayeeBase;
import java.util.Arrays;

CobrandedCard cobrandedCard = new CobrandedCard.Builder()
    .labels(Arrays.asList(
        "labels2"
    ))
    .payee(new PayeeBase.Builder()
        .emailAddress("email_address4")
        .merchantId("merchant_id6")
        .build())
    .amount(new Money.Builder(
        "currency_code6",
        "value0"
    )
    .build())
    .build();
```

