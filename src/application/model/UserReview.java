package application.model;
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
	
	public UserReview( String commont, String user, int rating, int popularity) {
		this.setComment(commont);
		this.setUserName(user);
		this.setRestroomRating(rating);
		this.setCommentPopularity(popularity);
	}
	
	public String toString() {
		
		String printIt =  userName + " rated this potty a: " + restroomRating + "\n\n";
		printIt += "What were " + userName + ",s thoughts on this potty?\n" + comment + "\n";
		printIt += "How accurate was this comment? Comment Score: " + commentPopularity;
		
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
