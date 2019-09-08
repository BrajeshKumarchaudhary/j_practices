package com.java.repository;

import java.util.List;
import com.java.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.java.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {

	Iterable<Customer> findAll();

	void save(List<Customer> customers);
	}


