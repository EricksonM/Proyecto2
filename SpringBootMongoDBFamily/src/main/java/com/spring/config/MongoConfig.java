package com.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration{

	@Override
	protected String getDatabaseName() {
		return "mongoFamily";
	}
	
	@Override
	public MongoClient mongoClient() {
		return new MongoClient("mongo", 27017);
	}
	
	@Autowired
	protected String getMappingBasePackage() {
		return "com.spring.model";
	}



}
