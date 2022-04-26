

# App


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [readonly] |
|**name** | **String** | The name of your app, as displayed on your apps list on the dashboard.  This can be renamed. |  [optional] |
|**players** | **Integer** |  |  [optional] [readonly] |
|**messageablePlayers** | **Integer** |  |  [optional] [readonly] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**createdAt** | **OffsetDateTime** |  |  [optional] [readonly] |
|**androidGcmSenderId** | **String** | Android: Your Google Project number.  Also known as Sender ID. |  [optional] |
|**gcmKey** | **String** | Android: Your Google Push Messaging Auth Key |  [optional] |
|**chromeWebOrigin** | **String** | Chrome (All Browsers except Safari) (Recommended): The URL to your website.  This field is required if you wish to enable web push and specify other web push parameters. |  [optional] |
|**chromeKey** | **String** | Not for web push.  Your Google Push Messaging Auth Key if you use Chrome Apps / Extensions. |  [optional] |
|**chromeWebDefaultNotificationIcon** | **String** | Chrome (All Browsers except Safari): Your default notification icon. Should be 256x256 pixels, min 80x80. |  [optional] |
|**chromeWebSubDomain** | **String** | Chrome (All Browsers except Safari): A subdomain of your choice in order to support Web Push on non-HTTPS websites. This field must be set in order for the chrome_web_gcm_sender_id property to be processed. |  [optional] |
|**apnsEnv** | [**ApnsEnvEnum**](#ApnsEnvEnum) | iOS: Either sandbox or production |  [optional] |
|**apnsP12** | **String** | iOS: Your apple push notification p12 certificate file, converted to a string and Base64 encoded. |  [optional] |
|**apnsP12Password** | **String** | iOS: Required if using p12 certificate.  Password for the apns_p12 file. |  [optional] |
|**apnsCertificates** | **String** |  |  [optional] [readonly] |
|**safariApnsCertificates** | **String** |  |  [optional] [readonly] |
|**safariApnsP12** | **String** | Safari: Your apple push notification p12 certificate file for Safari Push Notifications, converted to a string and Base64 encoded. |  [optional] |
|**safariApnsP12Password** | **String** | Safari: Password for safari_apns_p12 file |  [optional] |
|**safariSiteOrigin** | **String** | Safari (Recommended): The hostname to your website including http(s):// |  [optional] |
|**safariPushId** | **String** |  |  [optional] [readonly] |
|**safariIcon1616** | **String** |  |  [optional] [readonly] |
|**safariIcon3232** | **String** |  |  [optional] [readonly] |
|**safariIcon6464** | **String** |  |  [optional] [readonly] |
|**safariIcon128128** | **String** |  |  [optional] [readonly] |
|**safariIcon256256** | **String** | Safari: A url for a 256x256 png notification icon. This is the only Safari icon URL you need to provide. |  [optional] |
|**siteName** | **String** | All Browsers (Recommended): The Site Name. Requires both chrome_web_origin and safari_site_origin to be set to add or update it. |  [optional] |
|**basicAuthKey** | **String** |  |  [optional] [readonly] |
|**organizationId** | **String** | The Id of the Organization you would like to add this app to. |  [optional] |
|**additionalDataIsRootPayload** | **Boolean** | iOS: Notification data (additional data) values will be added to the root of the apns payload when sent to the device.  Ignore if you&#39;re not using any other plugins, or not using OneSignal SDK methods to read the payload. |  [optional] |



## Enum: ApnsEnvEnum

| Name | Value |
|---- | -----|
| SANDBOX | &quot;sandbox&quot; |
| PRODUCTION | &quot;production&quot; |


