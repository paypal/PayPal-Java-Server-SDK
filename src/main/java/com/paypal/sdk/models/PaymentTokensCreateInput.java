/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PaymentTokensCreateInput type.
 */
public class PaymentTokensCreateInput {
    private String paypalRequestId;
    private String contentType;
    private PaymentTokenRequest body;

    /**
     * Default constructor.
     */
    public PaymentTokensCreateInput() {
        contentType = "application/json";
    }

    /**
     * Initialization constructor.
     * @param  paypalRequestId  String value for paypalRequestId.
     * @param  contentType  String value for contentType.
     * @param  body  PaymentTokenRequest value for body.
     */
    public PaymentTokensCreateInput(
            String paypalRequestId,
            String contentType,
            PaymentTokenRequest body) {
        this.paypalRequestId = paypalRequestId;
        this.contentType = contentType;
        this.body = body;
    }

    /**
     * Getter for PaypalRequestId.
     * The server stores keys for 3 hours.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Request-Id")
    public String getPaypalRequestId() {
        return paypalRequestId;
    }

    /**
     * Setter for PaypalRequestId.
     * The server stores keys for 3 hours.
     * @param paypalRequestId Value for String
     */
    @JsonSetter("PayPal-Request-Id")
    public void setPaypalRequestId(String paypalRequestId) {
        this.paypalRequestId = paypalRequestId;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("Content-Type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("Content-Type")
    private void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Body.
     * Payment Token creation with a financial instrument and an optional customer_id.
     * @return Returns the PaymentTokenRequest
     */
    @JsonGetter("body")
    public PaymentTokenRequest getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * Payment Token creation with a financial instrument and an optional customer_id.
     * @param body Value for PaymentTokenRequest
     */
    @JsonSetter("body")
    public void setBody(PaymentTokenRequest body) {
        this.body = body;
    }

    /**
     * Converts this PaymentTokensCreateInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentTokensCreateInput [" + "paypalRequestId=" + paypalRequestId
                + ", contentType=" + contentType + ", body=" + body + "]";
    }

    /**
     * Builds a new {@link PaymentTokensCreateInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentTokensCreateInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paypalRequestId, contentType, body);
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentTokensCreateInput}.
     */
    public static class Builder {
        private String paypalRequestId;
        private String contentType = "application/json";
        private PaymentTokenRequest body;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paypalRequestId  String value for paypalRequestId.
         * @param  contentType  String value for contentType.
         * @param  body  PaymentTokenRequest value for body.
         */
        public Builder(String paypalRequestId, String contentType, PaymentTokenRequest body) {
            this.paypalRequestId = paypalRequestId;
            this.contentType = contentType;
            this.body = body;
        }

        /**
         * Setter for paypalRequestId.
         * @param  paypalRequestId  String value for paypalRequestId.
         * @return Builder
         */
        public Builder paypalRequestId(String paypalRequestId) {
            this.paypalRequestId = paypalRequestId;
            return this;
        }

        /**
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  PaymentTokenRequest value for body.
         * @return Builder
         */
        public Builder body(PaymentTokenRequest body) {
            this.body = body;
            return this;
        }

        /**
         * Builds a new {@link PaymentTokensCreateInput} object using the set fields.
         * @return {@link PaymentTokensCreateInput}
         */
        public PaymentTokensCreateInput build() {
            return new PaymentTokensCreateInput(paypalRequestId, contentType, body);
        }
    }
}
