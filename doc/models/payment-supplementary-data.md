
# Payment Supplementary Data

The supplementary data.

## Structure

`PaymentSupplementaryData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RelatedIds` | [`RelatedIdentifiers`](../../doc/models/related-identifiers.md) | Optional | Identifiers related to a specific resource. | RelatedIdentifiers getRelatedIds() | setRelatedIds(RelatedIdentifiers relatedIds) |

## Example (as JSON)

```json
{
  "related_ids": {
    "order_id": "order_id2",
    "authorization_id": "authorization_id0",
    "capture_id": "capture_id0"
  }
}
```

