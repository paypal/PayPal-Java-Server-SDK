
# Risk Supplementary Data

Additional information necessary to evaluate the risk profile of a transaction.

## Structure

`RiskSupplementaryData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`ParticipantMetadata`](../../doc/models/participant-metadata.md) | Optional | Profile information of the sender or receiver. | ParticipantMetadata getCustomer() | setCustomer(ParticipantMetadata customer) |

## Example

```java
import com.paypal.sdk.models.ParticipantMetadata;
import com.paypal.sdk.models.RiskSupplementaryData;

RiskSupplementaryData riskSupplementaryData = new RiskSupplementaryData.Builder()
    .customer(new ParticipantMetadata.Builder()
        .ipAddress("ip_address0")
        .build())
    .build();
```

