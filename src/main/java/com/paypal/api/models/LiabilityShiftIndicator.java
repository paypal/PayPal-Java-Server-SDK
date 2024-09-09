/*
 * PaypalServerSdkLib
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
 * LiabilityShiftIndicator to be used.
 */
public enum LiabilityShiftIndicator {
    NO,

    POSSIBLE,

    UNKNOWN,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, LiabilityShiftIndicator> valueMap = new TreeMap<>();
    private String value;

    static {
        NO.value = "NO";
        POSSIBLE.value = "POSSIBLE";
        UNKNOWN.value = "UNKNOWN";
        _UNKNOWN.value = null;

        valueMap.put("NO", NO);
        valueMap.put("POSSIBLE", POSSIBLE);
        valueMap.put("UNKNOWN", UNKNOWN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static LiabilityShiftIndicator constructFromString(String toConvert) throws IOException {
        LiabilityShiftIndicator enumValue = fromString(toConvert);
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
    public static LiabilityShiftIndicator fromString(String toConvert) {
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
     * Convert list of LiabilityShiftIndicator values to list of string values.
     * @param toConvert The list of LiabilityShiftIndicator values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<LiabilityShiftIndicator> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (LiabilityShiftIndicator enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 