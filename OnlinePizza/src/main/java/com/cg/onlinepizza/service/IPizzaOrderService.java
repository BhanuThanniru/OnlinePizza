package com.cg.onlinepizza.service;

import java.util.List;

import com.cg.onlinepizza.entities.PizzaOrder;
import com.cg.onlinepizza.exceptions.InvalidSizeException;
import com.cg.onlinepizza.exceptions.OrderIdNotFoundException;

public interface IPizzaOrderService {
	PizzaOrder bookPizzaOrder(PizzaOrder order);

	PizzaOrder updatePizzaOrder(PizzaOrder order);

	PizzaOrder cancelPizzaOrder(int orderId) throws OrderIdNotFoundException;

	PizzaOrder viewPizzaOrder(int orderId) throws OrderIdNotFoundException;

	List<PizzaOrder> caluculateTotal(String size, int quantity) throws InvalidSizeException;
}


