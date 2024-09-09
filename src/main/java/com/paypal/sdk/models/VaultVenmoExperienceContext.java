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
 * This is a model class for VaultVenmoExperienceContext type.
 */
public class VaultVenmoExperienceContext {
    private String brandName;
    private String shippingPreference;
    private String vaultInstruction;

    /**
     * Default constructor.
     */
    public VaultVenmoExperienceContext() {
        shippingPreference = "GET_FROM_FILE";
        vaultInstruction = "ON_CREATE_PAYMENT_TOKENS";
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  shippingPreference  String value for shippingPreference.
     * @param  vaultInstruction  String value for vaultInstruction.
     */
    public VaultVenmoExperienceContext(
            String brandName,
            String shippingPreference,
            String vaultInstruction) {
        this.brandName = brandName;
        this.shippingPreference = shippingPreference;
        this.vaultInstruction = vaultInstruction;
    }

    /**
     * Getter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @param brandName Value for String
     */
    @JsonSetter("brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Getter for ShippingPreference.
     * The shipping preference. This only applies to PayPal payment source.
     * @return Returns the String
     */
    @JsonGetter("shipping_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getShippingPreference() {
        return shippingPreference;
    }

    /**
     * Setter for ShippingPreference.
     * The shipping preference. This only applies to PayPal payment source.
     * @param shippingPreference Value for String
     */
    @JsonSetter("shipping_preference")
    public void setShippingPreference(String shippingPreference) {
        this.shippingPreference = shippingPreference;
    }

    /**
     * Getter for VaultInstruction.
     * Vault Instruction on action to be performed after a successful payer approval.
     * @return Returns the String
     */
    @JsonGetter("vault_instruction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultInstruction() {
        return vaultInstruction;
    }

    /**
     * Setter for VaultInstruction.
     * Vault Instruction on action to be performed after a successful payer approval.
     * @param vaultInstruction Value for String
     */
    @JsonSetter("vault_instruction")
    public void setVaultInstruction(String vaultInstruction) {
        this.vaultInstruction = vaultInstruction;
    }

    /**
     * Converts this VaultVenmoExperienceContext into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VaultVenmoExperienceContext [" + "brandName=" + brandName + ", shippingPreference="
                + shippingPreference + ", vaultInstruction=" + vaultInstruction + "]";
    }

    /**
     * Builds a new {@link VaultVenmoExperienceContext.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VaultVenmoExperienceContext.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .shippingPreference(getShippingPreference())
                .vaultInstruction(getVaultInstruction());
        return builder;
    }

    /**
     * Class to build instances of {@link VaultVenmoExperienceContext}.
     */
    public static class Builder {
        private String brandName;
        private String shippingPreference = "GET_FROM_FILE";
        private String vaultInstruction = "ON_CREATE_PAYMENT_TOKENS";



        /**
         * Setter for brandName.
         * @param  brandName  String value for brandName.
         * @return Builder
         */
        public Builder brandName(String brandName) {
            this.brandName = brandName;
            return this;
        }

        /**
         * Setter for shippingPreference.
         * @param  shippingPreference  String value for shippingPreference.
         * @return Builder
         */
        public Builder shippingPreference(String shippingPreference) {
            this.shippingPreference = shippingPreference;
            return this;
        }

        /**
         * Setter for vaultInstruction.
         * @param  vaultInstruction  String value for vaultInstruction.
         * @return Builder
         */
        public Builder vaultInstruction(String vaultInstruction) {
            this.vaultInstruction = vaultInstruction;
            return this;
        }

        /**
         * Builds a new {@link VaultVenmoExperienceContext} object using the set fields.
         * @return {@link VaultVenmoExperienceContext}
         */
        public VaultVenmoExperienceContext build() {
            return new VaultVenmoExperienceContext(brandName, shippingPreference, vaultInstruction);
        }
    }
}