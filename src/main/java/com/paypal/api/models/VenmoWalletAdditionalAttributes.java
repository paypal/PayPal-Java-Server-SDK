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
 * This is a model class for VenmoWalletAdditionalAttributes type.
 */
public class VenmoWalletAdditionalAttributes {
    private VenmoWalletCustomerInformation customer;
    private VenmoWalletVaultAttributes vault;

    /**
     * Default constructor.
     */
    public VenmoWalletAdditionalAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  customer  VenmoWalletCustomerInformation value for customer.
     * @param  vault  VenmoWalletVaultAttributes value for vault.
     */
    public VenmoWalletAdditionalAttributes(
            VenmoWalletCustomerInformation customer,
            VenmoWalletVaultAttributes vault) {
        this.customer = customer;
        this.vault = vault;
    }

    /**
     * Getter for Customer.
     * The details about a customer in PayPal's system of record.
     * @return Returns the VenmoWalletCustomerInformation
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoWalletCustomerInformation getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * The details about a customer in PayPal's system of record.
     * @param customer Value for VenmoWalletCustomerInformation
     */
    @JsonSetter("customer")
    public void setCustomer(VenmoWalletCustomerInformation customer) {
        this.customer = customer;
    }

    /**
     * Getter for Vault.
     * Resource consolidating common request and response attirbutes for vaulting Venmo Wallet.
     * @return Returns the VenmoWalletVaultAttributes
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VenmoWalletVaultAttributes getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * Resource consolidating common request and response attirbutes for vaulting Venmo Wallet.
     * @param vault Value for VenmoWalletVaultAttributes
     */
    @JsonSetter("vault")
    public void setVault(VenmoWalletVaultAttributes vault) {
        this.vault = vault;
    }

    /**
     * Converts this VenmoWalletAdditionalAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VenmoWalletAdditionalAttributes [" + "customer=" + customer + ", vault=" + vault
                + "]";
    }

    /**
     * Builds a new {@link VenmoWalletAdditionalAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VenmoWalletAdditionalAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link VenmoWalletAdditionalAttributes}.
     */
    public static class Builder {
        private VenmoWalletCustomerInformation customer;
        private VenmoWalletVaultAttributes vault;



        /**
         * Setter for customer.
         * @param  customer  VenmoWalletCustomerInformation value for customer.
         * @return Builder
         */
        public Builder customer(VenmoWalletCustomerInformation customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for vault.
         * @param  vault  VenmoWalletVaultAttributes value for vault.
         * @return Builder
         */
        public Builder vault(VenmoWalletVaultAttributes vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link VenmoWalletAdditionalAttributes} object using the set fields.
         * @return {@link VenmoWalletAdditionalAttributes}
         */
        public VenmoWalletAdditionalAttributes build() {
            return new VenmoWalletAdditionalAttributes(customer, vault);
        }
    }
}