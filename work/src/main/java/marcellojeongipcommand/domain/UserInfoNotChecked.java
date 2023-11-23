package marcellojeongipcommand.domain;

import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

@Data
@ToString
public class UserInfoNotChecked extends AbstractEvent {

    private Long id;
    private String userName;
    private String userRole;
}
