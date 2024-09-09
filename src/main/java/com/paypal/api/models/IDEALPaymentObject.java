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
 * This is a model class for IDEALPaymentObject type.
 */
public class IDEALPaymentObject {
    private String name;
    private String countryCode;
    private String bic;
    private String ibanLastChars;

    /**
     * Default constructor.
     */
    public IDEALPaymentObject() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  bic  String value for bic.
     * @param  ibanLastChars  String value for ibanLastChars.
     */
    public IDEALPaymentObject(
            String name,
            String countryCode,
            String bic,
            String ibanLastChars) {
        this.name = name;
        this.countryCode = countryCode;
        this.bic = bic;
        this.ibanLastChars = ibanLastChars;
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
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
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
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
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
     * Getter for IbanLastChars.
     * The last characters of the IBAN used to pay.
     * @return Returns the String
     */
    @JsonGetter("iban_last_chars")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIbanLastChars() {
        return ibanLastChars;
    }

    /**
     * Setter for IbanLastChars.
     * The last characters of the IBAN used to pay.
     * @param ibanLastChars Value for String
     */
    @JsonSetter("iban_last_chars")
    public void setIbanLastChars(String ibanLastChars) {
        this.ibanLastChars = ibanLastChars;
    }

    /**
     * Converts this IDEALPaymentObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IDEALPaymentObject [" + "name=" + name + ", countryCode=" + countryCode + ", bic="
                + bic + ", ibanLastChars=" + ibanLastChars + "]";
    }

    /**
     * Builds a new {@link IDEALPaymentObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IDEALPaymentObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .countryCode(getCountryCode())
                .bic(getBic())
                .ibanLastChars(getIbanLastChars());
        return builder;
    }

    /**
     * Class to build instances of {@link IDEALPaymentObject}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private String bic;
        private String ibanLastChars;



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
         * Setter for ibanLastChars.
         * @param  ibanLastChars  String value for ibanLastChars.
         * @return Builder
         */
        public Builder ibanLastChars(String ibanLastChars) {
            this.ibanLastChars = ibanLastChars;
            return this;
        }

        /**
         * Builds a new {@link IDEALPaymentObject} object using the set fields.
         * @return {@link IDEALPaymentObject}
         */
        public IDEALPaymentObject build() {
            return new IDEALPaymentObject(name, countryCode, bic, ibanLastChars);
        }
    }
}