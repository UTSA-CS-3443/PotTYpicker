package application.model;

import java.io.File;
import java.util.ArrayList;

import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Building {
	private File dir;
	private Image image; 
	private String name;
	private ArrayList<Restroom> restrooms;
	
	public Building(File file) {
		dir = file;
		name = dir.getName();
		restrooms = new ArrayList<Restroom>();
		for (File fileEntry : dir.listFiles()) {
			if (fileEntry.isDirectory())
				restrooms.add(new Restroom(file));
		}
	}
	
	public Image getImage() {
		Tooltip tt = new Tooltip ();
		tt.setGraphic(new ImageView (image));
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
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

	public ArrayList<Restroom> getRestrooms() {
		return this.restrooms;
	}

	public void setRestrooms(ArrayList<Restroom> restrooms) {
		this.restrooms = restrooms;
	}
}
