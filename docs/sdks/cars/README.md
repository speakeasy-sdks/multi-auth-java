# Cars
(*cars*)

## Overview

Car operations

### Available Operations

* [getCarsByCNIC](#getcarsbycnic) - Find cars by CNIC
* [getCarsById](#getcarsbyid) - Find cars by ID
* [getCarsByName](#getcarsbyname) - Find cars by Name

## getCarsByCNIC

Returns cars based on CNIC with apiKey and  httpBasic security

### Example Usage

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
                .setSecurity(new Security("Toyota",                 new SchemeHTTPBasic("Diesel", "Screen");) {{
                    apiKey = "";
                    httpBasic = new SchemeHTTPBasic("Account", "Maryland") {{
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

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [com.example.MultipleAuthTester.models.operations.GetCarsByCNICRequest](../../models/operations/GetCarsByCNICRequest.md) | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |


### Response

**[com.example.MultipleAuthTester.models.operations.GetCarsByCNICResponse](../../models/operations/GetCarsByCNICResponse.md)**


## getCarsById

Returns cars based on ID with apiKey or httpBasic security

### Example Usage

```java
package hello.world;

import com.example.MultipleAuthTester.MultipleAuthTester;
import com.example.MultipleAuthTester.models.operations.GetCarsByIdRequest;
import com.example.MultipleAuthTester.models.operations.GetCarsByIdResponse;
import com.example.MultipleAuthTester.models.operations.GetCarsByIdSecurity;
import com.example.MultipleAuthTester.models.shared.SchemeHTTPBasic;
import com.example.MultipleAuthTester.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            MultipleAuthTester sdk = MultipleAuthTester.builder()
                .build();

            GetCarsByIdRequest req = new GetCarsByIdRequest(174472L);            

            GetCarsByIdResponse res = sdk.cars.getCarsById(req, new GetCarsByIdSecurity() {{
                apiKey = "";
            }});

            if (res.cars != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [com.example.MultipleAuthTester.models.operations.GetCarsByIdRequest](../../models/operations/GetCarsByIdRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [com.example.MultipleAuthTester.models.operations.GetCarsByIdSecurity](../../models/operations/GetCarsByIdSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[com.example.MultipleAuthTester.models.operations.GetCarsByIdResponse](../../models/operations/GetCarsByIdResponse.md)**


## getCarsByName

Returns cars based on NAME with apiKeyHeader and httpBasic security

### Example Usage

```java
package hello.world;

import com.example.MultipleAuthTester.MultipleAuthTester;
import com.example.MultipleAuthTester.models.operations.GetCarsByNameRequest;
import com.example.MultipleAuthTester.models.operations.GetCarsByNameResponse;
import com.example.MultipleAuthTester.models.operations.GetCarsByNameSecurity;
import com.example.MultipleAuthTester.models.shared.SchemeHTTPBasic;
import com.example.MultipleAuthTester.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            MultipleAuthTester sdk = MultipleAuthTester.builder()
                .build();

            GetCarsByNameRequest req = new GetCarsByNameRequest("array");            

            GetCarsByNameResponse res = sdk.cars.getCarsByName(req, new GetCarsByNameSecurity("Steel",                 new SchemeHTTPBasic("Computers", "Borders");) {{
                apiKeyHeader = "";
                httpBasic = new SchemeHTTPBasic("Data", "optical") {{
                    password = "";
                    username = "";
                }};
            }});

            if (res.cars != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.example.MultipleAuthTester.models.operations.GetCarsByNameRequest](../../models/operations/GetCarsByNameRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [com.example.MultipleAuthTester.models.operations.GetCarsByNameSecurity](../../models/operations/GetCarsByNameSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[com.example.MultipleAuthTester.models.operations.GetCarsByNameResponse](../../models/operations/GetCarsByNameResponse.md)**

