
# Bank Request

A Resource representing a request to vault a Bank used for ACH Debit.

## Structure

`BankRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AchDebit` | `JsonValue` | Optional | A Resource representing a request to vault a ACH Debit. | JsonValue getAchDebit() | setAchDebit(JsonValue achDebit) |
| `SepaDebit` | [`SepaDebitRequest`](../../doc/models/sepa-debit-request.md) | Optional | An API resource denoting a request to securely store a SEPA Debit. | SepaDebitRequest getSepaDebit() | setSepaDebit(SepaDebitRequest sepaDebit) |

## Example

```java
import com.paypal.sdk.ApiHelper;
import com.paypal.sdk.models.BankRequest;
import com.paypal.sdk.models.SepaDebitExperienceContext;
import com.paypal.sdk.models.SepaDebitRequest;
import com.paypal.sdk.utilities.JsonValue;
import java.io.IOException;

BankRequest bankRequest = new BankRequest.Builder()
    .achDebit(ApiHelper.tryDeserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}", JsonValue.class))
    .sepaDebit(new SepaDebitRequest.Builder()
        .experienceContext(new SepaDebitExperienceContext.Builder(
            "return_url4",
            "cancel_url6"
        )
        .locale("locale6")
        .build())
        .build())
    .build();
```

