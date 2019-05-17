# spring-swagger-codegen-api-client

Jobtech Taxonomy
- API version: 1.0.0
  - Build date: 2019-05-17T13:28:16.089+02:00

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

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**authenticatedGet**](docs/DefaultApi.md#authenticatedGet) | **GET** /authenticated | 
*DefaultApi* | [**relationGraphRelationTypeGet**](docs/DefaultApi.md#relationGraphRelationTypeGet) | **GET** /relation/graph/{relation-type} | Relation graphs.
*DefaultApi* | [**relationGraphRelationTypeIdGet**](docs/DefaultApi.md#relationGraphRelationTypeIdGet) | **GET** /relation/graph/{relation-type}/{id} | Relation graphs.
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

 - [Response2779](docs/Response2779.md)
 - [Response2780](docs/Response2780.md)
 - [Response2782](docs/Response2782.md)
 - [Response2783](docs/Response2783.md)
 - [Response2785](docs/Response2785.md)
 - [Response2786](docs/Response2786.md)
 - [Response2787](docs/Response2787.md)
 - [Response2788](docs/Response2788.md)
 - [Response2789](docs/Response2789.md)
 - [Response2790](docs/Response2790.md)
 - [Response2791](docs/Response2791.md)
 - [Response2792](docs/Response2792.md)
 - [Response2793](docs/Response2793.md)
 - [Response2794](docs/Response2794.md)
 - [Response2795](docs/Response2795.md)
 - [Response2796](docs/Response2796.md)
 - [Response2798](docs/Response2798.md)
 - [Response2799](docs/Response2799.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



