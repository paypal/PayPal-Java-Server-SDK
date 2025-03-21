/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sdk.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.paypal.sdk.utilities.JsonValue;

/**
 * This is a model class for Patch type.
 */
public class Patch {
    private PatchOp op;
    private String path;
    private JsonValue value;
    private String from;

    /**
     * Default constructor.
     */
    public Patch() {
    }

    /**
     * Initialization constructor.
     * @param  op  PatchOp value for op.
     * @param  path  String value for path.
     * @param  value  JsonValue value for value.
     * @param  from  String value for from.
     */
    public Patch(
            PatchOp op,
            String path,
            JsonValue value,
            String from) {
        this.op = op;
        this.path = path;
        this.value = value;
        this.from = from;
    }

    /**
     * Getter for Op.
     * The operation.
     * @return Returns the PatchOp
     */
    @JsonGetter("op")
    public PatchOp getOp() {
        return op;
    }

    /**
     * Setter for Op.
     * The operation.
     * @param op Value for PatchOp
     */
    @JsonSetter("op")
    public void setOp(PatchOp op) {
        this.op = op;
    }

    /**
     * Getter for Path.
     * The JSON Pointer to the target document location at which to complete the operation.
     * @return Returns the String
     */
    @JsonGetter("path")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPath() {
        return path;
    }

    /**
     * Setter for Path.
     * The JSON Pointer to the target document location at which to complete the operation.
     * @param path Value for String
     */
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Getter for Value.
     * The value to apply. The remove, copy, and move operations do not require a value. Since JSON
     * Patch allows any type for value, the type property is not specified.
     * @return Returns the JsonValue
     */
    @JsonGetter("value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public JsonValue getValue() {
        return value;
    }

    /**
     * Setter for Value.
     * The value to apply. The remove, copy, and move operations do not require a value. Since JSON
     * Patch allows any type for value, the type property is not specified.
     * @param value Value for JsonValue
     */
    @JsonSetter("value")
    public void setValue(JsonValue value) {
        this.value = value;
    }

    /**
     * Getter for From.
     * The JSON Pointer to the target document location from which to move the value. Required for
     * the move operation.
     * @return Returns the String
     */
    @JsonGetter("from")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getFrom() {
        return from;
    }

    /**
     * Setter for From.
     * The JSON Pointer to the target document location from which to move the value. Required for
     * the move operation.
     * @param from Value for String
     */
    @JsonSetter("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Converts this Patch into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Patch [" + "op=" + op + ", path=" + path + ", value=" + value + ", from=" + from
                + "]";
    }

    /**
     * Builds a new {@link Patch.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Patch.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(op)
                .path(getPath())
                .value(getValue())
                .from(getFrom());
        return builder;
    }

    /**
     * Class to build instances of {@link Patch}.
     */
    public static class Builder {
        private PatchOp op;
        private String path;
        private JsonValue value;
        private String from;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  op  PatchOp value for op.
         */
        public Builder(PatchOp op) {
            this.op = op;
        }

        /**
         * Setter for op.
         * @param  op  PatchOp value for op.
         * @return Builder
         */
        public Builder op(PatchOp op) {
            this.op = op;
            return this;
        }

        /**
         * Setter for path.
         * @param  path  String value for path.
         * @return Builder
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Setter for value.
         * @param  value  JsonValue value for value.
         * @return Builder
         */
        public Builder value(JsonValue value) {
            this.value = value;
            return this;
        }

        /**
         * Setter for from.
         * @param  from  String value for from.
         * @return Builder
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * Builds a new {@link Patch} object using the set fields.
         * @return {@link Patch}
         */
        public Patch build() {
            return new Patch(op, path, value, from);
        }
    }
}
