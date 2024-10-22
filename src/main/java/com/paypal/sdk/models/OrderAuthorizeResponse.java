/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for OrderAuthorizeResponse type.
 */
public class OrderAuthorizeResponse {
    private String createTime;
    private String updateTime;
    private String id;
    private OrderAuthorizeResponsePaymentSource paymentSource;
    private CheckoutPaymentIntent intent;
    private ProcessingInstruction processingInstruction;
    private Payer payer;
    private List<PurchaseUnit> purchaseUnits;
    private OrderStatus status;
    private List<LinkDescription> links;

    /**
     * Default constructor.
     */
    public OrderAuthorizeResponse() {
        processingInstruction = ProcessingInstruction.NO_INSTRUCTION;
    }

    /**
     * Initialization constructor.
     * @param  createTime  String value for createTime.
     * @param  updateTime  String value for updateTime.
     * @param  id  String value for id.
     * @param  paymentSource  OrderAuthorizeResponsePaymentSource value for paymentSource.
     * @param  intent  CheckoutPaymentIntent value for intent.
     * @param  processingInstruction  ProcessingInstruction value for processingInstruction.
     * @param  payer  Payer value for payer.
     * @param  purchaseUnits  List of PurchaseUnit value for purchaseUnits.
     * @param  status  OrderStatus value for status.
     * @param  links  List of LinkDescription value for links.
     */
    public OrderAuthorizeResponse(
            String createTime,
            String updateTime,
            String id,
            OrderAuthorizeResponsePaymentSource paymentSource,
            CheckoutPaymentIntent intent,
            ProcessingInstruction processingInstruction,
            Payer payer,
            List<PurchaseUnit> purchaseUnits,
            OrderStatus status,
            List<LinkDescription> links) {
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.id = id;
        this.paymentSource = paymentSource;
        this.intent = intent;
        this.processingInstruction = processingInstruction;
        this.payer = payer;
        this.purchaseUnits = purchaseUnits;
        this.status = status;
        this.links = links;
    }

