
# Payment Token Request Payment Source

The payment method to vault with the instrument details.

## Structure

`PaymentTokenRequestPaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`PaymentTokenRequestCard`](../../doc/models/payment-token-request-card.md) | Optional | A Resource representing a request to vault a Card. | PaymentTokenRequestCard getCard() | setCard(PaymentTokenRequestCard card) |
| `Token` | [`VaultTokenRequest`](../../doc/models/vault-token-request.md) | Optional | The Tokenized Payment Source representing a Request to Vault a Token. | VaultTokenRequest getToken() | setToken(VaultTokenRequest token) |

## Example

```java
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.PaymentTokenRequestCard;
import com.paypal.sdk.models.PaymentTokenRequestPaymentSource;
import com.paypal.sdk.models.VaultTokenRequest;
import com.paypal.sdk.models.VaultTokenRequestType;

PaymentTokenRequestPaymentSource paymentTokenRequestPaymentSource = new PaymentTokenRequestPaymentSource.Builder()
    .card(new PaymentTokenRequestCard.Builder()
        .name("name6")
        .number("number6")
        .expiry("expiry4")
        .securityCode("security_code8")
        .brand(CardBrand.CB_NATIONALE)
        .build())
    .token(new VaultTokenRequest.Builder(
        "id6",
        VaultTokenRequestType.SETUP_TOKEN
    )
    .build())
    .build();
```

