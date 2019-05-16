# spring-swagger-codegen-api-client

Jobtech Taxonomy
- API version: 1.0.0
  - Build date: 2019-05-07T09:41:34.700+02:00

Jobtech taxonomy services



## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>se.jobtech</groupId>
  <artifactId>spring-swagger-codegen-api-client</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "se.jobtech:spring-swagger-codegen-api-client:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/spring-swagger-codegen-api-client-0.0.1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import se.jobtech.taxonomy.client.invoker.*;
import se.jobtech.taxonomy.client.invoker.auth.*;
import se.jobtech.taxonomy.client.model.*;
import se.jobtech.taxonomy.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        try {
            apiInstance.authenticatedGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#authenticatedGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:3000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**authenticatedGet**](docs/DefaultApi.md#authenticatedGet) | **GET** /authenticated | 
*DefaultApi* | [**relationGraphGet**](docs/DefaultApi.md#relationGraphGet) | **GET** /relation/graph | Relation graphs.
*DefaultApi* | [**relationTypesGet**](docs/DefaultApi.md#relationTypesGet) | **GET** /relation/types | Relation graphs.
*PrivateApi* | [**taxonomyPrivateConceptDelete**](docs/PrivateApi.md#taxonomyPrivateConceptDelete) | **DELETE** /taxonomy/private/concept | Retract the concept with the given ID.
*PrivateApi* | [**taxonomyPrivateConceptPost**](docs/PrivateApi.md#taxonomyPrivateConceptPost) | **POST** /taxonomy/private/concept | Assert a new concept.
*PrivateApi* | [**taxonomyPrivateReplaceConceptPost**](docs/PrivateApi.md#taxonomyPrivateReplaceConceptPost) | **POST** /taxonomy/private/replace-concept | Replace old concept with a new concept.
*PublicApi* | [**taxonomyPublicConceptAllGet**](docs/PublicApi.md#taxonomyPublicConceptAllGet) | **GET** /taxonomy/public/concept/all | Read all concepts of the given type.
*PublicApi* | [**taxonomyPublicConceptGet**](docs/PublicApi.md#taxonomyPublicConceptGet) | **GET** /taxonomy/public/concept | Read a concept by ID.
*PublicApi* | [**taxonomyPublicConceptHistorySinceGet**](docs/PublicApi.md#taxonomyPublicConceptHistorySinceGet) | **GET** /taxonomy/public/concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
*PublicApi* | [**taxonomyPublicConceptTypesGet**](docs/PublicApi.md#taxonomyPublicConceptTypesGet) | **GET** /taxonomy/public/concept/types | Read a list of all taxonomy types.
*PublicApi* | [**taxonomyPublicDeprecatedConceptHistorySinceGet**](docs/PublicApi.md#taxonomyPublicDeprecatedConceptHistorySinceGet) | **GET** /taxonomy/public/deprecated-concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
*PublicApi* | [**taxonomyPublicFullHistoryGet**](docs/PublicApi.md#taxonomyPublicFullHistoryGet) | **GET** /taxonomy/public/full-history | Show the complete history.
*PublicApi* | [**taxonomyPublicTermGet**](docs/PublicApi.md#taxonomyPublicTermGet) | **GET** /taxonomy/public/term | Search for a term across all taxonomies.
*PublicApi* | [**taxonomyPublicTermPartGet**](docs/PublicApi.md#taxonomyPublicTermPartGet) | **GET** /taxonomy/public/term-part | get concepts by part of string


## Documentation for Models

 - [Response38918](docs/Response38918.md)
 - [Response38919](docs/Response38919.md)
 - [Response38921](docs/Response38921.md)
 - [Response38922](docs/Response38922.md)
 - [Response38923](docs/Response38923.md)
 - [Response38924](docs/Response38924.md)
 - [Response38925](docs/Response38925.md)
 - [Response38926](docs/Response38926.md)
 - [Response38927](docs/Response38927.md)
 - [Response38928](docs/Response38928.md)
 - [Response38929](docs/Response38929.md)
 - [Response38930](docs/Response38930.md)
 - [Response38931](docs/Response38931.md)
 - [Response38932](docs/Response38932.md)
 - [Response38934](docs/Response38934.md)
 - [Response38935](docs/Response38935.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


