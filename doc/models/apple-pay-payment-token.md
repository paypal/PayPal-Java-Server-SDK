
# Apple Pay Payment Token

A resource representing a response for Apple Pay.

## Structure

`ApplePayPaymentToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`ApplePayCard`](../../doc/models/apple-pay-card.md) | Optional | The payment card to be used to fund a payment. Can be a credit or debit card. | ApplePayCard getCard() | setCard(ApplePayCard card) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayCard;
import com.paypal.sdk.models.ApplePayPaymentToken;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardType;

ApplePayPaymentToken applePayPaymentToken = new ApplePayPaymentToken.Builder()
    .card(new ApplePayCard.Builder()
        .name("name6")
        .type(CardType.UNKNOWN)
        .brand(CardBrand.CB_NATIONALE)
        .billingAddress(new Address.Builder(
            "country_code8"
        )
        .addressLine1("address_line_12")
        .addressLine2("address_line_28")
        .adminArea2("admin_area_28")
        .adminArea1("admin_area_14")
        .postalCode("postal_code0")
        .build())
        .build())
    .build();
```

