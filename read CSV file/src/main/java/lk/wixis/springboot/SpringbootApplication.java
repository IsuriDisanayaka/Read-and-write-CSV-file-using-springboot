package lk.wixis.springboot;


import org.springframework.boot.autoconfigure.SpringBootApplication;

import static lk.wixis.springboot.ReadCSVData.readDataLineByLine;


@SpringBootApplication
public class SpringbootApplication  {
	private static final String CSV_FILE_PATH
			= "D:\\Wixis 360\\SpringBoot\\AbC\\tutorials.csv";


	public static void main(String[] args) {

		readDataLineByLine(CSV_FILE_PATH);

	}





}
