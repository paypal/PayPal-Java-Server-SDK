
# Subscription

The subscription details.

## Structure

`Subscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the subscription.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `50` | String getId() | setId(String id) |
| `PlanId` | `String` | Optional | The ID of the plan.<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `50` | String getPlanId() | setPlanId(String planId) |
| `StartTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getStartTime() | setStartTime(String startTime) |
| `Quantity` | `String` | Optional | The quantity of the product in the subscription.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `32`, *Pattern*: `^([0-9]+\|([0-9]+)?[.][0-9]+)$` | String getQuantity() | setQuantity(String quantity) |
| `ShippingAmount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getShippingAmount() | setShippingAmount(Money shippingAmount) |
| `Subscriber` | [`Subscriber`](../../doc/models/subscriber.md) | Optional | The subscriber response information. | Subscriber getSubscriber() | setSubscriber(Subscriber subscriber) |
| `BillingInfo` | [`SubscriptionBillingInformation`](../../doc/models/subscription-billing-information.md) | Optional | The billing details for the subscription. If the subscription was or is active, these fields are populated. | SubscriptionBillingInformation getBillingInfo() | setBillingInfo(SubscriptionBillingInformation billingInfo) |
| `CreateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |
| `CustomId` | `String` | Optional | The custom id for the subscription. Can be invoice id.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `127`, *Pattern*: `^[\x20-\x7E]+` | String getCustomId() | setCustomId(String customId) |
| `PlanOverridden` | `Boolean` | Optional | Indicates whether the subscription has overridden any plan attributes. | Boolean getPlanOverridden() | setPlanOverridden(Boolean planOverridden) |
| `Plan` | [`PlanDetails`](../../doc/models/plan-details.md) | Optional | The plan details. | PlanDetails getPlan() | setPlan(PlanDetails plan) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of request-related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example (as JSON)

```json
{
  "id": "id4",
  "plan_id": "plan_id6",
  "start_time": "start_time8",
  "quantity": "quantity0",
  "shipping_amount": {
    "currency_code": "currency_code0",
    "value": "value6"
  }
}
```

