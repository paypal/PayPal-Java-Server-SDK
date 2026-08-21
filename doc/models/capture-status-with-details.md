
# Capture Status with Details

The status and status details of a captured payment.

## Structure

`CaptureStatusWithDetails`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | [`CaptureStatus`](../../doc/models/capture-status.md) | Optional, Read-only | The status of the captured payment. | CaptureStatus getStatus() | setStatus(CaptureStatus status) |
| `StatusDetails` | [`CaptureStatusDetails`](../../doc/models/capture-status-details.md) | Optional | The details of the captured payment status. | CaptureStatusDetails getStatusDetails() | setStatusDetails(CaptureStatusDetails statusDetails) |

## Example

```java
import com.paypal.sdk.models.CaptureIncompleteReason;
import com.paypal.sdk.models.CaptureStatusDetails;
import com.paypal.sdk.models.CaptureStatusWithDetails;

CaptureStatusWithDetails captureStatusWithDetails = new CaptureStatusWithDetails.Builder()
    .statusDetails(new CaptureStatusDetails.Builder()
        .reason(CaptureIncompleteReason.VERIFICATION_REQUIRED)
        .build())
    .build();
```

