package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer Likes;

	private List<Comment> comments = new ArrayList<>();
	
	public Post () {
		
	}

	public Post(Date moment, String title, String content, Integer likes) {
		private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		this.moment = moment;
		this.title = title;
		this.content = content;
		Likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return Likes;
	}

	public void setLikes(Integer likes) {
		Likes = likes;
	}

	public List<Comment> getComments(){
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add (comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(getLikes());
		sb.append(" Likes - ");
		sb.append((moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment c : comments) {
			sb.append(c.getText());
		}
	
		return sb.toString();
	}
	


}
	
