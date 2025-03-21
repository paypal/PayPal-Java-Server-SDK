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
 * This is a model class for OrderUpdateCallbackResponse type.
 */
public class OrderUpdateCallbackResponse {
    private String id;
    private ShippingOptionsPurchaseUnit purchaseUnits;

    /**
     * Default constructor.
     */
    public OrderUpdateCallbackResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  purchaseUnits  ShippingOptionsPurchaseUnit value for purchaseUnits.
     */
    public OrderUpdateCallbackResponse(
            String id,
            ShippingOptionsPurchaseUnit purchaseUnits) {
        this.id = id;
        this.purchaseUnits = purchaseUnits;
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
     * Getter for PurchaseUnits.
     * This would contain shipping option and amount data at purchase unit level.
     * @return Returns the ShippingOptionsPurchaseUnit
     */
    @JsonGetter("purchase_units")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ShippingOptionsPurchaseUnit getPurchaseUnits() {
        return purchaseUnits;
    }

    /**
     * Setter for PurchaseUnits.
     * This would contain shipping option and amount data at purchase unit level.
     * @param purchaseUnits Value for ShippingOptionsPurchaseUnit
     */
    @JsonSetter("purchase_units")
    public void setPurchaseUnits(ShippingOptionsPurchaseUnit purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    /**
     * Converts this OrderUpdateCallbackResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderUpdateCallbackResponse [" + "id=" + id + ", purchaseUnits=" + purchaseUnits
                + "]";
    }

    /**
     * Builds a new {@link OrderUpdateCallbackResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderUpdateCallbackResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .purchaseUnits(getPurchaseUnits());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderUpdateCallbackResponse}.
     */
    public static class Builder {
        private String id;
        private ShippingOptionsPurchaseUnit purchaseUnits;



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
         * Setter for purchaseUnits.
         * @param  purchaseUnits  ShippingOptionsPurchaseUnit value for purchaseUnits.
         * @return Builder
         */
        public Builder purchaseUnits(ShippingOptionsPurchaseUnit purchaseUnits) {
            this.purchaseUnits = purchaseUnits;
            return this;
        }

        /**
         * Builds a new {@link OrderUpdateCallbackResponse} object using the set fields.
         * @return {@link OrderUpdateCallbackResponse}
         */
        public OrderUpdateCallbackResponse build() {
            return new OrderUpdateCallbackResponse(id, purchaseUnits);
        }
    }
}
