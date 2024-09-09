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
 * This is a model class for CardFromRequest type.
 */
public class CardFromRequest {
    private String expiry;
    private String lastDigits;

    /**
     * Default constructor.
     */
    public CardFromRequest() {
    }

    /**
     * Initialization constructor.
     * @param  expiry  String value for expiry.
     * @param  lastDigits  String value for lastDigits.
     */
    public CardFromRequest(
            String expiry,
            String lastDigits) {
        this.expiry = expiry;
        this.lastDigits = lastDigits;
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
     * Converts this CardFromRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardFromRequest [" + "expiry=" + expiry + ", lastDigits=" + lastDigits + "]";
    }

    /**
     * Builds a new {@link CardFromRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardFromRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .expiry(getExpiry())
                .lastDigits(getLastDigits());
        return builder;
    }

    /**
     * Class to build instances of {@link CardFromRequest}.
     */
    public static class Builder {
        private String expiry;
        private String lastDigits;



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
         * Setter for lastDigits.
         * @param  lastDigits  String value for lastDigits.
         * @return Builder
         */
        public Builder lastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
            return this;
        }

        /**
         * Builds a new {@link CardFromRequest} object using the set fields.
         * @return {@link CardFromRequest}
         */
        public CardFromRequest build() {
            return new CardFromRequest(expiry, lastDigits);
        }
    }
}