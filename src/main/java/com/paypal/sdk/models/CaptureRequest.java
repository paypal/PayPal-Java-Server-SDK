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
 * This is a model class for CaptureRequest type.
 */
public class CaptureRequest {
    private String invoiceId;
    private String noteToPayer;
    private Money amount;
    private Boolean finalCapture;
    private CapturePaymentInstruction paymentInstruction;
    private String softDescriptor;

    /**
     * Default constructor.
     */
    public CaptureRequest() {
        finalCapture = false;
    }

    /**
     * Initialization constructor.
     * @param  invoiceId  String value for invoiceId.
     * @param  noteToPayer  String value for noteToPayer.
     * @param  amount  Money value for amount.
     * @param  finalCapture  Boolean value for finalCapture.
     * @param  paymentInstruction  CapturePaymentInstruction value for paymentInstruction.
     * @param  softDescriptor  String value for softDescriptor.
     */
    public CaptureRequest(
            String invoiceId,
            String noteToPayer,
            Money amount,
            Boolean finalCapture,
            CapturePaymentInstruction paymentInstruction,
            String softDescriptor) {
        this.invoiceId = invoiceId;
        this.noteToPayer = noteToPayer;
        this.amount = amount;
        this.finalCapture = finalCapture;
        this.paymentInstruction = paymentInstruction;
        this.softDescriptor = softDescriptor;
    }

    /**
     * Getter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @return Returns the String
     */
    @JsonGetter("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInvoiceId() {
        return invoiceId;
    }

    /**
     * Setter for InvoiceId.
     * The API caller-provided external invoice number for this order. Appears in both the payer's
     * transaction history and the emails that the payer receives.
     * @param invoiceId Value for String
     */
    @JsonSetter("invoice_id")
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Getter for NoteToPayer.
     * An informational note about this settlement. Appears in both the payer's transaction history
     * and the emails that the payer receives.
     * @return Returns the String
     */
    @JsonGetter("note_to_payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoteToPayer() {
        return noteToPayer;
    }

    /**
     * Setter for NoteToPayer.
     * An informational note about this settlement. Appears in both the payer's transaction history
     * and the emails that the payer receives.
     * @param noteToPayer Value for String
     */
    @JsonSetter("note_to_payer")
    public void setNoteToPayer(String noteToPayer) {
        this.noteToPayer = noteToPayer;
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
     * Getter for FinalCapture.
     * Indicates whether you can make additional captures against the authorized payment. Set to
     * `true` if you do not intend to capture additional payments against the authorization. Set to
     * `false` if you intend to capture additional payments against the authorization.
     * @return Returns the Boolean
     */
    @JsonGetter("final_capture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getFinalCapture() {
        return finalCapture;
    }

    /**
     * Setter for FinalCapture.
     * Indicates whether you can make additional captures against the authorized payment. Set to
     * `true` if you do not intend to capture additional payments against the authorization. Set to
     * `false` if you intend to capture additional payments against the authorization.
     * @param finalCapture Value for Boolean
     */
    @JsonSetter("final_capture")
    public void setFinalCapture(Boolean finalCapture) {
        this.finalCapture = finalCapture;
    }

    /**
     * Getter for PaymentInstruction.
     * Any additional payment instructions to be consider during payment processing. This processing
     * instruction is applicable for Capturing an order or Authorizing an Order.
     * @return Returns the CapturePaymentInstruction
     */
    @JsonGetter("payment_instruction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CapturePaymentInstruction getPaymentInstruction() {
        return paymentInstruction;
    }

    /**
     * Setter for PaymentInstruction.
     * Any additional payment instructions to be consider during payment processing. This processing
     * instruction is applicable for Capturing an order or Authorizing an Order.
     * @param paymentInstruction Value for CapturePaymentInstruction
     */
    @JsonSetter("payment_instruction")
    public void setPaymentInstruction(CapturePaymentInstruction paymentInstruction) {
        this.paymentInstruction = paymentInstruction;
    }

    /**
     * Getter for SoftDescriptor.
     * The payment descriptor on the payer's account statement.
     * @return Returns the String
     */
    @JsonGetter("soft_descriptor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSoftDescriptor() {
        return softDescriptor;
    }

    /**
     * Setter for SoftDescriptor.
     * The payment descriptor on the payer's account statement.
     * @param softDescriptor Value for String
     */
    @JsonSetter("soft_descriptor")
    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    /**
     * Converts this CaptureRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CaptureRequest [" + "invoiceId=" + invoiceId + ", noteToPayer=" + noteToPayer
                + ", amount=" + amount + ", finalCapture=" + finalCapture + ", paymentInstruction="
                + paymentInstruction + ", softDescriptor=" + softDescriptor + "]";
    }

    /**
     * Builds a new {@link CaptureRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CaptureRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .invoiceId(getInvoiceId())
                .noteToPayer(getNoteToPayer())
                .amount(getAmount())
                .finalCapture(getFinalCapture())
                .paymentInstruction(getPaymentInstruction())
                .softDescriptor(getSoftDescriptor());
        return builder;
    }

    /**
     * Class to build instances of {@link CaptureRequest}.
     */
    public static class Builder {
        private String invoiceId;
        private String noteToPayer;
        private Money amount;
        private Boolean finalCapture = false;
        private CapturePaymentInstruction paymentInstruction;
        private String softDescriptor;



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
         * Setter for amount.
         * @param  amount  Money value for amount.
         * @return Builder
         */
        public Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for finalCapture.
         * @param  finalCapture  Boolean value for finalCapture.
         * @return Builder
         */
        public Builder finalCapture(Boolean finalCapture) {
            this.finalCapture = finalCapture;
            return this;
        }

        /**
         * Setter for paymentInstruction.
         * @param  paymentInstruction  CapturePaymentInstruction value for paymentInstruction.
         * @return Builder
         */
        public Builder paymentInstruction(CapturePaymentInstruction paymentInstruction) {
            this.paymentInstruction = paymentInstruction;
            return this;
        }

        /**
         * Setter for softDescriptor.
         * @param  softDescriptor  String value for softDescriptor.
         * @return Builder
         */
        public Builder softDescriptor(String softDescriptor) {
            this.softDescriptor = softDescriptor;
            return this;
        }

        /**
         * Builds a new {@link CaptureRequest} object using the set fields.
         * @return {@link CaptureRequest}
         */
        public CaptureRequest build() {
            return new CaptureRequest(invoiceId, noteToPayer, amount, finalCapture,
                    paymentInstruction, softDescriptor);
        }
    }
}
