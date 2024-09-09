/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UniversalProductCode type.
 */
public class UniversalProductCode {
    private UPCType type;
    private String code;

    /**
     * Default constructor.
     */
    public UniversalProductCode() {
    }

    /**
     * Initialization constructor.
     * @param  type  UPCType value for type.
     * @param  code  String value for code.
     */
    public UniversalProductCode(
            UPCType type,
            String code) {
        this.type = type;
        this.code = code;
    }

    /**
     * Getter for Type.
     * The Universal Product Code type.
     * @return Returns the UPCType
     */
    @JsonGetter("type")
    public UPCType getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The Universal Product Code type.
     * @param type Value for UPCType
     */
    @JsonSetter("type")
    public void setType(UPCType type) {
        this.type = type;
    }

    /**
     * Getter for Code.
     * The UPC product code of the item.
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * The UPC product code of the item.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Converts this UniversalProductCode into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UniversalProductCode [" + "type=" + type + ", code=" + code + "]";
    }

    /**
     * Builds a new {@link UniversalProductCode.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UniversalProductCode.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, code);
        return builder;
    }

    /**
     * Class to build instances of {@link UniversalProductCode}.
     */
    public static class Builder {
        private UPCType type;
        private String code;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  UPCType value for type.
         * @param  code  String value for code.
         */
        public Builder(UPCType type, String code) {
            this.type = type;
            this.code = code;
        }

        /**
         * Setter for type.
         * @param  type  UPCType value for type.
         * @return Builder
         */
        public Builder type(UPCType type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Builds a new {@link UniversalProductCode} object using the set fields.
         * @return {@link UniversalProductCode}
         */
        public UniversalProductCode build() {
            return new UniversalProductCode(type, code);
        }
    }
}