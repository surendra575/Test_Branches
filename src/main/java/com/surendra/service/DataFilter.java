package com.surendra.service;

import java.util.List;

import com.surendra.beans.Products;

public interface DataFilter {
	
	public List<Products> filter(List<Products> lp);

}
