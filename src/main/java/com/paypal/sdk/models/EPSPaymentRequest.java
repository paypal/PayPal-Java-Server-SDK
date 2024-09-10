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
 * This is a model class for EPSPaymentRequest type.
 */
public class EPSPaymentRequest {
    private String name;
    private String countryCode;
    private ExperienceContext experienceContext;

    /**
     * Default constructor.
     */
    public EPSPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  experienceContext  ExperienceContext value for experienceContext.
     */
    public EPSPaymentRequest(
            String name,
            String countryCode,
            ExperienceContext experienceContext) {
        this.name = name;
        this.countryCode = countryCode;
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for Name.
     * The full name representation like Mr J Smith.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The full name representation like Mr J Smith.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @return Returns the ExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the approval process for the payment.
     * @param experienceContext Value for ExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(ExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Converts this EPSPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "EPSPaymentRequest [" + "name=" + name + ", countryCode=" + countryCode
                + ", experienceContext=" + experienceContext + "]";
    }

    /**
     * Builds a new {@link EPSPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link EPSPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, countryCode)
                .experienceContext(getExperienceContext());
        return builder;
    }

    /**
     * Class to build instances of {@link EPSPaymentRequest}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private ExperienceContext experienceContext;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  countryCode  String value for countryCode.
         */
        public Builder(String name, String countryCode) {
            this.name = name;
            this.countryCode = countryCode;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  ExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(ExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Builds a new {@link EPSPaymentRequest} object using the set fields.
         * @return {@link EPSPaymentRequest}
         */
        public EPSPaymentRequest build() {
            return new EPSPaymentRequest(name, countryCode, experienceContext);
        }
    }
}
