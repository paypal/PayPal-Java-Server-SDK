
# Subscription Payment Source Response

The payment source used to fund the payment.

## Structure

`SubscriptionPaymentSourceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardResponseWithBillingAddress`](../../doc/models/card-response-with-billing-address.md) | Optional | The payment card used to fund the payment. Card can be a credit or debit card. | CardResponseWithBillingAddress getCard() | setCard(CardResponseWithBillingAddress card) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.CardResponseWithBillingAddress;
import com.paypal.sdk.models.SubscriptionPaymentSourceResponse;

SubscriptionPaymentSourceResponse subscriptionPaymentSourceResponse = new SubscriptionPaymentSourceResponse.Builder()
    .card(new CardResponseWithBillingAddress.Builder()
        .name("name6")
        .billingAddress(new Address.Builder(
            "country_code8"
        )
        .addressLine1("address_line_12")
        .addressLine2("address_line_28")
        .adminArea2("admin_area_28")
        .adminArea1("admin_area_14")
        .postalCode("postal_code0")
        .build())
        .expiry("expiry4")
        .currencyCode("currency_code2")
        .build())
    .build();
```

