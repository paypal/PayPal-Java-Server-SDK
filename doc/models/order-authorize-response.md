
# Order Authorize Response

The order authorize response.

## Structure

`OrderAuthorizeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |
| `Id` | `String` | Optional, Read-only | The ID of the order. | String getId() | setId(String id) |
| `PaymentSource` | [`OrderAuthorizeResponsePaymentSource`](../../doc/models/order-authorize-response-payment-source.md) | Optional | The payment source used to fund the payment. | OrderAuthorizeResponsePaymentSource getPaymentSource() | setPaymentSource(OrderAuthorizeResponsePaymentSource paymentSource) |
| `Intent` | [`CheckoutPaymentIntent`](../../doc/models/checkout-payment-intent.md) | Optional | The intent to either capture payment immediately or authorize a payment for an order after order creation. | CheckoutPaymentIntent getIntent() | setIntent(CheckoutPaymentIntent intent) |
| `ProcessingInstruction` | [`ProcessingInstruction`](../../doc/models/processing-instruction.md) | Optional | The instruction to process an order. | ProcessingInstruction getProcessingInstruction() | setProcessingInstruction(ProcessingInstruction processingInstruction) |
| `Payer` | [`Payer`](../../doc/models/payer.md) | Optional | The customer who approves and pays for the order. The customer is also known as the payer. | Payer getPayer() | setPayer(Payer payer) |
| `PurchaseUnits` | [`List<PurchaseUnit>`](../../doc/models/purchase-unit.md) | Optional | An array of purchase units. Each purchase unit establishes a contract between a customer and merchant. Each purchase unit represents either a full or partial order that the customer intends to purchase from the merchant.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<PurchaseUnit> getPurchaseUnits() | setPurchaseUnits(List<PurchaseUnit> purchaseUnits) |
| `Status` | [`OrderStatus`](../../doc/models/order-status.md) | Optional | The order status.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | OrderStatus getStatus() | setStatus(OrderStatus status) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related HATEOAS links. To complete payer approval, use the `approve` link to redirect the payer. The API caller has 6 hours (default setting, this which can be changed by your account manager to 24/48/72 hours to accommodate your use case) from the time the order is created, to redirect your payer. Once redirected, the API caller has 6 hours for the payer to approve the order and either authorize or capture the order. If you are not using the PayPal JavaScript SDK to initiate PayPal Checkout (in context) ensure that you include `application_context.return_url` is specified or you will get "We're sorry, Things don't appear to be working at the moment" after the payer approves the payment. | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayPaymentObject;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardResponse;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.CheckoutPaymentIntent;
import com.paypal.sdk.models.GooglePayCardResponse;
import com.paypal.sdk.models.GooglePayWalletResponse;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.OrderAuthorizeResponse;
import com.paypal.sdk.models.OrderAuthorizeResponsePaymentSource;
import com.paypal.sdk.models.PaypalWalletResponse;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.VenmoWalletResponse;

OrderAuthorizeResponse orderAuthorizeResponse = new OrderAuthorizeResponse.Builder()
    .createTime("create_time8")
    .updateTime("update_time4")
    .paymentSource(new OrderAuthorizeResponsePaymentSource.Builder()
        .card(new CardResponse.Builder()
            .name("name6")
            .brand(CardBrand.CB_NATIONALE)
            .type(CardType.UNKNOWN)
            .build())
        .paypal(new PaypalWalletResponse.Builder()
            .emailAddress("email_address0")
            .accountId("account_id4")
            .name(new Name.Builder()
                .givenName("given_name2")
                .surname("surname8")
                .build())
            .phoneType(PhoneType.FAX)
            .build())
        .applePay(new ApplePayPaymentObject.Builder()
            .id("id0")
            .token("token6")
            .name("name0")
            .emailAddress("email_address8")
            .phoneNumber(new PhoneNumber.Builder(
                "national_number6"
            )
            .build())
            .build())
        .googlePay(new GooglePayWalletResponse.Builder()
            .name("name8")
            .emailAddress("email_address6")
            .phoneNumber(new PhoneNumberWithCountryCode.Builder(
                "country_code2",
                "national_number6"
            )
            .build())
            .card(new GooglePayCardResponse.Builder()
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
        .venmo(new VenmoWalletResponse.Builder()
            .emailAddress("email_address4")
            .accountId("account_id8")
            .userName("user_name2")
            .name(new Name.Builder()
                .givenName("given_name2")
                .surname("surname8")
                .build())
            .phoneNumber(new PhoneNumber.Builder(
                "national_number6"
            )
            .build())
            .build())
        .build())
    .intent(CheckoutPaymentIntent.CAPTURE)
    .build();
```

