package com.java.connection;

import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.impl.XMLResponseParser;

public class SolrConn {

	public static HttpSolrClient SolrC()
	{
		final String solrUrl = "http://localhost:8983/solr";
		return new HttpSolrClient.Builder(solrUrl)
		    .withConnectionTimeout(10000)
		    .withSocketTimeout(60000)
		    .build();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String urlString = "http://localhost:8983/solr/#/cacore";
//		HttpSolrClient solr = new HttpSolrClient.Builder(urlString).build();		
//		solr.setParser(new XMLResponseParser());
		
	}

}
