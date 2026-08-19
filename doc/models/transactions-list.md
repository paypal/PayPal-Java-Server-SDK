
# Transactions List

The list transactions for a subscription request details.

## Structure

`TransactionsList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Transactions` | [`List<SubscriptionTransactionDetails>`](../../doc/models/subscription-transaction-details.md) | Optional | An array of transactions.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `32767` | List<SubscriptionTransactionDetails> getTransactions() | setTransactions(List<SubscriptionTransactionDetails> transactions) |
| `TotalItems` | `Integer` | Optional | The total number of items.<br><br>**Constraints**: `>= 0`, `<= 500000000` | Integer getTotalItems() | setTotalItems(Integer totalItems) |
| `TotalPages` | `Integer` | Optional | The total number of pages.<br><br>**Constraints**: `>= 0`, `<= 100000000` | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.SubscriptionAmountWithBreakdown;
import com.paypal.sdk.models.SubscriptionPayerName;
import com.paypal.sdk.models.SubscriptionTransactionDetails;
import com.paypal.sdk.models.TransactionsList;
import java.util.Arrays;

TransactionsList transactionsList = new TransactionsList.Builder()
    .transactions(Arrays.asList(
        new SubscriptionTransactionDetails.Builder(
            null,
            new SubscriptionAmountWithBreakdown.Builder(
                new Money.Builder(
                    "currency_code4",
                    "value0"
                )
                .build()
            )
            .totalItemAmount(new Money.Builder(
                    "currency_code8",
                    "value4"
                )
                .build())
            .feeAmount(new Money.Builder(
                    "currency_code2",
                    "value4"
                )
                .build())
            .shippingAmount(new Money.Builder(
                    "currency_code0",
                    "value6"
                )
                .build())
            .taxAmount(new Money.Builder(
                    "currency_code2",
                    "value8"
                )
                .build())
            .netAmount(new Money.Builder(
                    "currency_code6",
                    "value2"
                )
                .build())
            .build(),
            "time8"
        )
        .payerName(new SubscriptionPayerName.Builder()
                .prefix("prefix8")
                .givenName("given_name2")
                .surname("surname8")
                .middleName("middle_name0")
                .suffix("suffix0")
                .build())
        .payerEmail("payer_email6")
        .build(),
        new SubscriptionTransactionDetails.Builder(
            null,
            new SubscriptionAmountWithBreakdown.Builder(
                new Money.Builder(
                    "currency_code4",
                    "value0"
                )
                .build()
            )
            .totalItemAmount(new Money.Builder(
                    "currency_code8",
                    "value4"
                )
                .build())
            .feeAmount(new Money.Builder(
                    "currency_code2",
                    "value4"
                )
                .build())
            .shippingAmount(new Money.Builder(
                    "currency_code0",
                    "value6"
                )
                .build())
            .taxAmount(new Money.Builder(
                    "currency_code2",
                    "value8"
                )
                .build())
            .netAmount(new Money.Builder(
                    "currency_code6",
                    "value2"
                )
                .build())
            .build(),
            "time8"
        )
        .payerName(new SubscriptionPayerName.Builder()
                .prefix("prefix8")
                .givenName("given_name2")
                .surname("surname8")
                .middleName("middle_name0")
                .suffix("suffix0")
                .build())
        .payerEmail("payer_email6")
        .build()
    ))
    .totalItems(36)
    .totalPages(72)
    .build();
```

