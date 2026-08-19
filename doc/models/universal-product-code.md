
# Universal Product Code

The Universal Product Code of the item.

## Structure

`UniversalProductCode`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`UpcType`](../../doc/models/upc-type.md) | Required | The Universal Product Code type.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `5`, *Pattern*: `^[0-9A-Z_-]+$` | UpcType getType() | setType(UpcType type) |
| `Code` | `String` | Required | The UPC product code of the item.<br><br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `17`, *Pattern*: `^[0-9]{0,17}$` | String getCode() | setCode(String code) |

## Example

```java
import com.paypal.sdk.models.UniversalProductCode;
import com.paypal.sdk.models.UpcType;

UniversalProductCode universalProductCode = new UniversalProductCode.Builder(
    UpcType.UPC_2,
    "code0"
)
.build();
```

