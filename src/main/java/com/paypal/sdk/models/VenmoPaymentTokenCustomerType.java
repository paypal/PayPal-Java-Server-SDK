/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * VenmoPaymentTokenCustomerType to be used.
 */
public enum VenmoPaymentTokenCustomerType {
    /**
     * The customer vaulting the Venmo payment token is a consumer on the merchant / platform.
     */
    CONSUMER,

    /**
     * The customer vaulting the Venmo payment token is a business on merchant / platform.
     */
    BUSINESS,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, VenmoPaymentTokenCustomerType> valueMap = new TreeMap<>();
    private String value;

    static {
        CONSUMER.value = "CONSUMER";
        BUSINESS.value = "BUSINESS";
        _UNKNOWN.value = null;

        valueMap.put("CONSUMER", CONSUMER);
        valueMap.put("BUSINESS", BUSINESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static VenmoPaymentTokenCustomerType constructFromString(String toConvert) throws IOException {
        VenmoPaymentTokenCustomerType enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static VenmoPaymentTokenCustomerType fromString(String toConvert) {
        if (!valueMap.containsKey(toConvert)) {
            return _UNKNOWN;
        }
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

    /**
     * Convert list of VenmoPaymentTokenCustomerType values to list of string values.
     * @param toConvert The list of VenmoPaymentTokenCustomerType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<VenmoPaymentTokenCustomerType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (VenmoPaymentTokenCustomerType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 