package example.micronaut;

import io.micronaut.function.FunctionBean;
import model.SimpleValidate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.function.Function;

@FunctionBean("vies-vat-validator")
public class ViesVatValidatorFunction implements Function<SimpleValidate, SimpleValidate> {

    private static final Logger logger = LoggerFactory.getLogger(ViesVatValidatorFunction.class);

    @Override
    public SimpleValidate apply(SimpleValidate simpleValidate) {
        logger.info("<<<<Welcome to Aws Lambda Function >>>>>>>>>");
        logger.info("<<<<+simpleValidate.getMemberStateCode() >>>>>>>>>" + simpleValidate.getMemberStateCode());
        logger.info("<<<<+simpleValidate.getVatNumber() >>>>>>>>>" + simpleValidate.getVatNumber());
        return simpleValidate;
    }
}
