
# Confirm Order Input

Input structure for the method ConfirmOrderAsync

## Structure

`ConfirmOrderInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The ID of the order for which the payer confirms their intent to pay.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[A-Z0-9]+$` | String getId() | setId(String id) |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `PaypalClientMetadataId` | `String` | Optional | **Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` | String getPaypalClientMetadataId() | setPaypalClientMetadataId(String paypalClientMetadataId) |
| `PaypalAuthAssertion` | `String` | Optional | An API-caller-provided JSON Web Token (JWT) assertion that identifies the merchant. For details, see PayPal-Auth-Assertion. | String getPaypalAuthAssertion() | setPaypalAuthAssertion(String paypalAuthAssertion) |
| `Prefer` | `String` | Optional | The preferred server response upon successful completion of the request. Value is: return=minimal. The server returns a minimal response to optimize communication between the API caller and the server. A minimal response includes the id, status and HATEOAS links. return=representation. The server returns a complete resource representation, including the current state of the resource.<br><br>**Default**: `"return=minimal"`<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `25`, *Pattern*: `^[a-zA-Z=]*$` | String getPrefer() | setPrefer(String prefer) |
| `Body` | [`ConfirmOrderRequest`](../../doc/models/confirm-order-request.md) | Optional | - | ConfirmOrderRequest getBody() | setBody(ConfirmOrderRequest body) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.BancontactPaymentRequest;
import com.paypal.sdk.models.BlikExperienceContext;
import com.paypal.sdk.models.BlikLevel0PaymentObject;
import com.paypal.sdk.models.BlikOneClickPaymentRequest;
import com.paypal.sdk.models.BlikPaymentRequest;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardRequest;
import com.paypal.sdk.models.ConfirmOrderInput;
import com.paypal.sdk.models.ConfirmOrderRequest;
import com.paypal.sdk.models.ExperienceContext;
import com.paypal.sdk.models.ExperienceContextShippingPreference;
import com.paypal.sdk.models.Name;
import com.paypal.sdk.models.NetworkTransaction;
import com.paypal.sdk.models.OrderConfirmApplicationContext;
import com.paypal.sdk.models.PaymentInitiator;
import com.paypal.sdk.models.PaymentSource;
import com.paypal.sdk.models.PaypalWallet;
import com.paypal.sdk.models.PhoneNumber;
import com.paypal.sdk.models.PhoneType;
import com.paypal.sdk.models.PhoneWithType;
import com.paypal.sdk.models.ProcessingInstruction;
import com.paypal.sdk.models.StoredPaymentSource;
import com.paypal.sdk.models.StoredPaymentSourcePaymentType;
import com.paypal.sdk.models.StoredPaymentSourceUsageType;
import com.paypal.sdk.models.Token;
import com.paypal.sdk.models.TokenType;

ConfirmOrderInput confirmOrderInput = new ConfirmOrderInput.Builder(
    "id0",
    "application/json"
)
.paypalClientMetadataId("PayPal-Client-Metadata-Id2")
.paypalAuthAssertion("PayPal-Auth-Assertion0")
.prefer("return=minimal")
.body(new ConfirmOrderRequest.Builder(
        new PaymentSource.Builder()
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
            .bancontact(new BancontactPaymentRequest.Builder(
                "name0",
                "country_code0"
            )
            .experienceContext(new ExperienceContext.Builder()
                    .brandName("brand_name2")
                    .locale("locale6")
                    .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
                    .returnUrl("return_url4")
                    .cancelUrl("cancel_url6")
                    .build())
            .build())
            .blik(new BlikPaymentRequest.Builder(
                "name2",
                "country_code2"
            )
            .email("email4")
            .experienceContext(new BlikExperienceContext.Builder()
                    .brandName("brand_name2")
                    .locale("locale6")
                    .shippingPreference(ExperienceContextShippingPreference.NO_SHIPPING)
                    .returnUrl("return_url4")
                    .cancelUrl("cancel_url6")
                    .build())
            .level0(new BlikLevel0PaymentObject.Builder(
                    "auth_code8"
                )
                .build())
            .oneClick(new BlikOneClickPaymentRequest.Builder(
                    "consumer_reference2"
                )
                .authCode("auth_code0")
                .aliasLabel("alias_label6")
                .aliasKey("alias_key4")
                .build())
            .build())
            .build()
    )
    .processingInstruction(ProcessingInstruction.ORDER_COMPLETE_ON_PAYMENT_APPROVAL)
    .applicationContext(new OrderConfirmApplicationContext.Builder()
            .brandName("brand_name8")
            .locale("locale2")
            .returnUrl("return_url0")
            .cancelUrl("cancel_url2")
            .storedPaymentSource(new StoredPaymentSource.Builder(
                PaymentInitiator.CUSTOMER,
                StoredPaymentSourcePaymentType.RECURRING
            )
            .usage(StoredPaymentSourceUsageType.FIRST)
            .previousNetworkTransactionReference(new NetworkTransaction.Builder()
                    .id("id6")
                    .date("date2")
                    .network(CardBrand.CONFIDIS)
                    .acquirerReferenceNumber("acquirer_reference_number8")
                    .build())
            .build())
            .build())
    .build())
.build();
```

