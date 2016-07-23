package co.grandcircus.david.pics.model;

public class Pic {

	private Integer id;
	private String url;
	private String description;
	private Integer userId;
	private String userDisplay;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserDisplay() {
		return userDisplay;
	}
	public void setUserDisplay(String userDisplay) {
		this.userDisplay = userDisplay;
	}
	
	
}
