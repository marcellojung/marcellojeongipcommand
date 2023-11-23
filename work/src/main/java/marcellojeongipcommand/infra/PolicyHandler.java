package marcellojeongipcommand.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import marcellojeongipcommand.config.kafka.KafkaProcessor;
import marcellojeongipcommand.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    WorkOrderRepository workOrderRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UserInfoChecked'"
    )
    public void wheneverUserInfoChecked_Proceed(
        @Payload UserInfoChecked userInfoChecked
    ) {
        UserInfoChecked event = userInfoChecked;
        System.out.println(
            "\n\n##### listener Proceed : " + userInfoChecked + "\n\n"
        );

        // Sample Logic //
        WorkOrder.proceed(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AccountFound'"
    )
    public void wheneverAccountFound_Proceed(
        @Payload AccountFound accountFound
    ) {
        AccountFound event = accountFound;
        System.out.println(
            "\n\n##### listener Proceed : " + accountFound + "\n\n"
        );

        // Sample Logic //
        WorkOrder.proceed(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='WorkTypeMatched'"
    )
    public void wheneverWorkTypeMatched_Proceed(
        @Payload WorkTypeMatched workTypeMatched
    ) {
        WorkTypeMatched event = workTypeMatched;
        System.out.println(
            "\n\n##### listener Proceed : " + workTypeMatched + "\n\n"
        );

        // Sample Logic //
        WorkOrder.proceed(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='WorkTypeNotMatched'"
    )
    public void wheneverWorkTypeNotMatched_Reject(
        @Payload WorkTypeNotMatched workTypeNotMatched
    ) {
        WorkTypeNotMatched event = workTypeNotMatched;
        System.out.println(
            "\n\n##### listener Reject : " + workTypeNotMatched + "\n\n"
        );

        // Sample Logic //
        WorkOrder.reject(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='AccountNotFound'"
    )
    public void wheneverAccountNotFound_Reject(
        @Payload AccountNotFound accountNotFound
    ) {
        AccountNotFound event = accountNotFound;
        System.out.println(
            "\n\n##### listener Reject : " + accountNotFound + "\n\n"
        );

        // Sample Logic //
        WorkOrder.reject(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='UserInfoNotChecked'"
    )
    public void wheneverUserInfoNotChecked_Reject(
        @Payload UserInfoNotChecked userInfoNotChecked
    ) {
        UserInfoNotChecked event = userInfoNotChecked;
        System.out.println(
            "\n\n##### listener Reject : " + userInfoNotChecked + "\n\n"
        );

        // Sample Logic //
        WorkOrder.reject(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
