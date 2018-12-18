package example.micronaut;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import model.SimpleValidate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViesVatValidatorFunctionTest {

    @Test
    public void testFunction() throws Exception {
        EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);
        SimpleValidate samValidate = new SimpleValidate("in","123456789");
        ViesVatValidatorClient client = server.getApplicationContext().getBean(ViesVatValidatorClient.class);
        assertEquals(client.apply(samValidate).blockingGet().getMemberStateCode(), "in");
        server.stop();
    }
}
