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
 * This is a model class for PaymentMethodPreference type.
 */
public class PaymentMethodPreference {
    private PayeePaymentMethodPreference payeePreferred;
    private StandardEntryClassCode standardEntryClassCode;

    /**
     * Default constructor.
     */
    public PaymentMethodPreference() {
        payeePreferred = PayeePaymentMethodPreference.UNRESTRICTED;
        standardEntryClassCode = StandardEntryClassCode.WEB;
    }

    /**
     * Initialization constructor.
     * @param  payeePreferred  PayeePaymentMethodPreference value for payeePreferred.
     * @param  standardEntryClassCode  StandardEntryClassCode value for standardEntryClassCode.
     */
    public PaymentMethodPreference(
            PayeePaymentMethodPreference payeePreferred,
            StandardEntryClassCode standardEntryClassCode) {
        this.payeePreferred = payeePreferred;
        this.standardEntryClassCode = standardEntryClassCode;
    }

    /**
     * Getter for PayeePreferred.
     * The merchant-preferred payment methods.
     * @return Returns the PayeePaymentMethodPreference
     */
    @JsonGetter("payee_preferred")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeePaymentMethodPreference getPayeePreferred() {
        return payeePreferred;
    }

    /**
     * Setter for PayeePreferred.
     * The merchant-preferred payment methods.
     * @param payeePreferred Value for PayeePaymentMethodPreference
     */
    @JsonSetter("payee_preferred")
    public void setPayeePreferred(PayeePaymentMethodPreference payeePreferred) {
        this.payeePreferred = payeePreferred;
    }

    /**
     * Getter for StandardEntryClassCode.
     * NACHA (the regulatory body governing the ACH network) requires that API callers (merchants,
     * partners) obtain the consumer’s explicit authorization before initiating a transaction. To
     * stay compliant, you’ll need to make sure that you retain a compliant authorization for each
     * transaction that you originate to the ACH Network using this API. ACH transactions are
     * categorized (using SEC codes) by how you capture authorization from the Receiver (the person
     * whose bank account is being debited or credited). PayPal supports the following SEC codes.
     * @return Returns the StandardEntryClassCode
     */
    @JsonGetter("standard_entry_class_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StandardEntryClassCode getStandardEntryClassCode() {
        return standardEntryClassCode;
    }

    /**
     * Setter for StandardEntryClassCode.
     * NACHA (the regulatory body governing the ACH network) requires that API callers (merchants,
     * partners) obtain the consumer’s explicit authorization before initiating a transaction. To
     * stay compliant, you’ll need to make sure that you retain a compliant authorization for each
     * transaction that you originate to the ACH Network using this API. ACH transactions are
     * categorized (using SEC codes) by how you capture authorization from the Receiver (the person
     * whose bank account is being debited or credited). PayPal supports the following SEC codes.
     * @param standardEntryClassCode Value for StandardEntryClassCode
     */
    @JsonSetter("standard_entry_class_code")
    public void setStandardEntryClassCode(StandardEntryClassCode standardEntryClassCode) {
        this.standardEntryClassCode = standardEntryClassCode;
    }

    /**
     * Converts this PaymentMethodPreference into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethodPreference [" + "payeePreferred=" + payeePreferred
                + ", standardEntryClassCode=" + standardEntryClassCode + "]";
    }

    /**
     * Builds a new {@link PaymentMethodPreference.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentMethodPreference.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payeePreferred(getPayeePreferred())
                .standardEntryClassCode(getStandardEntryClassCode());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethodPreference}.
     */
    public static class Builder {
        private PayeePaymentMethodPreference payeePreferred =
                PayeePaymentMethodPreference.UNRESTRICTED;
        private StandardEntryClassCode standardEntryClassCode = StandardEntryClassCode.WEB;



        /**
         * Setter for payeePreferred.
         * @param  payeePreferred  PayeePaymentMethodPreference value for payeePreferred.
         * @return Builder
         */
        public Builder payeePreferred(PayeePaymentMethodPreference payeePreferred) {
            this.payeePreferred = payeePreferred;
            return this;
        }

        /**
         * Setter for standardEntryClassCode.
         * @param  standardEntryClassCode  StandardEntryClassCode value for standardEntryClassCode.
         * @return Builder
         */
        public Builder standardEntryClassCode(StandardEntryClassCode standardEntryClassCode) {
            this.standardEntryClassCode = standardEntryClassCode;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethodPreference} object using the set fields.
         * @return {@link PaymentMethodPreference}
         */
        public PaymentMethodPreference build() {
            return new PaymentMethodPreference(payeePreferred, standardEntryClassCode);
        }
    }
}