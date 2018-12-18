package mail;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import model.EmailCmd;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.micronaut.http.HttpResponse;

import javax.validation.Valid;


@Controller("/mail")
public class MailController {
    private static final Logger logger = LoggerFactory.getLogger(MailController.class);


    @Post("/send")
    public HttpResponse send() {
        logger.info("**********Hiiiii Mailing Services With SES ....haaaaaahahah");
        logger.info("**********Hiiiii Mailing Services With SES ....haaaaaahahah");
        System.out.println("*************Sending Mail Triggerrrr************");
        System.out.println("*************Sending Mail Triggerrrr************");
        System.out.println("*************Sending Mail Triggerrrr************");
        return HttpResponse.ok();
    }


}
