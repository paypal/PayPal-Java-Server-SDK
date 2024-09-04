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
 * This is a model class for OrderApplicationContext type.
 */
public class OrderApplicationContext {
    private String brandName;
    private String locale;
    private OrderApplicationContextLandingPage landingPage;
    private OrderApplicationContextShippingPreference shippingPreference;
    private OrderApplicationContextUserAction userAction;
    private PaymentMethodPreference paymentMethod;
    private String returnUrl;
    private String cancelUrl;
    private StoredPaymentSource storedPaymentSource;

    /**
     * Default constructor.
     */
    public OrderApplicationContext() {
        landingPage = OrderApplicationContextLandingPage.NO_PREFERENCE;
        shippingPreference = OrderApplicationContextShippingPreference.GET_FROM_FILE;
        userAction = OrderApplicationContextUserAction.CONTINUE;
    }

    /**
     * Initialization constructor.
     * @param  brandName  String value for brandName.
     * @param  locale  String value for locale.
     * @param  landingPage  OrderApplicationContextLandingPage value for landingPage.
     * @param  shippingPreference  OrderApplicationContextShippingPreference value for
     *         shippingPreference.
     * @param  userAction  OrderApplicationContextUserAction value for userAction.
     * @param  paymentMethod  PaymentMethodPreference value for paymentMethod.
     * @param  returnUrl  String value for returnUrl.
     * @param  cancelUrl  String value for cancelUrl.
     * @param  storedPaymentSource  StoredPaymentSource value for storedPaymentSource.
     */
    public OrderApplicationContext(
            String brandName,
            String locale,
            OrderApplicationContextLandingPage landingPage,
            OrderApplicationContextShippingPreference shippingPreference,
            OrderApplicationContextUserAction userAction,
            PaymentMethodPreference paymentMethod,
            String returnUrl,
            String cancelUrl,
            StoredPaymentSource storedPaymentSource) {
        this.brandName = brandName;
        this.locale = locale;
        this.landingPage = landingPage;
        this.shippingPreference = shippingPreference;
        this.userAction = userAction;
        this.paymentMethod = paymentMethod;
        this.returnUrl = returnUrl;
        this.cancelUrl = cancelUrl;
        this.storedPaymentSource = storedPaymentSource;
    }

    /**
     * Getter for BrandName.
     * DEPRECATED. The label that overrides the business name in the PayPal account on the PayPal
     * site. The fields in `application_context` are now available in the `experience_context`
     * object under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.brand_name`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @return Returns the String
     */
    @JsonGetter("brand_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBrandName() {
        return brandName;
    }

    /**
     * Setter for BrandName.
     * DEPRECATED. The label that overrides the business name in the PayPal account on the PayPal
     * site. The fields in `application_context` are now available in the `experience_context`
     * object under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.brand_name`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
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
     * Getter for LandingPage.
     * DEPRECATED. DEPRECATED. The type of landing page to show on the PayPal site for customer
     * checkout. The fields in `application_context` are now available in the `experience_context`
     * object under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.landing_page`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @return Returns the OrderApplicationContextLandingPage
     */
    @JsonGetter("landing_page")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderApplicationContextLandingPage getLandingPage() {
        return landingPage;
    }

    /**
     * Setter for LandingPage.
     * DEPRECATED. DEPRECATED. The type of landing page to show on the PayPal site for customer
     * checkout. The fields in `application_context` are now available in the `experience_context`
     * object under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.landing_page`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @param landingPage Value for OrderApplicationContextLandingPage
     */
    @JsonSetter("landing_page")
    public void setLandingPage(OrderApplicationContextLandingPage landingPage) {
        this.landingPage = landingPage;
    }

    /**
     * Getter for ShippingPreference.
     * DEPRECATED. DEPRECATED. The shipping preference:&lt;ul&gt;&lt;li&gt;Displays the shipping address to the
     * customer.&lt;/li&gt;&lt;li&gt;Enables the customer to choose an address on the PayPal
     * site.&lt;/li&gt;&lt;li&gt;Restricts the customer from changing the address during the payment-approval
     * process.&lt;/li&gt;&lt;/ul&gt;. The fields in `application_context` are now available in the
     * `experience_context` object under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.shipping_preference`). Please specify this field in
     * the `experience_context` object instead of the `application_context` object.
     * @return Returns the OrderApplicationContextShippingPreference
     */
    @JsonGetter("shipping_preference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderApplicationContextShippingPreference getShippingPreference() {
        return shippingPreference;
    }

