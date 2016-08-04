package sandboxcore;

import de.hybris.platform.storelocator.impl.DefaultGPS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Evgeny_Pavelyev on 8/4/2016.
 */
public class GeoIpService
{
	public static final String FREE_GEO_IP_URL = "http://freegeoip.net/json/";
	@Autowired RestTemplate sandBoxRestTemplate;


	public String getLocationByIp(String ip)
	{
		DefaultGPS resp =  sandBoxRestTemplate.getForObject(FREE_GEO_IP_URL + ip, DefaultGPS.class);
		return null;
	}

}
