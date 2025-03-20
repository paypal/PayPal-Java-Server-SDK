/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PayeeBase type.
 */
public class PayeeBase {
    private String emailAddress;
    private String merchantId;

    /**
     * Default constructor.
     */
    public PayeeBase() {
    }

    /**
     * Initialization constructor.
     * @param  emailAddress  String value for emailAddress.
     * @param  merchantId  String value for merchantId.
     */
    public PayeeBase(
            String emailAddress,
            String merchantId) {
        this.emailAddress = emailAddress;
        this.merchantId = merchantId;
    }

    /**
     * Getter for EmailAddress.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @param emailAddress Value for String
     */
    @JsonSetter("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for MerchantId.
     * The account identifier for a PayPal account.
     * @return Returns the String
     */
    @JsonGetter("merchant_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Setter for MerchantId.
     * The account identifier for a PayPal account.
     * @param merchantId Value for String
     */
    @JsonSetter("merchant_id")
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * Converts this PayeeBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayeeBase [" + "emailAddress=" + emailAddress + ", merchantId=" + merchantId + "]";
    }

    /**
     * Builds a new {@link PayeeBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayeeBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .emailAddress(getEmailAddress())
                .merchantId(getMerchantId());
        return builder;
    }

    /**
     * Class to build instances of {@link PayeeBase}.
     */
    public static class Builder {
        private String emailAddress;
        private String merchantId;



        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for merchantId.
         * @param  merchantId  String value for merchantId.
         * @return Builder
         */
        public Builder merchantId(String merchantId) {
            this.merchantId = merchantId;
            return this;
        }

        /**
         * Builds a new {@link PayeeBase} object using the set fields.
         * @return {@link PayeeBase}
         */
        public PayeeBase build() {
            return new PayeeBase(emailAddress, merchantId);
        }
    }
}
