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
 * ShippingType to be used.
 */
public enum ShippingType {
    SHIPPING,

    PICKUP,

    PICKUP_IN_STORE,

    PICKUP_FROM_PERSON,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, ShippingType> valueMap = new TreeMap<>();
    private String value;

    static {
        SHIPPING.value = "SHIPPING";
        PICKUP.value = "PICKUP";
        PICKUP_IN_STORE.value = "PICKUP_IN_STORE";
        PICKUP_FROM_PERSON.value = "PICKUP_FROM_PERSON";
        _UNKNOWN.value = null;

        valueMap.put("SHIPPING", SHIPPING);
        valueMap.put("PICKUP", PICKUP);
        valueMap.put("PICKUP_IN_STORE", PICKUP_IN_STORE);
        valueMap.put("PICKUP_FROM_PERSON", PICKUP_FROM_PERSON);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ShippingType constructFromString(String toConvert) throws IOException {
        ShippingType enumValue = fromString(toConvert);
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
    public static ShippingType fromString(String toConvert) {
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
     * Convert list of ShippingType values to list of string values.
     * @param toConvert The list of ShippingType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ShippingType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ShippingType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 