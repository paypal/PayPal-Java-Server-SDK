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
 * This is a model class for VaultExperienceContext type.
 */
public class VaultExperienceContext {
    private String brandName;
    private String locale;
    private String returnUrl;
    private String cancelUrl;
    private OrderApplicationContextShippingPreference shippingPreference;
    private VaultInstructionAction vaultInstruction;

    /**
     * Default constructor.
     */
    public VaultExperienceContext() {
        shippingPreference = OrderApplicationContextShippingPreference.GET_FROM_FILE;
        vaultInstruction = VaultInstructionAction.ON_CREATE_PAYMENT_TOKENS;
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  locale  String value for locale.
     * @param  returnUrl  String value for returnUrl.
     * @param  cancelUrl  String value for cancelUrl.
     * @param  shippingPreference  OrderApplicationContextShippingPreference value for
     *         shippingPreference.
     * @param  vaultInstruction  VaultInstructionAction value for vaultInstruction.
     */
    public VaultExperienceContext(
            String brandName,
            String locale,
            String returnUrl,
            String cancelUrl,
            OrderApplicationContextShippingPreference shippingPreference,
            VaultInstructionAction vaultInstruction) {
        this.brandName = brandName;
        this.locale = locale;
        this.returnUrl = returnUrl;
        this.cancelUrl = cancelUrl;
        this.shippingPreference = shippingPreference;
        this.vaultInstruction = vaultInstruction;
    }

    /**
     * Getter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * The label that overrides the business name in the PayPal account on the PayPal site. The
     * pattern is defined by an external party and supports Unicode.
     * @param brandName Value for String
     */
    @JsonSetter("brand_name")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Getter for Locale.
     * The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to
     * localize the error-related strings, such as messages, issues, and suggested actions. The tag
     * is made up of the [ISO 639-2 language
     * code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924
     * script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2
     * country code](/api/rest/reference/country-codes/) or [M49 region
     * code](https://unstats.un.org/unsd/methodology/m49/).
     * @return Returns the String
     */
    @JsonGetter("locale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLocale() {
        return locale;
    }

    /**
     * Setter for Locale.
     * The [language tag](https://tools.ietf.org/html/bcp47#section-2) for the language in which to
     * localize the error-related strings, such as messages, issues, and suggested actions. The tag
     * is made up of the [ISO 639-2 language
     * code](https://www.loc.gov/standards/iso639-2/php/code_list.php), the optional [ISO-15924
     * script tag](https://www.unicode.org/iso15924/codelists.html), and the [ISO-3166 alpha-2
     * country code](/api/rest/reference/country-codes/) or [M49 region
     * code](https://unstats.un.org/unsd/methodology/m49/).
     * @param locale Value for String
     */
    @JsonSetter("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * Getter for ReturnUrl.
     * The URL where the customer is redirected after customer approves leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @return Returns the String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Setter for ReturnUrl.
     * The URL where the customer is redirected after customer approves leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Getter for CancelUrl.
     * The URL where the customer is redirected after customer cancels or leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @return Returns the String
     */
    @JsonGetter("cancel_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Setter for CancelUrl.
     * The URL where the customer is redirected after customer cancels or leaves the flow. It is a
     * required field for contingency flows like PayPal wallet, 3DS.
     * @param cancelUrl Value for String
     */
    @JsonSetter("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * Getter for ShippingPreference.
     * The shipping preference. This only applies to PayPal payment source.
     * @return Returns the OrderApplicationContextShippingPreference
     */
    @JsonGetter("shipping_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderApplicationContextShippingPreference getShippingPreference() {
        return shippingPreference;
    }

    /**
     * Setter for ShippingPreference.
     * The shipping preference. This only applies to PayPal payment source.
     * @param shippingPreference Value for OrderApplicationContextShippingPreference
     */
    @JsonSetter("shipping_preference")
    public void setShippingPreference(OrderApplicationContextShippingPreference shippingPreference) {
        this.shippingPreference = shippingPreference;
    }

    /**
     * Getter for VaultInstruction.
     * Vault Instruction on action to be performed after a successful payer approval.
     * @return Returns the VaultInstructionAction
     */
    @JsonGetter("vault_instruction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public VaultInstructionAction getVaultInstruction() {
        return vaultInstruction;
    }

    /**
     * Setter for VaultInstruction.
     * Vault Instruction on action to be performed after a successful payer approval.
     * @param vaultInstruction Value for VaultInstructionAction
     */
    @JsonSetter("vault_instruction")
    public void setVaultInstruction(VaultInstructionAction vaultInstruction) {
        this.vaultInstruction = vaultInstruction;
    }

    /**
     * Converts this VaultExperienceContext into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "VaultExperienceContext [" + "brandName=" + brandName + ", locale=" + locale
                + ", returnUrl=" + returnUrl + ", cancelUrl=" + cancelUrl + ", shippingPreference="
                + shippingPreference + ", vaultInstruction=" + vaultInstruction + "]";
    }

    /**
     * Builds a new {@link VaultExperienceContext.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link VaultExperienceContext.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .locale(getLocale())
                .returnUrl(getReturnUrl())
                .cancelUrl(getCancelUrl())
                .shippingPreference(getShippingPreference())
                .vaultInstruction(getVaultInstruction());
        return builder;
    }

    /**
     * Class to build instances of {@link VaultExperienceContext}.
     */
    public static class Builder {
        private String brandName;
        private String locale;
        private String returnUrl;
        private String cancelUrl;
        private OrderApplicationContextShippingPreference shippingPreference =
                OrderApplicationContextShippingPreference.GET_FROM_FILE;
        private VaultInstructionAction vaultInstruction =
                VaultInstructionAction.ON_CREATE_PAYMENT_TOKENS;



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
         * Setter for locale.
         * @param  locale  String value for locale.
         * @return Builder
         */
        public Builder locale(String locale) {
            this.locale = locale;
            return this;
        }

        /**
         * Setter for returnUrl.
         * @param  returnUrl  String value for returnUrl.
         * @return Builder
         */
        public Builder returnUrl(String returnUrl) {
            this.returnUrl = returnUrl;
            return this;
        }

        /**
         * Setter for cancelUrl.
         * @param  cancelUrl  String value for cancelUrl.
         * @return Builder
         */
        public Builder cancelUrl(String cancelUrl) {
            this.cancelUrl = cancelUrl;
            return this;
        }

        /**
         * Setter for shippingPreference.
         * @param  shippingPreference  OrderApplicationContextShippingPreference value for
         *         shippingPreference.
         * @return Builder
         */
        public Builder shippingPreference(
                OrderApplicationContextShippingPreference shippingPreference) {
            this.shippingPreference = shippingPreference;
            return this;
        }

        /**
         * Setter for vaultInstruction.
         * @param  vaultInstruction  VaultInstructionAction value for vaultInstruction.
         * @return Builder
         */
        public Builder vaultInstruction(VaultInstructionAction vaultInstruction) {
            this.vaultInstruction = vaultInstruction;
            return this;
        }

        /**
         * Builds a new {@link VaultExperienceContext} object using the set fields.
         * @return {@link VaultExperienceContext}
         */
        public VaultExperienceContext build() {
            return new VaultExperienceContext(brandName, locale, returnUrl, cancelUrl,
                    shippingPreference, vaultInstruction);
        }
    }
}
