
# Card Authentication Response

Results of Authentication such as 3D Secure.

## Structure

`CardAuthenticationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ThreeDSecure` | [`ThreeDSecureCardAuthenticationResponse`](../../doc/models/three-d-secure-card-authentication-response.md) | Optional | Results of 3D Secure Authentication. | ThreeDSecureCardAuthenticationResponse getThreeDSecure() | setThreeDSecure(ThreeDSecureCardAuthenticationResponse threeDSecure) |

## Example

```java
import com.paypal.sdk.models.CardAuthenticationResponse;
import com.paypal.sdk.models.EnrollmentStatus;
import com.paypal.sdk.models.PaResStatus;
import com.paypal.sdk.models.ThreeDSecureCardAuthenticationResponse;

CardAuthenticationResponse cardAuthenticationResponse = new CardAuthenticationResponse.Builder()
    .threeDSecure(new ThreeDSecureCardAuthenticationResponse.Builder()
        .authenticationStatus(PaResStatus.CHALLENGEREQUIRED)
        .enrollmentStatus(EnrollmentStatus.ENROLLED)
        .authenticationId("authentication_id6")
        .build())
    .build();
```

