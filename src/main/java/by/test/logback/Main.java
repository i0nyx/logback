package by.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("start project");
        Staff s1 = new TeamLead("team lead");
        s1.getPosition();
        Staff s2 = new Developer("developer");
        s2.getPosition();
        log.info("end project");
    }
}
