package WebSiteExample.WebSiteExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = {"WebSiteExample.WebSiteExample.Controllers"})
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class WebSiteExampleApplication {

	public static void main(String[] args) {

		try
		{
			SpringApplication.run(WebSiteExampleApplication.class);
		}
		catch(Exception exc)
		{
//			System.out.println("exception: " + exc.getMessage());
//			exc.printStackTrace();
		}
	}

}
