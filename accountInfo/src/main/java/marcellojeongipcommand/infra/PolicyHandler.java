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
    AccountInfoRepository accountInfoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='WorkCreated'"
    )
    public void wheneverWorkCreated_FindAccount(
        @Payload WorkCreated workCreated
    ) {
        WorkCreated event = workCreated;
        System.out.println(
            "\n\n##### listener FindAccount : " + workCreated + "\n\n"
        );

        // Sample Logic //
        AccountInfo.findAccount(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
