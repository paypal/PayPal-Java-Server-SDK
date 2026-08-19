
# Store Information

The store information.

## Structure

`StoreInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StoreId` | `String` | Optional | The ID of a store for a merchant in the system of record.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100`, *Pattern*: `^[a-zA-Z0-9]*$` | String getStoreId() | setStoreId(String storeId) |
| `TerminalId` | `String` | Optional | The terminal ID for the checkout stand in a merchant store.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `60`, *Pattern*: `^[a-zA-Z0-9]*$` | String getTerminalId() | setTerminalId(String terminalId) |

## Example

```java
import com.paypal.sdk.models.StoreInformation;

StoreInformation storeInformation = new StoreInformation.Builder()
    .storeId("store_id8")
    .terminalId("terminal_id2")
    .build();
```

