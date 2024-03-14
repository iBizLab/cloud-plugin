package net.ibizsys.ebsx.allinone.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient(autoRegister=false)
@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
@ComponentScan({"net.ibizsys.central.cloud.core.spring"
	,"net.ibizsys.central.cloud.workflow.core.spring"
	,"net.ibizsys.central.cloud.oss.core.spring"
	,"net.ibizsys.central.cloud.conf.core.spring"
	,"net.ibizsys.central.cloud.saas.core.spring"
	,"net.ibizsys.central.cloud.devops.core.spring"
	,"net.ibizsys.central.cloud.log.core.spring"
	,"net.ibizsys.central.cloud.task.core.spring"
	,"net.ibizsys.central.cloud.notify.core.spring"
	,"net.ibizsys.central.cloud.open.core.spring"
	,"net.ibizsys.central.cloud.ou.core.spring"
	,"net.ibizsys.central.cloud.saas.ebsx.spring.controller"
	,"net.ibizsys.central.plugin.liquibase.spring"
	,"net.ibizsys.central.cloud.report.core.spring"
	,"net.ibizsys.central.cloud.portal.core.spring"
	,"net.ibizsys.central.cloud.uaa.rabbitmq.spring"
	,"net.ibizsys.central.cloud.ai.core.spring"
	,"net.ibizsys.central.cloud.kb.core.spring"
	,"net.ibizsys.central.cloud.dataflow.core.spring"
	,"net.ibizsys.central.cloud.workflow.flowable.spring"})
public class EBSXAllInOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EBSXAllInOneApplication.class, args);
    }

}
