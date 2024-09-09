/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CardResponseEntity type.
 */
public class CardResponseEntity {
    private String name;
    private String lastDigits;
    private CardBrand brand;
    private String expiry;
    private AddressDetails billingAddress;
    private String verificationStatus;
    private CardVerificationDetails verification;
    private NetworkTransactionReferenceEntity networkTransactionReference;
    private CardAuthenticationResponse authenticationResult;
    private BinDetails binDetails;
    private CardType type;

    /**
     * Default constructor.
     */
    public CardResponseEntity() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  lastDigits  String value for lastDigits.
     * @param  brand  CardBrand value for brand.
     * @param  expiry  String value for expiry.
     * @param  billingAddress  AddressDetails value for billingAddress.
     * @param  verificationStatus  String value for verificationStatus.
     * @param  verification  CardVerificationDetails value for verification.
     * @param  networkTransactionReference  NetworkTransactionReferenceEntity value for
     *         networkTransactionReference.
     * @param  authenticationResult  CardAuthenticationResponse value for authenticationResult.
     * @param  binDetails  BinDetails value for binDetails.
     * @param  type  CardType value for type.
     */
    public CardResponseEntity(
            String name,
            String lastDigits,
            CardBrand brand,
            String expiry,
            AddressDetails billingAddress,
            String verificationStatus,
            CardVerificationDetails verification,
            NetworkTransactionReferenceEntity networkTransactionReference,
            CardAuthenticationResponse authenticationResult,
            BinDetails binDetails,
            CardType type) {
        this.name = name;
        this.lastDigits = lastDigits;
        this.brand = brand;
        this.expiry = expiry;
        this.billingAddress = billingAddress;
        this.verificationStatus = verificationStatus;
        this.verification = verification;
        this.networkTransactionReference = networkTransactionReference;
        this.authenticationResult = authenticationResult;
        this.binDetails = binDetails;
        this.type = type;
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
     * Getter for BillingAddress.
     * Address request details.
     * @return Returns the AddressDetails
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AddressDetails getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * Address request details.
     * @param billingAddress Value for AddressDetails
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(AddressDetails billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for VerificationStatus.
     * Verification status of Card.
     * @return Returns the String
     */
    @JsonGetter("verification_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * Setter for VerificationStatus.
     * Verification status of Card.
     * @param verificationStatus Value for String
     */
    @JsonSetter("verification_status")
    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * Getter for Verification.
     * Card Verification details including the authorization details and 3D SECURE details.
     * @return Returns the CardVerificationDetails
     */
    @JsonGetter("verification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardVerificationDetails getVerification() {
        return verification;
    }

    /**
     * Setter for Verification.
     * Card Verification details including the authorization details and 3D SECURE details.
     * @param verification Value for CardVerificationDetails
     */
    @JsonSetter("verification")
    public void setVerification(CardVerificationDetails verification) {
        this.verification = verification;
    }

    /**
     * Getter for NetworkTransactionReference.
     * Previous network transaction reference including id in response.
     * @return Returns the NetworkTransactionReferenceEntity
     */
    @JsonGetter("network_transaction_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetworkTransactionReferenceEntity getNetworkTransactionReference() {
        return networkTransactionReference;
    }

    /**
     * Setter for NetworkTransactionReference.
     * Previous network transaction reference including id in response.
     * @param networkTransactionReference Value for NetworkTransactionReferenceEntity
     */
    @JsonSetter("network_transaction_reference")
    public void setNetworkTransactionReference(NetworkTransactionReferenceEntity networkTransactionReference) {
        this.networkTransactionReference = networkTransactionReference;
    }

    /**
     * Getter for AuthenticationResult.
     * Results of Authentication such as 3D Secure.
     * @return Returns the CardAuthenticationResponse
     */
    @JsonGetter("authentication_result")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardAuthenticationResponse getAuthenticationResult() {
        return authenticationResult;
    }

    /**
     * Setter for AuthenticationResult.
     * Results of Authentication such as 3D Secure.
     * @param authenticationResult Value for CardAuthenticationResponse
     */
    @JsonSetter("authentication_result")
    public void setAuthenticationResult(CardAuthenticationResponse authenticationResult) {
        this.authenticationResult = authenticationResult;
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
     * Converts this CardResponseEntity into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardResponseEntity [" + "name=" + name + ", lastDigits=" + lastDigits + ", brand="
                + brand + ", expiry=" + expiry + ", billingAddress=" + billingAddress
                + ", verificationStatus=" + verificationStatus + ", verification=" + verification
                + ", networkTransactionReference=" + networkTransactionReference
                + ", authenticationResult=" + authenticationResult + ", binDetails=" + binDetails
                + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link CardResponseEntity.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardResponseEntity.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .lastDigits(getLastDigits())
                .brand(getBrand())
                .expiry(getExpiry())
                .billingAddress(getBillingAddress())
                .verificationStatus(getVerificationStatus())
                .verification(getVerification())
                .networkTransactionReference(getNetworkTransactionReference())
                .authenticationResult(getAuthenticationResult())
                .binDetails(getBinDetails())
                .type(getType());
        return builder;
    }

    /**
     * Class to build instances of {@link CardResponseEntity}.
     */
    public static class Builder {
        private String name;
        private String lastDigits;
        private CardBrand brand;
        private String expiry;
        private AddressDetails billingAddress;
        private String verificationStatus;
        private CardVerificationDetails verification;
        private NetworkTransactionReferenceEntity networkTransactionReference;
        private CardAuthenticationResponse authenticationResult;
        private BinDetails binDetails;
        private CardType type;



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
         * Setter for expiry.
         * @param  expiry  String value for expiry.
         * @return Builder
         */
        public Builder expiry(String expiry) {
            this.expiry = expiry;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  AddressDetails value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(AddressDetails billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for verificationStatus.
         * @param  verificationStatus  String value for verificationStatus.
         * @return Builder
         */
        public Builder verificationStatus(String verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * Setter for verification.
         * @param  verification  CardVerificationDetails value for verification.
         * @return Builder
         */
        public Builder verification(CardVerificationDetails verification) {
            this.verification = verification;
            return this;
        }

        /**
         * Setter for networkTransactionReference.
         * @param  networkTransactionReference  NetworkTransactionReferenceEntity value for
         *         networkTransactionReference.
         * @return Builder
         */
        public Builder networkTransactionReference(
                NetworkTransactionReferenceEntity networkTransactionReference) {
            this.networkTransactionReference = networkTransactionReference;
            return this;
        }

        /**
         * Setter for authenticationResult.
         * @param  authenticationResult  CardAuthenticationResponse value for authenticationResult.
         * @return Builder
         */
        public Builder authenticationResult(CardAuthenticationResponse authenticationResult) {
            this.authenticationResult = authenticationResult;
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
         * Setter for type.
         * @param  type  CardType value for type.
         * @return Builder
         */
        public Builder type(CardType type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link CardResponseEntity} object using the set fields.
         * @return {@link CardResponseEntity}
         */
        public CardResponseEntity build() {
            return new CardResponseEntity(name, lastDigits, brand, expiry, billingAddress,
                    verificationStatus, verification, networkTransactionReference,
                    authenticationResult, binDetails, type);
        }
    }
}
