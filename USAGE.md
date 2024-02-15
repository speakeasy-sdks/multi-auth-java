<!-- Start SDK Example Usage [usage] -->
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
                "<value>",
                new SchemeHTTPBasic(
                "",
                "")){{
                    apiKey = "<YOUR_API_KEY_HERE>";
                    httpBasic = new SchemeHTTPBasic(
                    "",
                    ""){{
                        password = "<YOUR_PASSWORD_HERE>";
                        username = "<YOUR_USERNAME_HERE>";
                    }};
                }})
                .build();

            com.example.MultipleAuthTester.models.operations.GetCarsByCNICRequest req = new GetCarsByCNICRequest(
                "<value>");

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