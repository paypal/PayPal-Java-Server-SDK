
# Payment Supplementary Data

The supplementary data.

## Structure

`PaymentSupplementaryData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RelatedIds` | [`RelatedIdentifiers`](../../doc/models/related-identifiers.md) | Optional | Identifiers related to a specific resource. | RelatedIdentifiers getRelatedIds() | setRelatedIds(RelatedIdentifiers relatedIds) |

## Example

```java
import com.paypal.sdk.models.PaymentSupplementaryData;
import com.paypal.sdk.models.RelatedIdentifiers;

PaymentSupplementaryData paymentSupplementaryData = new PaymentSupplementaryData.Builder()
    .relatedIds(new RelatedIdentifiers.Builder()
        .orderId("order_id2")
        .authorizationId("authorization_id0")
        .captureId("capture_id0")
        .build())
    .build();
```

