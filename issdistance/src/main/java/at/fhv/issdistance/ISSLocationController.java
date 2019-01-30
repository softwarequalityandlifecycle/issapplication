package at.fhv.issdistance;

import at.fhv.issdistance.models.DiscoveredResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ISSLocationController {

    @RequestMapping(value="/location", method= RequestMethod.GET)
    @ResponseBody
    public DiscoveredResult getResult() {

        RestTemplate restTemplate = new RestTemplate();
        DiscoveredResult result = restTemplate.getForObject("http://api.open-notify.org/iss-now.json", DiscoveredResult.class);

        return result;

    }
}
