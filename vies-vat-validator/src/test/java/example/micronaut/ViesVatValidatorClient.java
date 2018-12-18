package example.micronaut;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import model.SimpleValidate;

import javax.inject.Named;

@FunctionClient
public interface ViesVatValidatorClient {

    @Named("vies-vat-validator")
    Single<SimpleValidate> apply(@Body SimpleValidate sampleValidate);
}
