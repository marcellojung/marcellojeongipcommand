package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class WorkProceeded extends AbstractEvent {

    private Long id;
    private List<String> workTypeId;
    private String masterIp;
    private String hopeDate;
    private String userId;
    private String userName;
    private String userRole;
    private String workStatus;
    private String workStatusResult;

    public WorkProceeded(WorkOrder aggregate) {
        super(aggregate);
    }

    public WorkProceeded() {
        super();
    }
}
//>>> DDD / Domain Event
