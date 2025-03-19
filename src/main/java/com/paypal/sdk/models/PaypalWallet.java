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
 * This is a model class for PaypalWallet type.
 */
public class PaypalWallet {
    private String vaultId;
    private String emailAddress;
    private Name name;
    private PhoneWithType phone;
    private String birthDate;
    private TaxInfo taxInfo;
    private Address address;
    private PaypalWalletAttributes attributes;
    private PaypalWalletExperienceContext experienceContext;
    private String billingAgreementId;
    private PaypalWalletStoredCredential storedCredential;

    /**
     * Default constructor.
     */
    public PaypalWallet() {
    }

    /**
     * Initialization constructor.
     * @param  vaultId  String value for vaultId.
     * @param  emailAddress  String value for emailAddress.
     * @param  name  Name value for name.
     * @param  phone  PhoneWithType value for phone.
     * @param  birthDate  String value for birthDate.
     * @param  taxInfo  TaxInfo value for taxInfo.
     * @param  address  Address value for address.
     * @param  attributes  PaypalWalletAttributes value for attributes.
     * @param  experienceContext  PaypalWalletExperienceContext value for experienceContext.
     * @param  billingAgreementId  String value for billingAgreementId.
     * @param  storedCredential  PaypalWalletStoredCredential value for storedCredential.
     */
    public PaypalWallet(
            String vaultId,
            String emailAddress,
            Name name,
            PhoneWithType phone,
            String birthDate,
            TaxInfo taxInfo,
            Address address,
            PaypalWalletAttributes attributes,
            PaypalWalletExperienceContext experienceContext,
            String billingAgreementId,
            PaypalWalletStoredCredential storedCredential) {
        this.vaultId = vaultId;
        this.emailAddress = emailAddress;
        this.name = name;
        this.phone = phone;
        this.birthDate = birthDate;
        this.taxInfo = taxInfo;
        this.address = address;
        this.attributes = attributes;
        this.experienceContext = experienceContext;
        this.billingAgreementId = billingAgreementId;
        this.storedCredential = storedCredential;
    }

    /**
     * Getter for VaultId.
     * The PayPal-generated ID for the vaulted payment source. This ID should be stored on the
     * merchant's server so the saved payment source can be used for future transactions.
     * @return Returns the String
     */
    @JsonGetter("vault_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVaultId() {
        return vaultId;
    }

