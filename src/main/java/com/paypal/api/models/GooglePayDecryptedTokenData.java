/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GooglePayDecryptedTokenData type.
 */
public class GooglePayDecryptedTokenData {
    private String messageId;
    private String messageExpiration;
    private GooglePayPaymentMethod paymentMethod;
    private GooglePayAuthenticationMethod authenticationMethod;
    private String cryptogram;
    private String eciIndicator;

    /**
     * Default constructor.
     */
    public GooglePayDecryptedTokenData() {
    }

    /**
     * Initialization constructor.
     * @param  paymentMethod  GooglePayPaymentMethod value for paymentMethod.
     * @param  authenticationMethod  GooglePayAuthenticationMethod value for authenticationMethod.
     * @param  messageId  String value for messageId.
     * @param  messageExpiration  String value for messageExpiration.
     * @param  cryptogram  String value for cryptogram.
     * @param  eciIndicator  String value for eciIndicator.
     */
    public GooglePayDecryptedTokenData(
            GooglePayPaymentMethod paymentMethod,
            GooglePayAuthenticationMethod authenticationMethod,
            String messageId,
            String messageExpiration,
            String cryptogram,
            String eciIndicator) {
        this.messageId = messageId;
        this.messageExpiration = messageExpiration;
        this.paymentMethod = paymentMethod;
        this.authenticationMethod = authenticationMethod;
        this.cryptogram = cryptogram;
        this.eciIndicator = eciIndicator;
    }

    /**
     * Getter for MessageId.
     * A unique ID that identifies the message in case it needs to be revoked or located at a later
     * time.
     * @return Returns the String
     */
    @JsonGetter("message_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessageId() {
        return messageId;
    }

    /**
     * Setter for MessageId.
     * A unique ID that identifies the message in case it needs to be revoked or located at a later
     * time.
     * @param messageId Value for String
     */
    @JsonSetter("message_id")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Getter for MessageExpiration.
     * Date and time at which the message expires as UTC milliseconds since epoch. Integrators
     * should reject any message that's expired.
     * @return Returns the String
     */
    @JsonGetter("message_expiration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessageExpiration() {
        return messageExpiration;
    }

    /**
     * Setter for MessageExpiration.
     * Date and time at which the message expires as UTC milliseconds since epoch. Integrators
     * should reject any message that's expired.
     * @param messageExpiration Value for String
     */
    @JsonSetter("message_expiration")
    public void setMessageExpiration(String messageExpiration) {
        this.messageExpiration = messageExpiration;
    }

