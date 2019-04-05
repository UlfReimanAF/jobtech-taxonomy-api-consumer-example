package se.jobtech.taxonomy.client.api;


import org.junit.Ignore;
import org.junit.Test;
import se.jobtech.taxonomy.client.model.Response38760;
import se.jobtech.taxonomy.client.model.Response38763;
import se.jobtech.taxonomy.client.model.Response38765;

import java.util.List;

/**
 * API tests for PublicApi
 */
@Ignore
public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    
    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * 
     *
     * @throws
     *          if the Api call fails
     */
    @Test
    public void taxonomyPublicApiConceptHistorySinceGetTest() {
        String dateTime = null;
        List<Response38765> response = api.taxonomyPublicApiConceptHistorySinceGet(dateTime);

        // TODO: test validations
    }
    
    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * 
     *
     * @throws
     *          if the Api call fails
     */
    @Test
    public void taxonomyPublicApiDeprecatedConceptHistorySinceGetTest() {
        String dateTime = null;
        ERRORUNKNOWN response = api.taxonomyPublicApiDeprecatedConceptHistorySinceGet(dateTime);

        // TODO: test validations
    }
    
    /**
     * Show the complete history.
     *
     * 
     *
     * @throws
     *          if the Api call fails
     */
    @Test
    public void taxonomyPublicApiFullHistoryGetTest() {
        List<Response38763> response = api.taxonomyPublicApiFullHistoryGet();

        // TODO: test validations
    }
    
    /**
     * Search for a term across all taxonomies.
     *
     * 
     *
     * @throws
     *          if the Api call fails
     */
    @Test
    public void taxonomyPublicApiTermGetTest() {
        String term = null;
        List<Response38760> response = api.taxonomyPublicApiTermGet(term);

        // TODO: test validations
    }
    
    /**
     * get concepts by part of string
     *
     * 
     *
     * @throws
     *          if the Api call fails
     */
    @Test
    public void taxonomyPublicApiTermPartGetTest() {
        String term = null;
        api.taxonomyPublicApiTermPartGet(term);

        // TODO: test validations
    }
    
}
