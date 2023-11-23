package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WorkRejected extends AbstractEvent {

    private Long id;

    public WorkRejected(WorkOrder aggregate) {
        super(aggregate);
    }

    public WorkRejected() {
        super();
    }
}
//>>> DDD / Domain Event
