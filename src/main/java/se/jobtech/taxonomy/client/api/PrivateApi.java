package se.jobtech.taxonomy.client.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;
import se.jobtech.taxonomy.client.invoker.ApiClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-24T11:20:52.800+02:00")
@Component("se.jobtech.taxonomy.client.api.PrivateApi")
public class PrivateApi {
    private ApiClient apiClient;

    public PrivateApi() {
        this( new ApiClient( ) );
    }

    @Autowired
    public PrivateApi( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    /**
     * Retract the concept with the given ID.
     *
     * <p><b>0</b> -
     *
     * @param id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void v0TaxonomyPrivateConceptDelete( String id ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling v0TaxonomyPrivateConceptDelete" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/private/concept" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "id", id ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>( ) {
        };
        apiClient.invokeAPI( path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Assert a new concept.
     *
     * <p><b>0</b> -
     *
     * @param type
     * @param description
     * @param preferredTerm
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void v0TaxonomyPrivateConceptPost( String type, String description, String preferredTerm ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling v0TaxonomyPrivateConceptPost" );
        }

        // verify the required parameter 'description' is set
        if (description == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'description' when calling v0TaxonomyPrivateConceptPost" );
        }

        // verify the required parameter 'preferredTerm' is set
        if (preferredTerm == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'preferredTerm' when calling v0TaxonomyPrivateConceptPost" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/private/concept" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "type", type ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "description", description ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "preferredTerm", preferredTerm ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>( ) {
        };
        apiClient.invokeAPI( path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Relation graphs.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @param relationType
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN v0TaxonomyPrivateRelationGraphRelationTypeGet( String relationType ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'relationType' is set
        if (relationType == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'relationType' when calling v0TaxonomyPrivateRelationGraphRelationTypeGet" );
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>( );
        uriVariables.put( "relation-type", relationType );
        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/private/relation/graph/{relation-type}" ).buildAndExpand( uriVariables ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<ERRORUNKNOWN> returnType = new ParameterizedTypeReference<ERRORUNKNOWN>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Relation graphs.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @param relationType
     * @param id
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN v0TaxonomyPrivateRelationGraphRelationTypeIdGet( String relationType, String id ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'relationType' is set
        if (relationType == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'relationType' when calling v0TaxonomyPrivateRelationGraphRelationTypeIdGet" );
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling v0TaxonomyPrivateRelationGraphRelationTypeIdGet" );
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>( );
        uriVariables.put( "relation-type", relationType );
        uriVariables.put( "id", id );
        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/private/relation/graph/{relation-type}/{id}" ).buildAndExpand( uriVariables ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<ERRORUNKNOWN> returnType = new ParameterizedTypeReference<ERRORUNKNOWN>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Relation graphs.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN v0TaxonomyPrivateRelationTypesGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/private/relation/types" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<ERRORUNKNOWN> returnType = new ParameterizedTypeReference<ERRORUNKNOWN>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Replace old concept with a new concept.
     *
     * <p><b>0</b> -
     *
     * @param oldConceptId
     * @param newConceptId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void v0TaxonomyPrivateReplaceConceptPost( String oldConceptId, String newConceptId ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'oldConceptId' is set
        if (oldConceptId == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'oldConceptId' when calling v0TaxonomyPrivateReplaceConceptPost" );
        }

        // verify the required parameter 'newConceptId' is set
        if (newConceptId == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'newConceptId' when calling v0TaxonomyPrivateReplaceConceptPost" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/private/replace-concept" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "old-concept-id", oldConceptId ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "new-concept-id", newConceptId ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>( ) {
        };
        apiClient.invokeAPI( path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }
}
