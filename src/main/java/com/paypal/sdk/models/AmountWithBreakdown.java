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
 * This is a model class for AmountWithBreakdown type.
 */
public class AmountWithBreakdown {
    private String currencyCode;
    private String value;
    private AmountBreakdown breakdown;

    /**
     * Default constructor.
     */
    public AmountWithBreakdown() {
    }

    /**
     * Initialization constructor.
     * @param  currencyCode  String value for currencyCode.
     * @param  value  String value for value.
     * @param  breakdown  AmountBreakdown value for breakdown.
     */
    public AmountWithBreakdown(
            String currencyCode,
            String value,
            AmountBreakdown breakdown) {
        this.currencyCode = currencyCode;
        this.value = value;
        this.breakdown = breakdown;
    }

    /**
     * Getter for CurrencyCode.
     * The [three-character ISO-4217 currency code](/api/rest/reference/currency-codes/) that
     * identifies the currency.
     * @return Returns the String
     */
    @JsonGetter("currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Setter for CurrencyCode.
     * The [three-character ISO-4217 currency code](/api/rest/reference/currency-codes/) that
     * identifies the currency.
     * @param currencyCode Value for String
     */
    @JsonSetter("currency_code")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Getter for Value.
     * The value, which might be:&lt;ul&gt;&lt;li&gt;An integer for currencies like `JPY` that are not typically
     * fractional.&lt;/li&gt;&lt;li&gt;A decimal fraction for currencies like `TND` that are subdivided into
     * thousandths.&lt;/li&gt;&lt;/ul&gt;For the required number of decimal places for a currency code, see
     * [Currency Codes](/api/rest/reference/currency-codes/).
     * @return Returns the String
     */
    @JsonGetter("value")
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value, which might be:&lt;ul&gt;&lt;li&gt;An integer for currencies like `JPY` that are not typically
     * fractional.&lt;/li&gt;&lt;li&gt;A decimal fraction for currencies like `TND` that are subdivided into
     * thousandths.&lt;/li&gt;&lt;/ul&gt;For the required number of decimal places for a currency code, see
     * [Currency Codes](/api/rest/reference/currency-codes/).
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for Breakdown.
     * The breakdown of the amount. Breakdown provides details such as total item amount, total tax
     * amount, shipping, handling, insurance, and discounts, if any.
     * @return Returns the AmountBreakdown
     */
    @JsonGetter("breakdown")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AmountBreakdown getBreakdown() {
        return breakdown;
    }

    /**
     * Setter for Breakdown.
     * The breakdown of the amount. Breakdown provides details such as total item amount, total tax
     * amount, shipping, handling, insurance, and discounts, if any.
     * @param breakdown Value for AmountBreakdown
     */
    @JsonSetter("breakdown")
    public void setBreakdown(AmountBreakdown breakdown) {
        this.breakdown = breakdown;
    }

    /**
     * Converts this AmountWithBreakdown into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AmountWithBreakdown [" + "currencyCode=" + currencyCode + ", value=" + value
                + ", breakdown=" + breakdown + "]";
    }

    /**
     * Builds a new {@link AmountWithBreakdown.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AmountWithBreakdown.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencyCode, value)
                .breakdown(getBreakdown());
        return builder;
    }

    /**
     * Class to build instances of {@link AmountWithBreakdown}.
     */
    public static class Builder {
        private String currencyCode;
        private String value;
        private AmountBreakdown breakdown;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencyCode  String value for currencyCode.
         * @param  value  String value for value.
         */
        public Builder(String currencyCode, String value) {
            this.currencyCode = currencyCode;
            this.value = value;
        }

        /**
         * Setter for currencyCode.
         * @param  currencyCode  String value for currencyCode.
         * @return Builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for breakdown.
         * @param  breakdown  AmountBreakdown value for breakdown.
         * @return Builder
         */
        public Builder breakdown(AmountBreakdown breakdown) {
            this.breakdown = breakdown;
            return this;
        }

        /**
         * Builds a new {@link AmountWithBreakdown} object using the set fields.
         * @return {@link AmountWithBreakdown}
         */
        public AmountWithBreakdown build() {
            return new AmountWithBreakdown(currencyCode, value, breakdown);
        }
    }
}
