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
 * This is a model class for PaypalWalletVaultInstruction type.
 */
public class PaypalWalletVaultInstruction {
    private StoreInVaultInstruction storeInVault;
    private String description;
    private UsagePattern usagePattern;
    private PaypalPaymentTokenUsageType usageType;
    private PaypalPaymentTokenCustomerType customerType;
    private Boolean permitMultiplePaymentTokens;

    /**
     * Default constructor.
     */
    public PaypalWalletVaultInstruction() {
        customerType = PaypalPaymentTokenCustomerType.CONSUMER;
        permitMultiplePaymentTokens = false;
    }

    /**
     * Initialization constructor.
     * @param  usageType  PaypalPaymentTokenUsageType value for usageType.
     * @param  storeInVault  StoreInVaultInstruction value for storeInVault.
     * @param  description  String value for description.
     * @param  usagePattern  UsagePattern value for usagePattern.
     * @param  customerType  PaypalPaymentTokenCustomerType value for customerType.
     * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
     */
    public PaypalWalletVaultInstruction(
            PaypalPaymentTokenUsageType usageType,
            StoreInVaultInstruction storeInVault,
            String description,
            UsagePattern usagePattern,
            PaypalPaymentTokenCustomerType customerType,
            Boolean permitMultiplePaymentTokens) {
        this.storeInVault = storeInVault;
        this.description = description;
        this.usagePattern = usagePattern;
        this.usageType = usageType;
        this.customerType = customerType;
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    }

    /**
     * Getter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @return Returns the StoreInVaultInstruction
     */
    @JsonGetter("store_in_vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StoreInVaultInstruction getStoreInVault() {
        return storeInVault;
    }

    /**
     * Setter for StoreInVault.
     * Defines how and when the payment source gets vaulted.
     * @param storeInVault Value for StoreInVaultInstruction
     */
    @JsonSetter("store_in_vault")
    public void setStoreInVault(StoreInVaultInstruction storeInVault) {
        this.storeInVault = storeInVault;
    }

    /**
     * Getter for Description.
     * The description displayed to PayPal consumer on the approval flow for PayPal, as well as on
     * the PayPal payment token management experience on PayPal.com.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description displayed to PayPal consumer on the approval flow for PayPal, as well as on
     * the PayPal payment token management experience on PayPal.com.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for UsagePattern.
     * Expected business/pricing model for the billing agreement.
     * @return Returns the UsagePattern
     */
    @JsonGetter("usage_pattern")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UsagePattern getUsagePattern() {
        return usagePattern;
    }

    /**
     * Setter for UsagePattern.
     * Expected business/pricing model for the billing agreement.
     * @param usagePattern Value for UsagePattern
     */
    @JsonSetter("usage_pattern")
    public void setUsagePattern(UsagePattern usagePattern) {
        this.usagePattern = usagePattern;
    }

    /**
     * Getter for UsageType.
     * The usage type associated with the PayPal payment token.
     * @return Returns the PaypalPaymentTokenUsageType
     */
    @JsonGetter("usage_type")
    public PaypalPaymentTokenUsageType getUsageType() {
        return usageType;
    }

    /**
     * Setter for UsageType.
     * The usage type associated with the PayPal payment token.
     * @param usageType Value for PaypalPaymentTokenUsageType
     */
    @JsonSetter("usage_type")
    public void setUsageType(PaypalPaymentTokenUsageType usageType) {
        this.usageType = usageType;
    }

    /**
     * Getter for CustomerType.
     * The customer type associated with the PayPal payment token. This is to indicate whether the
     * customer acting on the merchant / platform is either a business or a consumer.
     * @return Returns the PaypalPaymentTokenCustomerType
     */
    @JsonGetter("customer_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalPaymentTokenCustomerType getCustomerType() {
        return customerType;
    }

    /**
     * Setter for CustomerType.
     * The customer type associated with the PayPal payment token. This is to indicate whether the
     * customer acting on the merchant / platform is either a business or a consumer.
     * @param customerType Value for PaypalPaymentTokenCustomerType
     */
    @JsonSetter("customer_type")
    public void setCustomerType(PaypalPaymentTokenCustomerType customerType) {
        this.customerType = customerType;
    }

