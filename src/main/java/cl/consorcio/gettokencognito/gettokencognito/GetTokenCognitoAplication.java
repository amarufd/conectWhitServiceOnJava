package cl.consorcio.gettokencognito.gettokencognito;

/**
 * Hello world!
 *
 */
public class GetTokenCognitoAplication 
{
    public static void main( String[] args )
    {
        System.out.println( "Conectandose al servicio login con JAVA" );
        
        EstructuraRequestCognito request = new EstructuraRequestCognito();
        request.setUsername("");
        request.setPassword("");
        request.setUserPoolId("");
        
        LoginCognito login = new LoginCognito();
        
        EstructuraResponseCognito response = login.getTokenCognito(5000,request);
        
        System.out.println(response.toString());
    }
}
