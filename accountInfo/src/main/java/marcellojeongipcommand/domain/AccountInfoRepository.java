package marcellojeongipcommand.domain;

import marcellojeongipcommand.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "accountInfos",
    path = "accountInfos"
)
public interface AccountInfoRepository
    extends PagingAndSortingRepository<AccountInfo, Long> {}
