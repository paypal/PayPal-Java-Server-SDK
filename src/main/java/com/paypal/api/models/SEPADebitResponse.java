/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.api.utilities.JsonValue;

/**
 * This is a model class for SEPADebitResponse type.
 */
public class SEPADebitResponse {
    private String ibanLastChars;
    private JsonValue accountHolderName;
    private Address billingAddress;
    private SEPADebitAuthorizationDetails authorizationDetails;

    /**
     * Default constructor.
     */
    public SEPADebitResponse() {
    }

    /**
     * Initialization constructor.
     * @param  ibanLastChars  String value for ibanLastChars.
     * @param  accountHolderName  JsonValue value for accountHolderName.
     * @param  billingAddress  Address value for billingAddress.
     * @param  authorizationDetails  SEPADebitAuthorizationDetails value for authorizationDetails.
     */
    public SEPADebitResponse(
            String ibanLastChars,
            JsonValue accountHolderName,
            Address billingAddress,
            SEPADebitAuthorizationDetails authorizationDetails) {
        this.ibanLastChars = ibanLastChars;
        this.accountHolderName = accountHolderName;
        this.billingAddress = billingAddress;
        this.authorizationDetails = authorizationDetails;
    }

    /**
     * Getter for IbanLastChars.
     * The last characters of the IBAN used to pay.
     * @return Returns the String
     */
    @JsonGetter("iban_last_chars")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIbanLastChars() {
        return ibanLastChars;
    }

    /**
     * Setter for IbanLastChars.
     * The last characters of the IBAN used to pay.
     * @param ibanLastChars Value for String
     */
    @JsonSetter("iban_last_chars")
    public void setIbanLastChars(String ibanLastChars) {
        this.ibanLastChars = ibanLastChars;
    }

    /**
     * Getter for AccountHolderName.
     * @return Returns the JsonValue
     */
    @JsonGetter("account_holder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonValue getAccountHolderName() {
        return accountHolderName;
    }

    /**
     * Setter for AccountHolderName.
     * @param accountHolderName Value for JsonValue
     */
    @JsonSetter("account_holder_name")
    public void setAccountHolderName(JsonValue accountHolderName) {
        this.accountHolderName = accountHolderName;
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
     * Getter for AuthorizationDetails.
     * Authorization details.
     * @return Returns the SEPADebitAuthorizationDetails
     */
    @JsonGetter("authorization_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SEPADebitAuthorizationDetails getAuthorizationDetails() {
        return authorizationDetails;
    }

    /**
     * Setter for AuthorizationDetails.
     * Authorization details.
     * @param authorizationDetails Value for SEPADebitAuthorizationDetails
     */
    @JsonSetter("authorization_details")
    public void setAuthorizationDetails(SEPADebitAuthorizationDetails authorizationDetails) {
        this.authorizationDetails = authorizationDetails;
    }

    /**
     * Converts this SEPADebitResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SEPADebitResponse [" + "ibanLastChars=" + ibanLastChars + ", accountHolderName="
                + accountHolderName + ", billingAddress=" + billingAddress
                + ", authorizationDetails=" + authorizationDetails + "]";
    }

    /**
     * Builds a new {@link SEPADebitResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SEPADebitResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ibanLastChars(getIbanLastChars())
                .accountHolderName(getAccountHolderName())
                .billingAddress(getBillingAddress())
                .authorizationDetails(getAuthorizationDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link SEPADebitResponse}.
     */
    public static class Builder {
        private String ibanLastChars;
        private JsonValue accountHolderName;
        private Address billingAddress;
        private SEPADebitAuthorizationDetails authorizationDetails;



        /**
         * Setter for ibanLastChars.
         * @param  ibanLastChars  String value for ibanLastChars.
         * @return Builder
         */
        public Builder ibanLastChars(String ibanLastChars) {
            this.ibanLastChars = ibanLastChars;
            return this;
        }

        /**
         * Setter for accountHolderName.
         * @param  accountHolderName  JsonValue value for accountHolderName.
         * @return Builder
         */
        public Builder accountHolderName(JsonValue accountHolderName) {
            this.accountHolderName = accountHolderName;
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
         * Setter for authorizationDetails.
         * @param  authorizationDetails  SEPADebitAuthorizationDetails value for
         *         authorizationDetails.
         * @return Builder
         */
        public Builder authorizationDetails(SEPADebitAuthorizationDetails authorizationDetails) {
            this.authorizationDetails = authorizationDetails;
            return this;
        }

        /**
         * Builds a new {@link SEPADebitResponse} object using the set fields.
         * @return {@link SEPADebitResponse}
         */
        public SEPADebitResponse build() {
            return new SEPADebitResponse(ibanLastChars, accountHolderName, billingAddress,
                    authorizationDetails);
        }
    }
}
