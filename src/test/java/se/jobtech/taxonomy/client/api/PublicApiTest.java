/*
 * Jobtech Taxonomy
 * Jobtech taxonomy services
 *
 * OpenAPI spec version: 0.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package se.jobtech.taxonomy.client.api;

import se.jobtech.taxonomy.client.model.*;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

/**
 * API tests for PublicApi
 */

public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    
    /**
     * Show the history from a given version.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicChangesGetTest() {
        Long fromVersion = 1L;
        Long toVersion = 2L;
        Long offset = null;
        Long limit = 10L;
        List<Response3164> response = api.v0TaxonomyPublicChangesGet(fromVersion, toVersion, offset, limit);
        assertNotNull( response );

    }
    
    /**
     * Return a list of all taxonomy types.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicConceptTypesGetTest() {
        Long version = 1L;
        List<String> response = api.v0TaxonomyPublicConceptTypesGet(version);

        assertNotNull( response );
    }
    
    /**
     * Get concepts.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicConceptsGetTest() {
        String id = "vVTg_C9s_8NG";
        String preferredLabel = "Drejare";
        String type = "occupation-name";
        Boolean deprecated = false;
        Long offset = null;
        Long limit = null;
        Long version = 1L;
        List<Response3166> response = api.v0TaxonomyPublicConceptsGet(id, preferredLabel, type, deprecated, offset, limit, version);

        assertNotNull( response );
    }
    

    
    /**
     * Show the history of concepts being replaced from a given version.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
  //  @Test
    public void v0TaxonomyPublicReplacedByChangesGetTest() {
        Long fromVersion = 1L;
        Long toVersion = 2L;
        Response3179Concept response = api.v0TaxonomyPublicReplacedByChangesGet(fromVersion, toVersion);

        assertNotNull( response );
    }
    
    /**
     * Autocomplete from query string
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void v0TaxonomyPublicSearchGetTest() {
        String q = "Java";
        String type = null;
        Long offset = null;
        Long limit = null;
        Long version = 2L;
        List<Response3168> response = api.v0TaxonomyPublicSearchGet(q, type, offset, limit, version);

        assertNotNull( response );
    }
    
    /**
     * Return a list of all Taxonomy versions.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
   // @Test
    public void v0TaxonomyPublicSearchLoadTest() {
        for (int i = 0; i < 50; i++) {
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            for (char c : alphabet) {
                List<Response3168> responseS = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "skill", null, null,2L );
                List<Response3168> responseOn = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "occupation-name", null, null,2L );
                List<Response3168> responseOg = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "occupation-group", null, null ,2L);
                List<Response3168> responseOf = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "occupation-field", null, null ,2L);
                List<Response3168> responseD = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "driving-license", null, null ,1L);
                List<Response3168> responseSH = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "skill-headline", null, null,1L );
                List<Response3168> responseL = api.v0TaxonomyPublicSearchGet( String.valueOf( c ), "language", null, null,1L );
                assertNotNull( responseS );
                assertNotNull( responseOn );
                assertNotNull( responseOg );
                assertNotNull( responseOf );
                assertNotNull( responseD );
                assertNotNull( responseSH );
                assertNotNull( responseL );

            }
        }
    }
    
}
