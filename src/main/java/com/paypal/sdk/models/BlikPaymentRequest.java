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
 * This is a model class for BlikPaymentRequest type.
 */
public class BlikPaymentRequest {
    private String name;
    private String countryCode;
    private String email;
    private BlikExperienceContext experienceContext;
    private BlikLevel0PaymentObject level0;
    private BlikOneClickPaymentRequest oneClick;

    /**
     * Default constructor.
     */
    public BlikPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  countryCode  String value for countryCode.
     * @param  email  String value for email.
     * @param  experienceContext  BlikExperienceContext value for experienceContext.
     * @param  level0  BlikLevel0PaymentObject value for level0.
     * @param  oneClick  BlikOneClickPaymentRequest value for oneClick.
     */
    public BlikPaymentRequest(
            String name,
            String countryCode,
            String email,
            BlikExperienceContext experienceContext,
            BlikLevel0PaymentObject level0,
            BlikOneClickPaymentRequest oneClick) {
        this.name = name;
        this.countryCode = countryCode;
        this.email = email;
        this.experienceContext = experienceContext;
        this.level0 = level0;
        this.oneClick = oneClick;
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
     * country or region. Note: The country code for Great Britain is GB and not UK as used in the
     * top-level domain names for that country. Use the `C2` country code for China worldwide for
     * comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The [two-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region. Note: The country code for Great Britain is GB and not UK as used in the
     * top-level domain names for that country. Use the `C2` country code for China worldwide for
     * comparable uncontrolled price (CUP) method, bank card, and cross-border transactions.
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Email.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the approval process for the BLIK payment.
     * @return Returns the BlikExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BlikExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the approval process for the BLIK payment.
     * @param experienceContext Value for BlikExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(BlikExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for Level0.
     * Information used to pay using BLIK level_0 flow.
     * @return Returns the BlikLevel0PaymentObject
     */
    @JsonGetter("level_0")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BlikLevel0PaymentObject getLevel0() {
        return level0;
    }

    /**
     * Setter for Level0.
     * Information used to pay using BLIK level_0 flow.
     * @param level0 Value for BlikLevel0PaymentObject
     */
    @JsonSetter("level_0")
    public void setLevel0(BlikLevel0PaymentObject level0) {
        this.level0 = level0;
    }

    /**
     * Getter for OneClick.
     * Information used to pay using BLIK one-click flow.
     * @return Returns the BlikOneClickPaymentRequest
     */
    @JsonGetter("one_click")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BlikOneClickPaymentRequest getOneClick() {
        return oneClick;
    }

    /**
     * Setter for OneClick.
     * Information used to pay using BLIK one-click flow.
     * @param oneClick Value for BlikOneClickPaymentRequest
     */
    @JsonSetter("one_click")
    public void setOneClick(BlikOneClickPaymentRequest oneClick) {
        this.oneClick = oneClick;
    }

    /**
     * Converts this BlikPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BlikPaymentRequest [" + "name=" + name + ", countryCode=" + countryCode + ", email="
                + email + ", experienceContext=" + experienceContext + ", level0=" + level0
                + ", oneClick=" + oneClick + "]";
    }

    /**
     * Builds a new {@link BlikPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BlikPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, countryCode)
                .email(getEmail())
                .experienceContext(getExperienceContext())
                .level0(getLevel0())
                .oneClick(getOneClick());
        return builder;
    }

    /**
     * Class to build instances of {@link BlikPaymentRequest}.
     */
    public static class Builder {
        private String name;
        private String countryCode;
        private String email;
        private BlikExperienceContext experienceContext;
        private BlikLevel0PaymentObject level0;
        private BlikOneClickPaymentRequest oneClick;

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
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  BlikExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(BlikExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Setter for level0.
         * @param  level0  BlikLevel0PaymentObject value for level0.
         * @return Builder
         */
        public Builder level0(BlikLevel0PaymentObject level0) {
            this.level0 = level0;
            return this;
        }

        /**
         * Setter for oneClick.
         * @param  oneClick  BlikOneClickPaymentRequest value for oneClick.
         * @return Builder
         */
        public Builder oneClick(BlikOneClickPaymentRequest oneClick) {
            this.oneClick = oneClick;
            return this;
        }

        /**
         * Builds a new {@link BlikPaymentRequest} object using the set fields.
         * @return {@link BlikPaymentRequest}
         */
        public BlikPaymentRequest build() {
            return new BlikPaymentRequest(name, countryCode, email, experienceContext, level0,
                    oneClick);
        }
    }
}
