package net.ibizsys.ebsx.gateway.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient(autoRegister=false)
@ComponentScan("net.ibizsys.central.cloud.gateway")
@SpringBootApplication
public class EBSXGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EBSXGatewayApplication.class, args);
    }

}
