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
 * This is a model class for AddressDetails type.
 */
public class AddressDetails {
    private String addressLine1;
    private String addressLine2;
    private String adminArea2;
    private String adminArea1;
    private String postalCode;
    private String countryCode;
    private Name name;
    private String id;
    private String company;
    private String phone;
    private Phone phoneNumber;

    /**
     * Default constructor.
     */
    public AddressDetails() {
    }

    /**
     * Initialization constructor.
     * @param  countryCode  String value for countryCode.
     * @param  addressLine1  String value for addressLine1.
     * @param  addressLine2  String value for addressLine2.
     * @param  adminArea2  String value for adminArea2.
     * @param  adminArea1  String value for adminArea1.
     * @param  postalCode  String value for postalCode.
     * @param  name  Name value for name.
     * @param  id  String value for id.
     * @param  company  String value for company.
     * @param  phone  String value for phone.
     * @param  phoneNumber  Phone value for phoneNumber.
     */
    public AddressDetails(
            String countryCode,
            String addressLine1,
            String addressLine2,
            String adminArea2,
            String adminArea1,
            String postalCode,
            Name name,
            String id,
            String company,
            String phone,
            Phone phoneNumber) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.adminArea2 = adminArea2;
        this.adminArea1 = adminArea1;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.name = name;
        this.id = id;
        this.company = company;
        this.phone = phone;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Getter for AddressLine1.
     * The first line of the address, such as number and street, for example, `173 Drury Lane`.
     * Needed for data entry, and Compliance and Risk checks. This field needs to pass the full
     * address.
     * @return Returns the String
     */
    @JsonGetter("address_line_1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Setter for AddressLine1.
     * The first line of the address, such as number and street, for example, `173 Drury Lane`.
     * Needed for data entry, and Compliance and Risk checks. This field needs to pass the full
     * address.
     * @param addressLine1 Value for String
     */
    @JsonSetter("address_line_1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * Getter for AddressLine2.
     * The second line of the address, for example, a suite or apartment number.
     * @return Returns the String
     */
    @JsonGetter("address_line_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Setter for AddressLine2.
     * The second line of the address, for example, a suite or apartment number.
     * @param addressLine2 Value for String
     */
    @JsonSetter("address_line_2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * Getter for AdminArea2.
     * A city, town, or village. Smaller than `admin_area_level_1`.
     * @return Returns the String
     */
    @JsonGetter("admin_area_2")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAdminArea2() {
        return adminArea2;
    }

    /**
     * Setter for AdminArea2.
     * A city, town, or village. Smaller than `admin_area_level_1`.
     * @param adminArea2 Value for String
     */
    @JsonSetter("admin_area_2")
    public void setAdminArea2(String adminArea2) {
        this.adminArea2 = adminArea2;
    }

    /**
     * Getter for AdminArea1.
     * The highest-level sub-division in a country, which is usually a province, state, or
     * ISO-3166-2 subdivision. This data is formatted for postal delivery, for example, `CA` and not
     * `California`. Value, by country, is:&lt;ul&gt;&lt;li&gt;UK. A county.&lt;/li&gt;&lt;li&gt;US. A
     * state.&lt;/li&gt;&lt;li&gt;Canada. A province.&lt;/li&gt;&lt;li&gt;Japan. A prefecture.&lt;/li&gt;&lt;li&gt;Switzerland. A
     * *kanton*.&lt;/li&gt;&lt;/ul&gt;
     * @return Returns the String
     */
    @JsonGetter("admin_area_1")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAdminArea1() {
        return adminArea1;
    }

    /**
     * Setter for AdminArea1.
     * The highest-level sub-division in a country, which is usually a province, state, or
     * ISO-3166-2 subdivision. This data is formatted for postal delivery, for example, `CA` and not
     * `California`. Value, by country, is:&lt;ul&gt;&lt;li&gt;UK. A county.&lt;/li&gt;&lt;li&gt;US. A
     * state.&lt;/li&gt;&lt;li&gt;Canada. A province.&lt;/li&gt;&lt;li&gt;Japan. A prefecture.&lt;/li&gt;&lt;li&gt;Switzerland. A
     * *kanton*.&lt;/li&gt;&lt;/ul&gt;
     * @param adminArea1 Value for String
     */
    @JsonSetter("admin_area_1")
    public void setAdminArea1(String adminArea1) {
        this.adminArea1 = adminArea1;
    }

    /**
     * Getter for PostalCode.
     * The postal code, which is the ZIP code or equivalent. Typically required for countries with a
     * postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).
     * @return Returns the String
     */
    @JsonGetter("postal_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Setter for PostalCode.
     * The postal code, which is the ZIP code or equivalent. Typically required for countries with a
     * postal code or an equivalent. See [postal code](https://en.wikipedia.org/wiki/Postal_code).
     * @param postalCode Value for String
     */
    @JsonSetter("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Getter for CountryCode.
     * The [2-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @return Returns the String
     */
    @JsonGetter("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * The [2-character ISO 3166-1 code](/api/rest/reference/country-codes/) that identifies the
     * country or region.&lt;blockquote&gt;&lt;strong&gt;Note:&lt;/strong&gt; The country code for Great Britain is
     * &lt;code&gt;GB&lt;/code&gt; and not &lt;code&gt;UK&lt;/code&gt; as used in the top-level domain names for that
     * country. Use the `C2` country code for China worldwide for comparable uncontrolled price
     * (CUP) method, bank card, and cross-border transactions.&lt;/blockquote&gt;
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Name.
     * The name of the party.
     * @return Returns the Name
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Name getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the party.
     * @param name Value for Name
     */
    @JsonSetter("name")
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * Getter for Id.
     * The resource ID of the address.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The resource ID of the address.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Company.
     * The name of the company or business associated to the address.
     * @return Returns the String
     */
    @JsonGetter("company")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCompany() {
        return company;
    }

    /**
     * Setter for Company.
     * The name of the company or business associated to the address.
     * @param company Value for String
     */
    @JsonSetter("company")
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Getter for Phone.
     * The phone number that can go on the mailing label with the address to track the shipping.
     * Phone number is in E.164 format.
     * @return Returns the String
     */
    @JsonGetter("phone")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for Phone.
     * The phone number that can go on the mailing label with the address to track the shipping.
     * Phone number is in E.164 format.
     * @param phone Value for String
     */
    @JsonSetter("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for PhoneNumber.
     * The phone number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en).
     * @return Returns the Phone
     */
    @JsonGetter("phone_number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Phone getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter for PhoneNumber.
     * The phone number, in its canonical international [E.164 numbering plan
     * format](https://www.itu.int/rec/T-REC-E.164/en).
     * @param phoneNumber Value for Phone
     */
    @JsonSetter("phone_number")
    public void setPhoneNumber(Phone phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Converts this AddressDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AddressDetails [" + "countryCode=" + countryCode + ", addressLine1=" + addressLine1
                + ", addressLine2=" + addressLine2 + ", adminArea2=" + adminArea2 + ", adminArea1="
                + adminArea1 + ", postalCode=" + postalCode + ", name=" + name + ", id=" + id
                + ", company=" + company + ", phone=" + phone + ", phoneNumber=" + phoneNumber
                + "]";
    }

    /**
     * Builds a new {@link AddressDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AddressDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(countryCode)
                .addressLine1(getAddressLine1())
                .addressLine2(getAddressLine2())
                .adminArea2(getAdminArea2())
                .adminArea1(getAdminArea1())
                .postalCode(getPostalCode())
                .name(getName())
                .id(getId())
                .company(getCompany())
                .phone(getPhone())
                .phoneNumber(getPhoneNumber());
        return builder;
    }

    /**
     * Class to build instances of {@link AddressDetails}.
     */
    public static class Builder {
        private String countryCode;
        private String addressLine1;
        private String addressLine2;
        private String adminArea2;
        private String adminArea1;
        private String postalCode;
        private Name name;
        private String id;
        private String company;
        private String phone;
        private Phone phoneNumber;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  countryCode  String value for countryCode.
         */
        public Builder(String countryCode) {
            this.countryCode = countryCode;
        }

        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for addressLine1.
         * @param  addressLine1  String value for addressLine1.
         * @return Builder
         */
        public Builder addressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        /**
         * Setter for addressLine2.
         * @param  addressLine2  String value for addressLine2.
         * @return Builder
         */
        public Builder addressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        /**
         * Setter for adminArea2.
         * @param  adminArea2  String value for adminArea2.
         * @return Builder
         */
        public Builder adminArea2(String adminArea2) {
            this.adminArea2 = adminArea2;
            return this;
        }

        /**
         * Setter for adminArea1.
         * @param  adminArea1  String value for adminArea1.
         * @return Builder
         */
        public Builder adminArea1(String adminArea1) {
            this.adminArea1 = adminArea1;
            return this;
        }

        /**
         * Setter for postalCode.
         * @param  postalCode  String value for postalCode.
         * @return Builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  Name value for name.
         * @return Builder
         */
        public Builder name(Name name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for company.
         * @param  company  String value for company.
         * @return Builder
         */
        public Builder company(String company) {
            this.company = company;
            return this;
        }

        /**
         * Setter for phone.
         * @param  phone  String value for phone.
         * @return Builder
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Setter for phoneNumber.
         * @param  phoneNumber  Phone value for phoneNumber.
         * @return Builder
         */
        public Builder phoneNumber(Phone phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Builds a new {@link AddressDetails} object using the set fields.
         * @return {@link AddressDetails}
         */
        public AddressDetails build() {
            return new AddressDetails(countryCode, addressLine1, addressLine2, adminArea2,
                    adminArea1, postalCode, name, id, company, phone, phoneNumber);
        }
    }
}
