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
 * This is a model class for RefundRequest type.
 */
public class RefundRequest {
    private Money amount;
    private String customId;
    private String invoiceId;
    private String noteToPayer;
    private RefundPaymentInstruction paymentInstruction;

    /**
     * Default constructor.
     */
    public RefundRequest() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Money value for amount.
     * @param  customId  String value for customId.
     * @param  invoiceId  String value for invoiceId.
     * @param  noteToPayer  String value for noteToPayer.
     * @param  paymentInstruction  RefundPaymentInstruction value for paymentInstruction.
     */
    public RefundRequest(
            Money amount,
            String customId,
            String invoiceId,
            String noteToPayer,
            RefundPaymentInstruction paymentInstruction) {
        this.amount = amount;
        this.customId = customId;
        this.invoiceId = invoiceId;
        this.noteToPayer = noteToPayer;
        this.paymentInstruction = paymentInstruction;
    }

    /**
     * Getter for Amount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param amount Value for Money
     */
    @JsonSetter("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * Getter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports. The pattern is defined by
     * an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("custom_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomId() {
        return customId;
    }

    /**
     * Setter for CustomId.
     * The API caller-provided external ID. Used to reconcile API caller-initiated transactions with
     * PayPal transactions. Appears in transaction and settlement reports. The pattern is defined by
     * an external party and supports Unicode.
     * @param customId Value for String
     */
    @JsonSetter("custom_id")
    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * Getter for InvoiceId.
     * The API caller-provided external invoice ID for this order. The pattern is defined by an
     * external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Setter for InvoiceId.
     * The API caller-provided external invoice ID for this order. The pattern is defined by an
     * external party and supports Unicode.
     * @param invoiceId Value for String
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Getter for NoteToPayer.
     * The reason for the refund. Appears in both the payer's transaction history and the emails
     * that the payer receives. The pattern is defined by an external party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("note_to_payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoteToPayer() {
        return noteToPayer;
    }

    /**
     * Setter for NoteToPayer.
     * The reason for the refund. Appears in both the payer's transaction history and the emails
     * that the payer receives. The pattern is defined by an external party and supports Unicode.
     * @param noteToPayer Value for String
     */
    @JsonSetter("note_to_payer")
    public void setNoteToPayer(String noteToPayer) {
        this.noteToPayer = noteToPayer;
    }

    /**
     * Getter for PaymentInstruction.
     * Any additional payments instructions during refund payment processing. This object is only
     * applicable to merchants that have been enabled for PayPal Commerce Platform for Marketplaces
     * and Platforms capability. Please speak to your account manager if you want to use this
     * capability.
     * @return Returns the RefundPaymentInstruction
     */
    @JsonGetter("payment_instruction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundPaymentInstruction getPaymentInstruction() {
        return paymentInstruction;
    }

    /**
     * Setter for PaymentInstruction.
     * Any additional payments instructions during refund payment processing. This object is only
     * applicable to merchants that have been enabled for PayPal Commerce Platform for Marketplaces
     * and Platforms capability. Please speak to your account manager if you want to use this
     * capability.
     * @param paymentInstruction Value for RefundPaymentInstruction
     */
    @JsonSetter("payment_instruction")
    public void setPaymentInstruction(RefundPaymentInstruction paymentInstruction) {
        this.paymentInstruction = paymentInstruction;
    }

    /**
     * Converts this RefundRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundRequest [" + "amount=" + amount + ", customId=" + customId + ", invoiceId="
                + invoiceId + ", noteToPayer=" + noteToPayer + ", paymentInstruction="
                + paymentInstruction + "]";
    }

    /**
     * Builds a new {@link RefundRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .customId(getCustomId())
                .invoiceId(getInvoiceId())
                .noteToPayer(getNoteToPayer())
                .paymentInstruction(getPaymentInstruction());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundRequest}.
     */
    public static class Builder {
        private Money amount;
        private String customId;
        private String invoiceId;
        private String noteToPayer;
        private RefundPaymentInstruction paymentInstruction;



        /**
         * Setter for amount.
         * @param  amount  Money value for amount.
         * @return Builder
         */
        public Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for customId.
         * @param  customId  String value for customId.
         * @return Builder
         */
        public Builder customId(String customId) {
            this.customId = customId;
            return this;
        }

        /**
         * Setter for invoiceId.
         * @param  invoiceId  String value for invoiceId.
         * @return Builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        /**
         * Setter for noteToPayer.
         * @param  noteToPayer  String value for noteToPayer.
         * @return Builder
         */
        public Builder noteToPayer(String noteToPayer) {
            this.noteToPayer = noteToPayer;
            return this;
        }

        /**
         * Setter for paymentInstruction.
         * @param  paymentInstruction  RefundPaymentInstruction value for paymentInstruction.
         * @return Builder
         */
        public Builder paymentInstruction(RefundPaymentInstruction paymentInstruction) {
            this.paymentInstruction = paymentInstruction;
            return this;
        }

        /**
         * Builds a new {@link RefundRequest} object using the set fields.
         * @return {@link RefundRequest}
         */
        public RefundRequest build() {
            return new RefundRequest(amount, customId, invoiceId, noteToPayer, paymentInstruction);
        }
    }
}