package com.jwt.dao;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import com.jwt.model.Item;


@Repository
public class ItemDAOImpl implements ItemDAO {

	@Autowired
	private SessionFactory sessionFactory1;     
	
	@Override
	public void addItem(Item item) {
		
		sessionFactory1.getCurrentSession().saveOrUpdate(item);
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Item> getAllItems() {
		return sessionFactory1.getCurrentSession().createQuery("from Item")
				.list();
	}
	
	

	@Override
	public void deleteItem(Integer itemId) {
		Item item = (Item) sessionFactory1.getCurrentSession().load(
				Item.class, itemId);
		if (null != item) {
			this.sessionFactory1.getCurrentSession().delete(item);
		}
		
	}
	


	@Override
	public Item getItem(int itemid) {
		return (Item) sessionFactory1.getCurrentSession().get(
				Item.class, itemid);
	}

	@Override
	public Item updateItem(Item item) {
		sessionFactory1.getCurrentSession().update(item);
		return item;
	}

}
