package marcellojeongipcommand.domain;

import java.util.*;
import lombok.*;
import marcellojeongipcommand.domain.*;
import marcellojeongipcommand.infra.AbstractEvent;

@Data
@ToString
public class AccountNotFound extends AbstractEvent {

    private Long id;
    private String masterip;
    private String connectId;
    private String connectpw;
}
