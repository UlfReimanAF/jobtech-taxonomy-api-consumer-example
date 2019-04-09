package se.jobtech.taxonomy.client.api;


import org.junit.Ignore;
import org.junit.Test;
import se.jobtech.taxonomy.client.model.Response38760;
import se.jobtech.taxonomy.client.model.Response38763;
import se.jobtech.taxonomy.client.model.Response38765;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * API tests for PublicApi
 */
@Ignore
public class PublicApiTest {

    private final PublicApi api = new PublicApi();


    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * @throws if the Api call fails
     *            category (string),
     *            preferred-term (string, optional),
     *            new-preferred-term (string, optional),
     *            old-preferred-term (string, optional),
     *            deprecated (boolean, optional),
     *            transaction-id (integer),
     *            timestamp (string),
     *            concept-id (string),
     *            event-type (string)
     */
    @Test
    public void taxonomyPublicApiConceptHistorySinceGetTest() {
        String dateTime = "2018-08-08 14:00:00";


        List<Response38765> response = api.taxonomyPublicApiConceptHistorySinceGet(dateTime);
        for (Response38765 response38765 : response) {
            assertNotNull(response38765.getCategory());
            assertNotNull(response38765.getConceptId());
            assertNotNull(response38765.getEventType());
            response38765.getNewPreferredTerm();
            response38765.getOldPreferredTerm();
            response38765.getPreferredTerm();
            assertNotNull(response38765.getTimestamp());
            assertNotNull(response38765.getTransactionId());

        }

        // TODO: test validations
    }

    /**
     * Show the history since the given date. Use the format yyyy-MM-dd HH:mm:ss (i.e. 2017-06-09 14:30:01).
     *
     * @throws if the Api call fails
     */
    //@Test
    public void taxonomyPublicApiDeprecatedConceptHistorySinceGetTest() {
        String dateTime = "2018-08-08 14:00:00";

        Object response = api.taxonomyPublicApiDeprecatedConceptHistorySinceGet(dateTime);

        assertNotNull(response);
    }

    /**
     * Show the complete history.
     *
     * @throws if the Api call fails
     */
    @Test
    public void taxonomyPublicApiFullHistoryGetTest() {
        System.out.println(api.getApiClient());

        List<Response38763> response = api.taxonomyPublicApiFullHistoryGet();

        // TODO: test validations
    }

    /**
     * Search for a term across all taxonomies.
     *
     * @throws if the Api call fails
     */
    @Test
    public void taxonomyPublicApiTermGetTest() {
        String term = "Danska";
        List<Response38760> response = api.taxonomyPublicApiTermGet(term);
        for (Response38760 response38760 : response) {
            assertNotNull(response38760.getId());
            assertNotNull(response38760.getCategory());
            assertNotNull(response38760.isDeprecated());

        }

        // TODO: test validations
    }

    /**
     * get concepts by part of string
     *
     * @throws if the Api call fails
     */
    @Test
    public void taxonomyPublicApiTermPartGetTest() {
        String term = "Danska";
        api.taxonomyPublicApiTermPartGet(term);

        // TODO: test validations
    }

}
