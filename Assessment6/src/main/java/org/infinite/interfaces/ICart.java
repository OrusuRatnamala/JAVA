package org.infinite.interfaces;

import java.util.List;

import org.infinite.pojo.Product;

public interface ICart {

	public void insert();

	public void update();

	public void delete();

	public List<Product> display();

}