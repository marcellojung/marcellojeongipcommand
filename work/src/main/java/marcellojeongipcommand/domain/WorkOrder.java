package marcellojeongipcommand.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import marcellojeongipcommand.WorkApplication;
import marcellojeongipcommand.domain.WorkCreated;
import marcellojeongipcommand.domain.WorkProceeded;
import marcellojeongipcommand.domain.WorkRejected;

@Entity
@Table(name = "WorkOrder_table")
@Data
//<<< DDD / Aggregate Root
public class WorkOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ElementCollection
    private List<String> workTypeId;

    private String masterIp;

    private String hopeDate;

    private String userId;

    private String userName;

    private String userRole;

    private Boolean workStatus;

    private String workStatusResult;

    @PostPersist
    public void onPostPersist() {
        WorkCreated workCreated = new WorkCreated(this);
        workCreated.publishAfterCommit();

        WorkProceeded workProceeded = new WorkProceeded(this);
        workProceeded.publishAfterCommit();

        WorkRejected workRejected = new WorkRejected(this);
        workRejected.publishAfterCommit();
    }

    public static WorkOrderRepository repository() {
        WorkOrderRepository workOrderRepository = WorkApplication.applicationContext.getBean(
            WorkOrderRepository.class
        );
        return workOrderRepository;
    }

    //<<< Clean Arch / Port Method
    public static void proceed(UserInfoChecked userInfoChecked) {
        //implement business logic here:

        /** Example 1:  new item 
        WorkOrder workOrder = new WorkOrder();
        repository().save(workOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(userInfoChecked.get???()).ifPresent(workOrder->{
            
            workOrder // do something
            repository().save(workOrder);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void proceed(AccountFound accountFound) {
        //implement business logic here:

        /** Example 1:  new item 
        WorkOrder workOrder = new WorkOrder();
        repository().save(workOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(accountFound.get???()).ifPresent(workOrder->{
            
            workOrder // do something
            repository().save(workOrder);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void proceed(WorkTypeMatched workTypeMatched) {
        //implement business logic here:

        /** Example 1:  new item 
        WorkOrder workOrder = new WorkOrder();
        repository().save(workOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(workTypeMatched.get???()).ifPresent(workOrder->{
            
            workOrder // do something
            repository().save(workOrder);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void reject(WorkTypeNotMatched workTypeNotMatched) {
        //implement business logic here:

        /** Example 1:  new item 
        WorkOrder workOrder = new WorkOrder();
        repository().save(workOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(workTypeNotMatched.get???()).ifPresent(workOrder->{
            
            workOrder // do something
            repository().save(workOrder);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void reject(AccountNotFound accountNotFound) {
        //implement business logic here:

        /** Example 1:  new item 
        WorkOrder workOrder = new WorkOrder();
        repository().save(workOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(accountNotFound.get???()).ifPresent(workOrder->{
            
            workOrder // do something
            repository().save(workOrder);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void reject(UserInfoNotChecked userInfoNotChecked) {
        //implement business logic here:

        /** Example 1:  new item 
        WorkOrder workOrder = new WorkOrder();
        repository().save(workOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(userInfoNotChecked.get???()).ifPresent(workOrder->{
            
            workOrder // do something
            repository().save(workOrder);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
