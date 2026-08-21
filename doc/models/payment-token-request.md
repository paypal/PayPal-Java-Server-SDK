
# Payment Token Request

Payment Token Request where the `source` defines the type of instrument to be stored.

## Structure

`PaymentTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customer` | [`Customer`](../../doc/models/customer.md) | Optional | This object defines a customer in your system. Use it to manage customer profiles, save payment methods and contact details. | Customer getCustomer() | setCustomer(Customer customer) |
| `PaymentSource` | [`PaymentTokenRequestPaymentSource`](../../doc/models/payment-token-request-payment-source.md) | Required | The payment method to vault with the instrument details. | PaymentTokenRequestPaymentSource getPaymentSource() | setPaymentSource(PaymentTokenRequestPaymentSource paymentSource) |

## Example

```java
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.Customer;
import com.paypal.sdk.models.PaymentTokenRequest;
import com.paypal.sdk.models.PaymentTokenRequestCard;
import com.paypal.sdk.models.PaymentTokenRequestPaymentSource;
import com.paypal.sdk.models.VaultTokenRequest;
import com.paypal.sdk.models.VaultTokenRequestType;

PaymentTokenRequest paymentTokenRequest = new PaymentTokenRequest.Builder(
    new PaymentTokenRequestPaymentSource.Builder()
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
        .build()
)
.customer(new Customer.Builder()
        .id("id0")
        .merchantCustomerId("merchant_customer_id2")
        .build())
.build();
```

