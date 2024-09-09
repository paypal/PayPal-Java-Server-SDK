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
 * This is a model class for NetAmountBreakdownItem type.
 */
public class NetAmountBreakdownItem {
    private Money payableAmount;
    private Money convertedAmount;
    private ExchangeRate exchangeRate;

    /**
     * Default constructor.
     */
    public NetAmountBreakdownItem() {
    }

    /**
     * Initialization constructor.
     * @param  payableAmount  Money value for payableAmount.
     * @param  convertedAmount  Money value for convertedAmount.
     * @param  exchangeRate  ExchangeRate value for exchangeRate.
     */
    public NetAmountBreakdownItem(
            Money payableAmount,
            Money convertedAmount,
            ExchangeRate exchangeRate) {
        this.payableAmount = payableAmount;
        this.convertedAmount = convertedAmount;
        this.exchangeRate = exchangeRate;
    }

    /**
     * Getter for PayableAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("payable_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getPayableAmount() {
        return payableAmount;
    }

    /**
     * Setter for PayableAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param payableAmount Value for Money
     */
    @JsonSetter("payable_amount")
    public void setPayableAmount(Money payableAmount) {
        this.payableAmount = payableAmount;
    }

    /**
     * Getter for ConvertedAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("converted_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getConvertedAmount() {
        return convertedAmount;
    }

    /**
     * Setter for ConvertedAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param convertedAmount Value for Money
     */
    @JsonSetter("converted_amount")
    public void setConvertedAmount(Money convertedAmount) {
        this.convertedAmount = convertedAmount;
    }

    /**
     * Getter for ExchangeRate.
     * The exchange rate that determines the amount to convert from one currency to another
     * currency.
     * @return Returns the ExchangeRate
     */
    @JsonGetter("exchange_rate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Setter for ExchangeRate.
     * The exchange rate that determines the amount to convert from one currency to another
     * currency.
     * @param exchangeRate Value for ExchangeRate
     */
    @JsonSetter("exchange_rate")
    public void setExchangeRate(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * Converts this NetAmountBreakdownItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NetAmountBreakdownItem [" + "payableAmount=" + payableAmount + ", convertedAmount="
                + convertedAmount + ", exchangeRate=" + exchangeRate + "]";
    }

    /**
     * Builds a new {@link NetAmountBreakdownItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NetAmountBreakdownItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payableAmount(getPayableAmount())
                .convertedAmount(getConvertedAmount())
                .exchangeRate(getExchangeRate());
        return builder;
    }

    /**
     * Class to build instances of {@link NetAmountBreakdownItem}.
     */
    public static class Builder {
        private Money payableAmount;
        private Money convertedAmount;
        private ExchangeRate exchangeRate;



        /**
         * Setter for payableAmount.
         * @param  payableAmount  Money value for payableAmount.
         * @return Builder
         */
        public Builder payableAmount(Money payableAmount) {
            this.payableAmount = payableAmount;
            return this;
        }

        /**
         * Setter for convertedAmount.
         * @param  convertedAmount  Money value for convertedAmount.
         * @return Builder
         */
        public Builder convertedAmount(Money convertedAmount) {
            this.convertedAmount = convertedAmount;
            return this;
        }

        /**
         * Setter for exchangeRate.
         * @param  exchangeRate  ExchangeRate value for exchangeRate.
         * @return Builder
         */
        public Builder exchangeRate(ExchangeRate exchangeRate) {
            this.exchangeRate = exchangeRate;
            return this;
        }

        /**
         * Builds a new {@link NetAmountBreakdownItem} object using the set fields.
         * @return {@link NetAmountBreakdownItem}
         */
        public NetAmountBreakdownItem build() {
            return new NetAmountBreakdownItem(payableAmount, convertedAmount, exchangeRate);
        }
    }
}