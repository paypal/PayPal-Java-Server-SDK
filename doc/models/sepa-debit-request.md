
# Sepa Debit Request

An API resource denoting a request to securely store a SEPA Debit.

## Structure

`SepaDebitRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExperienceContext` | [`SepaDebitExperienceContext`](../../doc/models/sepa-debit-experience-context.md) | Optional | Customizes the payer experience during the approval process for the SEPA Debit payment. | SepaDebitExperienceContext getExperienceContext() | setExperienceContext(SepaDebitExperienceContext experienceContext) |

## Example

```java
import com.paypal.sdk.models.SepaDebitExperienceContext;
import com.paypal.sdk.models.SepaDebitRequest;

SepaDebitRequest sepaDebitRequest = new SepaDebitRequest.Builder()
    .experienceContext(new SepaDebitExperienceContext.Builder(
        "return_url4",
        "cancel_url6"
    )
    .locale("locale6")
    .build())
    .build();
```

