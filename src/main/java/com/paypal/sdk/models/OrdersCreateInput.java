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
 * This is a model class for OrdersCreateInput type.
 */
public class OrdersCreateInput {
    private String contentType;
    private OrderRequest body;
    private String paypalRequestId;
    private String paypalPartnerAttributionId;
    private String paypalClientMetadataId;
    private String prefer;

    /**
     * Default constructor.
     */
    public OrdersCreateInput() {
        contentType = "application/json";
        prefer = "return=minimal";
    }

    /**
     * Initialization constructor.
     * @param  contentType  String value for contentType.
     * @param  body  OrderRequest value for body.
     * @param  paypalRequestId  String value for paypalRequestId.
     * @param  paypalPartnerAttributionId  String value for paypalPartnerAttributionId.
     * @param  paypalClientMetadataId  String value for paypalClientMetadataId.
     * @param  prefer  String value for prefer.
     */
    public OrdersCreateInput(
            String contentType,
            OrderRequest body,
            String paypalRequestId,
            String paypalPartnerAttributionId,
            String paypalClientMetadataId,
            String prefer) {
        this.contentType = contentType;
        this.body = body;
        this.paypalRequestId = paypalRequestId;
        this.paypalPartnerAttributionId = paypalPartnerAttributionId;
        this.paypalClientMetadataId = paypalClientMetadataId;
        this.prefer = prefer;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("Content-Type")
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("Content-Type")
    private void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Body.
     * @return Returns the OrderRequest
     */
    @JsonGetter("body")
    public OrderRequest getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * @param body Value for OrderRequest
     */
    @JsonSetter("body")
    public void setBody(OrderRequest body) {
        this.body = body;
    }

    /**
     * Getter for PaypalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Request-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalRequestId() {
        return paypalRequestId;
    }

    /**
     * Setter for PaypalRequestId.
     * The server stores keys for 6 hours. The API callers can request the times to up to 72 hours
     * by speaking to their Account Manager.
     * @param paypalRequestId Value for String
     */
    @JsonSetter("PayPal-Request-Id")
    public void setPaypalRequestId(String paypalRequestId) {
        this.paypalRequestId = paypalRequestId;
    }

    /**
     * Getter for PaypalPartnerAttributionId.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Partner-Attribution-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalPartnerAttributionId() {
        return paypalPartnerAttributionId;
    }

    /**
     * Setter for PaypalPartnerAttributionId.
     * @param paypalPartnerAttributionId Value for String
     */
    @JsonSetter("PayPal-Partner-Attribution-Id")
    public void setPaypalPartnerAttributionId(String paypalPartnerAttributionId) {
        this.paypalPartnerAttributionId = paypalPartnerAttributionId;
    }

    /**
     * Getter for PaypalClientMetadataId.
     * @return Returns the String
     */
    @JsonGetter("PayPal-Client-Metadata-Id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPaypalClientMetadataId() {
        return paypalClientMetadataId;
    }

    /**
     * Setter for PaypalClientMetadataId.
     * @param paypalClientMetadataId Value for String
     */
    @JsonSetter("PayPal-Client-Metadata-Id")
    public void setPaypalClientMetadataId(String paypalClientMetadataId) {
        this.paypalClientMetadataId = paypalClientMetadataId;
    }

    /**
     * Getter for Prefer.
     * The preferred server response upon successful completion of the request. Value
     * is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;. The server returns a minimal response to optimize
     * communication between the API caller and the server. A minimal response includes the
     * &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS
     * links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server returns a complete resource
     * representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt;
     * @return Returns the String
     */
    @JsonGetter("Prefer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrefer() {
        return prefer;
    }

    /**
     * Setter for Prefer.
     * The preferred server response upon successful completion of the request. Value
     * is:&lt;ul&gt;&lt;li&gt;&lt;code&gt;return=minimal&lt;/code&gt;. The server returns a minimal response to optimize
     * communication between the API caller and the server. A minimal response includes the
     * &lt;code&gt;id&lt;/code&gt;, &lt;code&gt;status&lt;/code&gt; and HATEOAS
     * links.&lt;/li&gt;&lt;li&gt;&lt;code&gt;return=representation&lt;/code&gt;. The server returns a complete resource
     * representation, including the current state of the resource.&lt;/li&gt;&lt;/ul&gt;
     * @param prefer Value for String
     */
    @JsonSetter("Prefer")
    public void setPrefer(String prefer) {
        this.prefer = prefer;
    }

    /**
     * Converts this OrdersCreateInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersCreateInput [" + "contentType=" + contentType + ", body=" + body
                + ", paypalRequestId=" + paypalRequestId + ", paypalPartnerAttributionId="
                + paypalPartnerAttributionId + ", paypalClientMetadataId=" + paypalClientMetadataId
                + ", prefer=" + prefer + "]";
    }

    /**
     * Builds a new {@link OrdersCreateInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersCreateInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(contentType, body)
                .paypalRequestId(getPaypalRequestId())
                .paypalPartnerAttributionId(getPaypalPartnerAttributionId())
                .paypalClientMetadataId(getPaypalClientMetadataId())
                .prefer(getPrefer());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersCreateInput}.
     */
    public static class Builder {
        private String contentType = "application/json";
        private OrderRequest body;
        private String paypalRequestId;
        private String paypalPartnerAttributionId;
        private String paypalClientMetadataId;
        private String prefer = "return=minimal";

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  contentType  String value for contentType.
         * @param  body  OrderRequest value for body.
         */
        public Builder(String contentType, OrderRequest body) {
            this.contentType = contentType;
            this.body = body;
        }

        /**
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  OrderRequest value for body.
         * @return Builder
         */
        public Builder body(OrderRequest body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for paypalRequestId.
         * @param  paypalRequestId  String value for paypalRequestId.
         * @return Builder
         */
        public Builder paypalRequestId(String paypalRequestId) {
            this.paypalRequestId = paypalRequestId;
            return this;
        }

        /**
         * Setter for paypalPartnerAttributionId.
         * @param  paypalPartnerAttributionId  String value for paypalPartnerAttributionId.
         * @return Builder
         */
        public Builder paypalPartnerAttributionId(String paypalPartnerAttributionId) {
            this.paypalPartnerAttributionId = paypalPartnerAttributionId;
            return this;
        }

        /**
         * Setter for paypalClientMetadataId.
         * @param  paypalClientMetadataId  String value for paypalClientMetadataId.
         * @return Builder
         */
        public Builder paypalClientMetadataId(String paypalClientMetadataId) {
            this.paypalClientMetadataId = paypalClientMetadataId;
            return this;
        }

        /**
         * Setter for prefer.
         * @param  prefer  String value for prefer.
         * @return Builder
         */
        public Builder prefer(String prefer) {
            this.prefer = prefer;
            return this;
        }

        /**
         * Builds a new {@link OrdersCreateInput} object using the set fields.
         * @return {@link OrdersCreateInput}
         */
        public OrdersCreateInput build() {
            return new OrdersCreateInput(contentType, body, paypalRequestId,
                    paypalPartnerAttributionId, paypalClientMetadataId, prefer);
        }
    }
}
