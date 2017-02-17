package conni.cannelloni;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Profile({"a","all"})
public class ABusinessService {

    private static Logger log = LoggerFactory.getLogger(ABusinessService.class);

    @Autowired
    private ADomainService aDomainService;

    @PostConstruct
    private void init() {
        log.info("ABusiness started.");
    }
}
