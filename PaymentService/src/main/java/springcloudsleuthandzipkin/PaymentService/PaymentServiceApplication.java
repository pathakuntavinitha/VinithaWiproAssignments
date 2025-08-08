package springcloudsleuthandzipkin.PaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
public class PaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}

/*
 * http://localhost:8081/order
 * Order service successfully consume Payment Service data
 */

/*
 * 2025-08-08T16:34:27.405+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-2] [6895d9bb98073f623c1ddca396a9ff49-1af74200cf2024e1] com.mainfile.Payment                     : Processing console request
2025-08-08T16:34:54.843+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-1] [6895d9d6aefa4f942be607b18d68a08e-0b007eb8ec2cc248] com.mainfile.Payment                     : Processing console request
2025-08-08T16:34:58.349+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-3] [6895d9dae154e8158fa193874a4ae798-2c2928033d1c1df3] com.mainfile.Payment                     : Processing console request
2025-08-08T16:35:07.945+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-5] [6895d9e358a4330c00e0560427bdbdff-00e0560427bdbdff] com.mainfile.Payment                     : Processing console request
2025-08-08T16:35:09.387+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-6] [6895d9e5584b1eba07909a3ffa4eadb8-07909a3ffa4eadb8] com.mainfile.Payment                     : Processing console request
2025-08-08T16:35:39.665+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-7] [6895da03893e6778aac24daa23092b17-aac24daa23092b17] com.mainfile.Payment                     : Processing console request
2025-08-08T16:35:40.397+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-8] [6895da045d613248b2b90a01e30d6b0c-b2b90a01e30d6b0c] com.mainfile.Payment                     : Processing console request
2025-08-08T16:35:41.454+05:30  INFO 19864 --- [PaymentService] [nio-8082-exec-9] [6895da053c38d738afe91915d2561e29-afe91915d2561e29] com.mainfile.Payment                     : Processing console request

 */	