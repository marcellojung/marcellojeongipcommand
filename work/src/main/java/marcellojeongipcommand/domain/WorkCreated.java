package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WorkCreated extends AbstractEvent {

    private Long id;
    private List<String> workTypeId;
    private String masterIp;
    private String userId;

    public WorkCreated(WorkOrder aggregate) {
        super(aggregate);
    }

    public WorkCreated() {
        super();
    }
}
//>>> DDD / Domain Event