    /**
     * Getter for CreateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("create_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreateTime() {
        return createTime;
    }

    /**
     * Setter for CreateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param createTime Value for String
     */
    @JsonSetter("create_time")
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter for UpdateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("update_time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Setter for UpdateTime.
     * The date and time, in [Internet date and time
     * format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while
     * fractional seconds are optional.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The regular expression
     * provides guidance but does not reject all invalid dates.&lt;/blockquote&gt;
     * @param updateTime Value for String
     */
    @JsonSetter("update_time")
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Getter for Id.
     * The ID of the order.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the order.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for PaymentSource.
     * The payment source used to fund the payment.
     * @return Returns the OrderAuthorizeResponsePaymentSource
     */
    @JsonGetter("payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderAuthorizeResponsePaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment source used to fund the payment.
     * @param paymentSource Value for OrderAuthorizeResponsePaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(OrderAuthorizeResponsePaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for Intent.
     * The intent to either capture payment immediately or authorize a payment for an order after
     * order creation.
     * @return Returns the CheckoutPaymentIntent
     */
    @JsonGetter("intent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CheckoutPaymentIntent getIntent() {
        return intent;
    }

    /**
     * Setter for Intent.
     * The intent to either capture payment immediately or authorize a payment for an order after
     * order creation.
     * @param intent Value for CheckoutPaymentIntent
     */
    @JsonSetter("intent")
    public void setIntent(CheckoutPaymentIntent intent) {
        this.intent = intent;
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
     * Getter for Payer.
     * @return Returns the Payer
     */
    @JsonGetter("payer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Payer getPayer() {
        return payer;
    }

    /**
     * Setter for Payer.
     * @param payer Value for Payer
     */
    @JsonSetter("payer")
    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    /**
     * Getter for PurchaseUnits.
     * An array of purchase units. Each purchase unit establishes a contract between a customer and
     * merchant. Each purchase unit represents either a full or partial order that the customer
     * intends to purchase from the merchant.
     * @return Returns the List of PurchaseUnit
     */
    @JsonGetter("purchase_units")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PurchaseUnit> getPurchaseUnits() {
        return purchaseUnits;
    }

    /**
     * Setter for PurchaseUnits.
     * An array of purchase units. Each purchase unit establishes a contract between a customer and
     * merchant. Each purchase unit represents either a full or partial order that the customer
     * intends to purchase from the merchant.
     * @param purchaseUnits Value for List of PurchaseUnit
     */
    @JsonSetter("purchase_units")
    public void setPurchaseUnits(List<PurchaseUnit> purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    /**
     * Getter for Status.
     * The order status.
     * @return Returns the OrderStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The order status.
     * @param status Value for OrderStatus
     */
    @JsonSetter("status")
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    /**
     * Getter for Links.
     * An array of request-related [HATEOAS links](/api/rest/responses/#hateoas-links) that are
     * either relevant to the issue by providing additional information or offering potential
     * resolutions.
     * @return Returns the List of LinkDescription
     */
    @JsonGetter("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<LinkDescription> getLinks() {
        return links;
    }

    /**
     * Setter for Links.
     * An array of request-related [HATEOAS links](/api/rest/responses/#hateoas-links) that are
     * either relevant to the issue by providing additional information or offering potential
     * resolutions.
     * @param links Value for List of LinkDescription
     */
    @JsonSetter("links")
    public void setLinks(List<LinkDescription> links) {
        this.links = links;
    }

    /**
     * Converts this OrderAuthorizeResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderAuthorizeResponse [" + "createTime=" + createTime + ", updateTime="
                + updateTime + ", id=" + id + ", paymentSource=" + paymentSource + ", intent="
                + intent + ", processingInstruction=" + processingInstruction + ", payer=" + payer
                + ", purchaseUnits=" + purchaseUnits + ", status=" + status + ", links=" + links
                + "]";
    }

    /**
     * Builds a new {@link OrderAuthorizeResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderAuthorizeResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .createTime(getCreateTime())
                .updateTime(getUpdateTime())
                .id(getId())
                .paymentSource(getPaymentSource())
                .intent(getIntent())
                .processingInstruction(getProcessingInstruction())
                .payer(getPayer())
                .purchaseUnits(getPurchaseUnits())
                .status(getStatus())
                .links(getLinks());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderAuthorizeResponse}.
     */
    public static class Builder {
        private String createTime;
        private String updateTime;
        private String id;
        private OrderAuthorizeResponsePaymentSource paymentSource;
        private CheckoutPaymentIntent intent;
        private ProcessingInstruction processingInstruction = ProcessingInstruction.NO_INSTRUCTION;
        private Payer payer;
        private List<PurchaseUnit> purchaseUnits;
        private OrderStatus status;
        private List<LinkDescription> links;



        /**
         * Setter for createTime.
         * @param  createTime  String value for createTime.
         * @return Builder
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Setter for updateTime.
         * @param  updateTime  String value for updateTime.
         * @return Builder
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  OrderAuthorizeResponsePaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(OrderAuthorizeResponsePaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for intent.
         * @param  intent  CheckoutPaymentIntent value for intent.
         * @return Builder
         */
        public Builder intent(CheckoutPaymentIntent intent) {
            this.intent = intent;
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
         * Setter for payer.
         * @param  payer  Payer value for payer.
         * @return Builder
         */
        public Builder payer(Payer payer) {
            this.payer = payer;
            return this;
        }

        /**
         * Setter for purchaseUnits.
         * @param  purchaseUnits  List of PurchaseUnit value for purchaseUnits.
         * @return Builder
         */
        public Builder purchaseUnits(List<PurchaseUnit> purchaseUnits) {
            this.purchaseUnits = purchaseUnits;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  OrderStatus value for status.
         * @return Builder
         */
        public Builder status(OrderStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for links.
         * @param  links  List of LinkDescription value for links.
         * @return Builder
         */
        public Builder links(List<LinkDescription> links) {
            this.links = links;
            return this;
        }

        /**
         * Builds a new {@link OrderAuthorizeResponse} object using the set fields.
         * @return {@link OrderAuthorizeResponse}
         */
        public OrderAuthorizeResponse build() {
            return new OrderAuthorizeResponse(createTime, updateTime, id, paymentSource, intent,
                    processingInstruction, payer, purchaseUnits, status, links);
        }
    }
}
