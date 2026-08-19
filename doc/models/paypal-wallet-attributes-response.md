
# Paypal Wallet Attributes Response

Additional attributes associated with the use of a PayPal Wallet.

## Structure

`PaypalWalletAttributesResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Vault` | [`PaypalWalletVaultResponse`](../../doc/models/paypal-wallet-vault-response.md) | Optional | The details about a saved PayPal Wallet payment source. | PaypalWalletVaultResponse getVault() | setVault(PaypalWalletVaultResponse vault) |
| `CobrandedCards` | [`List<CobrandedCard>`](../../doc/models/cobranded-card.md) | Optional | An array of merchant cobranded cards used by buyer to complete an order. This array will be present if a merchant has onboarded their cobranded card with PayPal and provided corresponding label(s).<br><br>**Constraints**: *Minimum Items*: `0`, *Maximum Items*: `25` | List<CobrandedCard> getCobrandedCards() | setCobrandedCards(List<CobrandedCard> cobrandedCards) |

## Example

```java
import com.paypal.sdk.models.CobrandedCard;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.PayeeBase;
import com.paypal.sdk.models.PaypalWalletAttributesResponse;
import com.paypal.sdk.models.PaypalWalletCustomer;
import com.paypal.sdk.models.PaypalWalletVaultResponse;
import com.paypal.sdk.models.PaypalWalletVaultStatus;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import java.util.Arrays;

PaypalWalletAttributesResponse paypalWalletAttributesResponse = new PaypalWalletAttributesResponse.Builder()
    .vault(new PaypalWalletVaultResponse.Builder()
        .id("id6")
        .status(PaypalWalletVaultStatus.APPROVED)
        .customer(new PaypalWalletCustomer.Builder()
            .id("id0")
            .emailAddress("email_address2")
            .phone(new PhoneWithType.Builder(
                new PhoneNumber.Builder(
                    "national_number6"
                )
                .build()
            )
            .phoneType(PhoneType.OTHER)
            .build())
            .name(new Name.Builder()
                .givenName("given_name2")
                .surname("surname8")
                .build())
            .merchantCustomerId("merchant_customer_id2")
            .build())
        .build())
    .cobrandedCards(Arrays.asList(
        new CobrandedCard.Builder()
            .labels(Arrays.asList(
                "labels4",
                "labels3"
            ))
            .payee(new PayeeBase.Builder()
                .emailAddress("email_address4")
                .merchantId("merchant_id6")
                .build())
            .amount(new Money.Builder(
                "currency_code6",
                "value0"
            )
            .build())
            .build(),
        new CobrandedCard.Builder()
            .labels(Arrays.asList(
                "labels4",
                "labels3"
            ))
            .payee(new PayeeBase.Builder()
                .emailAddress("email_address4")
                .merchantId("merchant_id6")
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

