package in.informo.poc.springcloudfunction.handler;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.BindingName;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import in.informo.poc.springcloudfunction.domain.Address;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.Optional;

public class AddressHandler extends FunctionInvoker<Object, Address> {

    @FunctionName("addressGet")
    public Address get(@HttpTrigger(name = "addressGetReq", methods = {HttpMethod.GET},
            authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<Integer>> request,
                       @BindingName("addressId") Integer addressId,
                       ExecutionContext context) {
        return handleRequest(addressId, context);
    }
}
