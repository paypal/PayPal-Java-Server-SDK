/*
 * PaypalServerSdkLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for LineItem type.
 */
public class LineItem {
    private String name;
    private String quantity;
    private String description;
    private String sku;
    private String url;
    private String imageUrl;
    private UniversalProductCode upc;
    private Money unitAmount;
    private Money tax;
    private String commodityCode;
    private Money discountAmount;
    private Money totalAmount;
    private String unitOfMeasure;

    /**
     * Default constructor.
     */
    public LineItem() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  quantity  String value for quantity.
     * @param  description  String value for description.
     * @param  sku  String value for sku.
     * @param  url  String value for url.
     * @param  imageUrl  String value for imageUrl.
     * @param  upc  UniversalProductCode value for upc.
     * @param  unitAmount  Money value for unitAmount.
     * @param  tax  Money value for tax.
     * @param  commodityCode  String value for commodityCode.
     * @param  discountAmount  Money value for discountAmount.
     * @param  totalAmount  Money value for totalAmount.
     * @param  unitOfMeasure  String value for unitOfMeasure.
     */
    public LineItem(
            String name,
            String quantity,
            String description,
            String sku,
            String url,
            String imageUrl,
            UniversalProductCode upc,
            Money unitAmount,
            Money tax,
            String commodityCode,
            Money discountAmount,
            Money totalAmount,
            String unitOfMeasure) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.sku = sku;
        this.url = url;
        this.imageUrl = imageUrl;
        this.upc = upc;
        this.unitAmount = unitAmount;
        this.tax = tax;
        this.commodityCode = commodityCode;
        this.discountAmount = discountAmount;
        this.totalAmount = totalAmount;
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * Getter for Name.
     * The item name or title.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The item name or title.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Quantity.
     * The item quantity. Must be a whole number.
     * @return Returns the String
     */
    @JsonGetter("quantity")
    public String getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * The item quantity. Must be a whole number.
     * @param quantity Value for String
     */
    @JsonSetter("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for Description.
     * The detailed item description.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The detailed item description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Sku.
     * The stock keeping unit (SKU) for the item.
     * @return Returns the String
     */
    @JsonGetter("sku")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSku() {
        return sku;
    }

    /**
     * Setter for Sku.
     * The stock keeping unit (SKU) for the item.
     * @param sku Value for String
     */
    @JsonSetter("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * Getter for Url.
     * The URL to the item being purchased. Visible to buyer and used in buyer experiences.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The URL to the item being purchased. Visible to buyer and used in buyer experiences.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for ImageUrl.
     * The URL of the item's image. File type and size restrictions apply. An image that violates
     * these restrictions will not be honored.
     * @return Returns the String
     */
    @JsonGetter("image_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Setter for ImageUrl.
     * The URL of the item's image. File type and size restrictions apply. An image that violates
     * these restrictions will not be honored.
     * @param imageUrl Value for String
     */
    @JsonSetter("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Getter for Upc.
     * The Universal Product Code of the item.
     * @return Returns the UniversalProductCode
     */
    @JsonGetter("upc")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UniversalProductCode getUpc() {
        return upc;
    }

    /**
     * Setter for Upc.
     * The Universal Product Code of the item.
     * @param upc Value for UniversalProductCode
     */
    @JsonSetter("upc")
    public void setUpc(UniversalProductCode upc) {
        this.upc = upc;
    }

    /**
     * Getter for UnitAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("unit_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getUnitAmount() {
        return unitAmount;
    }

    /**
     * Setter for UnitAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param unitAmount Value for Money
     */
    @JsonSetter("unit_amount")
    public void setUnitAmount(Money unitAmount) {
        this.unitAmount = unitAmount;
    }

    /**
     * Getter for Tax.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("tax")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getTax() {
        return tax;
    }

    /**
     * Setter for Tax.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param tax Value for Money
     */
    @JsonSetter("tax")
    public void setTax(Money tax) {
        this.tax = tax;
    }

    /**
     * Getter for CommodityCode.
     * Code used to classify items purchased and track the total amount spent across various
     * categories of products and services. Different corporate purchasing organizations may use
     * different standards, but the United Nations Standard Products and Services Code (UNSPSC) is
     * frequently used.
     * @return Returns the String
     */
    @JsonGetter("commodity_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Setter for CommodityCode.
     * Code used to classify items purchased and track the total amount spent across various
     * categories of products and services. Different corporate purchasing organizations may use
     * different standards, but the United Nations Standard Products and Services Code (UNSPSC) is
     * frequently used.
     * @param commodityCode Value for String
     */
    @JsonSetter("commodity_code")
    public void setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
    }

    /**
     * Getter for DiscountAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("discount_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Setter for DiscountAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param discountAmount Value for Money
     */
    @JsonSetter("discount_amount")
    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * Getter for TotalAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @return Returns the Money
     */
    @JsonGetter("total_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getTotalAmount() {
        return totalAmount;
    }

    /**
     * Setter for TotalAmount.
     * The currency and amount for a financial transaction, such as a balance or payment due.
     * @param totalAmount Value for Money
     */
    @JsonSetter("total_amount")
    public void setTotalAmount(Money totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Getter for UnitOfMeasure.
     * Unit of measure is a standard used to express the magnitude of a quantity in international
     * trade. Most commonly used (but not limited to) examples are: Acre (ACR), Ampere (AMP),
     * Centigram (CGM), Centimetre (CMT), Cubic inch (INQ), Cubic metre (MTQ), Fluid ounce (OZA),
     * Foot (FOT), Hour (HUR), Item (ITM), Kilogram (KGM), Kilometre (KMT), Kilowatt (KWT), Liquid
     * gallon (GLL), Liter (LTR), Pounds (LBS), Square foot (FTK).
     * @return Returns the String
     */
    @JsonGetter("unit_of_measure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Setter for UnitOfMeasure.
     * Unit of measure is a standard used to express the magnitude of a quantity in international
     * trade. Most commonly used (but not limited to) examples are: Acre (ACR), Ampere (AMP),
     * Centigram (CGM), Centimetre (CMT), Cubic inch (INQ), Cubic metre (MTQ), Fluid ounce (OZA),
     * Foot (FOT), Hour (HUR), Item (ITM), Kilogram (KGM), Kilometre (KMT), Kilowatt (KWT), Liquid
     * gallon (GLL), Liter (LTR), Pounds (LBS), Square foot (FTK).
     * @param unitOfMeasure Value for String
     */
    @JsonSetter("unit_of_measure")
    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * Converts this LineItem into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LineItem [" + "name=" + name + ", quantity=" + quantity + ", description="
                + description + ", sku=" + sku + ", url=" + url + ", imageUrl=" + imageUrl
                + ", upc=" + upc + ", unitAmount=" + unitAmount + ", tax=" + tax
                + ", commodityCode=" + commodityCode + ", discountAmount=" + discountAmount
                + ", totalAmount=" + totalAmount + ", unitOfMeasure=" + unitOfMeasure + "]";
    }

    /**
     * Builds a new {@link LineItem.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LineItem.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, quantity)
                .description(getDescription())
                .sku(getSku())
                .url(getUrl())
                .imageUrl(getImageUrl())
                .upc(getUpc())
                .unitAmount(getUnitAmount())
                .tax(getTax())
                .commodityCode(getCommodityCode())
                .discountAmount(getDiscountAmount())
                .totalAmount(getTotalAmount())
                .unitOfMeasure(getUnitOfMeasure());
        return builder;
    }

    /**
     * Class to build instances of {@link LineItem}.
     */
    public static class Builder {
        private String name;
        private String quantity;
        private String description;
        private String sku;
        private String url;
        private String imageUrl;
        private UniversalProductCode upc;
        private Money unitAmount;
        private Money tax;
        private String commodityCode;
        private Money discountAmount;
        private Money totalAmount;
        private String unitOfMeasure;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  quantity  String value for quantity.
         */
        public Builder(String name, String quantity) {
            this.name = name;
            this.quantity = quantity;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  String value for quantity.
         * @return Builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for sku.
         * @param  sku  String value for sku.
         * @return Builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for imageUrl.
         * @param  imageUrl  String value for imageUrl.
         * @return Builder
         */
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * Setter for upc.
         * @param  upc  UniversalProductCode value for upc.
         * @return Builder
         */
        public Builder upc(UniversalProductCode upc) {
            this.upc = upc;
            return this;
        }

        /**
         * Setter for unitAmount.
         * @param  unitAmount  Money value for unitAmount.
         * @return Builder
         */
        public Builder unitAmount(Money unitAmount) {
            this.unitAmount = unitAmount;
            return this;
        }

        /**
         * Setter for tax.
         * @param  tax  Money value for tax.
         * @return Builder
         */
        public Builder tax(Money tax) {
            this.tax = tax;
            return this;
        }

        /**
         * Setter for commodityCode.
         * @param  commodityCode  String value for commodityCode.
         * @return Builder
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * Setter for discountAmount.
         * @param  discountAmount  Money value for discountAmount.
         * @return Builder
         */
        public Builder discountAmount(Money discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }

        /**
         * Setter for totalAmount.
         * @param  totalAmount  Money value for totalAmount.
         * @return Builder
         */
        public Builder totalAmount(Money totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }

        /**
         * Setter for unitOfMeasure.
         * @param  unitOfMeasure  String value for unitOfMeasure.
         * @return Builder
         */
        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            return this;
        }

        /**
         * Builds a new {@link LineItem} object using the set fields.
         * @return {@link LineItem}
         */
        public LineItem build() {
            return new LineItem(name, quantity, description, sku, url, imageUrl, upc, unitAmount,
                    tax, commodityCode, discountAmount, totalAmount, unitOfMeasure);
        }
    }
}
