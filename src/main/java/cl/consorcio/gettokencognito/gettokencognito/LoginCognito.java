package cl.consorcio.gettokencognito.gettokencognito;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;



public class LoginCognito {

	public EstructuraResponseCognito getTokenCognito(int timeout, EstructuraRequestCognito request) {
		System.out.println("Start [getFactorEjecutivoHogar]");

		EstructuraResponseCognito response = new EstructuraResponseCognito();

		try {
			URL url = new URL(Constantes.URL);
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("x-api-key",Constantes.APIKEY);
			
			System.out.println("Url conneccion getFactorEjecutivoHogar: "+url);

			String str = new Gson().toJson(request);

			byte[] outputInBytes = str.getBytes("UTF-8");
			OutputStream os = conn.getOutputStream();
			os.write(outputInBytes);
			os.close();

			if (timeout > 0) {
				conn.setConnectTimeout(timeout);
			}

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			StringBuilder sal = new StringBuilder();
			while ((output = br.readLine()) != null) {
				sal.append(output);
			}
			
			
//			Type type = new EstructuraResponseCognito(){}.getType();
			response = new Gson().fromJson(sal.toString(), EstructuraResponseCognito.class);

			conn.disconnect();

		} catch (RuntimeException | IOException ex) {
			System.out.println(ex);
			//return response();
		}
		return response;
	}
}
