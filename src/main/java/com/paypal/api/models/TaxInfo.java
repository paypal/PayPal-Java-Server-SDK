/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for TaxInfo type.
 */
public class TaxInfo {
    private String taxId;
    private TaxIdType taxIdType;

    /**
     * Default constructor.
     */
    public TaxInfo() {
    }

    /**
     * Initialization constructor.
     * @param  taxId  String value for taxId.
     * @param  taxIdType  TaxIdType value for taxIdType.
     */
    public TaxInfo(
            String taxId,
            TaxIdType taxIdType) {
        this.taxId = taxId;
        this.taxIdType = taxIdType;
    }

    /**
     * Getter for TaxId.
     * The customer's tax ID value.
     * @return Returns the String
     */
    @JsonGetter("tax_id")
    public String getTaxId() {
        return taxId;
    }

    /**
     * Setter for TaxId.
     * The customer's tax ID value.
     * @param taxId Value for String
     */
    @JsonSetter("tax_id")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Getter for TaxIdType.
     * The customer's tax ID type.
     * @return Returns the TaxIdType
     */
    @JsonGetter("tax_id_type")
    public TaxIdType getTaxIdType() {
        return taxIdType;
    }

    /**
     * Setter for TaxIdType.
     * The customer's tax ID type.
     * @param taxIdType Value for TaxIdType
     */
    @JsonSetter("tax_id_type")
    public void setTaxIdType(TaxIdType taxIdType) {
        this.taxIdType = taxIdType;
    }

    /**
     * Converts this TaxInfo into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TaxInfo [" + "taxId=" + taxId + ", taxIdType=" + taxIdType + "]";
    }

    /**
     * Builds a new {@link TaxInfo.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TaxInfo.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(taxId, taxIdType);
        return builder;
    }

    /**
     * Class to build instances of {@link TaxInfo}.
     */
    public static class Builder {
        private String taxId;
        private TaxIdType taxIdType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  taxId  String value for taxId.
         * @param  taxIdType  TaxIdType value for taxIdType.
         */
        public Builder(String taxId, TaxIdType taxIdType) {
            this.taxId = taxId;
            this.taxIdType = taxIdType;
        }

        /**
         * Setter for taxId.
         * @param  taxId  String value for taxId.
         * @return Builder
         */
        public Builder taxId(String taxId) {
            this.taxId = taxId;
            return this;
        }

        /**
         * Setter for taxIdType.
         * @param  taxIdType  TaxIdType value for taxIdType.
         * @return Builder
         */
        public Builder taxIdType(TaxIdType taxIdType) {
            this.taxIdType = taxIdType;
            return this;
        }

        /**
         * Builds a new {@link TaxInfo} object using the set fields.
         * @return {@link TaxInfo}
         */
        public TaxInfo build() {
            return new TaxInfo(taxId, taxIdType);
        }
    }
}
