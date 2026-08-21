
# Subscription Payment Source

The payment source definition. To be eligible to create subscription using debit or credit card, you will need to sign up here (https://www.paypal.com/bizsignup/entry/product/ppcp). Please note, its available only for non-3DS cards and for merchants in US and AU regions.

## Structure

`SubscriptionPaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`SubscriptionCardRequest`](../../doc/models/subscription-card-request.md) | Optional | The payment card to use to fund a payment. Can be a credit or debit card. | SubscriptionCardRequest getCard() | setCard(SubscriptionCardRequest card) |

## Example

```java
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.SubscriptionCardRequest;
import com.paypal.sdk.models.SubscriptionPaymentSource;

SubscriptionPaymentSource subscriptionPaymentSource = new SubscriptionPaymentSource.Builder()
    .card(new SubscriptionCardRequest.Builder()
        .name("name6")
        .number("number6")
        .expiry("expiry4")
        .securityCode("security_code8")
        .type(CardType.UNKNOWN)
        .build())
    .build();
```

