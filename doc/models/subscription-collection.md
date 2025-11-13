
# Subscription Collection

The list of subscriptions.

## Structure

`SubscriptionCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscriptions` | [`List<Subscription>`](../../doc/models/subscription.md) | Optional | An array of subscriptions.<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `32767` | List<Subscription> getSubscriptions() | setSubscriptions(List<Subscription> subscriptions) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "subscriptions": [
    {
      "id": "id6",
      "plan_id": "plan_id8",
      "start_time": "start_time0",
      "quantity": "quantity2",
      "shipping_amount": {
        "currency_code": "currency_code0",
        "value": "value6"
      }
    },
    {
      "id": "id6",
      "plan_id": "plan_id8",
      "start_time": "start_time0",
      "quantity": "quantity2",
      "shipping_amount": {
        "currency_code": "currency_code0",
        "value": "value6"
      }
    }
  ],
  "links": [
    {
      "href": "href6",
      "rel": "rel0",
      "method": "HEAD"
    }
  ]
}
```

