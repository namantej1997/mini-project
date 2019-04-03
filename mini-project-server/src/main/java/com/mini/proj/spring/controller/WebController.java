package com.mini.proj.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.mini.proj.spring.dao.StockDataDAO;
import com.mini.proj.spring.model.*;

@Controller
public class WebController {

	@Autowired
	StockDataDAO stockDataDAO;

	@MessageMapping("/hello")
	@SendTo("/topic/hi")
	public void stockData(User user) throws Exception {
		stockDataDAO.stockDataDAOImpl();
	}
}
