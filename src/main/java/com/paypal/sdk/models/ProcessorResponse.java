/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ProcessorResponse type.
 */
public class ProcessorResponse {
    private AVSCode avsCode;
    private CVVCode cvvCode;
    private ProcessorResponseCode responseCode;
    private PaymentAdviceCode paymentAdviceCode;

    /**
     * Default constructor.
     */
    public ProcessorResponse() {
    }

    /**
     * Initialization constructor.
     * @param  avsCode  AVSCode value for avsCode.
     * @param  cvvCode  CVVCode value for cvvCode.
     * @param  responseCode  ProcessorResponseCode value for responseCode.
     * @param  paymentAdviceCode  PaymentAdviceCode value for paymentAdviceCode.
     */
    public ProcessorResponse(
            AVSCode avsCode,
            CVVCode cvvCode,
            ProcessorResponseCode responseCode,
            PaymentAdviceCode paymentAdviceCode) {
        this.avsCode = avsCode;
        this.cvvCode = cvvCode;
        this.responseCode = responseCode;
        this.paymentAdviceCode = paymentAdviceCode;
    }

    /**
     * Getter for AvsCode.
     * The address verification code for Visa, Discover, Mastercard, or American Express
     * transactions.
     * @return Returns the AVSCode
     */
    @JsonGetter("avs_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AVSCode getAvsCode() {
        return avsCode;
    }

    /**
     * Setter for AvsCode.
     * The address verification code for Visa, Discover, Mastercard, or American Express
     * transactions.
     * @param avsCode Value for AVSCode
     */
    @JsonSetter("avs_code")
    public void setAvsCode(AVSCode avsCode) {
        this.avsCode = avsCode;
    }

    /**
     * Getter for CvvCode.
     * The card verification value code for for Visa, Discover, Mastercard, or American Express.
     * @return Returns the CVVCode
     */
    @JsonGetter("cvv_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CVVCode getCvvCode() {
        return cvvCode;
    }

    /**
     * Setter for CvvCode.
     * The card verification value code for for Visa, Discover, Mastercard, or American Express.
     * @param cvvCode Value for CVVCode
     */
    @JsonSetter("cvv_code")
    public void setCvvCode(CVVCode cvvCode) {
        this.cvvCode = cvvCode;
    }

    /**
     * Getter for ResponseCode.
     * Processor response code for the non-PayPal payment processor errors.
     * @return Returns the ProcessorResponseCode
     */
    @JsonGetter("response_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessorResponseCode getResponseCode() {
        return responseCode;
    }

    /**
     * Setter for ResponseCode.
     * Processor response code for the non-PayPal payment processor errors.
     * @param responseCode Value for ProcessorResponseCode
     */
    @JsonSetter("response_code")
    public void setResponseCode(ProcessorResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Getter for PaymentAdviceCode.
     * The declined payment transactions might have payment advice codes. The card networks, like
     * Visa and Mastercard, return payment advice codes.
     * @return Returns the PaymentAdviceCode
     */
    @JsonGetter("payment_advice_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentAdviceCode getPaymentAdviceCode() {
        return paymentAdviceCode;
    }

    /**
     * Setter for PaymentAdviceCode.
     * The declined payment transactions might have payment advice codes. The card networks, like
     * Visa and Mastercard, return payment advice codes.
     * @param paymentAdviceCode Value for PaymentAdviceCode
     */
    @JsonSetter("payment_advice_code")
    public void setPaymentAdviceCode(PaymentAdviceCode paymentAdviceCode) {
        this.paymentAdviceCode = paymentAdviceCode;
    }

    /**
     * Converts this ProcessorResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProcessorResponse [" + "avsCode=" + avsCode + ", cvvCode=" + cvvCode
                + ", responseCode=" + responseCode + ", paymentAdviceCode=" + paymentAdviceCode
                + "]";
    }

    /**
     * Builds a new {@link ProcessorResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProcessorResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .avsCode(getAvsCode())
                .cvvCode(getCvvCode())
                .responseCode(getResponseCode())
                .paymentAdviceCode(getPaymentAdviceCode());
        return builder;
    }

    /**
     * Class to build instances of {@link ProcessorResponse}.
     */
    public static class Builder {
        private AVSCode avsCode;
        private CVVCode cvvCode;
        private ProcessorResponseCode responseCode;
        private PaymentAdviceCode paymentAdviceCode;



        /**
         * Setter for avsCode.
         * @param  avsCode  AVSCode value for avsCode.
         * @return Builder
         */
        public Builder avsCode(AVSCode avsCode) {
            this.avsCode = avsCode;
            return this;
        }

        /**
         * Setter for cvvCode.
         * @param  cvvCode  CVVCode value for cvvCode.
         * @return Builder
         */
        public Builder cvvCode(CVVCode cvvCode) {
            this.cvvCode = cvvCode;
            return this;
        }

        /**
         * Setter for responseCode.
         * @param  responseCode  ProcessorResponseCode value for responseCode.
         * @return Builder
         */
        public Builder responseCode(ProcessorResponseCode responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * Setter for paymentAdviceCode.
         * @param  paymentAdviceCode  PaymentAdviceCode value for paymentAdviceCode.
         * @return Builder
         */
        public Builder paymentAdviceCode(PaymentAdviceCode paymentAdviceCode) {
            this.paymentAdviceCode = paymentAdviceCode;
            return this;
        }

        /**
         * Builds a new {@link ProcessorResponse} object using the set fields.
         * @return {@link ProcessorResponse}
         */
        public ProcessorResponse build() {
            return new ProcessorResponse(avsCode, cvvCode, responseCode, paymentAdviceCode);
        }
    }
}
