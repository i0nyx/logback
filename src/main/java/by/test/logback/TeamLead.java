package by.test.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeamLead extends Staff {
    private static final Logger log = LoggerFactory.getLogger(TeamLead.class);
    private String position;

    TeamLead(String position) {
        this.position = position;
    }

    public void getPosition() {
        log.info(position);
    }
}
