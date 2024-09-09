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
 * This is a model class for VenmoWalletExperienceContext type.
 */
public class VenmoWalletExperienceContext {
    private String brandName;
    private ShippingPreference shippingPreference;

    /**
     * Default constructor.
     */
    public VenmoWalletExperienceContext() {
        shippingPreference = ShippingPreference.GET_FROM_FILE;
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  shippingPreference  ShippingPreference value for shippingPreference.
     */
    public VenmoWalletExperienceContext(
            String brandName,
            ShippingPreference shippingPreference) {
        this.brandName = brandName;
        this.shippingPreference = shippingPreference;
    }

    /**
     * Getter for BrandName.
     * The business name of the merchant. The pattern is defined by an external party and supports
     * Unicode.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * The business name of the merchant. The pattern is defined by an external party and supports
     * Unicode.
     * @param brandName Value for String
     */
    @JsonSetter("brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Getter for ShippingPreference.
     * The location from which the shipping address is derived.
     * @return Returns the ShippingPreference
     */
    @JsonGetter("shipping_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingPreference getShippingPreference() {
        return shippingPreference;
    }

    /**
     * Setter for ShippingPreference.
     * The location from which the shipping address is derived.
     * @param shippingPreference Value for ShippingPreference
     */
    @JsonSetter("shipping_preference")
    public void setShippingPreference(ShippingPreference shippingPreference) {
        this.shippingPreference = shippingPreference;
    }

    /**
     * Converts this VenmoWalletExperienceContext into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VenmoWalletExperienceContext [" + "brandName=" + brandName + ", shippingPreference="
                + shippingPreference + "]";
    }

    /**
     * Builds a new {@link VenmoWalletExperienceContext.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VenmoWalletExperienceContext.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .shippingPreference(getShippingPreference());
        return builder;
    }

    /**
     * Class to build instances of {@link VenmoWalletExperienceContext}.
     */
    public static class Builder {
        private String brandName;
        private ShippingPreference shippingPreference = ShippingPreference.GET_FROM_FILE;



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
         * @param  shippingPreference  ShippingPreference value for shippingPreference.
         * @return Builder
         */
        public Builder shippingPreference(ShippingPreference shippingPreference) {
            this.shippingPreference = shippingPreference;
            return this;
        }

        /**
         * Builds a new {@link VenmoWalletExperienceContext} object using the set fields.
         * @return {@link VenmoWalletExperienceContext}
         */
        public VenmoWalletExperienceContext build() {
            return new VenmoWalletExperienceContext(brandName, shippingPreference);
        }
    }
}