    /**
     * Getter for PaymentMethod.
     * The type of the payment credential. Currently, only CARD is supported.
     * @return Returns the GooglePayPaymentMethod
     */
    @JsonGetter("payment_method")
    public GooglePayPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * The type of the payment credential. Currently, only CARD is supported.
     * @param paymentMethod Value for GooglePayPaymentMethod
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(GooglePayPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for AuthenticationMethod.
     * Authentication Method which is used for the card transaction.
     * @return Returns the GooglePayAuthenticationMethod
     */
    @JsonGetter("authentication_method")
    public GooglePayAuthenticationMethod getAuthenticationMethod() {
        return authenticationMethod;
    }

    /**
     * Setter for AuthenticationMethod.
     * Authentication Method which is used for the card transaction.
     * @param authenticationMethod Value for GooglePayAuthenticationMethod
     */
    @JsonSetter("authentication_method")
    public void setAuthenticationMethod(GooglePayAuthenticationMethod authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    /**
     * Getter for Cryptogram.
     * Base-64 cryptographic identifier used by card schemes to validate the token verification
     * result. This is a conditionally required field if authentication_method is CRYPTOGRAM_3DS.
     * @return Returns the String
     */
    @JsonGetter("cryptogram")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCryptogram() {
        return cryptogram;
    }

    /**
     * Setter for Cryptogram.
     * Base-64 cryptographic identifier used by card schemes to validate the token verification
     * result. This is a conditionally required field if authentication_method is CRYPTOGRAM_3DS.
     * @param cryptogram Value for String
     */
    @JsonSetter("cryptogram")
    public void setCryptogram(String cryptogram) {
        this.cryptogram = cryptogram;
    }

    /**
     * Getter for EciIndicator.
     * Electronic Commerce Indicator may not always be present. It is only returned for tokens on
     * the Visa card network. This value is passed through in the payment authorization request.
     * @return Returns the String
     */
    @JsonGetter("eci_indicator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEciIndicator() {
        return eciIndicator;
    }

    /**
     * Setter for EciIndicator.
     * Electronic Commerce Indicator may not always be present. It is only returned for tokens on
     * the Visa card network. This value is passed through in the payment authorization request.
     * @param eciIndicator Value for String
     */
    @JsonSetter("eci_indicator")
    public void setEciIndicator(String eciIndicator) {
        this.eciIndicator = eciIndicator;
    }

    /**
     * Converts this GooglePayDecryptedTokenData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GooglePayDecryptedTokenData [" + "paymentMethod=" + paymentMethod
                + ", authenticationMethod=" + authenticationMethod + ", messageId=" + messageId
                + ", messageExpiration=" + messageExpiration + ", cryptogram=" + cryptogram
                + ", eciIndicator=" + eciIndicator + "]";
    }

    /**
     * Builds a new {@link GooglePayDecryptedTokenData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GooglePayDecryptedTokenData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentMethod, authenticationMethod)
                .messageId(getMessageId())
                .messageExpiration(getMessageExpiration())
                .cryptogram(getCryptogram())
                .eciIndicator(getEciIndicator());
        return builder;
    }

    /**
     * Class to build instances of {@link GooglePayDecryptedTokenData}.
     */
    public static class Builder {
        private GooglePayPaymentMethod paymentMethod;
        private GooglePayAuthenticationMethod authenticationMethod;
        private String messageId;
        private String messageExpiration;
        private String cryptogram;
        private String eciIndicator;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentMethod  GooglePayPaymentMethod value for paymentMethod.
         * @param  authenticationMethod  GooglePayAuthenticationMethod value for
         *         authenticationMethod.
         */
        public Builder(GooglePayPaymentMethod paymentMethod,
                GooglePayAuthenticationMethod authenticationMethod) {
            this.paymentMethod = paymentMethod;
            this.authenticationMethod = authenticationMethod;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  GooglePayPaymentMethod value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(GooglePayPaymentMethod paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for authenticationMethod.
         * @param  authenticationMethod  GooglePayAuthenticationMethod value for
         *         authenticationMethod.
         * @return Builder
         */
        public Builder authenticationMethod(GooglePayAuthenticationMethod authenticationMethod) {
            this.authenticationMethod = authenticationMethod;
            return this;
        }

        /**
         * Setter for messageId.
         * @param  messageId  String value for messageId.
         * @return Builder
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Setter for messageExpiration.
         * @param  messageExpiration  String value for messageExpiration.
         * @return Builder
         */
        public Builder messageExpiration(String messageExpiration) {
            this.messageExpiration = messageExpiration;
            return this;
        }

        /**
         * Setter for cryptogram.
         * @param  cryptogram  String value for cryptogram.
         * @return Builder
         */
        public Builder cryptogram(String cryptogram) {
            this.cryptogram = cryptogram;
            return this;
        }

        /**
         * Setter for eciIndicator.
         * @param  eciIndicator  String value for eciIndicator.
         * @return Builder
         */
        public Builder eciIndicator(String eciIndicator) {
            this.eciIndicator = eciIndicator;
            return this;
        }

        /**
         * Builds a new {@link GooglePayDecryptedTokenData} object using the set fields.
         * @return {@link GooglePayDecryptedTokenData}
         */
        public GooglePayDecryptedTokenData build() {
            return new GooglePayDecryptedTokenData(paymentMethod, authenticationMethod, messageId,
                    messageExpiration, cryptogram, eciIndicator);
        }
    }
}
