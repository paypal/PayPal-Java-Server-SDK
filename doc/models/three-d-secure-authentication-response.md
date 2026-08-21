
# Three D Secure Authentication Response

Results of 3D Secure Authentication.

## Structure

`ThreeDSecureAuthenticationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AuthenticationStatus` | [`PaResStatus`](../../doc/models/pa-res-status.md) | Optional | Transactions status result identifier. The outcome of the issuer's authentication.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | PaResStatus getAuthenticationStatus() | setAuthenticationStatus(PaResStatus authenticationStatus) |
| `EnrollmentStatus` | [`EnrollmentStatus`](../../doc/models/enrollment-status.md) | Optional | Status of Authentication eligibility.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255`, *Pattern*: `^[0-9A-Z_]+$` | EnrollmentStatus getEnrollmentStatus() | setEnrollmentStatus(EnrollmentStatus enrollmentStatus) |

## Example

```java
import com.paypal.sdk.models.EnrollmentStatus;
import com.paypal.sdk.models.PaResStatus;
import com.paypal.sdk.models.ThreeDSecureAuthenticationResponse;

ThreeDSecureAuthenticationResponse threeDSecureAuthenticationResponse = new ThreeDSecureAuthenticationResponse.Builder()
    .authenticationStatus(PaResStatus.SUCCESSFULAUTHENTICATION)
    .enrollmentStatus(EnrollmentStatus.ENROLLED)
    .build();
```

