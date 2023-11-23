package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marcellojeongipcommand.AccountInfoApplication;
import marcellojeongipcommand.domain.AccountFound;
import marcellojeongipcommand.domain.AccountNotFound;

@Entity
@Table(name = "AccountInfo_table")
@Data
//<<< DDD / Aggregate Root
public class AccountInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String masterip;

    private String connectId;

    private String connectpw;

    @PostPersist
    public void onPostPersist() {
        AccountFound accountFound = new AccountFound(this);
        accountFound.publishAfterCommit();

        AccountNotFound accountNotFound = new AccountNotFound(this);
        accountNotFound.publishAfterCommit();
    }

    public static AccountInfoRepository repository() {
        AccountInfoRepository accountInfoRepository = AccountInfoApplication.applicationContext.getBean(
            AccountInfoRepository.class
        );
        return accountInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void findAccount(WorkCreated workCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        AccountInfo accountInfo = new AccountInfo();
        repository().save(accountInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(workCreated.get???()).ifPresent(accountInfo->{
            
            accountInfo // do something
            repository().save(accountInfo);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
