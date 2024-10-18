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
 * This is a model class for ReauthorizeRequest type.
 */
public class ReauthorizeRequest {
    private Money amount;

    /**
     * Default constructor.
     */
    public ReauthorizeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Money value for amount.
     */
    public ReauthorizeRequest(
            Money amount) {
        this.amount = amount;
    }

    /**
     * Getter for Amount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param amount Value for Money
     */
    @JsonSetter("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * Converts this ReauthorizeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReauthorizeRequest [" + "amount=" + amount + "]";
    }

    /**
     * Builds a new {@link ReauthorizeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReauthorizeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link ReauthorizeRequest}.
     */
    public static class Builder {
        private Money amount;



        /**
         * Setter for amount.
         * @param  amount  Money value for amount.
         * @return Builder
         */
        public Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link ReauthorizeRequest} object using the set fields.
         * @return {@link ReauthorizeRequest}
         */
        public ReauthorizeRequest build() {
            return new ReauthorizeRequest(amount);
        }
    }
}
