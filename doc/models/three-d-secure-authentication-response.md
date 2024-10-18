
# Three D Secure Authentication Response

Results of 3D Secure Authentication.

## Structure

`ThreeDSecureAuthenticationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthenticationStatus` | [`PaResStatus`](../../doc/models/pa-res-status.md) | Optional | Transactions status result identifier. The outcome of the issuer's authentication.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaResStatus getAuthenticationStatus() | setAuthenticationStatus(PaResStatus authenticationStatus) |
| `EnrollmentStatus` | [`EnrollmentStatus`](../../doc/models/enrollment-status.md) | Optional | Status of Authentication eligibility.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | EnrollmentStatus getEnrollmentStatus() | setEnrollmentStatus(EnrollmentStatus enrollmentStatus) |

## Example (as JSON)

```json
{
  "authentication_status": "C",
  "enrollment_status": "Y"
}
```

