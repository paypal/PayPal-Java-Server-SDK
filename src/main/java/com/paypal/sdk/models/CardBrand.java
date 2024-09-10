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
 * CardBrand to be used.
 */
public enum CardBrand {
    VISA,

    MASTERCARD,

    DISCOVER,

    AMEX,

    SOLO,

    JCB,

    STAR,

    DELTA,

    SWITCH,

    MAESTRO,

    CB_NATIONALE,

    CONFIGOGA,

    CONFIDIS,

    ELECTRON,

    CETELEM,

    CHINA_UNION_PAY,

    DINERS,

    ELO,

    HIPER,

    HIPERCARD,

    RUPAY,

    GE,

    SYNCHRONY,

    EFTPOS,

    UNKNOWN,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, CardBrand> valueMap = new TreeMap<>();
    private String value;

    static {
        VISA.value = "VISA";
        MASTERCARD.value = "MASTERCARD";
        DISCOVER.value = "DISCOVER";
        AMEX.value = "AMEX";
        SOLO.value = "SOLO";
        JCB.value = "JCB";
        STAR.value = "STAR";
        DELTA.value = "DELTA";
        SWITCH.value = "SWITCH";
        MAESTRO.value = "MAESTRO";
        CB_NATIONALE.value = "CB_NATIONALE";
        CONFIGOGA.value = "CONFIGOGA";
        CONFIDIS.value = "CONFIDIS";
        ELECTRON.value = "ELECTRON";
        CETELEM.value = "CETELEM";
        CHINA_UNION_PAY.value = "CHINA_UNION_PAY";
        DINERS.value = "DINERS";
        ELO.value = "ELO";
        HIPER.value = "HIPER";
        HIPERCARD.value = "HIPERCARD";
        RUPAY.value = "RUPAY";
        GE.value = "GE";
        SYNCHRONY.value = "SYNCHRONY";
        EFTPOS.value = "EFTPOS";
        UNKNOWN.value = "UNKNOWN";
        _UNKNOWN.value = null;

        valueMap.put("VISA", VISA);
        valueMap.put("MASTERCARD", MASTERCARD);
        valueMap.put("DISCOVER", DISCOVER);
        valueMap.put("AMEX", AMEX);
        valueMap.put("SOLO", SOLO);
        valueMap.put("JCB", JCB);
        valueMap.put("STAR", STAR);
        valueMap.put("DELTA", DELTA);
        valueMap.put("SWITCH", SWITCH);
        valueMap.put("MAESTRO", MAESTRO);
        valueMap.put("CB_NATIONALE", CB_NATIONALE);
        valueMap.put("CONFIGOGA", CONFIGOGA);
        valueMap.put("CONFIDIS", CONFIDIS);
        valueMap.put("ELECTRON", ELECTRON);
        valueMap.put("CETELEM", CETELEM);
        valueMap.put("CHINA_UNION_PAY", CHINA_UNION_PAY);
        valueMap.put("DINERS", DINERS);
        valueMap.put("ELO", ELO);
        valueMap.put("HIPER", HIPER);
        valueMap.put("HIPERCARD", HIPERCARD);
        valueMap.put("RUPAY", RUPAY);
        valueMap.put("GE", GE);
        valueMap.put("SYNCHRONY", SYNCHRONY);
        valueMap.put("EFTPOS", EFTPOS);
        valueMap.put("UNKNOWN", UNKNOWN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CardBrand constructFromString(String toConvert) throws IOException {
        CardBrand enumValue = fromString(toConvert);
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
    public static CardBrand fromString(String toConvert) {
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
     * Convert list of CardBrand values to list of string values.
     * @param toConvert The list of CardBrand values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<CardBrand> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (CardBrand enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 