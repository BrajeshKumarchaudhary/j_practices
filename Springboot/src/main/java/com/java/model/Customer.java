package com.java.model;
/*
 * This  is used for accessing data from elastic search
 */
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="ca_project",type="Property",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	@Id
	private String id;
	private String firstName;
	private String LastName;
	private int age;

}
