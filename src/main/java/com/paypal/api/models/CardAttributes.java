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
 * This is a model class for CardAttributes type.
 */
public class CardAttributes {
    private CardCustomerInformation customer;
    private VaultInstructionBase vault;
    private CardVerification verification;

    /**
     * Default constructor.
     */
    public CardAttributes() {
    }

    /**
     * Initialization constructor.
     * @param  customer  CardCustomerInformation value for customer.
     * @param  vault  VaultInstructionBase value for vault.
     * @param  verification  CardVerification value for verification.
     */
    public CardAttributes(
            CardCustomerInformation customer,
            VaultInstructionBase vault,
            CardVerification verification) {
        this.customer = customer;
        this.vault = vault;
        this.verification = verification;
    }

    /**
     * Getter for Customer.
     * The details about a customer in PayPal's system of record.
     * @return Returns the CardCustomerInformation
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardCustomerInformation getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * The details about a customer in PayPal's system of record.
     * @param customer Value for CardCustomerInformation
     */
    @JsonSetter("customer")
    public void setCustomer(CardCustomerInformation customer) {
        this.customer = customer;
    }

    /**
     * Getter for Vault.
     * Basic vault instruction specification that can be extended by specific payment sources that
     * supports vaulting.
     * @return Returns the VaultInstructionBase
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionBase getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * Basic vault instruction specification that can be extended by specific payment sources that
     * supports vaulting.
     * @param vault Value for VaultInstructionBase
     */
    @JsonSetter("vault")
    public void setVault(VaultInstructionBase vault) {
        this.vault = vault;
    }

    /**
     * Getter for Verification.
     * The API caller can opt in to verify the card through PayPal offered verification services
     * (e.g. Smart Dollar Auth, 3DS).
     * @return Returns the CardVerification
     */
    @JsonGetter("verification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CardVerification getVerification() {
        return verification;
    }

    /**
     * Setter for Verification.
     * The API caller can opt in to verify the card through PayPal offered verification services
     * (e.g. Smart Dollar Auth, 3DS).
     * @param verification Value for CardVerification
     */
    @JsonSetter("verification")
    public void setVerification(CardVerification verification) {
        this.verification = verification;
    }

    /**
     * Converts this CardAttributes into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardAttributes [" + "customer=" + customer + ", vault=" + vault + ", verification="
                + verification + "]";
    }

    /**
     * Builds a new {@link CardAttributes.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardAttributes.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customer(getCustomer())
                .vault(getVault())
                .verification(getVerification());
        return builder;
    }

    /**
     * Class to build instances of {@link CardAttributes}.
     */
    public static class Builder {
        private CardCustomerInformation customer;
        private VaultInstructionBase vault;
        private CardVerification verification;



        /**
         * Setter for customer.
         * @param  customer  CardCustomerInformation value for customer.
         * @return Builder
         */
        public Builder customer(CardCustomerInformation customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for vault.
         * @param  vault  VaultInstructionBase value for vault.
         * @return Builder
         */
        public Builder vault(VaultInstructionBase vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Setter for verification.
         * @param  verification  CardVerification value for verification.
         * @return Builder
         */
        public Builder verification(CardVerification verification) {
            this.verification = verification;
            return this;
        }

        /**
         * Builds a new {@link CardAttributes} object using the set fields.
         * @return {@link CardAttributes}
         */
        public CardAttributes build() {
            return new CardAttributes(customer, vault, verification);
        }
    }
}
