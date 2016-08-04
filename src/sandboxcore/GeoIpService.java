package sandboxcore;

import de.hybris.platform.storelocator.GPS;
import de.hybris.platform.storelocator.impl.DefaultGPS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import sandboxcore.data.GeoLocationData;


/**
 * Created by Evgeny_Pavelyev on 8/4/2016.
 */
public class GeoIpService
{
	public static final String FREE_GEO_IP_URL = "http://freegeoip.net/json/";
	@Autowired RestTemplate sandBoxRestTemplate;


	public GPS getLocationByIp(String ip)
	{
		GeoLocationData geoLocationData = sandBoxRestTemplate.getForObject(FREE_GEO_IP_URL + ip, GeoLocationData.class);
		GPS gpsIp = new DefaultGPS(geoLocationData.getLatitude(), geoLocationData.getLongitude());
		return gpsIp;
	}

}
