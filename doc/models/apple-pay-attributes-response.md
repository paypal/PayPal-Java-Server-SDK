
# Apple Pay Attributes Response

Additional attributes associated with the use of Apple Pay.

## Structure

`ApplePayAttributesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Vault` | [`VaultResponse`](../../doc/models/vault-response.md) | Optional | The details about a saved payment source. | VaultResponse getVault() | setVault(VaultResponse vault) |

## Example

```java
import com.paypal.sdk.models.ApplePayAttributesResponse;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.VaultCustomer;
import com.paypal.sdk.models.VaultResponse;
import com.paypal.sdk.models.VaultStatus;

ApplePayAttributesResponse applePayAttributesResponse = new ApplePayAttributesResponse.Builder()
    .vault(new VaultResponse.Builder()
        .id("id6")
        .status(VaultStatus.APPROVED)
        .customer(new VaultCustomer.Builder()
            .id("id0")
            .name(new Name.Builder()
                .givenName("given_name2")
                .surname("surname8")
                .build())
            .build())
        .build())
    .build();
```

