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
 * This is a model class for PaypalWalletAttributes type.
 */
public class PaypalWalletAttributes {
    private PaypalWalletCustomerRequest customer;
    private PaypalWalletVaultInstruction vault;

    /**
     * Default constructor.
     */
    public PaypalWalletAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  customer  PaypalWalletCustomerRequest value for customer.
     * @param  vault  PaypalWalletVaultInstruction value for vault.
     */
    public PaypalWalletAttributes(
            PaypalWalletCustomerRequest customer,
            PaypalWalletVaultInstruction vault) {
        this.customer = customer;
        this.vault = vault;
    }

    /**
     * Getter for Customer.
     * @return Returns the PaypalWalletCustomerRequest
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletCustomerRequest getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for PaypalWalletCustomerRequest
     */
    @JsonSetter("customer")
    public void setCustomer(PaypalWalletCustomerRequest customer) {
        this.customer = customer;
    }

    /**
     * Getter for Vault.
     * @return Returns the PaypalWalletVaultInstruction
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletVaultInstruction getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * @param vault Value for PaypalWalletVaultInstruction
     */
    @JsonSetter("vault")
    public void setVault(PaypalWalletVaultInstruction vault) {
        this.vault = vault;
    }

    /**
     * Converts this PaypalWalletAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaypalWalletAttributes [" + "customer=" + customer + ", vault=" + vault + "]";
    }

    /**
     * Builds a new {@link PaypalWalletAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaypalWalletAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link PaypalWalletAttributes}.
     */
    public static class Builder {
        private PaypalWalletCustomerRequest customer;
        private PaypalWalletVaultInstruction vault;



        /**
         * Setter for customer.
         * @param  customer  PaypalWalletCustomerRequest value for customer.
         * @return Builder
         */
        public Builder customer(PaypalWalletCustomerRequest customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for vault.
         * @param  vault  PaypalWalletVaultInstruction value for vault.
         * @return Builder
         */
        public Builder vault(PaypalWalletVaultInstruction vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link PaypalWalletAttributes} object using the set fields.
         * @return {@link PaypalWalletAttributes}
         */
        public PaypalWalletAttributes build() {
            return new PaypalWalletAttributes(customer, vault);
        }
    }
}