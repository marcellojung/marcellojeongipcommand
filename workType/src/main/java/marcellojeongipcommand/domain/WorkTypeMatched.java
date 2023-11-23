package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WorkTypeMatched extends AbstractEvent {

    private Long id;
    private String command;

    public WorkTypeMatched(WorkType aggregate) {
        super(aggregate);
    }

    public WorkTypeMatched() {
        super();
    }
}
//>>> DDD / Domain Event
