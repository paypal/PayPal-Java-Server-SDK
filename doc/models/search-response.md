
# Search Response

The search response information.

## Structure

`SearchResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionDetails` | [`List<TransactionDetails>`](../../doc/models/transaction-details.md) | Optional | An array of transaction detail objects.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `2147483647` | List<TransactionDetails> getTransactionDetails() | setTransactionDetails(List<TransactionDetails> transactionDetails) |
| `AccountNumber` | `String` | Optional | The merchant account number.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[a-zA-Z0-9]*$` | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `StartDate` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getStartDate() | setStartDate(String startDate) |
| `EndDate` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getEndDate() | setEndDate(String endDate) |
| `LastRefreshedDatetime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getLastRefreshedDatetime() | setLastRefreshedDatetime(String lastRefreshedDatetime) |
| `Page` | `Integer` | Optional | A zero-relative index of transactions.<br><br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getPage() | setPage(Integer page) |
| `TotalItems` | `Integer` | Optional | The total number of transactions as an integer beginning with the specified `page` in the full result and not just in this response.<br><br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getTotalItems() | setTotalItems(Integer totalItems) |
| `TotalPages` | `Integer` | Optional | The total number of pages, as an `integer`, when the `total_items` is divided into pages of the specified `page_size`.<br><br>**Constraints**: `>= 0`, `<= 2147483647` | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related [HATEOAS links](https://developer.paypal.com/api/rest/responses/#hateoas-links).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32767` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.CartInformation;
import com.paypal.sdk.models.ItemDetails;
import com.paypal.sdk.models.PayerInformation;
import com.paypal.sdk.models.PaypalReferenceIdType;
import com.paypal.sdk.models.Phone;
import com.paypal.sdk.models.SearchResponse;
import com.paypal.sdk.models.ShippingInformation;
import com.paypal.sdk.models.SimplePostalAddressCoarseGrained;
import com.paypal.sdk.models.StoreInformation;
import com.paypal.sdk.models.TransactionDetails;
import com.paypal.sdk.models.TransactionInformation;
import java.util.Arrays;

SearchResponse searchResponse = new SearchResponse.Builder()
    .transactionDetails(Arrays.asList(
        new TransactionDetails.Builder()
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
            .build(),
        new TransactionDetails.Builder()
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
            .build()
    ))
    .accountNumber("account_number4")
    .startDate("start_date0")
    .endDate("end_date6")
    .lastRefreshedDatetime("last_refreshed_datetime8")
    .build();
```

