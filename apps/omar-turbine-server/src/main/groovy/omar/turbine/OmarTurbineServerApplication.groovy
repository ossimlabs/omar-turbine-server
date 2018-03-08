package omar.turbine

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard
import org.springframework.cloud.netflix.turbine.EnableTurbine
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
@EnableDiscoveryClient

class OmarTurbineServerApplication {

	static void main(String[] args) {
		SpringApplication.run OmarTurbineServerApplication, args
	}
}
