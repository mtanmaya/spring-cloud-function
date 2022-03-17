package in.informo.poc.springcloudfunction.function;

import in.informo.poc.springcloudfunction.domain.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class AddressFunction {

    @Bean("addressGet")
    public Function<Integer, Address> getAddress() {
        Address adr = new Address();
        adr.setAddress1("adress line 1");
        adr.setCity("Atlanta");
        return id -> adr;
    }
}
