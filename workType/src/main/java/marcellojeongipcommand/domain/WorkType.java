package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marcellojeongipcommand.WorkTypeApplication;
import marcellojeongipcommand.domain.WorkTypeMatched;
import marcellojeongipcommand.domain.WorkTypeNotMatched;

@Entity
@Table(name = "WorkType_table")
@Data
//<<< DDD / Aggregate Root
public class WorkType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String command;

    @PostPersist
    public void onPostPersist() {
        WorkTypeMatched workTypeMatched = new WorkTypeMatched(this);
        workTypeMatched.publishAfterCommit();

        WorkTypeNotMatched workTypeNotMatched = new WorkTypeNotMatched(this);
        workTypeNotMatched.publishAfterCommit();
    }

    public static WorkTypeRepository repository() {
        WorkTypeRepository workTypeRepository = WorkTypeApplication.applicationContext.getBean(
            WorkTypeRepository.class
        );
        return workTypeRepository;
    }

    //<<< Clean Arch / Port Method
    public static void matchWorktype(WorkCreated workCreated) {
        //implement business logic here:

        /** Example 1:  new item 
        WorkType workType = new WorkType();
        repository().save(workType);

        */

        /** Example 2:  finding and process
        
        repository().findById(workCreated.get???()).ifPresent(workType->{
            
            workType // do something
            repository().save(workType);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
