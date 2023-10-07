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
                .setSecurity(new Security("Toyota", new SchemeHTTPBasic("Diesel", "Screen")){{
                    apiKey = "";
                    httpBasic = new SchemeHTTPBasic("Account", "Maryland"){{
                        password = "";
                        username = "";
                    }};
                }})
                .build();

            GetCarsByCNICRequest req = new GetCarsByCNICRequest("JSON");            

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