package omar.turbine

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.cloud.netflix.turbine.EnableTurbine

@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard

class OmarTurbineServerApplication {

	static void main(String[] args) {
		SpringApplication.run OmarTurbineServerApplication, args
	}
}
