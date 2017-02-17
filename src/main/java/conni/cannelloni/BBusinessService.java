package conni.cannelloni;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Profile({"all","b"})
public class BBusinessService {

    private static Logger log = LoggerFactory.getLogger(BBusinessService.class);

    @Autowired
    private ADomainService aDomainService;

    @PostConstruct
    private void init() {
        log.info("BBusiness started.");
    }
}
