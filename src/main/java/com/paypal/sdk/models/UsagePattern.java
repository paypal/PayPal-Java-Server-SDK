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
 * UsagePattern to be used.
 */
public enum UsagePattern {
    /**
     * On-demand instant payments – non-recurring, pre-paid, variable amount, variable frequency.
     */
    IMMEDIATE,

    /**
     * Pay after use, non-recurring post-paid, variable amount, irregular frequency.
     */
    DEFERRED,

    /**
     * Pay upfront fixed or variable amount on a fixed date before the goods/service is delivered.
     */
    RECURRING_PREPAID,

    /**
     * Pay on a fixed date based on usage or consumption after the goods/service is delivered.
     */
    RECURRING_POSTPAID,

    /**
     * Charge payer when the set amount is reached or monthly billing cycle, whichever comes first, before the goods/service is delivered.
     */
    THRESHOLD_PREPAID,

    /**
     * Charge payer when the set amount is reached or monthly billing cycle, whichever comes first, after the goods/service is delivered.
     */
    THRESHOLD_POSTPAID,

    /**
     * Subscription plan where the "amount due" and the "billing frequency" are fixed, and there is no defined duration with the payment due before the good/service is delivered.
     */
    SUBSCRIPTION_PREPAID,

    /**
     * Subscription plan where the "amount due" and the "billing frequency" are fixed, and there is no defined duration with the payment due after the goods/services are delivered.
     */
    SUBSCRIPTION_POSTPAID,

    /**
     * Unscheduled card on file plan where the merchant can bill buyer upfront based on an agreed logic, but "amount due" and "frequency" can vary. Inclusive of automatic reload plans.
     */
    UNSCHEDULED_PREPAID,

    /**
     * Unscheduled card on file plan where the merchant can bill buyer based on an agreed logic, but "amount due" and "frequency" can vary. Inclusive of automatic reload plans.
     */
    UNSCHEDULED_POSTPAID,

    /**
     * Merchant-managed installment plan when the "amount" to be paid and the "billing frequency" are fixed, but there is a defined number of payments with the payment due before the good/service is delivered.
     */
    INSTALLMENT_PREPAID,

    /**
     * Merchant-managed installment plan when the "amount" to be paid and the "billing frequency" are fixed, but there is a defined number of payments with the payment due after the goods/services are delivered.
     */
    INSTALLMENT_POSTPAID,

    /**
     * Unknown values will be mapped by this enum member
     */
    _UNKNOWN;


    private static TreeMap<String, UsagePattern> valueMap = new TreeMap<>();
    private String value;

    static {
        IMMEDIATE.value = "IMMEDIATE";
        DEFERRED.value = "DEFERRED";
        RECURRING_PREPAID.value = "RECURRING_PREPAID";
        RECURRING_POSTPAID.value = "RECURRING_POSTPAID";
        THRESHOLD_PREPAID.value = "THRESHOLD_PREPAID";
        THRESHOLD_POSTPAID.value = "THRESHOLD_POSTPAID";
        SUBSCRIPTION_PREPAID.value = "SUBSCRIPTION_PREPAID";
        SUBSCRIPTION_POSTPAID.value = "SUBSCRIPTION_POSTPAID";
        UNSCHEDULED_PREPAID.value = "UNSCHEDULED_PREPAID";
        UNSCHEDULED_POSTPAID.value = "UNSCHEDULED_POSTPAID";
        INSTALLMENT_PREPAID.value = "INSTALLMENT_PREPAID";
        INSTALLMENT_POSTPAID.value = "INSTALLMENT_POSTPAID";
        _UNKNOWN.value = null;

        valueMap.put("IMMEDIATE", IMMEDIATE);
        valueMap.put("DEFERRED", DEFERRED);
        valueMap.put("RECURRING_PREPAID", RECURRING_PREPAID);
        valueMap.put("RECURRING_POSTPAID", RECURRING_POSTPAID);
        valueMap.put("THRESHOLD_PREPAID", THRESHOLD_PREPAID);
        valueMap.put("THRESHOLD_POSTPAID", THRESHOLD_POSTPAID);
        valueMap.put("SUBSCRIPTION_PREPAID", SUBSCRIPTION_PREPAID);
        valueMap.put("SUBSCRIPTION_POSTPAID", SUBSCRIPTION_POSTPAID);
        valueMap.put("UNSCHEDULED_PREPAID", UNSCHEDULED_PREPAID);
        valueMap.put("UNSCHEDULED_POSTPAID", UNSCHEDULED_POSTPAID);
        valueMap.put("INSTALLMENT_PREPAID", INSTALLMENT_PREPAID);
        valueMap.put("INSTALLMENT_POSTPAID", INSTALLMENT_POSTPAID);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static UsagePattern constructFromString(String toConvert) throws IOException {
        UsagePattern enumValue = fromString(toConvert);
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
    public static UsagePattern fromString(String toConvert) {
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
     * Convert list of UsagePattern values to list of string values.
     * @param toConvert The list of UsagePattern values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<UsagePattern> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (UsagePattern enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 