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
 * This is a model class for GooglePayCardAttributes type.
 */
public class GooglePayCardAttributes {
    private CardVerification verification;

    /**
     * Default constructor.
     */
    public GooglePayCardAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  verification  CardVerification value for verification.
     */
    public GooglePayCardAttributes(
            CardVerification verification) {
        this.verification = verification;
    }

    /**
     * Getter for Verification.
     * The API caller can opt in to verify the card through PayPal offered verification services
     * (e.g. Smart Dollar Auth, 3DS).
     * @return Returns the CardVerification
     */
    @JsonGetter("verification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardVerification getVerification() {
        return verification;
    }

    /**
     * Setter for Verification.
     * The API caller can opt in to verify the card through PayPal offered verification services
     * (e.g. Smart Dollar Auth, 3DS).
     * @param verification Value for CardVerification
     */
    @JsonSetter("verification")
    public void setVerification(CardVerification verification) {
        this.verification = verification;
    }

    /**
     * Converts this GooglePayCardAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GooglePayCardAttributes [" + "verification=" + verification + "]";
    }

    /**
     * Builds a new {@link GooglePayCardAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GooglePayCardAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .verification(getVerification());
        return builder;
    }

    /**
     * Class to build instances of {@link GooglePayCardAttributes}.
     */
    public static class Builder {
        private CardVerification verification;



        /**
         * Setter for verification.
         * @param  verification  CardVerification value for verification.
         * @return Builder
         */
        public Builder verification(CardVerification verification) {
            this.verification = verification;
            return this;
        }

        /**
         * Builds a new {@link GooglePayCardAttributes} object using the set fields.
         * @return {@link GooglePayCardAttributes}
         */
        public GooglePayCardAttributes build() {
            return new GooglePayCardAttributes(verification);
        }
    }
}
