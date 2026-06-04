
# Create Setup Token Input

Input structure for the method CreateSetupTokenAsync

## Structure

`CreateSetupTokenInput`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContentType` | `String` | Required, Constant | **Value**: `"application/json"` | String getContentType() | setContentType(String contentType) |
| `Body` | [`SetupTokenRequest`](../../doc/models/setup-token-request.md) | Required | Setup Token creation with a instrument type optional financial instrument details and customer_id. | SetupTokenRequest getBody() | setBody(SetupTokenRequest body) |
| `PaypalRequestId` | `String` | Optional | The server stores keys for 3 hours.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `108`, *Pattern*: `^.*$` | String getPaypalRequestId() | setPaypalRequestId(String paypalRequestId) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayRequestCard;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.CreateSetupTokenInput;
import com.paypal.sdk.models.Customer;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.PaypalPaymentTokenUsageType;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
import com.paypal.sdk.models.SetupTokenRequest;
import com.paypal.sdk.models.SetupTokenRequestCard;
import com.paypal.sdk.models.SetupTokenRequestPaymentSource;
import com.paypal.sdk.models.ShippingName;
import com.paypal.sdk.models.UsagePattern;
import com.paypal.sdk.models.VaultApplePayRequest;
import com.paypal.sdk.models.VaultPaypalWalletRequest;
import com.paypal.sdk.models.VaultTokenRequest;
import com.paypal.sdk.models.VaultTokenRequestType;
import com.paypal.sdk.models.VaultVenmoRequest;
import com.paypal.sdk.models.VaultedDigitalWalletShippingDetails;

CreateSetupTokenInput createSetupTokenInput = new CreateSetupTokenInput.Builder(
    "application/json",
    new SetupTokenRequest.Builder(
        new SetupTokenRequestPaymentSource.Builder()
            .card(new SetupTokenRequestCard.Builder()
                .name("name6")
                .number("number6")
                .expiry("expiry4")
                .securityCode("security_code8")
                .brand(CardBrand.CB_NATIONALE)
                .build())
            .paypal(new VaultPaypalWalletRequest.Builder()
                .description("description2")
                .usagePattern(UsagePattern.THRESHOLD_PREPAID)
                .shipping(new VaultedDigitalWalletShippingDetails.Builder()
                    .name(new ShippingName.Builder()
                        .fullName("full_name6")
                        .build())
                    .emailAddress("email_address2")
                    .phoneNumber(new PhoneNumberWithCountryCode.Builder(
                        "country_code2",
                        "national_number6"
                    )
                    .build())
                    .type(FulfillmentType.SHIPPING)
                    .address(new Address.Builder(
                        "country_code6"
                    )
                    .addressLine1("address_line_16")
                    .addressLine2("address_line_26")
                    .adminArea2("admin_area_20")
                    .adminArea1("admin_area_12")
                    .postalCode("postal_code8")
                    .build())
                    .build())
                .permitMultiplePaymentTokens(false)
                .usageType(PaypalPaymentTokenUsageType.MERCHANT)
                .build())
            .venmo(new VaultVenmoRequest.Builder()
                .description("description6")
                .usagePattern(UsagePattern.UNSCHEDULED_PREPAID)
                .shipping(new VaultedDigitalWalletShippingDetails.Builder()
                    .name(new ShippingName.Builder()
                        .fullName("full_name6")
                        .build())
                    .emailAddress("email_address2")
                    .phoneNumber(new PhoneNumberWithCountryCode.Builder(
                        "country_code2",
                        "national_number6"
                    )
                    .build())
                    .type(FulfillmentType.SHIPPING)
                    .address(new Address.Builder(
                        "country_code6"
                    )
                    .addressLine1("address_line_16")
                    .addressLine2("address_line_26")
                    .adminArea2("admin_area_20")
                    .adminArea1("admin_area_12")
                    .postalCode("postal_code8")
                    .build())
                    .build())
                .permitMultiplePaymentTokens(false)
                .usageType(PaypalPaymentTokenUsageType.MERCHANT)
                .build())
            .applePay(new VaultApplePayRequest.Builder()
                .token("token6")
                .card(new ApplePayRequestCard.Builder()
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
            .token(new VaultTokenRequest.Builder(
                "id6",
                VaultTokenRequestType.SETUP_TOKEN
            )
            .build())
            .build()
    )
    .customer(new Customer.Builder()
            .id("id0")
            .merchantCustomerId("merchant_customer_id2")
            .build())
    .build()
)
.paypalRequestId("PayPal-Request-Id6")
.build();
```

