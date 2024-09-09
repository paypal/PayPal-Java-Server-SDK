/*
 * PaypalServerSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Name type.
 */
public class Name {
    private String givenName;
    private String surname;

    /**
     * Default constructor.
     */
    public Name() {
    }

    /**
     * Initialization constructor.
     * @param  givenName  String value for givenName.
     * @param  surname  String value for surname.
     */
    public Name(
            String givenName,
            String surname) {
        this.givenName = givenName;
        this.surname = surname;
    }

    /**
     * Getter for GivenName.
     * When the party is a person, the party's given, or first, name.
     * @return Returns the String
     */
    @JsonGetter("given_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGivenName() {
        return givenName;
    }

    /**
     * Setter for GivenName.
     * When the party is a person, the party's given, or first, name.
     * @param givenName Value for String
     */
    @JsonSetter("given_name")
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * Getter for Surname.
     * When the party is a person, the party's surname or family name. Also known as the last name.
     * Required when the party is a person. Use also to store multiple surnames including the
     * matronymic, or mother's, surname.
     * @return Returns the String
     */
    @JsonGetter("surname")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSurname() {
        return surname;
    }

    /**
     * Setter for Surname.
     * When the party is a person, the party's surname or family name. Also known as the last name.
     * Required when the party is a person. Use also to store multiple surnames including the
     * matronymic, or mother's, surname.
     * @param surname Value for String
     */
    @JsonSetter("surname")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Converts this Name into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Name [" + "givenName=" + givenName + ", surname=" + surname + "]";
    }

    /**
     * Builds a new {@link Name.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Name.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .givenName(getGivenName())
                .surname(getSurname());
        return builder;
    }

    /**
     * Class to build instances of {@link Name}.
     */
    public static class Builder {
        private String givenName;
        private String surname;



        /**
         * Setter for givenName.
         * @param  givenName  String value for givenName.
         * @return Builder
         */
        public Builder givenName(String givenName) {
            this.givenName = givenName;
            return this;
        }

        /**
         * Setter for surname.
         * @param  surname  String value for surname.
         * @return Builder
         */
        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        /**
         * Builds a new {@link Name} object using the set fields.
         * @return {@link Name}
         */
        public Name build() {
            return new Name(givenName, surname);
        }
    }
}
