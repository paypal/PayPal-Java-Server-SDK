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
 * This is a model class for CaptureStatusDetails type.
 */
public class CaptureStatusDetails {
    private CaptureIncompleteReason reason;

    /**
     * Default constructor.
     */
    public CaptureStatusDetails() {
    }

    /**
     * Initialization constructor.
     * @param  reason  CaptureIncompleteReason value for reason.
     */
    public CaptureStatusDetails(
            CaptureIncompleteReason reason) {
        this.reason = reason;
    }

    /**
     * Getter for Reason.
     * The reason why the captured payment status is `PENDING` or `DENIED`.
     * @return Returns the CaptureIncompleteReason
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureIncompleteReason getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * The reason why the captured payment status is `PENDING` or `DENIED`.
     * @param reason Value for CaptureIncompleteReason
     */
    @JsonSetter("reason")
    public void setReason(CaptureIncompleteReason reason) {
        this.reason = reason;
    }

    /**
     * Converts this CaptureStatusDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CaptureStatusDetails [" + "reason=" + reason + "]";
    }

    /**
     * Builds a new {@link CaptureStatusDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CaptureStatusDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .reason(getReason());
        return builder;
    }

    /**
     * Class to build instances of {@link CaptureStatusDetails}.
     */
    public static class Builder {
        private CaptureIncompleteReason reason;



        /**
         * Setter for reason.
         * @param  reason  CaptureIncompleteReason value for reason.
         * @return Builder
         */
        public Builder reason(CaptureIncompleteReason reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds a new {@link CaptureStatusDetails} object using the set fields.
         * @return {@link CaptureStatusDetails}
         */
        public CaptureStatusDetails build() {
            return new CaptureStatusDetails(reason);
        }
    }
}
