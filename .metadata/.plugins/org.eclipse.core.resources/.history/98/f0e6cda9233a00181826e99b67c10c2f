package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.jwt.model.Room;
import com.jwt.service.RoomService;

@Controller

public class RoomController {

	private static final Logger logger = Logger
			.getLogger(RoomController.class);

	public RoomController() {
		System.out.println("RoomController()");
	}

	@Autowired
	private RoomService roomService;

	@RequestMapping(value = "/RoomView")
	public ModelAndView listRoom(ModelAndView model) throws IOException {
		List<Room> listRoom = roomService.getAllRoom();
		model.addObject("listRoom", listRoom);
		model.setViewName("RoomHome");
		return model;
	}
	
	@RequestMapping(value = "/newRoom", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Room room = new Room();
		model.addObject("room", room);
		model.setViewName("RoomForm");
		return model;
   }

	@RequestMapping(value = "/saveRoom", method = RequestMethod.POST)
	public ModelAndView saveRoom(@ModelAttribute Room room) {
		if (room.getNo() == 0) { // if employee id is 0 then creating the
			roomService.addRooms(room);
		} else {
			roomService.updateRoom(room);
		}
		return new ModelAndView("redirect:/");
	}
	

	@RequestMapping(value = "/deleteRoom", method = RequestMethod.GET)
	public ModelAndView deleteRoom(HttpServletRequest request) {
		int RoomID = Integer.parseInt(request.getParameter("no"));
		roomService.deleteRoom(RoomID);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editRoom", method = RequestMethod.GET)
	public ModelAndView editRoom(HttpServletRequest request) {
		int RoomID = Integer.parseInt(request.getParameter("no"));
		Room room = roomService.getRoom(RoomID);
		ModelAndView model = new ModelAndView("RoomForm");
		model.addObject("room",room);
		
		return model;
	}
	
	
}
