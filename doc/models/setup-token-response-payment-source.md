
# Setup Token Response Payment Source

The setup payment method details.

## Structure

`SetupTokenResponsePaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`SetupTokenResponseCard`](../../doc/models/setup-token-response-card.md) | Optional | - | SetupTokenResponseCard getCard() | setCard(SetupTokenResponseCard card) |
| `Paypal` | [`PaypalPaymentToken`](../../doc/models/paypal-payment-token.md) | Optional, Read-only | Full representation of a PayPal Payment Token. | PaypalPaymentToken getPaypal() | setPaypal(PaypalPaymentToken paypal) |
| `Venmo` | [`VenmoPaymentToken`](../../doc/models/venmo-payment-token.md) | Optional, Read-only | Full representation of a Venmo Payment Token. | VenmoPaymentToken getVenmo() | setVenmo(VenmoPaymentToken venmo) |

## Example

```java
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardResponseAddress;
import com.paypal.sdk.models.SetupTokenResponseCard;
import com.paypal.sdk.models.SetupTokenResponsePaymentSource;

SetupTokenResponsePaymentSource setupTokenResponsePaymentSource = new SetupTokenResponsePaymentSource.Builder()
    .card(new SetupTokenResponseCard.Builder()
        .name("name6")
        .brand(CardBrand.CB_NATIONALE)
        .expiry("expiry4")
        .billingAddress(new CardResponseAddress.Builder(
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