    /**
     * Getter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same PayPal account. This only applies to PayPal payment source.
     * @return Returns the Boolean
     */
    @JsonGetter("permit_multiple_payment_tokens")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPermitMultiplePaymentTokens() {
        return permitMultiplePaymentTokens;
    }

    /**
     * Setter for PermitMultiplePaymentTokens.
     * Create multiple payment tokens for the same payer, merchant/platform combination. Use this
     * when the customer has not logged in at merchant/platform. The payment token thus generated,
     * can then also be used to create the customer account at merchant/platform. Use this also when
     * multiple payment tokens are required for the same payer, different customer at
     * merchant/platform. This helps to identify customers distinctly even though they may share the
     * same PayPal account. This only applies to PayPal payment source.
     * @param permitMultiplePaymentTokens Value for Boolean
     */
    @JsonSetter("permit_multiple_payment_tokens")
    public void setPermitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
    }

    /**
     * Converts this PaypalWalletVaultInstruction into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaypalWalletVaultInstruction [" + "usageType=" + usageType + ", storeInVault="
                + storeInVault + ", description=" + description + ", usagePattern=" + usagePattern
                + ", customerType=" + customerType + ", permitMultiplePaymentTokens="
                + permitMultiplePaymentTokens + "]";
    }

    /**
     * Builds a new {@link PaypalWalletVaultInstruction.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaypalWalletVaultInstruction.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(usageType)
                .storeInVault(getStoreInVault())
                .description(getDescription())
                .usagePattern(getUsagePattern())
                .customerType(getCustomerType())
                .permitMultiplePaymentTokens(getPermitMultiplePaymentTokens());
        return builder;
    }

    /**
     * Class to build instances of {@link PaypalWalletVaultInstruction}.
     */
    public static class Builder {
        private PaypalPaymentTokenUsageType usageType;
        private StoreInVaultInstruction storeInVault;
        private String description;
        private UsagePattern usagePattern;
        private PaypalPaymentTokenCustomerType customerType =
                PaypalPaymentTokenCustomerType.CONSUMER;
        private Boolean permitMultiplePaymentTokens = false;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  usageType  PaypalPaymentTokenUsageType value for usageType.
         */
        public Builder(PaypalPaymentTokenUsageType usageType) {
            this.usageType = usageType;
        }

        /**
         * Setter for usageType.
         * @param  usageType  PaypalPaymentTokenUsageType value for usageType.
         * @return Builder
         */
        public Builder usageType(PaypalPaymentTokenUsageType usageType) {
            this.usageType = usageType;
            return this;
        }

        /**
         * Setter for storeInVault.
         * @param  storeInVault  StoreInVaultInstruction value for storeInVault.
         * @return Builder
         */
        public Builder storeInVault(StoreInVaultInstruction storeInVault) {
            this.storeInVault = storeInVault;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for usagePattern.
         * @param  usagePattern  UsagePattern value for usagePattern.
         * @return Builder
         */
        public Builder usagePattern(UsagePattern usagePattern) {
            this.usagePattern = usagePattern;
            return this;
        }

        /**
         * Setter for customerType.
         * @param  customerType  PaypalPaymentTokenCustomerType value for customerType.
         * @return Builder
         */
        public Builder customerType(PaypalPaymentTokenCustomerType customerType) {
            this.customerType = customerType;
            return this;
        }

        /**
         * Setter for permitMultiplePaymentTokens.
         * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
         * @return Builder
         */
        public Builder permitMultiplePaymentTokens(Boolean permitMultiplePaymentTokens) {
            this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
            return this;
        }

        /**
         * Builds a new {@link PaypalWalletVaultInstruction} object using the set fields.
         * @return {@link PaypalWalletVaultInstruction}
         */
        public PaypalWalletVaultInstruction build() {
            return new PaypalWalletVaultInstruction(usageType, storeInVault, description,
                    usagePattern, customerType, permitMultiplePaymentTokens);
        }
    }
}
