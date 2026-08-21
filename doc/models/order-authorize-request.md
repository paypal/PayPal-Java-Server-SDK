
# Order Authorize Request

The authorization of an order request.

## Structure

`OrderAuthorizeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentSource` | [`OrderAuthorizeRequestPaymentSource`](../../doc/models/order-authorize-request-payment-source.md) | Optional | The payment source definition. | OrderAuthorizeRequestPaymentSource getPaymentSource() | setPaymentSource(OrderAuthorizeRequestPaymentSource paymentSource) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayDecryptedTokenData;
import com.paypal.sdk.models.ApplePayPaymentData;
import com.paypal.sdk.models.ApplePayPaymentDataType;
import com.paypal.sdk.models.ApplePayRequest;
import com.paypal.sdk.models.ApplePayTokenizedCard;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardRequest;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.GooglePayAuthenticationMethod;
import com.paypal.sdk.models.GooglePayCard;
import com.paypal.sdk.models.GooglePayDecryptedTokenData;
import com.paypal.sdk.models.GooglePayPaymentMethod;
import com.paypal.sdk.models.GooglePayRequest;
import com.paypal.sdk.models.GooglePayRequestCard;
import com.paypal.sdk.models.Money;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.OrderAuthorizeRequest;
import com.paypal.sdk.models.OrderAuthorizeRequestPaymentSource;
import com.paypal.sdk.models.PaypalWallet;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.Token;
import com.paypal.sdk.models.TokenType;

OrderAuthorizeRequest orderAuthorizeRequest = new OrderAuthorizeRequest.Builder()
    .paymentSource(new OrderAuthorizeRequestPaymentSource.Builder()
        .card(new CardRequest.Builder()
            .name("name6")
            .number("number6")
            .expiry("expiry4")
            .securityCode("security_code8")
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
        .token(new Token.Builder(
            "id6",
            TokenType.BILLING_AGREEMENT
        )
        .build())
        .paypal(new PaypalWallet.Builder()
            .vaultId("vault_id0")
            .emailAddress("email_address0")
            .name(new Name.Builder()
                .givenName("given_name2")
                .surname("surname8")
                .build())
            .phone(new PhoneWithType.Builder(
                new PhoneNumber.Builder(
                    "national_number6"
                )
                .build()
            )
            .phoneType(PhoneType.OTHER)
            .build())
            .birthDate("birth_date8")
            .build())
        .applePay(new ApplePayRequest.Builder()
            .id("id0")
            .name("name0")
            .emailAddress("email_address8")
            .phoneNumber(new PhoneNumber.Builder(
                "national_number6"
            )
            .build())
            .decryptedToken(new ApplePayDecryptedTokenData.Builder(
                new ApplePayTokenizedCard.Builder()
                    .name("name4")
                    .number("number2")
                    .expiry("expiry2")
                    .type(CardType.UNKNOWN)
                    .build()
            )
            .transactionAmount(new Money.Builder(
                    "currency_code6",
                    "value2"
                )
                .build())
            .deviceManufacturerId("device_manufacturer_id6")
            .paymentDataType(ApplePayPaymentDataType.ENUM_3DSECURE)
            .paymentData(new ApplePayPaymentData.Builder()
                    .cryptogram("cryptogram6")
                    .eciIndicator("eci_indicator0")
                    .emvData("emv_data0")
                    .pin("pin4")
                    .build())
            .build())
            .build())
        .googlePay(new GooglePayRequest.Builder()
            .name("name8")
            .emailAddress("email_address6")
            .phoneNumber(new PhoneNumberWithCountryCode.Builder(
                "country_code2",
                "national_number6"
            )
            .build())
            .card(new GooglePayRequestCard.Builder()
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
            .decryptedToken(new GooglePayDecryptedTokenData.Builder(
                GooglePayPaymentMethod.CARD,
                new GooglePayCard.Builder()
                    .name("name6")
                    .number("number6")
                    .expiry("expiry4")
                    .type(CardType.UNKNOWN)
                    .build(),
                GooglePayAuthenticationMethod.PAN_ONLY
            )
            .messageId("message_id0")
            .messageExpiration("message_expiration2")
            .cryptogram("cryptogram6")
            .eciIndicator("eci_indicator0")
            .build())
            .build())
        .build())
    .build();
```

