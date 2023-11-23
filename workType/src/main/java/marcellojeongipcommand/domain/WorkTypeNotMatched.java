package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WorkTypeNotMatched extends AbstractEvent {

    private Long id;
    private String command;

    public WorkTypeNotMatched(WorkType aggregate) {
        super(aggregate);
    }

    public WorkTypeNotMatched() {
        super();
    }
}
//>>> DDD / Domain Event
