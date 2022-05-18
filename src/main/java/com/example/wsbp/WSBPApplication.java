package com.example.wsbp;

import com.giffing.wicket.spring.boot.starter.app.WicketBootSecuredWebApplication;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WSBPApplication extends WicketBootSecuredWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WSBPApplication.class, args);
	}

	@Override
	protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass(){
		return MySession.class;
	}
}
