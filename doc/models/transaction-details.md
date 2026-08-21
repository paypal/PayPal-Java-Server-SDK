
# Transaction Details

The transaction details.

## Structure

`TransactionDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionInfo` | [`TransactionInformation`](../../doc/models/transaction-information.md) | Optional | The transaction information. | TransactionInformation getTransactionInfo() | setTransactionInfo(TransactionInformation transactionInfo) |
| `PayerInfo` | [`PayerInformation`](../../doc/models/payer-information.md) | Optional | The payer information. | PayerInformation getPayerInfo() | setPayerInfo(PayerInformation payerInfo) |
| `ShippingInfo` | [`ShippingInformation`](../../doc/models/shipping-information.md) | Optional | The shipping information. | ShippingInformation getShippingInfo() | setShippingInfo(ShippingInformation shippingInfo) |
| `CartInfo` | [`CartInformation`](../../doc/models/cart-information.md) | Optional | The cart information. | CartInformation getCartInfo() | setCartInfo(CartInformation cartInfo) |
| `StoreInfo` | [`StoreInformation`](../../doc/models/store-information.md) | Optional | The store information. | StoreInformation getStoreInfo() | setStoreInfo(StoreInformation storeInfo) |
| `AuctionInfo` | [`AuctionInformation`](../../doc/models/auction-information.md) | Optional | The auction information. | AuctionInformation getAuctionInfo() | setAuctionInfo(AuctionInformation auctionInfo) |
| `IncentiveInfo` | [`IncentiveInformation`](../../doc/models/incentive-information.md) | Optional | The incentive details. | IncentiveInformation getIncentiveInfo() | setIncentiveInfo(IncentiveInformation incentiveInfo) |

## Example

```java
import com.paypal.sdk.models.CartInformation;
import com.paypal.sdk.models.ItemDetails;
import com.paypal.sdk.models.PayerInformation;
import com.paypal.sdk.models.PaypalReferenceIdType;
import com.paypal.sdk.models.Phone;
import com.paypal.sdk.models.ShippingInformation;
import com.paypal.sdk.models.SimplePostalAddressCoarseGrained;
import com.paypal.sdk.models.StoreInformation;
import com.paypal.sdk.models.TransactionDetails;
import com.paypal.sdk.models.TransactionInformation;
import java.util.Arrays;

TransactionDetails transactionDetails = new TransactionDetails.Builder()
    .transactionInfo(new TransactionInformation.Builder()
        .paypalAccountId("paypal_account_id4")
        .paypalReferenceId("paypal_reference_id2")
        .paypalReferenceIdType(PaypalReferenceIdType.ODR)
        .transactionEventCode("transaction_event_code6")
        .build())
    .payerInfo(new PayerInformation.Builder()
        .accountId("account_id2")
        .emailAddress("email_address2")
        .phoneNumber(new Phone.Builder(
            "country_code2",
            "national_number6"
        )
        .extensionNumber("extension_number8")
        .build())
        .addressStatus("address_status2")
        .payerStatus("payer_status2")
        .build())
    .shippingInfo(new ShippingInformation.Builder()
        .name("name0")
        .method("method4")
        .address(new SimplePostalAddressCoarseGrained.Builder(
            "line18",
            "city6",
            "country_code6"
        )
        .line2("line20")
        .state("state2")
        .postalCode("postal_code8")
        .build())
        .secondaryShippingAddress(new SimplePostalAddressCoarseGrained.Builder(
            "line16",
            "city4",
            "country_code4"
        )
        .line2("line28")
        .state("state0")
        .postalCode("postal_code6")
        .build())
        .build())
    .cartInfo(new CartInformation.Builder()
        .itemDetails(Arrays.asList(
            new ItemDetails.Builder()
                .itemCode("item_code0")
                .itemName("item_name8")
                .itemDescription("item_description4")
                .itemOptions("item_options2")
                .itemQuantity("item_quantity2")
                .build(),
            new ItemDetails.Builder()
                .itemCode("item_code0")
                .itemName("item_name8")
                .itemDescription("item_description4")
                .itemOptions("item_options2")
                .itemQuantity("item_quantity2")
                .build()
        ))
        .taxInclusive(false)
        .paypalInvoiceId("paypal_invoice_id6")
        .build())
    .storeInfo(new StoreInformation.Builder()
        .storeId("store_id2")
        .terminalId("terminal_id6")
        .build())
    .build();
```