    /**
     * Setter for ShippingPreference.
     * DEPRECATED. DEPRECATED. The shipping preference:&lt;ul&gt;&lt;li&gt;Displays the shipping address to the
     * customer.&lt;/li&gt;&lt;li&gt;Enables the customer to choose an address on the PayPal
     * site.&lt;/li&gt;&lt;li&gt;Restricts the customer from changing the address during the payment-approval
     * process.&lt;/li&gt;&lt;/ul&gt;. The fields in `application_context` are now available in the
     * `experience_context` object under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.shipping_preference`). Please specify this field in
     * the `experience_context` object instead of the `application_context` object.
     * @param shippingPreference Value for OrderApplicationContextShippingPreference
     */
    @JsonSetter("shipping_preference")
    public void setShippingPreference(OrderApplicationContextShippingPreference shippingPreference) {
        this.shippingPreference = shippingPreference;
    }

    /**
     * Getter for UserAction.
     * DEPRECATED. Configures a &lt;strong&gt;Continue&lt;/strong&gt; or &lt;strong&gt;Pay Now&lt;/strong&gt; checkout flow.
     * The fields in `application_context` are now available in the `experience_context` object
     * under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.user_action`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @return Returns the OrderApplicationContextUserAction
     */
    @JsonGetter("user_action")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderApplicationContextUserAction getUserAction() {
        return userAction;
    }

    /**
     * Setter for UserAction.
     * DEPRECATED. Configures a &lt;strong&gt;Continue&lt;/strong&gt; or &lt;strong&gt;Pay Now&lt;/strong&gt; checkout flow.
     * The fields in `application_context` are now available in the `experience_context` object
     * under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.user_action`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @param userAction Value for OrderApplicationContextUserAction
     */
    @JsonSetter("user_action")
    public void setUserAction(OrderApplicationContextUserAction userAction) {
        this.userAction = userAction;
    }

