package com.jwt.service;

import java.util.List;

import com.jwt.model.Room;

public interface RoomService {

	public void addRooms(Room room);

	public List<Room> getAllRoom();

	public void deleteRoom(Integer RoomID);

	public Room getRoom(int RoomID);
	
	public  Room updateRoom(Room room);
	
}
