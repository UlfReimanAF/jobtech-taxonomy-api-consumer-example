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
import se.jobtech.taxonomy.client.model.ERRORUNKNOWN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-05-17T13:28:16.089+02:00")
@Component("se.jobtech.taxonomy.client.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this( new ApiClient( ) );
    }

    @Autowired
    public DefaultApi( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient( ApiClient apiClient ) {
        this.apiClient = apiClient;
    }

    /**
     * <p><b>0</b> -
     *
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void authenticatedGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/authenticated" ).build( ).toUriString( );

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
    public ERRORUNKNOWN relationGraphRelationTypeGet( String relationType ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'relationType' is set
        if (relationType == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'relationType' when calling relationGraphRelationTypeGet" );
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>( );
        uriVariables.put( "relation-type", relationType );
        String path = UriComponentsBuilder.fromPath( "/relation/graph/{relation-type}" ).buildAndExpand( uriVariables ).toUriString( );

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
    public ERRORUNKNOWN relationGraphRelationTypeIdGet( String relationType, String id ) throws RestClientException {
        Object postBody = null;

        // verify the required parameter 'relationType' is set
        if (relationType == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'relationType' when calling relationGraphRelationTypeIdGet" );
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException( HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling relationGraphRelationTypeIdGet" );
        }

        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>( );
        uriVariables.put( "relation-type", relationType );
        uriVariables.put( "id", id );
        String path = UriComponentsBuilder.fromPath( "/relation/graph/{relation-type}/{id}" ).buildAndExpand( uriVariables ).toUriString( );

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
    public ERRORUNKNOWN relationTypesGet() throws RestClientException {
        Object postBody = null;

        String path = UriComponentsBuilder.fromPath( "/relation/types" ).build( ).toUriString( );

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
}
