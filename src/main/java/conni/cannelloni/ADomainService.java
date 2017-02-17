package conni.cannelloni;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Lazy
public class ADomainService {

    private static Logger log = LoggerFactory.getLogger(ADomainService.class);

    @PostConstruct
    private void init() {
        log.info("ADomain started.");
    }
}
