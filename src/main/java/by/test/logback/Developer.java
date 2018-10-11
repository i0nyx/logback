package by.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Developer extends Staff {
    private static final Logger log = LoggerFactory.getLogger(Developer.class);
    private String position;

    Developer(String position) {
        this.position = position;
    }

    public void getPosition() {
        log.info(position);
    }
}
