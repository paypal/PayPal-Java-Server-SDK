
# Setup Token Request Payment Source

The payment method to vault with the instrument details.

## Structure

`SetupTokenRequestPaymentSource`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`SetupTokenRequestCard`](../../doc/models/setup-token-request-card.md) | Optional | A Resource representing a request to vault a Card. | SetupTokenRequestCard getCard() | setCard(SetupTokenRequestCard card) |
| `Paypal` | [`VaultPaypalWalletRequest`](../../doc/models/vault-paypal-wallet-request.md) | Optional | A resource representing a request to vault PayPal Wallet. | VaultPaypalWalletRequest getPaypal() | setPaypal(VaultPaypalWalletRequest paypal) |
| `Venmo` | [`VaultVenmoRequest`](../../doc/models/vault-venmo-request.md) | Optional | A resource representing a request to vault Venmo. | VaultVenmoRequest getVenmo() | setVenmo(VaultVenmoRequest venmo) |
| `ApplePay` | [`VaultApplePayRequest`](../../doc/models/vault-apple-pay-request.md) | Optional | A resource representing a request to vault Apple Pay. | VaultApplePayRequest getApplePay() | setApplePay(VaultApplePayRequest applePay) |
| `Token` | [`VaultTokenRequest`](../../doc/models/vault-token-request.md) | Optional | The Tokenized Payment Source representing a Request to Vault a Token. | VaultTokenRequest getToken() | setToken(VaultTokenRequest token) |
| `Bank` | [`BankRequest`](../../doc/models/bank-request.md) | Optional | A Resource representing a request to vault a Bank used for ACH Debit. | BankRequest getBank() | setBank(BankRequest bank) |

## Example

```java
import com.paypal.sdk.models.Address;
import com.paypal.sdk.models.ApplePayRequestCard;
import com.paypal.sdk.models.CardBrand;
import com.paypal.sdk.models.CardType;
import com.paypal.sdk.models.FulfillmentType;
import com.paypal.sdk.models.PaypalPaymentTokenUsageType;
import com.paypal.sdk.models.PhoneNumberWithCountryCode;
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

SetupTokenRequestPaymentSource setupTokenRequestPaymentSource = new SetupTokenRequestPaymentSource.Builder()
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
    .build();
```

