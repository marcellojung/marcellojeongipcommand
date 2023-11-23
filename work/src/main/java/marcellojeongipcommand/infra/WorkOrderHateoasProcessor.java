package marcellojeongipcommand.infra;

import marcellojeongipcommand.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class WorkOrderHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<WorkOrder>> {

    @Override
    public EntityModel<WorkOrder> process(EntityModel<WorkOrder> model) {
        return model;
    }
}
