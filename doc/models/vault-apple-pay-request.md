
# Vault Apple Pay Request

A resource representing a request to vault Apple Pay.

## Structure

`VaultApplePayRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Token` | `String` | Optional | Encrypted Apple Pay token, containing card information. This token would be base64 encoded.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `10000`, *Pattern*: `^.*$` | String getToken() | setToken(String token) |
| `Card` | [`ApplePayRequestCard`](../../doc/models/apple-pay-request-card.md) | Optional | The payment card to be used to fund a payment. Can be a credit or debit card. | ApplePayRequestCard getCard() | setCard(ApplePayRequestCard card) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayRequestCard;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.VaultApplePayRequest;

VaultApplePayRequest vaultApplePayRequest = new VaultApplePayRequest.Builder()
    .token("token8")
    .card(new ApplePayRequestCard.Builder()
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

