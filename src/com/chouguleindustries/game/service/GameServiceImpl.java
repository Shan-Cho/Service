package com.chouguleindustries.game.service;

import com.chouguleindustries.game.dto.GameDTO;

public class GameServiceImpl implements GameService {

	public boolean validateAndSave(GameDTO dto) {
		System.out.println("invoked validateAndSave" + dto);
		boolean nameValid = false;
		boolean versionValid = false;
		boolean devVaild = false;
		boolean maxPlayerValid = false;
		boolean memoryRequirementVaild = false;

		if (dto != null) {
			System.out.println("dto is not null, will start validating");
			String name = dto.getName();// sp
			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() < +10) {
				System.out.println("name is valid");
				nameValid = true;
			} else {
				System.out.println("name is invalid");
				nameValid = false;// false
			}
			String version = dto.getVersion();// 3
			if (version != null && version.length() > 1 && version.length() < 50) {
				System.out.println("version is valid");
				versionValid = true;// true
			} else {

				System.out.println(" version is invalid");
				versionValid = false;
			}
			if (nameValid && versionValid) {
				System.out.println("data is valid, returning success");
				return true;
			}
			String dev = dto.getDeveloper();
			if (dev.length() > 3 && dev.length() <= 15) {
				System.out.println("dev is valid");
				devVaild = true;// min 3 , max 15
			} else {
				System.out.println("dev is invalid");
				devVaild = false;
			}

			int maxPlayer = dto.getMaxplayer();// min 1 , max 8
			if (maxPlayer > 1 && maxPlayer <= 8) {
				System.out.println("maxPlayer is valid");
				maxPlayerValid = true;
			} else {
				System.out.println("maxPlayer is invalid");
				maxPlayerValid = false;
			}

			double memoryRequirement = dto.getMemoryRequired();
			if (memoryRequirement > 500 && memoryRequirement <= 500000) {
				System.out.println("memoryRequirement is valid");// min 500, max 500000
				memoryRequirementVaild = true;
			} else {
				System.out.println("memoryRequirement is invalid");
				memoryRequirementVaild = false;
			}

			return false;
		}
		System.out.println("dto is null , cannot pass to dto");
		return false;
	}
}
