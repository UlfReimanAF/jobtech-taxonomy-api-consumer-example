# spring-swagger-codegen-api-client

Jobtech Taxonomy
- API version: 0.9.0
  - Build date: 2019-05-22T16:42:59.138+02:00

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
*PrivateApi* | [**v0TaxonomyPrivateRelationGraphRelationTypeGet**](docs/PrivateApi.md#v0TaxonomyPrivateRelationGraphRelationTypeGet) | **GET** /v0/taxonomy/private/relation/graph/{relation-type} | Relation graphs.
*PrivateApi* | [**v0TaxonomyPrivateRelationGraphRelationTypeIdGet**](docs/PrivateApi.md#v0TaxonomyPrivateRelationGraphRelationTypeIdGet) | **GET** /v0/taxonomy/private/relation/graph/{relation-type}/{id} | Relation graphs.
*PrivateApi* | [**v0TaxonomyPrivateRelationTypesGet**](docs/PrivateApi.md#v0TaxonomyPrivateRelationTypesGet) | **GET** /v0/taxonomy/private/relation/types | Relation graphs.
*PrivateApi* | [**v0TaxonomyPrivateReplaceConceptPost**](docs/PrivateApi.md#v0TaxonomyPrivateReplaceConceptPost) | **POST** /v0/taxonomy/private/replace-concept | Replace old concept with a new concept.
*PublicApi* | [**v0TaxonomyPublicChangesGet**](docs/PublicApi.md#v0TaxonomyPublicChangesGet) | **GET** /v0/taxonomy/public/changes | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
*PublicApi* | [**v0TaxonomyPublicConceptTypesGet**](docs/PublicApi.md#v0TaxonomyPublicConceptTypesGet) | **GET** /v0/taxonomy/public/concept/types | Return a list of all taxonomy types.
*PublicApi* | [**v0TaxonomyPublicConceptsGet**](docs/PublicApi.md#v0TaxonomyPublicConceptsGet) | **GET** /v0/taxonomy/public/concepts | Get concepts.
*PublicApi* | [**v0TaxonomyPublicDeprecatedConceptHistorySinceGet**](docs/PublicApi.md#v0TaxonomyPublicDeprecatedConceptHistorySinceGet) | **GET** /v0/taxonomy/public/deprecated-concept-history-since | Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
*PublicApi* | [**v0TaxonomyPublicSearchGet**](docs/PublicApi.md#v0TaxonomyPublicSearchGet) | **GET** /v0/taxonomy/public/search | get concepts by part of string


## Documentation for Models

 - [Response38969](docs/Response38969.md)
 - [Response38969Concept](docs/Response38969Concept.md)
 - [Response38970](docs/Response38970.md)
 - [Response38971](docs/Response38971.md)
 - [Response38972](docs/Response38972.md)
 - [Response38973](docs/Response38973.md)
 - [Response38974](docs/Response38974.md)
 - [Response38976](docs/Response38976.md)
 - [Response38978](docs/Response38978.md)
 - [Response38980](docs/Response38980.md)
 - [Response38982](docs/Response38982.md)
 - [Response38984](docs/Response38984.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



