/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PayerBase type.
 */
public class PayerBase {
    private String emailAddress;
    private String payerId;

    /**
     * Default constructor.
     */
    public PayerBase() {
    }

    /**
     * Initialization constructor.
     * @param  emailAddress  String value for emailAddress.
     * @param  payerId  String value for payerId.
     */
    public PayerBase(
            String emailAddress,
            String payerId) {
        this.emailAddress = emailAddress;
        this.payerId = payerId;
    }

    /**
     * Getter for EmailAddress.
     * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters
     * are allowed before and 255 characters are allowed after the &lt;code&gt;{@literal @}&lt;/code&gt; sign. However, the
     * generally accepted maximum length for an email address is 254 characters. The pattern
     * verifies that an unquoted &lt;code&gt;{@literal @}&lt;/code&gt; sign exists.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The internationalized email address.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; Up to 64 characters
     * are allowed before and 255 characters are allowed after the &lt;code&gt;{@literal @}&lt;/code&gt; sign. However, the
     * generally accepted maximum length for an email address is 254 characters. The pattern
     * verifies that an unquoted &lt;code&gt;{@literal @}&lt;/code&gt; sign exists.&lt;/blockquote&gt;
     * @param emailAddress Value for String
     */
    @JsonSetter("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for PayerId.
     * The account identifier for a PayPal account.
     * @return Returns the String
     */
    @JsonGetter("payer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPayerId() {
        return payerId;
    }

    /**
     * Setter for PayerId.
     * The account identifier for a PayPal account.
     * @param payerId Value for String
     */
    @JsonSetter("payer_id")
    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    /**
     * Converts this PayerBase into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PayerBase [" + "emailAddress=" + emailAddress + ", payerId=" + payerId + "]";
    }

    /**
     * Builds a new {@link PayerBase.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PayerBase.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .emailAddress(getEmailAddress())
                .payerId(getPayerId());
        return builder;
    }

    /**
     * Class to build instances of {@link PayerBase}.
     */
    public static class Builder {
        private String emailAddress;
        private String payerId;



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
         * Setter for payerId.
         * @param  payerId  String value for payerId.
         * @return Builder
         */
        public Builder payerId(String payerId) {
            this.payerId = payerId;
            return this;
        }

        /**
         * Builds a new {@link PayerBase} object using the set fields.
         * @return {@link PayerBase}
         */
        public PayerBase build() {
            return new PayerBase(emailAddress, payerId);
        }
    }
}
