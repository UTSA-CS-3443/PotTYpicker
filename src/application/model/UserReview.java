package application.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The review class represents the user review on the RestRoom. The user review includes the actual comment, the name of the user,
 * a bathroom rating based on a 0 to 5 scale, and an overall score based on upvotes and downvotes.
 * @author The Walking Data Structures
 */
public class UserReview {
	
	private String comment;
	private String userName;
	private int restroomRating;
	private int commentPopularity;
	
	public UserReview( String comment, String user, int rating, int popularity) {
		this.setComment(comment);
		this.setUserName(user);
		this.setRestroomRating(rating);
		this.setCommentPopularity(popularity);
	}
	
	public void writeReview(Restroom restroom) {
		String fileName = this.getUserName() + ".txt";
		fileName = restroom.getDir().getAbsolutePath() + "/" + fileName;
		
		File writeFile = new File(fileName);
		try {
			writeFile.createNewFile();
			FileWriter writer = new FileWriter(writeFile);
			writer.write(this.getCommentPopularity() + "\n");
			writer.write(this.getRestroomRating()  + "\n");
			writer.write(this.getComment());
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		String printIt =  userName + " rated this restroom " + restroomRating + "/5\n\n";
		printIt += comment + "\n";		
		return printIt;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRestroomRating() {
		return restroomRating;
	}

	public void setRestroomRating(int restroomRating) {
		this.restroomRating = restroomRating;
	}

	public int getCommentPopularity() {
		return commentPopularity;
	}

	public void setCommentPopularity(int commentPopularity) {
		this.commentPopularity = commentPopularity;
	}
}
