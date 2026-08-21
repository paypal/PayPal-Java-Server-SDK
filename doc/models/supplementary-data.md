
# Supplementary Data

Supplementary data about a payment. This object passes information that can be used to improve risk assessments and processing costs, for example, by providing Level 2 and Level 3 payment data.

## Structure

`SupplementaryData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardSupplementaryData`](../../doc/models/card-supplementary-data.md) | Optional | Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see checkout or multiparty checkout. | CardSupplementaryData getCard() | setCard(CardSupplementaryData card) |
| `Risk` | [`RiskSupplementaryData`](../../doc/models/risk-supplementary-data.md) | Optional | Additional information necessary to evaluate the risk profile of a transaction. | RiskSupplementaryData getRisk() | setRisk(RiskSupplementaryData risk) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.CardSupplementaryData;
import com.paypal.sdk.models.Level2CardProcessingData;
import com.paypal.sdk.models.Level3CardProcessingData;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.ParticipantMetadata;
import com.paypal.sdk.models.RiskSupplementaryData;
import com.paypal.sdk.models.SupplementaryData;

SupplementaryData supplementaryData = new SupplementaryData.Builder()
    .card(new CardSupplementaryData.Builder()
        .level2(new Level2CardProcessingData.Builder()
            .invoiceId("invoice_id4")
            .taxTotal(new Money.Builder(
                "currency_code4",
                "value0"
            )
            .build())
            .build())
        .level3(new Level3CardProcessingData.Builder()
            .shippingAmount(new Money.Builder(
                "currency_code0",
                "value6"
            )
            .build())
            .dutyAmount(new Money.Builder(
                "currency_code6",
                "value2"
            )
            .build())
            .discountAmount(new Money.Builder(
                "currency_code2",
                "value8"
            )
            .build())
            .shippingAddress(new Address.Builder(
                "country_code0"
            )
            .addressLine1("address_line_10")
            .addressLine2("address_line_20")
            .adminArea2("admin_area_24")
            .adminArea1("admin_area_16")
            .postalCode("postal_code2")
            .build())
            .shipsFromPostalCode("ships_from_postal_code4")
            .build())
        .build())
    .risk(new RiskSupplementaryData.Builder()
        .customer(new ParticipantMetadata.Builder()
            .ipAddress("ip_address0")
            .build())
        .build())
    .build();
```

