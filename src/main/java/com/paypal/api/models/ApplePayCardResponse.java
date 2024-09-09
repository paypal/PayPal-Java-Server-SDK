/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ApplePayCardResponse type.
 */
public class ApplePayCardResponse {
    private String name;
    private String lastDigits;
    private CardBrand brand;
    private List<CardBrand> availableNetworks;
    private CardType type;
    private AuthenticationResponse authenticationResult;
    private CardAttributesResponse attributes;
    private CardFromRequest fromRequest;
    private String expiry;
    private BinDetails binDetails;
    private Address billingAddress;
    private String countryCode;

    /**
     * Default constructor.
     */
    public ApplePayCardResponse() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  lastDigits  String value for lastDigits.
     * @param  brand  CardBrand value for brand.
     * @param  availableNetworks  List of CardBrand value for availableNetworks.
     * @param  type  CardType value for type.
     * @param  authenticationResult  AuthenticationResponse value for authenticationResult.
     * @param  attributes  CardAttributesResponse value for attributes.
     * @param  fromRequest  CardFromRequest value for fromRequest.
     * @param  expiry  String value for expiry.
     * @param  binDetails  BinDetails value for binDetails.
     * @param  billingAddress  Address value for billingAddress.
     * @param  countryCode  String value for countryCode.
     */
    public ApplePayCardResponse(
            String name,
            String lastDigits,
            CardBrand brand,
            List<CardBrand> availableNetworks,
            CardType type,
            AuthenticationResponse authenticationResult,
            CardAttributesResponse attributes,
            CardFromRequest fromRequest,
            String expiry,
            BinDetails binDetails,
            Address billingAddress,
            String countryCode) {
        this.name = name;
        this.lastDigits = lastDigits;
        this.brand = brand;
        this.availableNetworks = availableNetworks;
        this.type = type;
        this.authenticationResult = authenticationResult;
        this.attributes = attributes;
        this.fromRequest = fromRequest;
        this.expiry = expiry;
        this.binDetails = binDetails;
        this.billingAddress = billingAddress;
        this.countryCode = countryCode;
    }

    /**
     * Getter for Name.
     * The card holder's name as it appears on the card.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The card holder's name as it appears on the card.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for LastDigits.
     * The last digits of the payment card.
     * @return Returns the String
     */
    @JsonGetter("last_digits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastDigits() {
        return lastDigits;
    }

    /**
     * Setter for LastDigits.
     * The last digits of the payment card.
     * @param lastDigits Value for String
     */
    @JsonSetter("last_digits")
    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    /**
     * Getter for Brand.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @return Returns the CardBrand
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardBrand getBrand() {
        return brand;
    }

    /**
     * Setter for Brand.
     * The card network or brand. Applies to credit, debit, gift, and payment cards.
     * @param brand Value for CardBrand
     */
    @JsonSetter("brand")
    public void setBrand(CardBrand brand) {
        this.brand = brand;
    }

    /**
     * Getter for AvailableNetworks.
     * Array of brands or networks associated with the card.
     * @return Returns the List of CardBrand
     */
    @JsonGetter("available_networks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CardBrand> getAvailableNetworks() {
        return availableNetworks;
    }

    /**
     * Setter for AvailableNetworks.
     * Array of brands or networks associated with the card.
     * @param availableNetworks Value for List of CardBrand
     */
    @JsonSetter("available_networks")
    public void setAvailableNetworks(List<CardBrand> availableNetworks) {
        this.availableNetworks = availableNetworks;
    }

    /**
     * Getter for Type.
     * Type of card. i.e Credit, Debit and so on.
     * @return Returns the CardType
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type of card. i.e Credit, Debit and so on.
     * @param type Value for CardType
     */
    @JsonSetter("type")
    public void setType(CardType type) {
        this.type = type;
    }

