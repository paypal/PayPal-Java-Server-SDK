
# Card Supplementary Data

Merchants and partners can add Level 2 and 3 data to payments to reduce risk and payment processing costs. For more information about processing payments, see checkout or multiparty checkout.

## Structure

`CardSupplementaryData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Level2` | [`Level2CardProcessingData`](../../doc/models/level-2-card-processing-data.md) | Optional | The level 2 card processing data collections. If your merchant account has been configured for Level 2 processing this field will be passed to the processor on your behalf. Please contact your PayPal Technical Account Manager to define level 2 data for your business. | Level2CardProcessingData getLevel2() | setLevel2(Level2CardProcessingData level2) |
| `Level3` | [`Level3CardProcessingData`](../../doc/models/level-3-card-processing-data.md) | Optional | The level 3 card processing data collections, If your merchant account has been configured for Level 3 processing this field will be passed to the processor on your behalf. Please contact your PayPal Technical Account Manager to define level 3 data for your business. | Level3CardProcessingData getLevel3() | setLevel3(Level3CardProcessingData level3) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.CardSupplementaryData;
import com.paypal.sdk.models.Level2CardProcessingData;
import com.paypal.sdk.models.Level3CardProcessingData;
import com.paypal.sdk.models.Money;

CardSupplementaryData cardSupplementaryData = new CardSupplementaryData.Builder()
    .level2(new Level2CardProcessingData.Builder()
        .invoiceId("invoice_id4")
        .taxTotal(new Money.Builder(
            "currency_code4",
            "value0"
        )
        .build())
        .build())
    .level3(new Level3CardProcessingData.Builder()
        .shippingAmount(new Money.Builder(
            "currency_code0",
            "value6"
        )
        .build())
        .dutyAmount(new Money.Builder(
            "currency_code6",
            "value2"
        )
        .build())
        .discountAmount(new Money.Builder(
            "currency_code2",
            "value8"
        )
        .build())
        .shippingAddress(new Address.Builder(
            "country_code0"
        )
        .addressLine1("address_line_10")
        .addressLine2("address_line_20")
        .adminArea2("admin_area_24")
        .adminArea1("admin_area_16")
        .postalCode("postal_code2")
        .build())
        .shipsFromPostalCode("ships_from_postal_code4")
        .build())
    .build();
```

