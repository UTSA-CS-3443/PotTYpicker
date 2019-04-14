package application.model;

import java.io.File;

public class Building {
	private File dir;
	private String name;
	
	public Building(File file) {
		dir = file;
		name = dir.getName();
	}
	
	public String toString() {
		return this.name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public File getDir() {
		return this.dir;
	}
	
	public void setDir(File dir) {
		this.dir = dir;
	}
}
