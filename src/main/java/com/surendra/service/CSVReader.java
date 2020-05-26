package com.surendra.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surendra.beans.Products;

@Service
public class CSVReader {
	
	private DataFilter df;
	
	@Autowired
	public CSVReader(DataFilter dfo) {
		this.df=dfo;
	}
	
	public List<Products> gerReader() throws IOException
	{
		List<Products> prods=new ArrayList<Products>();
		List<Products> filteredProducts=new ArrayList<Products>();
		FileReader fr=new FileReader("products.csv");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			String ar[]=line.split(",");
			Products p=new Products();
			p.setPid(Integer.parseInt(ar[0]));
			p.setPname(ar[1]);
			p.setPrice(Double.parseDouble(ar[2]));
			
			prods.add(p);
			line=br.readLine();
		}
		filteredProducts=df.filter(prods);
		br.close();
		return filteredProducts;
	}

}
