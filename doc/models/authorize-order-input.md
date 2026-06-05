
# Authorize Order Input

Input structure for the method AuthorizeOrderAsync

## Structure

`AuthorizeOrderInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the order for which to authorize.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalMockResponse` | `String` | Optional | PayPal's REST API uses a request header to invoke negative testing in the sandbox. This header configures the sandbox into a negative testing state for transactions that include the merchant. | String getPaypalMockResponse() | setPaypalMockResponse(String paypalMockResponse) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 6 hours. The API callers can request the times to up to 72 hours by speaking to their Account Manager. It is mandatory for all single-step create order calls (E.g. Create Order Request with payment source information like Card, PayPal.vault_id, PayPal.billing_agreement_id, etc).<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `108` | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `25`, *Pattern*: `^[a-zA-Z=,-]*$` | String getPrefer() | setPrefer(String prefer) |
| `PaypalClientMetadataId` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` | String getPaypalClientMetadataId() | setPaypalClientMetadataId(String paypalClientMetadataId) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see PayPal-Auth-Assertion. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Body` | [`OrderAuthorizeRequest`](../../doc/models/order-authorize-request.md) | Optional | - | OrderAuthorizeRequest getBody() | setBody(OrderAuthorizeRequest body) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayDecryptedTokenData;
import com.paypal.sdk.models.ApplePayPaymentData;
import com.paypal.sdk.models.ApplePayPaymentDataType;
import com.paypal.sdk.models.ApplePayRequest;
import com.paypal.sdk.models.ApplePayTokenizedCard;
import com.paypal.sdk.models.AuthorizeOrderInput;
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

AuthorizeOrderInput authorizeOrderInput = new AuthorizeOrderInput.Builder(
    "id0",
    "application/json"
)
.paypalMockResponse("PayPal-Mock-Response0")
.paypalRequestId("PayPal-Request-Id6")
.prefer("return=minimal")
.paypalClientMetadataId("PayPal-Client-Metadata-Id2")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.body(new OrderAuthorizeRequest.Builder()
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
                        .cardType(CardBrand.VISA)
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
                        .lastDigits("last_digits0")
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
        .build())
.build();
```

