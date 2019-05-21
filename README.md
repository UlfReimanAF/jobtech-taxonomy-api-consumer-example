# spring-swagger-codegen-api-client

Jobtech Taxonomy
- API version: 0.9.0
  - Build date: 2019-05-21T08:53:05.447+02:00

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
import se.jobtech.taxonomy.client.api.PrivateApi;

import java.io.File;
import java.util.*;

public class PrivateApiExample {

    public static void main(String[] args) {
        
        PrivateApi apiInstance = new PrivateApi();
        String id = "id_example"; // String | 
        try {
            apiInstance.v0TaxonomyPrivateConceptDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivateApi#v0TaxonomyPrivateConceptDelete");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PrivateApi* | [**v0TaxonomyPrivateConceptDelete**](docs/PrivateApi.md#v0TaxonomyPrivateConceptDelete) | **DELETE** /v0/taxonomy/private/concept | Retract the concept with the given ID.
*PrivateApi* | [**v0TaxonomyPrivateConceptPost**](docs/PrivateApi.md#v0TaxonomyPrivateConceptPost) | **POST** /v0/taxonomy/private/concept | Assert a new concept.
*PrivateApi* | [**v0TaxonomyPrivateReplaceConceptPost**](docs/PrivateApi.md#v0TaxonomyPrivateReplaceConceptPost) | **POST** /v0/taxonomy/private/replace-concept | Replace old concept with a new concept.
*PublicApi* | [**v0TaxonomyPublicChangesGet**](docs/PublicApi.md#v0TaxonomyPublicChangesGet) | **GET** /v0/taxonomy/public/changes | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
*PublicApi* | [**v0TaxonomyPublicConceptAllGet**](docs/PublicApi.md#v0TaxonomyPublicConceptAllGet) | **GET** /v0/taxonomy/public/concept/all | Read all concepts of the given type.
*PublicApi* | [**v0TaxonomyPublicConceptGet**](docs/PublicApi.md#v0TaxonomyPublicConceptGet) | **GET** /v0/taxonomy/public/concept | Read a concept by ID.
*PublicApi* | [**v0TaxonomyPublicConceptHistorySinceGet**](docs/PublicApi.md#v0TaxonomyPublicConceptHistorySinceGet) | **GET** /v0/taxonomy/public/concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
*PublicApi* | [**v0TaxonomyPublicConceptTypesGet**](docs/PublicApi.md#v0TaxonomyPublicConceptTypesGet) | **GET** /v0/taxonomy/public/concept/types | Read a list of all taxonomy types.
*PublicApi* | [**v0TaxonomyPublicConceptsGet**](docs/PublicApi.md#v0TaxonomyPublicConceptsGet) | **GET** /v0/taxonomy/public/concepts | Get concepts.
*PublicApi* | [**v0TaxonomyPublicDeprecatedConceptHistorySinceGet**](docs/PublicApi.md#v0TaxonomyPublicDeprecatedConceptHistorySinceGet) | **GET** /v0/taxonomy/public/deprecated-concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
*PublicApi* | [**v0TaxonomyPublicFullHistoryGet**](docs/PublicApi.md#v0TaxonomyPublicFullHistoryGet) | **GET** /v0/taxonomy/public/full-history | Show the complete history.
*PublicApi* | [**v0TaxonomyPublicRelationGraphRelationTypeGet**](docs/PublicApi.md#v0TaxonomyPublicRelationGraphRelationTypeGet) | **GET** /v0/taxonomy/public/relation/graph/{relation-type} | Relation graphs.
*PublicApi* | [**v0TaxonomyPublicRelationGraphRelationTypeIdGet**](docs/PublicApi.md#v0TaxonomyPublicRelationGraphRelationTypeIdGet) | **GET** /v0/taxonomy/public/relation/graph/{relation-type}/{id} | Relation graphs.
*PublicApi* | [**v0TaxonomyPublicRelationTypesGet**](docs/PublicApi.md#v0TaxonomyPublicRelationTypesGet) | **GET** /v0/taxonomy/public/relation/types | Relation graphs.
*PublicApi* | [**v0TaxonomyPublicSearchGet**](docs/PublicApi.md#v0TaxonomyPublicSearchGet) | **GET** /v0/taxonomy/public/search | get concepts by part of string
*PublicApi* | [**v0TaxonomyPublicTermGet**](docs/PublicApi.md#v0TaxonomyPublicTermGet) | **GET** /v0/taxonomy/public/term | Search for a term across all taxonomies.
*PublicApi* | [**v0TaxonomyPublicTermPartGet**](docs/PublicApi.md#v0TaxonomyPublicTermPartGet) | **GET** /v0/taxonomy/public/term-part | get concepts by part of string


## Documentation for Models

 - [Response3254](docs/Response3254.md)
 - [Response3254Concept](docs/Response3254Concept.md)
 - [Response3255](docs/Response3255.md)
 - [Response3256](docs/Response3256.md)
 - [Response3257](docs/Response3257.md)
 - [Response3258](docs/Response3258.md)
 - [Response3259](docs/Response3259.md)
 - [Response3260](docs/Response3260.md)
 - [Response3261](docs/Response3261.md)
 - [Response3263](docs/Response3263.md)
 - [Response3264](docs/Response3264.md)
 - [Response3266](docs/Response3266.md)
 - [Response3267](docs/Response3267.md)
 - [Response3269](docs/Response3269.md)
 - [Response3270](docs/Response3270.md)
 - [Response3271](docs/Response3271.md)
 - [Response3272](docs/Response3272.md)
 - [Response3273](docs/Response3273.md)
 - [Response3274](docs/Response3274.md)
 - [Response3275](docs/Response3275.md)
 - [Response3276](docs/Response3276.md)
 - [Response3277](docs/Response3277.md)
 - [Response3278](docs/Response3278.md)
 - [Response3279](docs/Response3279.md)
 - [Response3280](docs/Response3280.md)
 - [Response3282](docs/Response3282.md)
 - [Response3283](docs/Response3283.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



