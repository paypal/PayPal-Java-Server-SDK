
# O Auth Scope

OAuth 2 scopes supported by the API

## Enumeration

`OAuthScope`

## Fields

| Name | Description |
|  --- | --- |
| `HttpsUriPaypalComServicesPaymentsPayment` | Manage payments and checkout workflow. |
| `HttpsUriPaypalComServicesPaymentsPaymentReferenceTransaction` | Permission to initiate reference transaction |
| `HttpsUriPaypalComServicesPaymentsInitiatepayment` | Initiates payments and checkout workflows. |
| `HttpsUriPaypalComServicesPaymentsOrdersDeprecatingJssdkMigrationForLimitedMerchants` | Allows client-side integration on Create, Get, Patch, Authorize & Capture Order endpoints. |
| `HttpsUriPaypalComServicesPaymentsPaymentAuthcapture` | Permission to do non-real time payments like capture on authorization |
| `HttpsUriPaypalComServicesPaymentsRefund` | Permission to initiate a refund on a capture transaction |
| `HttpsUriPaypalComServicesPaymentsNonReferencedCredit` | Permission to initiate non referenced credit |
| `HttpsUriPaypalComServicesPaymentsRealtimepayment` | Permission to do any real time payment, with support for sale/authorize/order intents |
| `HttpsUriPaypalComServicesPaymentsReversepayment` | Permission to do any reverse payment |
| `HttpsUriPaypalComServicesPaymentsPaymentsReady` | Permission to get information about payment readiness. |
| `HttpsUriPaypalComServicesVaultPaymentTokensReadwrite` | Manage payment instruments |
| `HttpsUriPaypalComServicesVaultPaymentTokensRead` | Permission to only read from vault |
| `HttpsUriPaypalComServicesVaultCustomersRead` | Permission to read customer information. |
| `HttpsUriPaypalComServicesVaultCustomersReadwrite` | Permission to create/update customer information. |

