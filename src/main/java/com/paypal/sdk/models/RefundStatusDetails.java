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
 * This is a model class for RefundStatusDetails type.
 */
public class RefundStatusDetails {
    private RefundIncompleteReason reason;

    /**
     * Default constructor.
     */
    public RefundStatusDetails() {
    }

    /**
     * Initialization constructor.
     * @param  reason  RefundIncompleteReason value for reason.
     */
    public RefundStatusDetails(
            RefundIncompleteReason reason) {
        this.reason = reason;
    }

    /**
     * Getter for Reason.
     * The reason why the refund has the `PENDING` or `FAILED` status.
     * @return Returns the RefundIncompleteReason
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefundIncompleteReason getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * The reason why the refund has the `PENDING` or `FAILED` status.
     * @param reason Value for RefundIncompleteReason
     */
    @JsonSetter("reason")
    public void setReason(RefundIncompleteReason reason) {
        this.reason = reason;
    }

    /**
     * Converts this RefundStatusDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RefundStatusDetails [" + "reason=" + reason + "]";
    }

    /**
     * Builds a new {@link RefundStatusDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RefundStatusDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .reason(getReason());
        return builder;
    }

    /**
     * Class to build instances of {@link RefundStatusDetails}.
     */
    public static class Builder {
        private RefundIncompleteReason reason;



        /**
         * Setter for reason.
         * @param  reason  RefundIncompleteReason value for reason.
         * @return Builder
         */
        public Builder reason(RefundIncompleteReason reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds a new {@link RefundStatusDetails} object using the set fields.
         * @return {@link RefundStatusDetails}
         */
        public RefundStatusDetails build() {
            return new RefundStatusDetails(reason);
        }
    }
}
