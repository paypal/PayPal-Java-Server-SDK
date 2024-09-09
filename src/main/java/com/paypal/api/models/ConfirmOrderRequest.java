/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ConfirmOrderRequest type.
 */
public class ConfirmOrderRequest {
    private PaymentSource paymentSource;
    private ProcessingInstruction processingInstruction;
    private OrderConfirmApplicationContext applicationContext;

    /**
     * Default constructor.
     */
    public ConfirmOrderRequest() {
        processingInstruction = ProcessingInstruction.NO_INSTRUCTION;
    }

    /**
     * Initialization constructor.
     * @param  paymentSource  PaymentSource value for paymentSource.
     * @param  processingInstruction  ProcessingInstruction value for processingInstruction.
     * @param  applicationContext  OrderConfirmApplicationContext value for applicationContext.
     */
    public ConfirmOrderRequest(
            PaymentSource paymentSource,
            ProcessingInstruction processingInstruction,
            OrderConfirmApplicationContext applicationContext) {
        this.paymentSource = paymentSource;
        this.processingInstruction = processingInstruction;
        this.applicationContext = applicationContext;
    }

    /**
     * Getter for PaymentSource.
     * The payment source definition.
     * @return Returns the PaymentSource
     */
    @JsonGetter("payment_source")
    public PaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment source definition.
     * @param paymentSource Value for PaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(PaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for ProcessingInstruction.
     * The instruction to process an order.
     * @return Returns the ProcessingInstruction
     */
    @JsonGetter("processing_instruction")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProcessingInstruction getProcessingInstruction() {
        return processingInstruction;
    }

    /**
     * Setter for ProcessingInstruction.
     * The instruction to process an order.
     * @param processingInstruction Value for ProcessingInstruction
     */
    @JsonSetter("processing_instruction")
    public void setProcessingInstruction(ProcessingInstruction processingInstruction) {
        this.processingInstruction = processingInstruction;
    }

    /**
     * Getter for ApplicationContext.
     * Customizes the payer confirmation experience.
     * @return Returns the OrderConfirmApplicationContext
     */
    @JsonGetter("application_context")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderConfirmApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * Setter for ApplicationContext.
     * Customizes the payer confirmation experience.
     * @param applicationContext Value for OrderConfirmApplicationContext
     */
    @JsonSetter("application_context")
    public void setApplicationContext(OrderConfirmApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    /**
     * Converts this ConfirmOrderRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConfirmOrderRequest [" + "paymentSource=" + paymentSource
                + ", processingInstruction=" + processingInstruction + ", applicationContext="
                + applicationContext + "]";
    }

    /**
     * Builds a new {@link ConfirmOrderRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConfirmOrderRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentSource)
                .processingInstruction(getProcessingInstruction())
                .applicationContext(getApplicationContext());
        return builder;
    }

    /**
     * Class to build instances of {@link ConfirmOrderRequest}.
     */
    public static class Builder {
        private PaymentSource paymentSource;
        private ProcessingInstruction processingInstruction = ProcessingInstruction.NO_INSTRUCTION;
        private OrderConfirmApplicationContext applicationContext;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentSource  PaymentSource value for paymentSource.
         */
        public Builder(PaymentSource paymentSource) {
            this.paymentSource = paymentSource;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  PaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(PaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for processingInstruction.
         * @param  processingInstruction  ProcessingInstruction value for processingInstruction.
         * @return Builder
         */
        public Builder processingInstruction(ProcessingInstruction processingInstruction) {
            this.processingInstruction = processingInstruction;
            return this;
        }

        /**
         * Setter for applicationContext.
         * @param  applicationContext  OrderConfirmApplicationContext value for applicationContext.
         * @return Builder
         */
        public Builder applicationContext(OrderConfirmApplicationContext applicationContext) {
            this.applicationContext = applicationContext;
            return this;
        }

        /**
         * Builds a new {@link ConfirmOrderRequest} object using the set fields.
         * @return {@link ConfirmOrderRequest}
         */
        public ConfirmOrderRequest build() {
            return new ConfirmOrderRequest(paymentSource, processingInstruction,
                    applicationContext);
        }
    }
}
