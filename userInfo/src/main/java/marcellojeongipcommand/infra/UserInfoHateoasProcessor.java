package marcellojeongipcommand.infra;

import marcellojeongipcommand.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class UserInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<UserInfo>> {

    @Override
    public EntityModel<UserInfo> process(EntityModel<UserInfo> model) {
        return model;
    }
}
