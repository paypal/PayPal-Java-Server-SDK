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
 * This is a model class for OrderUpdateCallbackErrorResponseDetails type.
 */
public class OrderUpdateCallbackErrorResponseDetails {
    private String field;
    private String value;
    private String issue;

    /**
     * Default constructor.
     */
    public OrderUpdateCallbackErrorResponseDetails() {
    }

    /**
     * Initialization constructor.
     * @param  issue  String value for issue.
     * @param  field  String value for field.
     * @param  value  String value for value.
     */
    public OrderUpdateCallbackErrorResponseDetails(
            String issue,
            String field,
            String value) {
        this.field = field;
        this.value = value;
        this.issue = issue;
    }

    /**
     * Getter for Field.
     * The field that caused the error. If this field is in the body, set this value to the field's
     * JSON pointer value. Required for client-side errors.
     * @return Returns the String
     */
    @JsonGetter("field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getField() {
        return field;
    }

    /**
     * Setter for Field.
     * The field that caused the error. If this field is in the body, set this value to the field's
     * JSON pointer value. Required for client-side errors.
     * @param field Value for String
     */
    @JsonSetter("field")
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Getter for Value.
     * The value of the field that caused the error.
     * @return Returns the String
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value of the field that caused the error.
     * @param value Value for String
     */
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Getter for Issue.
     * The unique, fine-grained application-level error code.
     * @return Returns the String
     */
    @JsonGetter("issue")
    public String getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * The unique, fine-grained application-level error code.
     * @param issue Value for String
     */
    @JsonSetter("issue")
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /**
     * Converts this OrderUpdateCallbackErrorResponseDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderUpdateCallbackErrorResponseDetails [" + "issue=" + issue + ", field=" + field
                + ", value=" + value + "]";
    }

    /**
     * Builds a new {@link OrderUpdateCallbackErrorResponseDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderUpdateCallbackErrorResponseDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(issue)
                .field(getField())
                .value(getValue());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderUpdateCallbackErrorResponseDetails}.
     */
    public static class Builder {
        private String issue;
        private String field;
        private String value;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  issue  String value for issue.
         */
        public Builder(String issue) {
            this.issue = issue;
        }

        /**
         * Setter for issue.
         * @param  issue  String value for issue.
         * @return Builder
         */
        public Builder issue(String issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for field.
         * @param  field  String value for field.
         * @return Builder
         */
        public Builder field(String field) {
            this.field = field;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  String value for value.
         * @return Builder
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * Builds a new {@link OrderUpdateCallbackErrorResponseDetails} object using the set fields.
         * @return {@link OrderUpdateCallbackErrorResponseDetails}
         */
        public OrderUpdateCallbackErrorResponseDetails build() {
            return new OrderUpdateCallbackErrorResponseDetails(issue, field, value);
        }
    }
}
