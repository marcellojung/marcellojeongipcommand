package marcellojeongipcommand.domain;

import marcellojeongipcommand.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "workTypes", path = "workTypes")
public interface WorkTypeRepository
    extends PagingAndSortingRepository<WorkType, Long> {}
