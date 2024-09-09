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
 * This is a model class for VaultCustomer type.
 */
public class VaultCustomer {
    private String id;

    /**
     * Default constructor.
     */
    public VaultCustomer() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     */
    public VaultCustomer(
            String id) {
        this.id = id;
    }

    /**
     * Getter for Id.
     * The unique ID for a customer generated by PayPal.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The unique ID for a customer generated by PayPal.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this VaultCustomer into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VaultCustomer [" + "id=" + id + "]";
    }

    /**
     * Builds a new {@link VaultCustomer.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VaultCustomer.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId());
        return builder;
    }

    /**
     * Class to build instances of {@link VaultCustomer}.
     */
    public static class Builder {
        private String id;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link VaultCustomer} object using the set fields.
         * @return {@link VaultCustomer}
         */
        public VaultCustomer build() {
            return new VaultCustomer(id);
        }
    }
}