package cl.consorcio.gettokencognito.gettokencognito;

public class EstructuraResponseCognito {

	    private String AccessToken;
	    private Integer ExpiresIn;
	    private String TokenType;
	    private String RefreshToken;
	    private String IdToken;
	    
		public String getAccessToken() {
			return AccessToken;
		}
		public void setAccessToken(String accessToken) {
			AccessToken = accessToken;
		}
		public Integer getExpiresIn() {
			return ExpiresIn;
		}
		public void setExpiresIn(Integer expiresIn) {
			ExpiresIn = expiresIn;
		}
		public String getTokenType() {
			return TokenType;
		}
		public void setTokenType(String tokenType) {
			TokenType = tokenType;
		}
		public String getRefreshToken() {
			return RefreshToken;
		}
		public void setRefreshToken(String refreshToken) {
			RefreshToken = refreshToken;
		}
		public String getIdToken() {
			return IdToken;
		}
		public void setIdToken(String idToken) {
			IdToken = idToken;
		}
		@Override
		public String toString() {
			return "EstructuraResponseCognito [AccessToken=" + AccessToken + ", ExpiresIn=" + ExpiresIn + ", TokenType="
					+ TokenType + ", RefreshToken=" + RefreshToken + ", IdToken=" + IdToken + "]";
		}
		
}
