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
 * This is a model class for ApplePayAttributes type.
 */
public class ApplePayAttributes {
    private CustomerInformation customer;
    private VaultInstruction vault;

    /**
     * Default constructor.
     */
    public ApplePayAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  customer  CustomerInformation value for customer.
     * @param  vault  VaultInstruction value for vault.
     */
    public ApplePayAttributes(
            CustomerInformation customer,
            VaultInstruction vault) {
        this.customer = customer;
        this.vault = vault;
    }

    /**
     * Getter for Customer.
     * The details about a customer in PayPal's system of record.
     * @return Returns the CustomerInformation
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerInformation getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * The details about a customer in PayPal's system of record.
     * @param customer Value for CustomerInformation
     */
    @JsonSetter("customer")
    public void setCustomer(CustomerInformation customer) {
        this.customer = customer;
    }

    /**
     * Getter for Vault.
     * Base vaulting specification. The object can be extended for specific use cases within each
     * payment_source that supports vaulting.
     * @return Returns the VaultInstruction
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstruction getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * Base vaulting specification. The object can be extended for specific use cases within each
     * payment_source that supports vaulting.
     * @param vault Value for VaultInstruction
     */
    @JsonSetter("vault")
    public void setVault(VaultInstruction vault) {
        this.vault = vault;
    }

    /**
     * Converts this ApplePayAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayAttributes [" + "customer=" + customer + ", vault=" + vault + "]";
    }

    /**
     * Builds a new {@link ApplePayAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayAttributes}.
     */
    public static class Builder {
        private CustomerInformation customer;
        private VaultInstruction vault;



        /**
         * Setter for customer.
         * @param  customer  CustomerInformation value for customer.
         * @return Builder
         */
        public Builder customer(CustomerInformation customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for vault.
         * @param  vault  VaultInstruction value for vault.
         * @return Builder
         */
        public Builder vault(VaultInstruction vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link ApplePayAttributes} object using the set fields.
         * @return {@link ApplePayAttributes}
         */
        public ApplePayAttributes build() {
            return new ApplePayAttributes(customer, vault);
        }
    }
}
