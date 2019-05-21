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
import se.jobtech.taxonomy.client.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-21T08:53:05.447+02:00")
@Component("se.jobtech.taxonomy.client.api.PublicApi")
public class PublicApi {
    private ApiClient apiClient;

    public PublicApi() {
        this( new ApiClient( ) );
    }

    @Autowired
    public PublicApi( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param fromDateTime
     * @param offset
     * @param limit
     * @return List&lt;Response3254&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3254> v0TaxonomyPublicChangesGet( String fromDateTime, Long offset, Long limit ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'fromDateTime' is set
        if (fromDateTime == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromDateTime' when calling v0TaxonomyPublicChangesGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/changes" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "fromDateTime", fromDateTime ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "offset", offset ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "limit", limit ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response3254>> returnType = new ParameterizedTypeReference<List<Response3254>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Read all concepts of the given type.
     *
     * <p><b>0</b> -
     *
     * @param type
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void v0TaxonomyPublicConceptAllGet( String type ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling v0TaxonomyPublicConceptAllGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/concept/all" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "type", type ) );

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
        apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Read a concept by ID.
     *
     * <p><b>0</b> -
     *
     * @param id
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void v0TaxonomyPublicConceptGet( String id ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling v0TaxonomyPublicConceptGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/concept" ).build( ).toUriString( );

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
        apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param dateTime
     * @return List&lt;Response3278&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3278> v0TaxonomyPublicConceptHistorySinceGet( String dateTime ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling v0TaxonomyPublicConceptHistorySinceGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/concept-history-since" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "date-time", dateTime ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response3278>> returnType = new ParameterizedTypeReference<List<Response3278>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Read a list of all taxonomy types.
     *
     * <p><b>0</b> -
     *
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void v0TaxonomyPublicConceptTypesGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/concept/types" ).build( ).toUriString( );

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

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>( ) {
        };
        apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Get concepts.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @param id
     * @param preferredLabel
     * @param type
     * @param deprecated
     * @param offset
     * @param limit
     * @return List&lt;Response3257&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3257> v0TaxonomyPublicConceptsGet( String id, String preferredLabel, String type, Boolean deprecated, Long offset, Long limit ) throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/concepts" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "id", id ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "preferredLabel", preferredLabel ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "type", type ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "deprecated", deprecated ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "offset", offset ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "limit", limit ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response3257>> returnType = new ParameterizedTypeReference<List<Response3257>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param dateTime
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN v0TaxonomyPublicDeprecatedConceptHistorySinceGet( String dateTime ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'dateTime' is set
        if (dateTime == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'dateTime' when calling v0TaxonomyPublicDeprecatedConceptHistorySinceGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/deprecated-concept-history-since" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "date-time", dateTime ) );

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
     * Show the complete history.
     *
     * <p><b>200</b> -
     * <p><b>500</b> -
     *
     * @return List&lt;Response3276&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3276> v0TaxonomyPublicFullHistoryGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/full-history" ).build( ).toUriString( );

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

        ParameterizedTypeReference<List<Response3276>> returnType = new ParameterizedTypeReference<List<Response3276>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Relation graphs.
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param relationType
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN v0TaxonomyPublicRelationGraphRelationTypeGet( String relationType ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'relationType' is set
        if (relationType == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'relationType' when calling v0TaxonomyPublicRelationGraphRelationTypeGet" );
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>( );
        uriVariables.put( "relation-type", relationType );
        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/relation/graph/{relation-type}" ).buildAndExpand( uriVariables ).toUriString( );

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
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param relationType
     * @param id
     * @return ERRORUNKNOWN
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ERRORUNKNOWN v0TaxonomyPublicRelationGraphRelationTypeIdGet( String relationType, String id ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'relationType' is set
        if (relationType == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'relationType' when calling v0TaxonomyPublicRelationGraphRelationTypeIdGet" );
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling v0TaxonomyPublicRelationGraphRelationTypeIdGet" );
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>( );
        uriVariables.put( "relation-type", relationType );
        uriVariables.put( "id", id );
        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/relation/graph/{relation-type}/{id}" ).buildAndExpand( uriVariables ).toUriString( );

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
    public ERRORUNKNOWN v0TaxonomyPublicRelationTypesGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/relation/types" ).build( ).toUriString( );

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
     * get concepts by part of string
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param q
     * @param type
     * @param offset
     * @param limit
     * @return List&lt;Response3259&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3259> v0TaxonomyPublicSearchGet( String q, String type, Long offset, Long limit ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling v0TaxonomyPublicSearchGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/search" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "q", q ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "type", type ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "offset", offset ) );
        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "limit", limit ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response3259>> returnType = new ParameterizedTypeReference<List<Response3259>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * Search for a term across all taxonomies.
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param term
     * @return List&lt;Response3270&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3270> v0TaxonomyPublicTermGet( String term ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'term' is set
        if (term == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'term' when calling v0TaxonomyPublicTermGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/term" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "term", term ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response3270>> returnType = new ParameterizedTypeReference<List<Response3270>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }

    /**
     * get concepts by part of string
     *
     * <p><b>200</b> -
     * <p><b>404</b> -
     * <p><b>500</b> -
     *
     * @param term
     * @return List&lt;Response3273&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Response3273> v0TaxonomyPublicTermPartGet( String term ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'term' is set
        if (term == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'term' when calling v0TaxonomyPublicTermPartGet" );
        }

        String path = UriComponentsBuilder.fromPath( "/v0/taxonomy/public/term-part" ).build( ).toUriString( );

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>( );
        final HttpHeaders headerParams = new HttpHeaders( );
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>( );

        queryParams.putAll( apiClient.parameterToMultiValueMap( null, "term", term ) );

        final String[] accepts = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept( accepts );
        final String[] contentTypes = {
                "application/json", "application/transit+msgpack", "application/transit+json", "application/edn"
        };
        final MediaType contentType = apiClient.selectHeaderContentType( contentTypes );

        String[] authNames = new String[]{};

        ParameterizedTypeReference<List<Response3273>> returnType = new ParameterizedTypeReference<List<Response3273>>( ) {
        };
        return apiClient.invokeAPI( path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType );
    }
}
