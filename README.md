# MultipleAuthTester

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://github.com/speakeasy-sdks/multi-auth-java.git/actions"><img src="https://img.shields.io/github/actions/workflow/status/speakeasy-sdks/bolt-php/speakeasy_sdk_generation.yml?style=for-the-badge" /></a>
    
</div>

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'com.example.MultipleAuthTester:MultipleAuthTester:0.1.2'
```
<!-- End SDK Installation -->

## SDK Example Usage
<!-- Start SDK Example Usage -->


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
                .setSecurity(new Security("distinctio",                 new SchemeHTTPBasic("quibusdam", "unde");) {{
                    apiKey = "";
                    httpBasic = new SchemeHTTPBasic("corrupti", "provident") {{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetCarsByCNICRequest req = new GetCarsByCNICRequest("nulla");            

            GetCarsByCNICResponse res = sdk.cars.getCarsByCNIC(req);

            if (res.cars != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [Cars](docs/sdks/cars/README.md)

* [getCarsByCNIC](docs/sdks/cars/README.md#getcarsbycnic) - Find cars by CNIC
* [getCarsById](docs/sdks/cars/README.md#getcarsbyid) - Find cars by ID
* [getCarsByName](docs/sdks/cars/README.md#getcarsbyname) - Find cars by Name
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
