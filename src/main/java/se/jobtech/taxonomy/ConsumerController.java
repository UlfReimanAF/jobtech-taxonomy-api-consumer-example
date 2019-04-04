package se.jobtech.taxonomy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import se.jobtech.taxonomy.response.History;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@Controller
public class ConsumerController {

    @RequestMapping(value = "/taxonomy/public-api/concept-history-since", headers = "key=45c1f5e3f05d0", method = GET)
    @ResponseBody
    public History conceptHistorySince() {
        return new History();


    }



}