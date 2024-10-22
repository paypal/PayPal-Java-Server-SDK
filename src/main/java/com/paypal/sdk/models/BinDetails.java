/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for BinDetails type.
 */
public class BinDetails {
    private String bin;
    private String issuingBank;
    private String binCountryCode;
    private List<String> products;

    /**
     * Default constructor.
     */
    public BinDetails() {
    }

    /**
     * Initialization constructor.
     * @param  bin  String value for bin.
     * @param  issuingBank  String value for issuingBank.
     * @param  binCountryCode  String value for binCountryCode.
     * @param  products  List of String value for products.
     */
    public BinDetails(
            String bin,
            String issuingBank,
            String binCountryCode,
            List<String> products) {
        this.bin = bin;
        this.issuingBank = issuingBank;
        this.binCountryCode = binCountryCode;
        this.products = products;
    }

    /**
     * Getter for Bin.
     * The Bank Identification Number (BIN) signifies the number that is being used to identify the
     * granular level details (except the PII information) of the card.
     * @return Returns the String
     */
    @JsonGetter("bin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBin() {
        return bin;
    }

    /**
     * Setter for Bin.
     * The Bank Identification Number (BIN) signifies the number that is being used to identify the
     * granular level details (except the PII information) of the card.
     * @param bin Value for String
     */
    @JsonSetter("bin")
    public void setBin(String bin) {
        this.bin = bin;
    }

    /**
     * Getter for IssuingBank.
     * The issuer of the card instrument.
     * @return Returns the String
     */
    @JsonGetter("issuing_bank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIssuingBank() {
        return issuingBank;
    }

    /**
     * Setter for IssuingBank.
     * The issuer of the card instrument.
     * @param issuingBank Value for String
     */
    @JsonSetter("issuing_bank")
    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    /**
     * Getter for BinCountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("bin_country_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBinCountryCode() {
        return binCountryCode;
    }

    /**
     * Setter for BinCountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @param binCountryCode Value for String
     */
    @JsonSetter("bin_country_code")
    public void setBinCountryCode(String binCountryCode) {
        this.binCountryCode = binCountryCode;
    }

    /**
     * Getter for Products.
     * The type of card product assigned to the BIN by the issuer. These values are defined by the
     * issuer and may change over time. Some examples include: PREPAID_GIFT, CONSUMER, CORPORATE.
     * @return Returns the List of String
     */
    @JsonGetter("products")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getProducts() {
        return products;
    }

    /**
     * Setter for Products.
     * The type of card product assigned to the BIN by the issuer. These values are defined by the
     * issuer and may change over time. Some examples include: PREPAID_GIFT, CONSUMER, CORPORATE.
     * @param products Value for List of String
     */
    @JsonSetter("products")
    public void setProducts(List<String> products) {
        this.products = products;
    }

    /**
     * Converts this BinDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BinDetails [" + "bin=" + bin + ", issuingBank=" + issuingBank + ", binCountryCode="
                + binCountryCode + ", products=" + products + "]";
    }

    /**
     * Builds a new {@link BinDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BinDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .bin(getBin())
                .issuingBank(getIssuingBank())
                .binCountryCode(getBinCountryCode())
                .products(getProducts());
        return builder;
    }

    /**
     * Class to build instances of {@link BinDetails}.
     */
    public static class Builder {
        private String bin;
        private String issuingBank;
        private String binCountryCode;
        private List<String> products;



        /**
         * Setter for bin.
         * @param  bin  String value for bin.
         * @return Builder
         */
        public Builder bin(String bin) {
            this.bin = bin;
            return this;
        }

        /**
         * Setter for issuingBank.
         * @param  issuingBank  String value for issuingBank.
         * @return Builder
         */
        public Builder issuingBank(String issuingBank) {
            this.issuingBank = issuingBank;
            return this;
        }

        /**
         * Setter for binCountryCode.
         * @param  binCountryCode  String value for binCountryCode.
         * @return Builder
         */
        public Builder binCountryCode(String binCountryCode) {
            this.binCountryCode = binCountryCode;
            return this;
        }

        /**
         * Setter for products.
         * @param  products  List of String value for products.
         * @return Builder
         */
        public Builder products(List<String> products) {
            this.products = products;
            return this;
        }

        /**
         * Builds a new {@link BinDetails} object using the set fields.
         * @return {@link BinDetails}
         */
        public BinDetails build() {
            return new BinDetails(bin, issuingBank, binCountryCode, products);
        }
    }
}
