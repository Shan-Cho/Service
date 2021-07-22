package com.chouguleindustries.game.tester;

import com.chouguleindustries.game.dto.GameDTO;
import com.chouguleindustries.game.service.GameService;
import com.chouguleindustries.game.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {

		GameDTO dto = new GameDTO("nfs", "10", "EA sports", 0, 500.00, false);

		GameService gameService = new GameServiceImpl();
		boolean save = gameService.validateAndSave(dto);
		System.out.println(save);
	}
}
