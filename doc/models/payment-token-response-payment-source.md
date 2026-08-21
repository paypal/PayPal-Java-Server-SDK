
# Payment Token Response Payment Source

The vaulted payment method details.

## Structure

`PaymentTokenResponsePaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CardPaymentTokenEntity`](../../doc/models/card-payment-token-entity.md) | Optional | Full representation of a Card Payment Token including network token. | CardPaymentTokenEntity getCard() | setCard(CardPaymentTokenEntity card) |
| `Paypal` | [`PaypalPaymentToken`](../../doc/models/paypal-payment-token.md) | Optional, Read-only | Full representation of a PayPal Payment Token. | PaypalPaymentToken getPaypal() | setPaypal(PaypalPaymentToken paypal) |
| `Venmo` | [`VenmoPaymentToken`](../../doc/models/venmo-payment-token.md) | Optional, Read-only | Full representation of a Venmo Payment Token. | VenmoPaymentToken getVenmo() | setVenmo(VenmoPaymentToken venmo) |
| `ApplePay` | [`ApplePayPaymentToken`](../../doc/models/apple-pay-payment-token.md) | Optional | A resource representing a response for Apple Pay. | ApplePayPaymentToken getApplePay() | setApplePay(ApplePayPaymentToken applePay) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayCard;
import com.paypal.sdk.models.ApplePayPaymentToken;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardPaymentTokenEntity;
import com.paypal.sdk.models.CardResponseAddress;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.PaymentTokenResponsePaymentSource;

PaymentTokenResponsePaymentSource paymentTokenResponsePaymentSource = new PaymentTokenResponsePaymentSource.Builder()
    .card(new CardPaymentTokenEntity.Builder()
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
    .applePay(new ApplePayPaymentToken.Builder()
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
        .build())
    .build();
```

