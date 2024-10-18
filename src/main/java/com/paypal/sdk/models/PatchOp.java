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
 * PatchOp to be used.
 */
public enum PatchOp {
    ADD,

    REMOVE,

    REPLACE,

    MOVE,

    COPY,

    TEST,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, PatchOp> valueMap = new TreeMap<>();
    private String value;

    static {
        ADD.value = "add";
        REMOVE.value = "remove";
        REPLACE.value = "replace";
        MOVE.value = "move";
        COPY.value = "copy";
        TEST.value = "test";
        _UNKNOWN.value = null;

        valueMap.put("add", ADD);
        valueMap.put("remove", REMOVE);
        valueMap.put("replace", REPLACE);
        valueMap.put("move", MOVE);
        valueMap.put("copy", COPY);
        valueMap.put("test", TEST);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PatchOp constructFromString(String toConvert) throws IOException {
        PatchOp enumValue = fromString(toConvert);
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
    public static PatchOp fromString(String toConvert) {
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
     * Convert list of PatchOp values to list of string values.
     * @param toConvert The list of PatchOp values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PatchOp> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PatchOp enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 