    /**
     * Setter for VaultId.
     * The PayPal-generated ID for the vaulted payment source. This ID should be stored on the
     * merchant's server so the saved payment source can be used for future transactions.
     * @param vaultId Value for String
     */
    @JsonSetter("vault_id")
    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    /**
     * Getter for EmailAddress.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @return Returns the String
     */
    @JsonGetter("email_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter for EmailAddress.
     * The internationalized email address. Note: Up to 64 characters are allowed before and 255
     * characters are allowed after the {@literal @} sign. However, the generally accepted maximum length for
     * an email address is 254 characters. The pattern verifies that an unquoted {@literal @} sign exists.
     * @param emailAddress Value for String
     */
    @JsonSetter("email_address")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * Getter for Name.
     * The name of the party.
     * @return Returns the Name
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Name getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the party.
     * @param name Value for Name
     */
    @JsonSetter("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Getter for Phone.
     * The phone information.
     * @return Returns the PhoneWithType
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PhoneWithType getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * The phone information.
     * @param phone Value for PhoneWithType
     */
    @JsonSetter("phone")
    public void setPhone(PhoneWithType phone) {
        this.phone = phone;
    }

    /**
     * Getter for BirthDate.
     * The stand-alone date, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values,
     * such as a date of birth, you should use dates with no associated time or time-zone data.
     * Whenever possible, use the standard `date_time` type. This regular expression does not
     * validate all dates. For example, February 31 is valid and nothing is known about leap years.
     * @return Returns the String
     */
    @JsonGetter("birth_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Setter for BirthDate.
     * The stand-alone date, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). To represent special legal values,
     * such as a date of birth, you should use dates with no associated time or time-zone data.
     * Whenever possible, use the standard `date_time` type. This regular expression does not
     * validate all dates. For example, February 31 is valid and nothing is known about leap years.
     * @param birthDate Value for String
     */
    @JsonSetter("birth_date")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Getter for TaxInfo.
     * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and
     * `tax_id_type` are required.
     * @return Returns the TaxInfo
     */
    @JsonGetter("tax_info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /**
     * Setter for TaxInfo.
     * The tax ID of the customer. The customer is also known as the payer. Both `tax_id` and
     * `tax_id_type` are required.
     * @param taxInfo Value for TaxInfo
     */
    @JsonSetter("tax_info")
    public void setTaxInfo(TaxInfo taxInfo) {
        this.taxInfo = taxInfo;
    }

    /**
     * Getter for Address.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @return Returns the Address
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Address getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * The portable international postal address. Maps to
     * [AddressValidationMetadata](https://github.com/googlei18n/libaddressinput/wiki/AddressValidationMetadata)
     * and HTML 5.1 [Autofilling form controls: the autocomplete
     * attribute](https://www.w3.org/TR/html51/sec-forms.html#autofilling-form-controls-the-autocomplete-attribute).
     * @param address Value for Address
     */
    @JsonSetter("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Getter for Attributes.
     * Additional attributes associated with the use of this PayPal Wallet.
     * @return Returns the PaypalWalletAttributes
     */
    @JsonGetter("attributes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletAttributes getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Additional attributes associated with the use of this PayPal Wallet.
     * @param attributes Value for PaypalWalletAttributes
     */
    @JsonSetter("attributes")
    public void setAttributes(PaypalWalletAttributes attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for ExperienceContext.
     * Customizes the payer experience during the approval process for payment with PayPal. Note:
     * Partners and Marketplaces might configure brand_name and shipping_preference during partner
     * account setup, which overrides the request values.
     * @return Returns the PaypalWalletExperienceContext
     */
    @JsonGetter("experience_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletExperienceContext getExperienceContext() {
        return experienceContext;
    }

    /**
     * Setter for ExperienceContext.
     * Customizes the payer experience during the approval process for payment with PayPal. Note:
     * Partners and Marketplaces might configure brand_name and shipping_preference during partner
     * account setup, which overrides the request values.
     * @param experienceContext Value for PaypalWalletExperienceContext
     */
    @JsonSetter("experience_context")
    public void setExperienceContext(PaypalWalletExperienceContext experienceContext) {
        this.experienceContext = experienceContext;
    }

    /**
     * Getter for BillingAgreementId.
     * The PayPal billing agreement ID. References an approved recurring payment for goods or
     * services.
     * @return Returns the String
     */
    @JsonGetter("billing_agreement_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingAgreementId() {
        return billingAgreementId;
    }

    /**
     * Setter for BillingAgreementId.
     * The PayPal billing agreement ID. References an approved recurring payment for goods or
     * services.
     * @param billingAgreementId Value for String
     */
    @JsonSetter("billing_agreement_id")
    public void setBillingAgreementId(String billingAgreementId) {
        this.billingAgreementId = billingAgreementId;
    }

    /**
     * Getter for StoredCredential.
     * Provides additional details to process a payment using the PayPal wallet billing agreement or
     * a vaulted payment method that has been stored or is intended to be stored.
     * @return Returns the PaypalWalletStoredCredential
     */
    @JsonGetter("stored_credential")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalWalletStoredCredential getStoredCredential() {
        return storedCredential;
    }

    /**
     * Setter for StoredCredential.
     * Provides additional details to process a payment using the PayPal wallet billing agreement or
     * a vaulted payment method that has been stored or is intended to be stored.
     * @param storedCredential Value for PaypalWalletStoredCredential
     */
    @JsonSetter("stored_credential")
    public void setStoredCredential(PaypalWalletStoredCredential storedCredential) {
        this.storedCredential = storedCredential;
    }

    /**
     * Converts this PaypalWallet into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaypalWallet [" + "vaultId=" + vaultId + ", emailAddress=" + emailAddress
                + ", name=" + name + ", phone=" + phone + ", birthDate=" + birthDate + ", taxInfo="
                + taxInfo + ", address=" + address + ", attributes=" + attributes
                + ", experienceContext=" + experienceContext + ", billingAgreementId="
                + billingAgreementId + ", storedCredential=" + storedCredential + "]";
    }

    /**
     * Builds a new {@link PaypalWallet.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaypalWallet.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .vaultId(getVaultId())
                .emailAddress(getEmailAddress())
                .name(getName())
                .phone(getPhone())
                .birthDate(getBirthDate())
                .taxInfo(getTaxInfo())
                .address(getAddress())
                .attributes(getAttributes())
                .experienceContext(getExperienceContext())
                .billingAgreementId(getBillingAgreementId())
                .storedCredential(getStoredCredential());
        return builder;
    }

    /**
     * Class to build instances of {@link PaypalWallet}.
     */
    public static class Builder {
        private String vaultId;
        private String emailAddress;
        private Name name;
        private PhoneWithType phone;
        private String birthDate;
        private TaxInfo taxInfo;
        private Address address;
        private PaypalWalletAttributes attributes;
        private PaypalWalletExperienceContext experienceContext;
        private String billingAgreementId;
        private PaypalWalletStoredCredential storedCredential;



        /**
         * Setter for vaultId.
         * @param  vaultId  String value for vaultId.
         * @return Builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }

        /**
         * Setter for emailAddress.
         * @param  emailAddress  String value for emailAddress.
         * @return Builder
         */
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  Name value for name.
         * @return Builder
         */
        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for phone.
         * @param  phone  PhoneWithType value for phone.
         * @return Builder
         */
        public Builder phone(PhoneWithType phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for birthDate.
         * @param  birthDate  String value for birthDate.
         * @return Builder
         */
        public Builder birthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        /**
         * Setter for taxInfo.
         * @param  taxInfo  TaxInfo value for taxInfo.
         * @return Builder
         */
        public Builder taxInfo(TaxInfo taxInfo) {
            this.taxInfo = taxInfo;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  Address value for address.
         * @return Builder
         */
        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for attributes.
         * @param  attributes  PaypalWalletAttributes value for attributes.
         * @return Builder
         */
        public Builder attributes(PaypalWalletAttributes attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Setter for experienceContext.
         * @param  experienceContext  PaypalWalletExperienceContext value for experienceContext.
         * @return Builder
         */
        public Builder experienceContext(PaypalWalletExperienceContext experienceContext) {
            this.experienceContext = experienceContext;
            return this;
        }

        /**
         * Setter for billingAgreementId.
         * @param  billingAgreementId  String value for billingAgreementId.
         * @return Builder
         */
        public Builder billingAgreementId(String billingAgreementId) {
            this.billingAgreementId = billingAgreementId;
            return this;
        }

        /**
         * Setter for storedCredential.
         * @param  storedCredential  PaypalWalletStoredCredential value for storedCredential.
         * @return Builder
         */
        public Builder storedCredential(PaypalWalletStoredCredential storedCredential) {
            this.storedCredential = storedCredential;
            return this;
        }

        /**
         * Builds a new {@link PaypalWallet} object using the set fields.
         * @return {@link PaypalWallet}
         */
        public PaypalWallet build() {
            return new PaypalWallet(vaultId, emailAddress, name, phone, birthDate, taxInfo, address,
                    attributes, experienceContext, billingAgreementId, storedCredential);
        }
    }
}
