package omar.turbine

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.cloud.netflix.turbine.EnableTurbine
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@EnableEurekaClient

class OmarTurbineServerApplication {

	static void main(String[] args) {
		SpringApplication.run OmarTurbineServerApplication, args
	}
}
