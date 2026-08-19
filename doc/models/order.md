
# Order

The order details.

## Structure

`Order`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |
| `Id` | `String` | Optional, Read-only | The ID of the order. | String getId() | setId(String id) |
| `PaymentSource` | [`PaymentSourceResponse`](../../doc/models/payment-source-response.md) | Optional | The payment source used to fund the payment. | PaymentSourceResponse getPaymentSource() | setPaymentSource(PaymentSourceResponse paymentSource) |
| `Intent` | [`CheckoutPaymentIntent`](../../doc/models/checkout-payment-intent.md) | Optional | The intent to either capture payment immediately or authorize a payment for an order after order creation. | CheckoutPaymentIntent getIntent() | setIntent(CheckoutPaymentIntent intent) |
| `ProcessingInstruction` | [`ProcessingInstruction`](../../doc/models/processing-instruction.md) | Optional | The instruction to process an order. | ProcessingInstruction getProcessingInstruction() | setProcessingInstruction(ProcessingInstruction processingInstruction) |
| `Payer` | [`Payer`](../../doc/models/payer.md) | Optional | DEPRECATED. The customer is also known as the payer. The Payer object was intended to only be used with the `payment_source.paypal` object. In order to make this design more clear, the details in the `payer` object are now available under `payment_source.paypal`. Please use `payment_source.paypal`. | Payer getPayer() | setPayer(Payer payer) |
| `PurchaseUnits` | [`List<PurchaseUnit>`](../../doc/models/purchase-unit.md) | Optional | An array of purchase units. Each purchase unit establishes a contract between a customer and merchant. Each purchase unit represents either a full or partial order that the customer intends to purchase from the merchant.<br><br>**Constraints**: *Minimum Items*: `1`, *Maximum Items*: `10` | List<PurchaseUnit> getPurchaseUnits() | setPurchaseUnits(List<PurchaseUnit> purchaseUnits) |
| `Status` | [`OrderStatus`](../../doc/models/order-status.md) | Optional | The order status.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | OrderStatus getStatus() | setStatus(OrderStatus status) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional, Read-only | An array of request-related HATEOAS links. To complete payer approval, use the `approve` link to redirect the payer. The API caller has 6 hours (default setting, this which can be changed by your account manager to 24/48/72 hours to accommodate your use case) from the time the order is created, to redirect your payer. Once redirected, the API caller has 6 hours for the payer to approve the order and either authorize or capture the order. If you are not using the PayPal JavaScript SDK to initiate PayPal Checkout (in context) ensure that you include `application_context.return_url` is specified or you will get "We're sorry, Things don't appear to be working at the moment" after the payer approves the payment. | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |

## Example

```java
import com.paypal.sdk.models.BancontactPaymentObject;
import com.paypal.sdk.models.BlikOneClickPaymentObject;
import com.paypal.sdk.models.BlikPaymentObject;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardResponse;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.CheckoutPaymentIntent;
import com.paypal.sdk.models.EpsPaymentObject;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.Order;
import com.paypal.sdk.models.PaymentSourceResponse;
import com.paypal.sdk.models.PaypalWalletResponse;
import com.paypal.sdk.models.PhoneType;

Order order = new Order.Builder()
    .createTime("create_time2")
    .updateTime("update_time8")
    .paymentSource(new PaymentSourceResponse.Builder()
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
        .bancontact(new BancontactPaymentObject.Builder()
            .name("name0")
            .countryCode("country_code0")
            .bic("bic2")
            .ibanLastChars("iban_last_chars8")
            .cardLastDigits("card_last_digits4")
            .build())
        .blik(new BlikPaymentObject.Builder()
            .name("name2")
            .countryCode("country_code2")
            .email("email4")
            .oneClick(new BlikOneClickPaymentObject.Builder()
                .consumerReference("consumer_reference2")
                .build())
            .build())
        .eps(new EpsPaymentObject.Builder()
            .name("name6")
            .countryCode("country_code6")
            .bic("bic8")
            .build())
        .build())
    .intent(CheckoutPaymentIntent.CAPTURE)
    .build();
```

