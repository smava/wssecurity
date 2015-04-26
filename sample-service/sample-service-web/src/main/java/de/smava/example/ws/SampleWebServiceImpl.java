package de.smava.example.ws;


import de.smava.wssecurity.sample.StatusRequest;
import de.smava.wssecurity.sample.StatusResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Created by aakhmerov on 25.08.14.
 */
@Component
public class SampleWebServiceImpl extends SpringBeanAutowiringSupport implements StatusResource {

    @Override
    public StatusResponse setStatus(StatusRequest statusRequest) {
        StatusResponse result = new StatusResponse();
        System.out.println(statusRequest.toString());
        result.setStatus("200 OK");
        return result;
    }
}
