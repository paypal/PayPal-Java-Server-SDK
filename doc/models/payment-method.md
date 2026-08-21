
# Payment Method

The customer and merchant payment preferences.

## Structure

`PaymentMethod`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PayeePreferred` | [`PayeePaymentMethodPreference`](../../doc/models/payee-payment-method-preference.md) | Optional | The merchant-preferred payment methods.<br><br>**Default**: `PayeePaymentMethodPreference.UNRESTRICTED`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PayeePaymentMethodPreference getPayeePreferred() | setPayeePreferred(PayeePaymentMethodPreference payeePreferred) |

## Example

```java
import com.paypal.sdk.models.PayeePaymentMethodPreference;
import com.paypal.sdk.models.PaymentMethod;

PaymentMethod paymentMethod = new PaymentMethod.Builder()
    .payeePreferred(PayeePaymentMethodPreference.UNRESTRICTED)
    .build();
```

