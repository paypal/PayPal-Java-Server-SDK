
# Customer Vault Payment Tokens Response

Collection of payment tokens saved for a given customer.

## Structure

`CustomerVaultPaymentTokensResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TotalItems` | `Integer` | Optional | Total number of items.<br><br>**Constraints**: `>= 1`, `<= 50` | Integer getTotalItems() | setTotalItems(Integer totalItems) |
| `TotalPages` | `Integer` | Optional | Total number of pages.<br><br>**Constraints**: `>= 1`, `<= 10` | Integer getTotalPages() | setTotalPages(Integer totalPages) |
| `Customer` | [`VaultResponseCustomer`](../../doc/models/vault-response-customer.md) | Optional | This object defines a customer in your system. Use it to manage customer profiles, save payment methods and contact details. | VaultResponseCustomer getCustomer() | setCustomer(VaultResponseCustomer customer) |
| `PaymentTokens` | [`List<PaymentTokenResponse>`](../../doc/models/payment-token-response.md) | Optional | **Constraints**: *Minimum Items*: `0`, *Maximum Items*: `64` | List<PaymentTokenResponse> getPaymentTokens() | setPaymentTokens(List<PaymentTokenResponse> paymentTokens) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of related [HATEOAS links](https://developer.paypal.com/api/rest/responses/#hateoas).<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `32` | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayCard;
import com.paypal.sdk.models.ApplePayPaymentToken;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardPaymentTokenEntity;
import com.paypal.sdk.models.CardResponseAddress;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.CustomerResponse;
import com.paypal.sdk.models.CustomerVaultPaymentTokensResponse;
import com.paypal.sdk.models.PaymentTokenResponse;
import com.paypal.sdk.models.PaymentTokenResponsePaymentSource;
import com.paypal.sdk.models.VaultResponseCustomer;
import java.util.Arrays;

CustomerVaultPaymentTokensResponse customerVaultPaymentTokensResponse = new CustomerVaultPaymentTokensResponse.Builder()
    .totalItems(50)
    .totalPages(10)
    .customer(new VaultResponseCustomer.Builder()
        .id("id0")
        .merchantCustomerId("merchant_customer_id2")
        .build())
    .paymentTokens(Arrays.asList(
        new PaymentTokenResponse.Builder()
            .id("id4")
            .customer(new CustomerResponse.Builder()
                .id("id0")
                .merchantCustomerId("merchant_customer_id2")
                .build())
            .paymentSource(new PaymentTokenResponsePaymentSource.Builder()
                .card(new CardPaymentTokenEntity.Builder()
                    .name("name6")
                    .brand(CardBrand.CB_NATIONALE)
                    .expiry("expiry4")
                    .billingAddress(new CardResponseAddress.Builder(
                        "country_code8"
                    )
                    .addressLine1("address_line_12")
                    .addressLine2("address_line_28")
                    .adminArea2("admin_area_28")
                    .adminArea1("admin_area_14")
                    .postalCode("postal_code0")
                    .build())
                    .build())
                .applePay(new ApplePayPaymentToken.Builder()
                    .card(new ApplePayCard.Builder()
                        .name("name6")
                        .type(CardType.UNKNOWN)
                        .brand(CardBrand.CB_NATIONALE)
                        .billingAddress(new Address.Builder(
                            "country_code8"
                        )
                        .addressLine1("address_line_12")
                        .addressLine2("address_line_28")
                        .adminArea2("admin_area_28")
                        .adminArea1("admin_area_14")
                        .postalCode("postal_code0")
                        .build())
                        .build())
                    .build())
                .build())
            .build(),
        new PaymentTokenResponse.Builder()
            .id("id4")
            .customer(new CustomerResponse.Builder()
                .id("id0")
                .merchantCustomerId("merchant_customer_id2")
                .build())
            .paymentSource(new PaymentTokenResponsePaymentSource.Builder()
                .card(new CardPaymentTokenEntity.Builder()
                    .name("name6")
                    .brand(CardBrand.CB_NATIONALE)
                    .expiry("expiry4")
                    .billingAddress(new CardResponseAddress.Builder(
                        "country_code8"
                    )
                    .addressLine1("address_line_12")
                    .addressLine2("address_line_28")
                    .adminArea2("admin_area_28")
                    .adminArea1("admin_area_14")
                    .postalCode("postal_code0")
                    .build())
                    .build())
                .applePay(new ApplePayPaymentToken.Builder()
                    .card(new ApplePayCard.Builder()
                        .name("name6")
                        .type(CardType.UNKNOWN)
                        .brand(CardBrand.CB_NATIONALE)
                        .billingAddress(new Address.Builder(
                            "country_code8"
                        )
                        .addressLine1("address_line_12")
                        .addressLine2("address_line_28")
                        .adminArea2("admin_area_28")
                        .adminArea1("admin_area_14")
                        .postalCode("postal_code0")
                        .build())
                        .build())
                    .build())
                .build())
            .build()
    ))
    .build();
```

