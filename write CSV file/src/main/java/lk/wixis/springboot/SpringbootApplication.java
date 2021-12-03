package lk.wixis.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static lk.wixis.springboot.ResultGenerator.addDataToCSV;

@SpringBootApplication
public class SpringbootApplication {
	private static final String CSV_FILE_PATH
			= "./result.csv";
	public static void main(String[] args) {
		addDataToCSV(CSV_FILE_PATH);
	//	SpringApplication.run(SpringbootApplication.class, args);

	}

}

