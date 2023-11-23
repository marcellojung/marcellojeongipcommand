package marcellojeongipcommand.domain;

import marcellojeongipcommand.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "workOrders",
    path = "workOrders"
)
public interface WorkOrderRepository
    extends PagingAndSortingRepository<WorkOrder, Long> {}
