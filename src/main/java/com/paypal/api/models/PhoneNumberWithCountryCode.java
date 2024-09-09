/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PhoneNumberWithCountryCode type.
 */
public class PhoneNumberWithCountryCode {
    private String countryCode;
    private String nationalNumber;

    /**
     * Default constructor.
     */
    public PhoneNumberWithCountryCode() {
    }

    /**
     * Initialization constructor.
     * @param  countryCode  String value for countryCode.
     * @param  nationalNumber  String value for nationalNumber.
     */
    public PhoneNumberWithCountryCode(
            String countryCode,
            String nationalNumber) {
        this.countryCode = countryCode;
        this.nationalNumber = nationalNumber;
    }

    /**
     * Getter for CountryCode.
     * The country calling code (CC), in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the CC and the
     * national number must not be greater than 15 digits. The national number consists of a
     * national destination code (NDC) and subscriber number (SN).
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The country calling code (CC), in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the CC and the
     * national number must not be greater than 15 digits. The national number consists of a
     * national destination code (NDC) and subscriber number (SN).
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for NationalNumber.
     * The national number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the country calling
     * code (CC) and the national number must not be greater than 15 digits. The national number
     * consists of a national destination code (NDC) and subscriber number (SN).
     * @return Returns the String
     */
    @JsonGetter("national_number")
    public String getNationalNumber() {
        return nationalNumber;
    }

    /**
     * Setter for NationalNumber.
     * The national number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en). The combined length of the country calling
     * code (CC) and the national number must not be greater than 15 digits. The national number
     * consists of a national destination code (NDC) and subscriber number (SN).
     * @param nationalNumber Value for String
     */
    @JsonSetter("national_number")
    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    /**
     * Converts this PhoneNumberWithCountryCode into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PhoneNumberWithCountryCode [" + "countryCode=" + countryCode + ", nationalNumber="
                + nationalNumber + "]";
    }

    /**
     * Builds a new {@link PhoneNumberWithCountryCode.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PhoneNumberWithCountryCode.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(countryCode, nationalNumber);
        return builder;
    }

    /**
     * Class to build instances of {@link PhoneNumberWithCountryCode}.
     */
    public static class Builder {
        private String countryCode;
        private String nationalNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  countryCode  String value for countryCode.
         * @param  nationalNumber  String value for nationalNumber.
         */
        public Builder(String countryCode, String nationalNumber) {
            this.countryCode = countryCode;
            this.nationalNumber = nationalNumber;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for nationalNumber.
         * @param  nationalNumber  String value for nationalNumber.
         * @return Builder
         */
        public Builder nationalNumber(String nationalNumber) {
            this.nationalNumber = nationalNumber;
            return this;
        }

        /**
         * Builds a new {@link PhoneNumberWithCountryCode} object using the set fields.
         * @return {@link PhoneNumberWithCountryCode}
         */
        public PhoneNumberWithCountryCode build() {
            return new PhoneNumberWithCountryCode(countryCode, nationalNumber);
        }
    }
}
