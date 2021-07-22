package com.chouguleindustries.game.service;

import com.chouguleindustries.game.dto.GameDTO;

public interface GameService {

	boolean validateAndSave(GameDTO dto);
}
