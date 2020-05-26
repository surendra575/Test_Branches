package com.surendra;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.surendra.beans.Products;
import com.surendra.service.CSVReader;

@SpringBootApplication
public class AssignmentCsvStreamsBySirApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext ctx = SpringApplication.run(AssignmentCsvStreamsBySirApplication.class, args);
		CSVReader csv=ctx.getBean(CSVReader.class);
		List<Products> lsp=csv.gerReader();
		lsp.forEach(System.out::println);
	}

}
