
# Refund

The refund information.

## Structure

`Refund`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`RefundStatus`](../../doc/models/refund-status.md) | Optional | The status of the refund. | RefundStatus getStatus() | setStatus(RefundStatus status) |
| `StatusDetails` | [`RefundStatusDetails`](../../doc/models/refund-status-details.md) | Optional | The details of the refund status. | RefundStatusDetails getStatusDetails() | setStatusDetails(RefundStatusDetails statusDetails) |
| `Id` | `String` | Optional | The PayPal-generated ID for the refund. | String getId() | setId(String id) |
| `Amount` | [`Money`](../../doc/models/money.md) | Optional | The currency and amount for a financial transaction, such as a balance or payment due. | Money getAmount() | setAmount(Money amount) |
| `InvoiceId` | `String` | Optional | The API caller-provided external invoice number for this order. Appears in both the payer's transaction history and the emails that the payer receives. | String getInvoiceId() | setInvoiceId(String invoiceId) |
| `CustomId` | `String` | Optional | The API caller-provided external ID. Used to reconcile API caller-initiated transactions with PayPal transactions. Appears in transaction and settlement reports.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[A-Za-z0-9-_.,]*$` | String getCustomId() | setCustomId(String customId) |
| `AcquirerReferenceNumber` | `String` | Optional | Reference ID issued for the card transaction. This ID can be used to track the transaction across processors, card brands and issuing banks.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36`, *Pattern*: `^[a-zA-Z0-9]+$` | String getAcquirerReferenceNumber() | setAcquirerReferenceNumber(String acquirerReferenceNumber) |
| `NoteToPayer` | `String` | Optional | The reason for the refund. Appears in both the payer's transaction history and the emails that the payer receives. | String getNoteToPayer() | setNoteToPayer(String noteToPayer) |
| `SellerPayableBreakdown` | [`SellerPayableBreakdown`](../../doc/models/seller-payable-breakdown.md) | Optional | The breakdown of the refund. | SellerPayableBreakdown getSellerPayableBreakdown() | setSellerPayableBreakdown(SellerPayableBreakdown sellerPayableBreakdown) |
| `Payer` | [`PayeeBase`](../../doc/models/payee-base.md) | Optional | The details for the merchant who receives the funds and fulfills the order. The merchant is also known as the payee. | PayeeBase getPayer() | setPayer(PayeeBase payer) |
| `Links` | [`List<LinkDescription>`](../../doc/models/link-description.md) | Optional | An array of related [HATEOAS links](/docs/api/reference/api-responses/#hateoas-links). | List<LinkDescription> getLinks() | setLinks(List<LinkDescription> links) |
| `CreateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getCreateTime() | setCreateTime(String createTime) |
| `UpdateTime` | `String` | Optional | The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). Seconds are required while fractional seconds are optional. Note: The regular expression provides guidance but does not reject all invalid dates.<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `64`, *Pattern*: `^[0-9]{4}-(0[1-9]\|1[0-2])-(0[1-9]\|[1-2][0-9]\|3[0-1])[T,t]([0-1][0-9]\|2[0-3]):[0-5][0-9]:([0-5][0-9]\|60)([.][0-9]+)?([Zz]\|[+-][0-9]{2}:[0-9]{2})$` | String getUpdateTime() | setUpdateTime(String updateTime) |

## Example (as JSON)

```json
{
  "status": "CANCELLED",
  "status_details": {
    "reason": "ECHECK"
  },
  "id": "id6",
  "amount": {
    "currency_code": "currency_code6",
    "value": "value0"
  },
  "invoice_id": "invoice_id6"
}
```