    /**
     * Getter for AuthenticationResult.
     * Results of Authentication such as 3D Secure.
     * @return Returns the AuthenticationResponse
     */
    @JsonGetter("authentication_result")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthenticationResponse getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Setter for AuthenticationResult.
     * Results of Authentication such as 3D Secure.
     * @param authenticationResult Value for AuthenticationResponse
     */
    @JsonSetter("authentication_result")
    public void setAuthenticationResult(AuthenticationResponse authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    /**
     * Getter for Attributes.
     * Additional attributes associated with the use of this card.
     * @return Returns the CardAttributesResponse
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardAttributesResponse getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Additional attributes associated with the use of this card.
     * @param attributes Value for CardAttributesResponse
     */
    @JsonSetter("attributes")
    public void setAttributes(CardAttributesResponse attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for FromRequest.
     * Representation of card details as received in the request.
     * @return Returns the CardFromRequest
     */
    @JsonGetter("from_request")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardFromRequest getFromRequest() {
        return fromRequest;
    }

    /**
     * Setter for FromRequest.
     * Representation of card details as received in the request.
     * @param fromRequest Value for CardFromRequest
     */
    @JsonSetter("from_request")
    public void setFromRequest(CardFromRequest fromRequest) {
        this.fromRequest = fromRequest;
    }

    /**
     * Getter for Expiry.
     * The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @return Returns the String
     */
    @JsonGetter("expiry")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExpiry() {
        return expiry;
    }

    /**
     * Setter for Expiry.
     * The year and month, in ISO-8601 `YYYY-MM` date format. See [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6).
     * @param expiry Value for String
     */
    @JsonSetter("expiry")
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * Getter for BinDetails.
     * Bank Identification Number (BIN) details used to fund a payment.
     * @return Returns the BinDetails
     */
    @JsonGetter("bin_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BinDetails getBinDetails() {
        return binDetails;
    }

    /**
     * Setter for BinDetails.
     * Bank Identification Number (BIN) details used to fund a payment.
     * @param binDetails Value for BinDetails
     */
    @JsonSetter("bin_details")
    public void setBinDetails(BinDetails binDetails) {
        this.binDetails = binDetails;
    }

    /**
     * Getter for BillingAddress.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @return Returns the Address
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @param billingAddress Value for Address
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("country_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Converts this ApplePayCardResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayCardResponse [" + "name=" + name + ", lastDigits=" + lastDigits + ", brand="
                + brand + ", availableNetworks=" + availableNetworks + ", type=" + type
                + ", authenticationResult=" + authenticationResult + ", attributes=" + attributes
                + ", fromRequest=" + fromRequest + ", expiry=" + expiry + ", binDetails="
                + binDetails + ", billingAddress=" + billingAddress + ", countryCode=" + countryCode
                + "]";
    }

    /**
     * Builds a new {@link ApplePayCardResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayCardResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .lastDigits(getLastDigits())
                .brand(getBrand())
                .availableNetworks(getAvailableNetworks())
                .type(getType())
                .authenticationResult(getAuthenticationResult())
                .attributes(getAttributes())
                .fromRequest(getFromRequest())
                .expiry(getExpiry())
                .binDetails(getBinDetails())
                .billingAddress(getBillingAddress())
                .countryCode(getCountryCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayCardResponse}.
     */
    public static class Builder {
        private String name;
        private String lastDigits;
        private CardBrand brand;
        private List<CardBrand> availableNetworks;
        private CardType type;
        private AuthenticationResponse authenticationResult;
        private CardAttributesResponse attributes;
        private CardFromRequest fromRequest;
        private String expiry;
        private BinDetails binDetails;
        private Address billingAddress;
        private String countryCode;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for lastDigits.
         * @param  lastDigits  String value for lastDigits.
         * @return Builder
         */
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  CardBrand value for brand.
         * @return Builder
         */
        public Builder brand(CardBrand brand) {
            this.brand = brand;
            return this;
        }

        /**
         * Setter for availableNetworks.
         * @param  availableNetworks  List of CardBrand value for availableNetworks.
         * @return Builder
         */
        public Builder availableNetworks(List<CardBrand> availableNetworks) {
            this.availableNetworks = availableNetworks;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  CardType value for type.
         * @return Builder
         */
        public Builder type(CardType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for authenticationResult.
         * @param  authenticationResult  AuthenticationResponse value for authenticationResult.
         * @return Builder
         */
        public Builder authenticationResult(AuthenticationResponse authenticationResult) {
            this.authenticationResult = authenticationResult;
            return this;
        }

        /**
         * Setter for attributes.
         * @param  attributes  CardAttributesResponse value for attributes.
         * @return Builder
         */
        public Builder attributes(CardAttributesResponse attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Setter for fromRequest.
         * @param  fromRequest  CardFromRequest value for fromRequest.
         * @return Builder
         */
        public Builder fromRequest(CardFromRequest fromRequest) {
            this.fromRequest = fromRequest;
            return this;
        }

        /**
         * Setter for expiry.
         * @param  expiry  String value for expiry.
         * @return Builder
         */
        public Builder expiry(String expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Setter for binDetails.
         * @param  binDetails  BinDetails value for binDetails.
         * @return Builder
         */
        public Builder binDetails(BinDetails binDetails) {
            this.binDetails = binDetails;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  Address value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Builds a new {@link ApplePayCardResponse} object using the set fields.
         * @return {@link ApplePayCardResponse}
         */
        public ApplePayCardResponse build() {
            return new ApplePayCardResponse(name, lastDigits, brand, availableNetworks, type,
                    authenticationResult, attributes, fromRequest, expiry, binDetails,
                    billingAddress, countryCode);
        }
    }
}