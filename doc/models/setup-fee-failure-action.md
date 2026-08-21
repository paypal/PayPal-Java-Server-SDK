
# Setup Fee Failure Action

The action to take on the subscription if the initial payment for the setup fails.

## Enumeration

`SetupFeeFailureAction`

## Fields

| Name | Description |
|  --- | --- |
| `CONTINUE` | Continues the subscription if the initial payment for the setup fails. |
| `CANCEL` | Cancels the subscription if the initial payment for the setup fails. |

## Example

```java
import com.paypal.sdk.models.SetupFeeFailureAction;

SetupFeeFailureAction setupFeeFailureAction = SetupFeeFailureAction.CONTINUE;
```

