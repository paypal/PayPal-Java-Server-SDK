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
 * This is a model class for PaypalWalletAttributesResponse type.
 */
public class PaypalWalletAttributesResponse {
    private PaypalWalletVaultResponse vault;
    private List<CobrandedCard> cobrandedCards;

    /**
     * Default constructor.
     */
    public PaypalWalletAttributesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  vault  PaypalWalletVaultResponse value for vault.
     * @param  cobrandedCards  List of CobrandedCard value for cobrandedCards.
     */
    public PaypalWalletAttributesResponse(
            PaypalWalletVaultResponse vault,
            List<CobrandedCard> cobrandedCards) {
        this.vault = vault;
        this.cobrandedCards = cobrandedCards;
    }

    /**
     * Getter for Vault.
     * The details about a saved PayPal Wallet payment source.
     * @return Returns the PaypalWalletVaultResponse
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletVaultResponse getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * The details about a saved PayPal Wallet payment source.
     * @param vault Value for PaypalWalletVaultResponse
     */
    @JsonSetter("vault")
    public void setVault(PaypalWalletVaultResponse vault) {
        this.vault = vault;
    }

    /**
     * Getter for CobrandedCards.
     * An array of merchant cobranded cards used by buyer to complete an order. This array will be
     * present if a merchant has onboarded their cobranded card with PayPal and provided
     * corresponding label(s).
     * @return Returns the List of CobrandedCard
     */
    @JsonGetter("cobranded_cards")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CobrandedCard> getCobrandedCards() {
        return cobrandedCards;
    }

    /**
     * Setter for CobrandedCards.
     * An array of merchant cobranded cards used by buyer to complete an order. This array will be
     * present if a merchant has onboarded their cobranded card with PayPal and provided
     * corresponding label(s).
     * @param cobrandedCards Value for List of CobrandedCard
     */
    @JsonSetter("cobranded_cards")
    public void setCobrandedCards(List<CobrandedCard> cobrandedCards) {
        this.cobrandedCards = cobrandedCards;
    }

    /**
     * Converts this PaypalWalletAttributesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaypalWalletAttributesResponse [" + "vault=" + vault + ", cobrandedCards="
                + cobrandedCards + "]";
    }

    /**
     * Builds a new {@link PaypalWalletAttributesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaypalWalletAttributesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .vault(getVault())
                .cobrandedCards(getCobrandedCards());
        return builder;
    }

    /**
     * Class to build instances of {@link PaypalWalletAttributesResponse}.
     */
    public static class Builder {
        private PaypalWalletVaultResponse vault;
        private List<CobrandedCard> cobrandedCards;



        /**
         * Setter for vault.
         * @param  vault  PaypalWalletVaultResponse value for vault.
         * @return Builder
         */
        public Builder vault(PaypalWalletVaultResponse vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Setter for cobrandedCards.
         * @param  cobrandedCards  List of CobrandedCard value for cobrandedCards.
         * @return Builder
         */
        public Builder cobrandedCards(List<CobrandedCard> cobrandedCards) {
            this.cobrandedCards = cobrandedCards;
            return this;
        }

        /**
         * Builds a new {@link PaypalWalletAttributesResponse} object using the set fields.
         * @return {@link PaypalWalletAttributesResponse}
         */
        public PaypalWalletAttributesResponse build() {
            return new PaypalWalletAttributesResponse(vault, cobrandedCards);
        }
    }
}
