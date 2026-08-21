
# Payment Collection

The collection of payments, or transactions, for a purchase unit in an order. For example, authorized payments, captured payments, and refunds.

## Structure

`PaymentCollection`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Authorizations` | [`List<AuthorizationWithAdditionalData>`](../../doc/models/authorization-with-additional-data.md) | Optional | An array of authorized payments for a purchase unit. A purchase unit can have zero or more authorized payments. | List<AuthorizationWithAdditionalData> getAuthorizations() | setAuthorizations(List<AuthorizationWithAdditionalData> authorizations) |
| `Captures` | [`List<OrdersCapture>`](../../doc/models/orders-capture.md) | Optional | An array of captured payments for a purchase unit. A purchase unit can have zero or more captured payments. | List<OrdersCapture> getCaptures() | setCaptures(List<OrdersCapture> captures) |
| `Refunds` | [`List<Refund>`](../../doc/models/refund.md) | Optional | An array of refunds for a purchase unit. A purchase unit can have zero or more refunds. | List<Refund> getRefunds() | setRefunds(List<Refund> refunds) |

## Example

```java
import com.paypal.sdk.models.AuthorizationIncompleteReason;
import com.paypal.sdk.models.AuthorizationStatusDetails;
import com.paypal.sdk.models.AuthorizationWithAdditionalData;
import com.paypal.sdk.models.CaptureIncompleteReason;
import com.paypal.sdk.models.CaptureStatusDetails;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.OrdersCapture;
import com.paypal.sdk.models.PaymentCollection;
import com.paypal.sdk.models.Refund;
import com.paypal.sdk.models.RefundIncompleteReason;
import com.paypal.sdk.models.RefundStatusDetails;
import java.util.Arrays;

PaymentCollection paymentCollection = new PaymentCollection.Builder()
    .authorizations(Arrays.asList(
        new AuthorizationWithAdditionalData.Builder()
            .statusDetails(new AuthorizationStatusDetails.Builder()
                .reason(AuthorizationIncompleteReason.PENDING_REVIEW)
                .build())
            .amount(new Money.Builder(
                "currency_code6",
                "value0"
            )
            .build())
            .build()
    ))
    .captures(Arrays.asList(
        new OrdersCapture.Builder()
            .statusDetails(new CaptureStatusDetails.Builder()
                .reason(CaptureIncompleteReason.VERIFICATION_REQUIRED)
                .build())
            .amount(new Money.Builder(
                "currency_code6",
                "value0"
            )
            .build())
            .build(),
        new OrdersCapture.Builder()
            .statusDetails(new CaptureStatusDetails.Builder()
                .reason(CaptureIncompleteReason.VERIFICATION_REQUIRED)
                .build())
            .amount(new Money.Builder(
                "currency_code6",
                "value0"
            )
            .build())
            .build(),
        new OrdersCapture.Builder()
            .statusDetails(new CaptureStatusDetails.Builder()
                .reason(CaptureIncompleteReason.VERIFICATION_REQUIRED)
                .build())
            .amount(new Money.Builder(
                "currency_code6",
                "value0"
            )
            .build())
            .build()
    ))
    .refunds(Arrays.asList(
        new Refund.Builder()
            .statusDetails(new RefundStatusDetails.Builder()
                .reason(RefundIncompleteReason.ECHECK)
                .build())
            .amount(new Money.Builder(
                "currency_code6",
                "value0"
            )
            .build())
            .build()
    ))
    .build();
```

