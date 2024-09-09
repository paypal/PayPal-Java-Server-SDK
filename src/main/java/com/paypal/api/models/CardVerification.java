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
 * This is a model class for CardVerification type.
 */
public class CardVerification {
    private CardVerificationMethod method;

    /**
     * Default constructor.
     */
    public CardVerification() {
        method = CardVerificationMethod.SCA_WHEN_REQUIRED;
    }

    /**
     * Initialization constructor.
     * @param  method  CardVerificationMethod value for method.
     */
    public CardVerification(
            CardVerificationMethod method) {
        this.method = method;
    }

    /**
     * Getter for Method.
     * The method used for card verification.
     * @return Returns the CardVerificationMethod
     */
    @JsonGetter("method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardVerificationMethod getMethod() {
        return method;
    }

    /**
     * Setter for Method.
     * The method used for card verification.
     * @param method Value for CardVerificationMethod
     */
    @JsonSetter("method")
    public void setMethod(CardVerificationMethod method) {
        this.method = method;
    }

    /**
     * Converts this CardVerification into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardVerification [" + "method=" + method + "]";
    }

    /**
     * Builds a new {@link CardVerification.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardVerification.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .method(getMethod());
        return builder;
    }

    /**
     * Class to build instances of {@link CardVerification}.
     */
    public static class Builder {
        private CardVerificationMethod method = CardVerificationMethod.SCA_WHEN_REQUIRED;



        /**
         * Setter for method.
         * @param  method  CardVerificationMethod value for method.
         * @return Builder
         */
        public Builder method(CardVerificationMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Builds a new {@link CardVerification} object using the set fields.
         * @return {@link CardVerification}
         */
        public CardVerification build() {
            return new CardVerification(method);
        }
    }
}