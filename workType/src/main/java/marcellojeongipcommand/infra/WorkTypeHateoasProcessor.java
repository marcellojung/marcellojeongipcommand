package marcellojeongipcommand.infra;

import marcellojeongipcommand.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class WorkTypeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<WorkType>> {

    @Override
    public EntityModel<WorkType> process(EntityModel<WorkType> model) {
        return model;
    }
}
