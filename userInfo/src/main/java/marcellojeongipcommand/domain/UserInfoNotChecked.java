package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class UserInfoNotChecked extends AbstractEvent {

    private Long id;
    private String userName;
    private String userRole;

    public UserInfoNotChecked(UserInfo aggregate) {
        super(aggregate);
    }

    public UserInfoNotChecked() {
        super();
    }
}
//>>> DDD / Domain Event
