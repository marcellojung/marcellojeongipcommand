package marcellojeongipcommand.infra;

import marcellojeongipcommand.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class AccountInfoHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<AccountInfo>> {

    @Override
    public EntityModel<AccountInfo> process(EntityModel<AccountInfo> model) {
        return model;
    }
}
