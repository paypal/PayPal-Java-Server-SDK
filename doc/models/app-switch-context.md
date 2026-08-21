
# App Switch Context

Merchant provided details of the native app or mobile web browser to facilitate buyer's app switch to the PayPal consumer app.

## Structure

`AppSwitchContext`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NativeApp` | [`NativeAppContext`](../../doc/models/native-app-context.md) | Optional | Merchant provided, buyer's native app preferences to app switch to the PayPal consumer app. | NativeAppContext getNativeApp() | setNativeApp(NativeAppContext nativeApp) |
| `MobileWeb` | [`MobileWebContext`](../../doc/models/mobile-web-context.md) | Optional | Buyer's mobile web browser context to app switch to the PayPal consumer app. | MobileWebContext getMobileWeb() | setMobileWeb(MobileWebContext mobileWeb) |

## Example

```java
import com.paypal.sdk.models.AppSwitchContext;
import com.paypal.sdk.models.MobileWebContext;
import com.paypal.sdk.models.NativeAppContext;

AppSwitchContext appSwitchContext = new AppSwitchContext.Builder()
    .nativeApp(new NativeAppContext.Builder()
        .build())
    .mobileWeb(new MobileWebContext.Builder()
        .buyerUserAgent("buyer_user_agent8")
        .build())
    .build();
```

