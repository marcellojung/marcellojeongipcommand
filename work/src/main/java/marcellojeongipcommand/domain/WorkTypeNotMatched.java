package marcellojeongipcommand.domain;

import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

@Data
@ToString
public class WorkTypeNotMatched extends AbstractEvent {

    private Long id;
    private String command;
}