    /**
     * Getter for PaymentMethod.
     * The customer and merchant payment preferences.
     * @return Returns the PaymentMethodPreference
     */
    @JsonGetter("payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentMethodPreference getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * The customer and merchant payment preferences.
     * @param paymentMethod Value for PaymentMethodPreference
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(PaymentMethodPreference paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for ReturnUrl.
     * DEPRECATED. The URL where the customer is redirected after the customer approves the payment.
     * The fields in `application_context` are now available in the `experience_context` object
     * under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.return_url`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @return Returns the String
     */
    @JsonGetter("return_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Setter for ReturnUrl.
     * DEPRECATED. The URL where the customer is redirected after the customer approves the payment.
     * The fields in `application_context` are now available in the `experience_context` object
     * under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.return_url`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @param returnUrl Value for String
     */
    @JsonSetter("return_url")
    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    /**
     * Getter for CancelUrl.
     * DEPRECATED. The URL where the customer is redirected after the customer cancels the payment.
     * The fields in `application_context` are now available in the `experience_context` object
     * under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.cancel_url`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @return Returns the String
     */
    @JsonGetter("cancel_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Setter for CancelUrl.
     * DEPRECATED. The URL where the customer is redirected after the customer cancels the payment.
     * The fields in `application_context` are now available in the `experience_context` object
     * under the `payment_source` which supports them (eg.
     * `payment_source.paypal.experience_context.cancel_url`). Please specify this field in the
     * `experience_context` object instead of the `application_context` object.
     * @param cancelUrl Value for String
     */
    @JsonSetter("cancel_url")
    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    /**
     * Getter for StoredPaymentSource.
     * Provides additional details to process a payment using a `payment_source` that has been
     * stored or is intended to be stored (also referred to as stored_credential or
     * card-on-file).&lt;br/&gt;Parameter compatibility:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;`payment_type=ONE_TIME` is compatible
     * only with `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`usage=FIRST` is compatible only with
     * `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`previous_transaction_reference` or
     * `previous_network_transaction_reference` is compatible only with
     * `payment_initiator=MERCHANT`.&lt;/li&gt;&lt;li&gt;Only one of the parameters -
     * `previous_transaction_reference` and `previous_network_transaction_reference` - can be
     * present in the request.&lt;/li&gt;&lt;/ul&gt;
     * @return Returns the StoredPaymentSource
     */
    @JsonGetter("stored_payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StoredPaymentSource getStoredPaymentSource() {
        return storedPaymentSource;
    }

    /**
     * Setter for StoredPaymentSource.
     * Provides additional details to process a payment using a `payment_source` that has been
     * stored or is intended to be stored (also referred to as stored_credential or
     * card-on-file).&lt;br/&gt;Parameter compatibility:&lt;br/&gt;&lt;ul&gt;&lt;li&gt;`payment_type=ONE_TIME` is compatible
     * only with `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`usage=FIRST` is compatible only with
     * `payment_initiator=CUSTOMER`.&lt;/li&gt;&lt;li&gt;`previous_transaction_reference` or
     * `previous_network_transaction_reference` is compatible only with
     * `payment_initiator=MERCHANT`.&lt;/li&gt;&lt;li&gt;Only one of the parameters -
     * `previous_transaction_reference` and `previous_network_transaction_reference` - can be
     * present in the request.&lt;/li&gt;&lt;/ul&gt;
     * @param storedPaymentSource Value for StoredPaymentSource
     */
    @JsonSetter("stored_payment_source")
    public void setStoredPaymentSource(StoredPaymentSource storedPaymentSource) {
        this.storedPaymentSource = storedPaymentSource;
    }

    /**
     * Converts this OrderApplicationContext into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderApplicationContext [" + "brandName=" + brandName + ", locale=" + locale
                + ", landingPage=" + landingPage + ", shippingPreference=" + shippingPreference
                + ", userAction=" + userAction + ", paymentMethod=" + paymentMethod + ", returnUrl="
                + returnUrl + ", cancelUrl=" + cancelUrl + ", storedPaymentSource="
                + storedPaymentSource + "]";
    }

    /**
     * Builds a new {@link OrderApplicationContext.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderApplicationContext.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .brandName(getBrandName())
                .locale(getLocale())
                .landingPage(getLandingPage())
                .shippingPreference(getShippingPreference())
                .userAction(getUserAction())
                .paymentMethod(getPaymentMethod())
                .returnUrl(getReturnUrl())
                .cancelUrl(getCancelUrl())
                .storedPaymentSource(getStoredPaymentSource());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderApplicationContext}.
     */
    public static class Builder {
        private String brandName;
        private String locale;
        private OrderApplicationContextLandingPage landingPage =
                OrderApplicationContextLandingPage.NO_PREFERENCE;
        private OrderApplicationContextShippingPreference shippingPreference =
                OrderApplicationContextShippingPreference.GET_FROM_FILE;
        private OrderApplicationContextUserAction userAction =
                OrderApplicationContextUserAction.CONTINUE;
        private PaymentMethodPreference paymentMethod;
        private String returnUrl;
        private String cancelUrl;
        private StoredPaymentSource storedPaymentSource;



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
         * Setter for landingPage.
         * @param  landingPage  OrderApplicationContextLandingPage value for landingPage.
         * @return Builder
         */
        public Builder landingPage(OrderApplicationContextLandingPage landingPage) {
            this.landingPage = landingPage;
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
         * Setter for userAction.
         * @param  userAction  OrderApplicationContextUserAction value for userAction.
         * @return Builder
         */
        public Builder userAction(OrderApplicationContextUserAction userAction) {
            this.userAction = userAction;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  PaymentMethodPreference value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(PaymentMethodPreference paymentMethod) {
            this.paymentMethod = paymentMethod;
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
         * Setter for storedPaymentSource.
         * @param  storedPaymentSource  StoredPaymentSource value for storedPaymentSource.
         * @return Builder
         */
        public Builder storedPaymentSource(StoredPaymentSource storedPaymentSource) {
            this.storedPaymentSource = storedPaymentSource;
            return this;
        }

        /**
         * Builds a new {@link OrderApplicationContext} object using the set fields.
         * @return {@link OrderApplicationContext}
         */
        public OrderApplicationContext build() {
            return new OrderApplicationContext(brandName, locale, landingPage, shippingPreference,
                    userAction, paymentMethod, returnUrl, cancelUrl, storedPaymentSource);
        }
    }
}
