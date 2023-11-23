package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class AccountNotFound extends AbstractEvent {

    private Long id;
    private String masterip;
    private String connectId;
    private String connectpw;

    public AccountNotFound(AccountInfo aggregate) {
        super(aggregate);
    }

    public AccountNotFound() {
        super();
    }
}
//>>> DDD / Domain Event
