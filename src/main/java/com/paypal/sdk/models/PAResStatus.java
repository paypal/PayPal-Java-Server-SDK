/*
 * PaypalServerSDKLib
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
 * PAResStatus to be used.
 */
public enum PAResStatus {
    Y,

    N,

    U,

    A,

    C,

    R,

    D,

    I,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, PAResStatus> valueMap = new TreeMap<>();
    private String value;

    static {
        Y.value = "Y";
        N.value = "N";
        U.value = "U";
        A.value = "A";
        C.value = "C";
        R.value = "R";
        D.value = "D";
        I.value = "I";
        _UNKNOWN.value = null;

        valueMap.put("Y", Y);
        valueMap.put("N", N);
        valueMap.put("U", U);
        valueMap.put("A", A);
        valueMap.put("C", C);
        valueMap.put("R", R);
        valueMap.put("D", D);
        valueMap.put("I", I);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PAResStatus constructFromString(String toConvert) throws IOException {
        PAResStatus enumValue = fromString(toConvert);
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
    public static PAResStatus fromString(String toConvert) {
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
     * Convert list of PAResStatus values to list of string values.
     * @param toConvert The list of PAResStatus values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PAResStatus> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PAResStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 