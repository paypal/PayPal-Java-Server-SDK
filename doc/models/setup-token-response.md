
# Setup Token Response

Minimal representation of a cached setup token.

## Structure

`SetupTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The PayPal-generated ID for the vaulted payment source. This ID should be stored on the merchant's server so the saved payment source can be used for future transactions.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9a-zA-Z_-]+$` | String getId() | setId(String id) |
| `Customer` | [`Customer`](../../doc/models/customer.md) | Optional | This object defines a customer in your system. Use it to manage customer profiles, save payment methods and contact details. | Customer getCustomer() | setCustomer(Customer customer) |
| `Status` | [`PaymentTokenStatus`](../../doc/models/payment-token-status.md) | Optional | The status of the payment token.<br><br>**Default**: `PaymentTokenStatus.CREATED`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaymentTokenStatus getStatus() | setStatus(PaymentTokenStatus status) |
| `PaymentSource` | [`SetupTokenResponsePaymentSource`](../../doc/models/setup-token-response-payment-source.md) | Optional | The setup payment method details. | SetupTokenResponsePaymentSource getPaymentSource() | setPaymentSource(SetupTokenResponsePaymentSource paymentSource) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of related [HATEOAS links](https://developer.paypal.com/api/rest/responses/#hateoas).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardResponseAddress;
import com.paypal.sdk.models.Customer;
import com.paypal.sdk.models.PaymentTokenStatus;
import com.paypal.sdk.models.SetupTokenResponse;
import com.paypal.sdk.models.SetupTokenResponseCard;
import com.paypal.sdk.models.SetupTokenResponsePaymentSource;

SetupTokenResponse setupTokenResponse = new SetupTokenResponse.Builder()
    .id("id2")
    .customer(new Customer.Builder()
        .id("id0")
        .merchantCustomerId("merchant_customer_id2")
        .build())
    .status(PaymentTokenStatus.CREATED)
    .paymentSource(new SetupTokenResponsePaymentSource.Builder()
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
        .build())
    .build();
```

