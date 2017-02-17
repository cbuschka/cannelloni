package conni.cannelloni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Profile({"a","all"})
@Controller
public class AController {
    @Autowired
    private ABusinessService aBusinessService;

    @RequestMapping(value="/a",produces = MediaType.APPLICATION_JSON_VALUE)
    public HttpEntity<?> getA() {
        return new HttpEntity<>(HttpStatus.NO_CONTENT);
    }
}
