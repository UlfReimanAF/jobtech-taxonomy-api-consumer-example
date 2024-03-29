# spring-swagger-codegen-api-client

Jobtech Taxonomy
- API version: 0.9.0
  - Build date: 2019-08-27T11:15:31.744+02:00

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
            Response3176 result = apiInstance.v0TaxonomyPrivateConceptDelete(id);
            System.out.println(result);
        } catch (Exception e) {
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
*PrivateApi* | [**v0TaxonomyPrivateVersionsPost**](docs/PrivateApi.md#v0TaxonomyPrivateVersionsPost) | **POST** /v0/taxonomy/private/versions | Creates a new version tag in the database.
*PublicApi* | [**v0TaxonomyPublicChangesGet**](docs/PublicApi.md#v0TaxonomyPublicChangesGet) | **GET** /v0/taxonomy/public/changes | Show the history from a given version.
*PublicApi* | [**v0TaxonomyPublicConceptTypesGet**](docs/PublicApi.md#v0TaxonomyPublicConceptTypesGet) | **GET** /v0/taxonomy/public/concept/types | Return a list of all taxonomy types.
*PublicApi* | [**v0TaxonomyPublicConceptsGet**](docs/PublicApi.md#v0TaxonomyPublicConceptsGet) | **GET** /v0/taxonomy/public/concepts | Get concepts.
*PublicApi* | [**v0TaxonomyPublicParseTextPost**](docs/PublicApi.md#v0TaxonomyPublicParseTextPost) | **POST** /v0/taxonomy/public/parse-text | Finds all concepts in a text.
*PublicApi* | [**v0TaxonomyPublicReplacedByChangesGet**](docs/PublicApi.md#v0TaxonomyPublicReplacedByChangesGet) | **GET** /v0/taxonomy/public/replaced-by-changes | Show the history of concepts being replaced from a given version.
*PublicApi* | [**v0TaxonomyPublicSearchGet**](docs/PublicApi.md#v0TaxonomyPublicSearchGet) | **GET** /v0/taxonomy/public/search | Autocomplete from query string
*PublicApi* | [**v0TaxonomyPublicVersionsGet**](docs/PublicApi.md#v0TaxonomyPublicVersionsGet) | **GET** /v0/taxonomy/public/versions | Return a list of all Taxonomy versions.


## Documentation for Models

 - [Response3162](docs/Response3162.md)
 - [Response3163](docs/Response3163.md)
 - [Response3164](docs/Response3164.md)
 - [Response3164Concept](docs/Response3164Concept.md)
 - [Response3165](docs/Response3165.md)
 - [Response3166](docs/Response3166.md)
 - [Response3166ReplacedBy](docs/Response3166ReplacedBy.md)
 - [Response3167](docs/Response3167.md)
 - [Response3168](docs/Response3168.md)
 - [Response3169](docs/Response3169.md)
 - [Response3171](docs/Response3171.md)
 - [Response3173](docs/Response3173.md)
 - [Response3175](docs/Response3175.md)
 - [Response3176](docs/Response3176.md)
 - [Response3177](docs/Response3177.md)
 - [Response3178](docs/Response3178.md)
 - [Response3179](docs/Response3179.md)
 - [Response3179Concept](docs/Response3179Concept.md)
 - [Response3179ConceptReplacedBy](docs/Response3179ConceptReplacedBy.md)
 - [Response3180](docs/Response3180.md)
 - [Response3181](docs/Response3181.md)
 - [Response3182](docs/Response3182.md)
 - [Response3183](docs/Response3183.md)
 - [Response3185](docs/Response3185.md)
 - [Response3187](docs/Response3187.md)
 - [Response3189](docs/Response3189.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



