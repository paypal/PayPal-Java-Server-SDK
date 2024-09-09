/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * ShippingPreference to be used.
 */
public enum ShippingPreference {
    GET_FROM_FILE,

    NO_SHIPPING,

    SET_PROVIDED_ADDRESS,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, ShippingPreference> valueMap = new TreeMap<>();
    private String value;

    static {
        GET_FROM_FILE.value = "GET_FROM_FILE";
        NO_SHIPPING.value = "NO_SHIPPING";
        SET_PROVIDED_ADDRESS.value = "SET_PROVIDED_ADDRESS";
        _UNKNOWN.value = null;

        valueMap.put("GET_FROM_FILE", GET_FROM_FILE);
        valueMap.put("NO_SHIPPING", NO_SHIPPING);
        valueMap.put("SET_PROVIDED_ADDRESS", SET_PROVIDED_ADDRESS);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShippingPreference constructFromString(String toConvert) throws IOException {
        ShippingPreference enumValue = fromString(toConvert);
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
    public static ShippingPreference fromString(String toConvert) {
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
     * Convert list of ShippingPreference values to list of string values.
     * @param toConvert The list of ShippingPreference values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShippingPreference> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShippingPreference enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 