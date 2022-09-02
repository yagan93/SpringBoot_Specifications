package com.example.specifications.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ extends com.example.specifications.core.generic.ExtendedEntity_ {

	public static volatile SingularAttribute<Book, Double> purchasePrice;
	public static volatile SingularAttribute<Book, String> title;

	public static final String PURCHASE_PRICE = "purchasePrice";
	public static final String TITLE = "title";

}

