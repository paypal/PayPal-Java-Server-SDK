/*
 * PayPalRESTAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CaptureStatusWithDetails type.
 */
public class CaptureStatusWithDetails {
    private CaptureStatus status;
    private CaptureStatusDetails statusDetails;

    /**
     * Default constructor.
     */
    public CaptureStatusWithDetails() {
    }

    /**
     * Initialization constructor.
     * @param  status  CaptureStatus value for status.
     * @param  statusDetails  CaptureStatusDetails value for statusDetails.
     */
    public CaptureStatusWithDetails(
            CaptureStatus status,
            CaptureStatusDetails statusDetails) {
        this.status = status;
        this.statusDetails = statusDetails;
    }

    /**
     * Getter for Status.
     * The status of the captured payment.
     * @return Returns the CaptureStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * The status of the captured payment.
     * @param status Value for CaptureStatus
     */
    @JsonSetter("status")
    public void setStatus(CaptureStatus status) {
        this.status = status;
    }

    /**
     * Getter for StatusDetails.
     * The details of the captured payment status.
     * @return Returns the CaptureStatusDetails
     */
    @JsonGetter("status_details")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CaptureStatusDetails getStatusDetails() {
        return statusDetails;
    }

    /**
     * Setter for StatusDetails.
     * The details of the captured payment status.
     * @param statusDetails Value for CaptureStatusDetails
     */
    @JsonSetter("status_details")
    public void setStatusDetails(CaptureStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * Converts this CaptureStatusWithDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CaptureStatusWithDetails [" + "status=" + status + ", statusDetails="
                + statusDetails + "]";
    }

    /**
     * Builds a new {@link CaptureStatusWithDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CaptureStatusWithDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .statusDetails(getStatusDetails());
        return builder;
    }

    /**
     * Class to build instances of {@link CaptureStatusWithDetails}.
     */
    public static class Builder {
        private CaptureStatus status;
        private CaptureStatusDetails statusDetails;



        /**
         * Setter for status.
         * @param  status  CaptureStatus value for status.
         * @return Builder
         */
        public Builder status(CaptureStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for statusDetails.
         * @param  statusDetails  CaptureStatusDetails value for statusDetails.
         * @return Builder
         */
        public Builder statusDetails(CaptureStatusDetails statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }

        /**
         * Builds a new {@link CaptureStatusWithDetails} object using the set fields.
         * @return {@link CaptureStatusWithDetails}
         */
        public CaptureStatusWithDetails build() {
            return new CaptureStatusWithDetails(status, statusDetails);
        }
    }
}
