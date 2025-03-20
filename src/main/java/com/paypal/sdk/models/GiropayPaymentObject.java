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
 * This is a model class for GiropayPaymentObject type.
 */
public class GiropayPaymentObject {
    private String name;
    private String countryCode;
    private String bic;

    /**
     * Default constructor.
     */
    public GiropayPaymentObject() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  bic  String value for bic.
     */
    public GiropayPaymentObject(
            String name,
            String countryCode,
            String bic) {
        this.name = name;
        this.countryCode = countryCode;
        this.bic = bic;
    }

    /**
     * Getter for Name.
     * The full name representation like Mr J Smith.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The full name representation like Mr J Smith.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region. Note: The country code for Great Britain is GB and not UK as used in the
     * top-level domain names for that country. Use the `C2` country code for China worldwide for
     * comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.
     * @return Returns the String
     */
    @JsonGetter("country_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region. Note: The country code for Great Britain is GB and not UK as used in the
     * top-level domain names for that country. Use the `C2` country code for China worldwide for
     * comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Bic.
     * The business identification code (BIC). In payments systems, a BIC is used to identify a
     * specific business, most commonly a bank.
     * @return Returns the String
     */
    @JsonGetter("bic")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBic() {
        return bic;
    }

    /**
     * Setter for Bic.
     * The business identification code (BIC). In payments systems, a BIC is used to identify a
     * specific business, most commonly a bank.
     * @param bic Value for String
     */
    @JsonSetter("bic")
    public void setBic(String bic) {
        this.bic = bic;
    }

    /**
     * Converts this GiropayPaymentObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GiropayPaymentObject [" + "name=" + name + ", countryCode=" + countryCode + ", bic="
                + bic + "]";
    }

    /**
     * Builds a new {@link GiropayPaymentObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GiropayPaymentObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .countryCode(getCountryCode())
                .bic(getBic());
        return builder;
    }

    /**
     * Class to build instances of {@link GiropayPaymentObject}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private String bic;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for bic.
         * @param  bic  String value for bic.
         * @return Builder
         */
        public Builder bic(String bic) {
            this.bic = bic;
            return this;
        }

        /**
         * Builds a new {@link GiropayPaymentObject} object using the set fields.
         * @return {@link GiropayPaymentObject}
         */
        public GiropayPaymentObject build() {
            return new GiropayPaymentObject(name, countryCode, bic);
        }
    }
}
