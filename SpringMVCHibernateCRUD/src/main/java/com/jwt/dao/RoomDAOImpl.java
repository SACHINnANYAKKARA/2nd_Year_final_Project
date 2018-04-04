package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.jwt.model.Room;

@Repository
public class RoomDAOImpl implements RoomDAO {

	@Autowired
	private SessionFactory sessionFactory1;

	@Override
	public void addRooms(Room room) {
		sessionFactory1.getCurrentSession().saveOrUpdate(room);
		
	}

	@SuppressWarnings("unchecked")
	public List<Room> getAllRoom() {
		return sessionFactory1.getCurrentSession().createQuery("from Room")
				.list();
	}

	@Override
	public void deleteRoom(Integer RoomID) {
	    Room room  = (Room) sessionFactory1.getCurrentSession().load(
			  Room.class, RoomID);
		if (null != room) {
			this.sessionFactory1.getCurrentSession().delete(room);
		}
		
	}

	@Override
	public Room getRoom(int RoomID) {
		return (Room) sessionFactory1.getCurrentSession().get(
				Room.class, RoomID);
	}

	@Override
	public Room updateRoom(Room room) {
		sessionFactory1.getCurrentSession().update(room);
		return room;
	}
	
	
	
	
}
