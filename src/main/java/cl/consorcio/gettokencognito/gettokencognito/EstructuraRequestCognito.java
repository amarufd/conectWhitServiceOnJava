package cl.consorcio.gettokencognito.gettokencognito;

public class EstructuraRequestCognito {

	private String username;
	private String password;
	private String userPoolId;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserPoolId() {
		return userPoolId;
	}
	public void setUserPoolId(String userPoolId) {
		this.userPoolId = userPoolId;
	}
	
}
