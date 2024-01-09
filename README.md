# MultipleAuthTester

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://github.com/speakeasy-sdks/multi-auth-java.git/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-sdks/bolt-php/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
    
</div>

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Gradle

```groovy
implementation 'com.example.MultipleAuthTester:MultipleAuthTester:0.11.0'
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.example.MultipleAuthTester.MultipleAuthTester;
import com.example.MultipleAuthTester.models.operations.GetCarsByCNICRequest;
import com.example.MultipleAuthTester.models.operations.GetCarsByCNICResponse;
import com.example.MultipleAuthTester.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            MultipleAuthTester sdk = MultipleAuthTester.builder()
                .setSecurity(new Security(
                "string",
                new SchemeHTTPBasic(
                "string",
                "string")){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                    httpBasic = new SchemeHTTPBasic(
                    "string",
                    "string"){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.example.MultipleAuthTester.models.operations.GetCarsByCNICRequest req = new GetCarsByCNICRequest(
                "string");

            com.example.MultipleAuthTester.models.operations.GetCarsByCNICResponse res = sdk.cars.getCarsByCNIC(req);

            if (res.classes != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

### [cars](docs/sdks/cars/README.md)

* [getCarsByCNIC](docs/sdks/cars/README.md#getcarsbycnic) - Find cars by CNIC
* [getCarsById](docs/sdks/cars/README.md#getcarsbyid) - Find cars by ID
* [getCarsByName](docs/sdks/cars/README.md#getcarsbyname) - Find cars by Name
<!-- End Available Resources and Operations [operations] -->



<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally using the `setServerIndex` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `https://development.gigantic-server.com/v1` | None |
| 1 | `https://staging.gigantic-server.com/v1` | None |
| 2 | `https://api.gigantic-server.com/v1` | None |




### Override Server URL Per-Client

The default server can also be overridden globally using the `setServerURL` option when initializing the SDK client instance. For example:
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->



### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
