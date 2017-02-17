
package conni.cannelloni;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAutoConfiguration
@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class CannelloniMain extends SpringBootServletInitializer
{
	public static void main(String[] args)
	{
		SpringApplication app = new SpringApplication(CannelloniMain.class);
		app.run(args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CannelloniMain.class);
	}
}
