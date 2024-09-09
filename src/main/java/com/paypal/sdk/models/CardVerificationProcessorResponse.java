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
 * This is a model class for CardVerificationProcessorResponse type.
 */
public class CardVerificationProcessorResponse {
    private AVSCode avsCode;
    private CVVCode cvvCode;

    /**
     * Default constructor.
     */
    public CardVerificationProcessorResponse() {
    }

    /**
     * Initialization constructor.
     * @param  avsCode  AVSCode value for avsCode.
     * @param  cvvCode  CVVCode value for cvvCode.
     */
    public CardVerificationProcessorResponse(
            AVSCode avsCode,
            CVVCode cvvCode) {
        this.avsCode = avsCode;
        this.cvvCode = cvvCode;
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
     * Converts this CardVerificationProcessorResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardVerificationProcessorResponse [" + "avsCode=" + avsCode + ", cvvCode=" + cvvCode
                + "]";
    }

    /**
     * Builds a new {@link CardVerificationProcessorResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardVerificationProcessorResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .avsCode(getAvsCode())
                .cvvCode(getCvvCode());
        return builder;
    }

    /**
     * Class to build instances of {@link CardVerificationProcessorResponse}.
     */
    public static class Builder {
        private AVSCode avsCode;
        private CVVCode cvvCode;



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
         * Builds a new {@link CardVerificationProcessorResponse} object using the set fields.
         * @return {@link CardVerificationProcessorResponse}
         */
        public CardVerificationProcessorResponse build() {
            return new CardVerificationProcessorResponse(avsCode, cvvCode);
        }
    }
}