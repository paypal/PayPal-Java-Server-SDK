
# Create Payment Token Input

Input structure for the method CreatePaymentTokenAsync

## Structure

`CreatePaymentTokenInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`PaymentTokenRequest`](../../doc/models/payment-token-request.md) | Required | Payment Token creation with a financial instrument and an optional customer_id. | PaymentTokenRequest getBody() | setBody(PaymentTokenRequest body) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 3 hours.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `108`, *Pattern*: `^.*$` | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |

## Example

```java
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CreatePaymentTokenInput;
import com.paypal.sdk.models.Customer;
import com.paypal.sdk.models.PaymentTokenRequest;
import com.paypal.sdk.models.PaymentTokenRequestCard;
import com.paypal.sdk.models.PaymentTokenRequestPaymentSource;
import com.paypal.sdk.models.VaultTokenRequest;
import com.paypal.sdk.models.VaultTokenRequestType;

CreatePaymentTokenInput createPaymentTokenInput = new CreatePaymentTokenInput.Builder(
    "application/json",
    new PaymentTokenRequest.Builder(
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
    .build()
)
.paypalRequestId("PayPal-Request-Id6")
.build();
```

