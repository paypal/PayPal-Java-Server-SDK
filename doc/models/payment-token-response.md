
# Payment Token Response

Full representation of a saved payment token.

## Structure

`PaymentTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant's server so the saved payment source can be used for future transactions.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getId() | setId(String id) |
| `Customer` | [`CustomerResponse`](../../doc/models/customer-response.md) | Optional | Customer in merchant's or partner's system of records. | CustomerResponse getCustomer() | setCustomer(CustomerResponse customer) |
| `PaymentSource` | [`PaymentTokenResponsePaymentSource`](../../doc/models/payment-token-response-payment-source.md) | Optional | The vaulted payment method details. | PaymentTokenResponsePaymentSource getPaymentSource() | setPaymentSource(PaymentTokenResponsePaymentSource paymentSource) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of related [HATEOAS links](https://developer.paypal.com/api/rest/responses/#hateoas).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayCard;
import com.paypal.sdk.models.ApplePayPaymentToken;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardPaymentTokenEntity;
import com.paypal.sdk.models.CardResponseAddress;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.CustomerResponse;
import com.paypal.sdk.models.PaymentTokenResponse;
import com.paypal.sdk.models.PaymentTokenResponsePaymentSource;

PaymentTokenResponse paymentTokenResponse = new PaymentTokenResponse.Builder()
    .id("id8")
    .customer(new CustomerResponse.Builder()
        .id("id0")
        .merchantCustomerId("merchant_customer_id2")
        .build())
    .paymentSource(new PaymentTokenResponsePaymentSource.Builder()
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
        .build())
    .build();
```

