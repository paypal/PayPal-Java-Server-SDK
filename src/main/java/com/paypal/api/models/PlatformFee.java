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
 * This is a model class for PlatformFee type.
 */
public class PlatformFee {
    private Money amount;
    private PayeeBase payee;

    /**
     * Default constructor.
     */
    public PlatformFee() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Money value for amount.
     * @param  payee  PayeeBase value for payee.
     */
    public PlatformFee(
            Money amount,
            PayeeBase payee) {
        this.amount = amount;
        this.payee = payee;
    }

    /**
     * Getter for Amount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("amount")
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
     * Getter for Payee.
     * The details for the merchant who receives the funds and fulfills the order. The merchant is
     * also known as the payee.
     * @return Returns the PayeeBase
     */
    @JsonGetter("payee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeBase getPayee() {
        return payee;
    }

    /**
     * Setter for Payee.
     * The details for the merchant who receives the funds and fulfills the order. The merchant is
     * also known as the payee.
     * @param payee Value for PayeeBase
     */
    @JsonSetter("payee")
    public void setPayee(PayeeBase payee) {
        this.payee = payee;
    }

    /**
     * Converts this PlatformFee into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PlatformFee [" + "amount=" + amount + ", payee=" + payee + "]";
    }

    /**
     * Builds a new {@link PlatformFee.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PlatformFee.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amount)
                .payee(getPayee());
        return builder;
    }

    /**
     * Class to build instances of {@link PlatformFee}.
     */
    public static class Builder {
        private Money amount;
        private PayeeBase payee;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  amount  Money value for amount.
         */
        public Builder(Money amount) {
            this.amount = amount;
        }

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
         * Setter for payee.
         * @param  payee  PayeeBase value for payee.
         * @return Builder
         */
        public Builder payee(PayeeBase payee) {
            this.payee = payee;
            return this;
        }

        /**
         * Builds a new {@link PlatformFee} object using the set fields.
         * @return {@link PlatformFee}
         */
        public PlatformFee build() {
            return new PlatformFee(amount, payee);
        }
    }
}
