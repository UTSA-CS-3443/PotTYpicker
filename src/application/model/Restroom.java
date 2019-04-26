package application.model;

import java.io.File;

public class Restroom {
	private File dir;
	private String roomNumber;

	public Restroom(File file) {
		dir = file;
		roomNumber = dir.getName();
	}

		public String toString() {
			return this.roomNumber;
		}

		public String getRoomNumber() {
			return this.roomNumber;
		}

		public void setName(String roomNumber) {
			this.roomNumber = roomNumber;
		}

		public File getDir() {
			return this.dir;
		}

		public void setDir(File dir) {
			this.dir = dir;
		}
	}