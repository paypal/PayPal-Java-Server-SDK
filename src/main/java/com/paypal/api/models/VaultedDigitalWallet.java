/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for VaultedDigitalWallet type.
 */
public class VaultedDigitalWallet {
    private String description;
    private VaultedDigitalWalletShippingDetails shipping;
    private Boolean permitMultiplePaymentTokens;
    private String usageType;
    private String customerType;

    /**
     * Default constructor.
     */
    public VaultedDigitalWallet() {
        permitMultiplePaymentTokens = false;
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  shipping  VaultedDigitalWalletShippingDetails value for shipping.
     * @param  permitMultiplePaymentTokens  Boolean value for permitMultiplePaymentTokens.
     * @param  usageType  String value for usageType.
     * @param  customerType  String value for customerType.
     */
    public VaultedDigitalWallet(
            String description,
            VaultedDigitalWalletShippingDetails shipping,
            Boolean permitMultiplePaymentTokens,
            String usageType,
            String customerType) {
        this.description = description;
        this.shipping = shipping;
        this.permitMultiplePaymentTokens = permitMultiplePaymentTokens;
        this.usageType = usageType;
        this.customerType = customerType;
    }

    /**
     * Getter for Description.
     * The description displayed to the consumer on the approval flow for a digital wallet, as well
     * as on the merchant view of the payment token management experience. exp: PayPal.com.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description displayed to the consumer on the approval flow for a digital wallet, as well
     * as on the merchant view of the payment token management experience. exp: PayPal.com.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Shipping.
     * The shipping details.
     * @return Returns the VaultedDigitalWalletShippingDetails
     */
    @JsonGetter("shipping")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultedDigitalWalletShippingDetails getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * The shipping details.
     * @param shipping Value for VaultedDigitalWalletShippingDetails
     */
    @JsonSetter("shipping")
    public void setShipping(VaultedDigitalWalletShippingDetails shipping) {
        this.shipping = shipping;
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
     * Getter for UsageType.
     * The usage type associated with a digital wallet payment token.
     * @return Returns the String
     */
    @JsonGetter("usage_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsageType() {
        return usageType;
    }

    /**
     * Setter for UsageType.
     * The usage type associated with a digital wallet payment token.
     * @param usageType Value for String
     */
    @JsonSetter("usage_type")
    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * Getter for CustomerType.
     * The customer type associated with a digital wallet payment token. This is to indicate whether
     * the customer acting on the merchant / platform is either a business or a consumer.
     * @return Returns the String
     */
    @JsonGetter("customer_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Setter for CustomerType.
     * The customer type associated with a digital wallet payment token. This is to indicate whether
     * the customer acting on the merchant / platform is either a business or a consumer.
     * @param customerType Value for String
     */
    @JsonSetter("customer_type")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * Converts this VaultedDigitalWallet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VaultedDigitalWallet [" + "description=" + description + ", shipping=" + shipping
                + ", permitMultiplePaymentTokens=" + permitMultiplePaymentTokens + ", usageType="
                + usageType + ", customerType=" + customerType + "]";
    }

    /**
     * Builds a new {@link VaultedDigitalWallet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VaultedDigitalWallet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .description(getDescription())
                .shipping(getShipping())
                .permitMultiplePaymentTokens(getPermitMultiplePaymentTokens())
                .usageType(getUsageType())
                .customerType(getCustomerType());
        return builder;
    }

    /**
     * Class to build instances of {@link VaultedDigitalWallet}.
     */
    public static class Builder {
        private String description;
        private VaultedDigitalWalletShippingDetails shipping;
        private Boolean permitMultiplePaymentTokens = false;
        private String usageType;
        private String customerType;



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
         * Setter for shipping.
         * @param  shipping  VaultedDigitalWalletShippingDetails value for shipping.
         * @return Builder
         */
        public Builder shipping(VaultedDigitalWalletShippingDetails shipping) {
            this.shipping = shipping;
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
         * Setter for usageType.
         * @param  usageType  String value for usageType.
         * @return Builder
         */
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            return this;
        }

        /**
         * Setter for customerType.
         * @param  customerType  String value for customerType.
         * @return Builder
         */
        public Builder customerType(String customerType) {
            this.customerType = customerType;
            return this;
        }

        /**
         * Builds a new {@link VaultedDigitalWallet} object using the set fields.
         * @return {@link VaultedDigitalWallet}
         */
        public VaultedDigitalWallet build() {
            return new VaultedDigitalWallet(description, shipping, permitMultiplePaymentTokens,
                    usageType, customerType);
        }
    }
}
