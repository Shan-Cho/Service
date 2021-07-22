package com.chouguleindustries.game.dto;

import java.io.Serializable;

public class GameDTO implements Serializable {

	private String name;// char, >3 , <=10,!null
	private String version; // !null, >1, <50
	private String developer;// min 3 , max 15
	private int maxplayer; // min 1 , max 8
	private double memoryRequired; // min 500, max 500000
	private boolean online;

	public GameDTO() {
		System.out.println("default");
	}

	public GameDTO(String name, String version, String developer, int maxplayer, double memoryRequired,
			boolean online) {
		super();
		this.name = name;
		this.version = version;
		this.developer = developer;
		this.maxplayer = maxplayer;
		this.memoryRequired = memoryRequired;
		this.online = online;
	}

	@Override
	public String toString() {
		return "GameDTO [name=" + name + ", version=" + version + ", developer=" + developer + ", maxplayer="
				+ maxplayer + ", memoryRequired=" + memoryRequired + ", online=" + online + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof GameDTO) {
			GameDTO castd = (GameDTO) obj;
			if (this.name.equals(castd.name) && this.version.equals(castd.version)
					&& this.developer.equals(castd.developer)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("original hashcode: " + System.identityHashCode(this) + "for hashing returnng 43");

		return 43;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDeveloper() {
		return developer;
	}

	public void setDeveloper(String developer) {
		this.developer = developer;
	}

	public int getMaxplayer() {
		return maxplayer;
	}

	public void setMaxplayer(int maxplayer) {
		this.maxplayer = maxplayer;
	}

	public double getMemoryRequired() {
		return memoryRequired;
	}

	public void setMemoryRequired(double memoryRequired) {
		this.memoryRequired = memoryRequired;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

}
