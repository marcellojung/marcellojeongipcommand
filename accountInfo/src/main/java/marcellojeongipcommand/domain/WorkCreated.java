package marcellojeongipcommand.domain;

import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

@Data
@ToString
public class WorkCreated extends AbstractEvent {

    private Long id;
    private Object workTypeId;
    private String masterIp;
    private String userId;
}
