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
 * This is a model class for ApplePayAttributesResponse type.
 */
public class ApplePayAttributesResponse {
    private VaultResponse vault;

    /**
     * Default constructor.
     */
    public ApplePayAttributesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  vault  VaultResponse value for vault.
     */
    public ApplePayAttributesResponse(
            VaultResponse vault) {
        this.vault = vault;
    }

    /**
     * Getter for Vault.
     * The details about a saved payment source.
     * @return Returns the VaultResponse
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultResponse getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * The details about a saved payment source.
     * @param vault Value for VaultResponse
     */
    @JsonSetter("vault")
    public void setVault(VaultResponse vault) {
        this.vault = vault;
    }

    /**
     * Converts this ApplePayAttributesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApplePayAttributesResponse [" + "vault=" + vault + "]";
    }

    /**
     * Builds a new {@link ApplePayAttributesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApplePayAttributesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link ApplePayAttributesResponse}.
     */
    public static class Builder {
        private VaultResponse vault;



        /**
         * Setter for vault.
         * @param  vault  VaultResponse value for vault.
         * @return Builder
         */
        public Builder vault(VaultResponse vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link ApplePayAttributesResponse} object using the set fields.
         * @return {@link ApplePayAttributesResponse}
         */
        public ApplePayAttributesResponse build() {
            return new ApplePayAttributesResponse(vault);
        }
    }
}
