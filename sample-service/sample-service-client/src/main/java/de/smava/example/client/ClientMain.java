package de.smava.example.client;

import de.smava.example.ws.StatusResource;
import de.smava.wssecurity.sample.Bank;
import de.smava.wssecurity.sample.Status;
import de.smava.wssecurity.sample.StatusRequest;
import de.smava.wssecurity.sample.StatusResponse;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigInteger;

/**
 * Created by aakhmerov on 26.08.14.
 */
public class ClientMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                new String[]{"client-context.xml"});
        StatusResource client = (StatusResource) context.getBean("sampleClient");
        StatusRequest status = new StatusRequest();
        Bank b = new Bank();
        b.setName("test");
        b.setNumber(new BigInteger("1"));
        status.setBank(b);

        Status s = new Status();
        s.setStartDate("1");
        status.setStatus(s);
        StatusResponse response = client.setStatus(status);
        System.out.println(response.getStatus());
    }
}
