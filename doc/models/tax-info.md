
# Tax Info

The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and `tax_id_type` are required.

## Structure

`TaxInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TaxId` | `String` | Required | The customer's tax ID value.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `14`, *Pattern*: `([a-zA-Z0-9])` | String getTaxId() | setTaxId(String taxId) |
| `TaxIdType` | [`TaxIdType`](../../doc/models/tax-id-type.md) | Required | The customer's tax ID type.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `14`, *Pattern*: `^[A-Z0-9_]+$` | TaxIdType getTaxIdType() | setTaxIdType(TaxIdType taxIdType) |

## Example

```java
import com.paypal.sdk.models.TaxIdType;
import com.paypal.sdk.models.TaxInfo;

TaxInfo taxInfo = new TaxInfo.Builder(
    "tax_id6",
    TaxIdType.BR_CPF
)
.build();
```

