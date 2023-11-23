package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marcellojeongipcommand.UserInfoApplication;
import marcellojeongipcommand.domain.UserInfoChecked;
import marcellojeongipcommand.domain.UserInfoNotChecked;

@Entity
@Table(name = "UserInfo_table")
@Data
//<<< DDD / Aggregate Root
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;

    private String userRole;

    @PostPersist
    public void onPostPersist() {
        UserInfoChecked userInfoChecked = new UserInfoChecked(this);
        userInfoChecked.publishAfterCommit();

        UserInfoNotChecked userInfoNotChecked = new UserInfoNotChecked(this);
        userInfoNotChecked.publishAfterCommit();
    }

    public static UserInfoRepository repository() {
        UserInfoRepository userInfoRepository = UserInfoApplication.applicationContext.getBean(
            UserInfoRepository.class
        );
        return userInfoRepository;
    }

    //<<< Clean Arch / Port Method
    public static void checkUserInfo(WorkCreated workCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        UserInfo userInfo = new UserInfo();
        repository().save(userInfo);

        */

        /** Example 2:  finding and process
        
        repository().findById(workCreated.get???()).ifPresent(userInfo->{
            
            userInfo // do something
            repository().save(userInfo);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
