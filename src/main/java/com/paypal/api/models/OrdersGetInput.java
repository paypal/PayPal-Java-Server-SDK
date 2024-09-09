/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for OrdersGetInput type.
 */
public class OrdersGetInput {
    private String id;
    private String fields;

    /**
     * Default constructor.
     */
    public OrdersGetInput() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  fields  String value for fields.
     */
    public OrdersGetInput(
            String id,
            String fields) {
        this.id = id;
        this.fields = fields;
    }

    /**
     * Getter for Id.
     * The ID of the order for which to show details.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The ID of the order for which to show details.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Fields.
     * A comma-separated list of fields that should be returned for the order. Valid filter field is
     * `payment_source`.
     * @return Returns the String
     */
    @JsonGetter("fields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFields() {
        return fields;
    }

    /**
     * Setter for Fields.
     * A comma-separated list of fields that should be returned for the order. Valid filter field is
     * `payment_source`.
     * @param fields Value for String
     */
    @JsonSetter("fields")
    public void setFields(String fields) {
        this.fields = fields;
    }

    /**
     * Converts this OrdersGetInput into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrdersGetInput [" + "id=" + id + ", fields=" + fields + "]";
    }

    /**
     * Builds a new {@link OrdersGetInput.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrdersGetInput.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id)
                .fields(getFields());
        return builder;
    }

    /**
     * Class to build instances of {@link OrdersGetInput}.
     */
    public static class Builder {
        private String id;
        private String fields;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         */
        public Builder(String id) {
            this.id = id;
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
         * Setter for fields.
         * @param  fields  String value for fields.
         * @return Builder
         */
        public Builder fields(String fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Builds a new {@link OrdersGetInput} object using the set fields.
         * @return {@link OrdersGetInput}
         */
        public OrdersGetInput build() {
            return new OrdersGetInput(id, fields);
        }
    }
}
