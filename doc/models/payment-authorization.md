
# Payment Authorization

The authorized payment transaction.

## Structure

`PaymentAuthorization`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`AuthorizationStatus`](../../doc/models/authorization-status.md) | Optional | The status for the authorized payment. | AuthorizationStatus getStatus() | setStatus(AuthorizationStatus status) |
| `StatusDetails` | [`AuthorizationStatusDetails`](../../doc/models/authorization-status-details.md) | Optional | The details of the authorized payment status. | AuthorizationStatusDetails getStatusDetails() | setStatusDetails(AuthorizationStatusDetails statusDetails) |
| `Id` | `String` | Optional | The PayPal-generated ID for the authorized payment. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Maximum Length*: `127` | String getCustomId() | setCustomId(String customId) |
| `NetworkTransactionReference` | [`NetworkTransactionReference`](../../doc/models/network-transaction-reference.md) | Optional | Reference values used by the card network to identify a transaction. | NetworkTransactionReference getNetworkTransactionReference() | setNetworkTransactionReference(NetworkTransactionReference networkTransactionReference) |
| `SellerProtection` | [`SellerProtection`](../../doc/models/seller-protection.md) | Optional | The level of protection offered as defined by [PayPal Seller Protection for Merchants](https://www.paypal.com/us/webapps/mpp/security/seller-protection). | SellerProtection getSellerProtection() | setSellerProtection(SellerProtection sellerProtection) |
| `ExpirationTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getExpirationTime() | setExpirationTime(String expirationTime) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `CreateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional.<blockquote><strong>Note:</strong> The regular expression provides guidance but does not reject all invalid dates.</blockquote><br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |
| `SupplementaryData` | [`PaymentSupplementaryData`](../../doc/models/payment-supplementary-data.md) | Optional | The supplementary data. | PaymentSupplementaryData getSupplementaryData() | setSupplementaryData(PaymentSupplementaryData supplementaryData) |
| `Payee` | [`Payee`](../../doc/models/payee.md) | Optional | The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee. | Payee getPayee() | setPayee(Payee payee) |

## Example (as JSON)

```json
{
  "status": "VOIDED",
  "status_details": {
    "reason": "PENDING_REVIEW"
  },
  "id": "id0",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id0"
}
```

