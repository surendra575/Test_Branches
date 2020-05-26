package com.surendra.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.surendra.beans.Products;

@Service
public class DataFilterImpl implements DataFilter {

	@Override
	public List<Products> filter(List<Products> lp) {
		
		return lp.stream()
				.filter(p->p.getPrice()>5000)
				.collect(Collectors.toList());
	}

}
