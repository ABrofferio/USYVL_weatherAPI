
import com.github.dvdme.ForecastIOLib.FIODataPoint;
import com.github.dvdme.ForecastIOLib.FIOHourly;
import com.github.dvdme.ForecastIOLib.ForecastIO;

public class DarkSky_API_report {

	public static void main(String[] args) {
		
		ForecastIO goleta = new ForecastIO("f43ab5024a3233ae0bb0252de6b80dfc");
		goleta.setExcludeURL("currently,minutely,alerts,flags");
		goleta.getForecast("34.4358294", "-119.8276389");
		
		ForecastIO ventura = new ForecastIO("f43ab5024a3233ae0bb0252de6b80dfc");
		ventura.setExcludeURL("currently,minutely,alerts,flags");
		ventura.getForecast("34.274647", "-119.229034");
		
		ForecastIO oxnard = new ForecastIO("f43ab5024a3233ae0bb0252de6b80dfc");
		oxnard.setExcludeURL("currently,minutely,alerts,flags");
		oxnard.getForecast("34.196411", "-119.170898");
		
		ForecastIO ojai = new ForecastIO("f43ab5024a3233ae0bb0252de6b80dfc");
		ojai.setExcludeURL("currently,minutely,alerts,flags");
		ojai.getForecast("34.44805", "-119.242889");
		
		System.out.println("A comparison of weather and wind speed at different USYVL sites in Southern California. \n");
		
		FIOHourly  goleta_hourly = new FIOHourly(goleta);
		System.out.println("Goleta Volleybal Conditions");
		FIODataPoint gten = goleta_hourly.getHour(10);
		FIODataPoint gfive = goleta_hourly.getHour(17);
		System.out.println("Date:" + gten.time().toString().substring(0, 10));
		System.out.println("The morning temp is " + gten.temperature() + "° and wind speed is " + gten.windSpeed() + " mph");
		System.out.println("The evening temp is "+ gfive.temperature() +  "° and wind speed is " + gfive.windSpeed() + " mph \n");
		
		FIOHourly  ventura_hourly = new FIOHourly(ventura);
		System.out.println("Ventura Volleybal Conditions");
		FIODataPoint vten = ventura_hourly.getHour(10);
		FIODataPoint vfive = ventura_hourly.getHour(17);
		System.out.println("Date:" + vten.time().toString().substring(0, 10));
		System.out.println("The morning temp is " + vten.temperature() + "° and wind speed is " + vten.windSpeed() + " mph");
		System.out.println("The evening temp is "+ vfive.temperature() +  "° and wind speed is " + vfive.windSpeed() + " mph \n");
		
		FIOHourly  oxnard_hourly = new FIOHourly(oxnard);
		System.out.println("Oxnard Volleybal Conditions");
		FIODataPoint oxten = oxnard_hourly.getHour(10);
		FIODataPoint oxfive = oxnard_hourly.getHour(17);
		System.out.println("Date:" + oxten.time().toString().substring(0, 10));
		System.out.println("The morning temp is " + oxten.temperature() + "° and wind speed is " + oxten.windSpeed() + " mph");
		System.out.println("The evening temp is "+ oxfive.temperature() +  "° and wind speed is " + oxfive.windSpeed() + " mph \n");
		
		FIOHourly  ojai_hourly = new FIOHourly(ojai);
		System.out.println("Ojai Volleybal Conditions");
		FIODataPoint oten = oxnard_hourly.getHour(10);
		FIODataPoint ofive = oxnard_hourly.getHour(17);
		System.out.println("Date:" + oten.time().toString().substring(0, 10));
		System.out.println("The morning temp is " + oten.temperature() + "° and wind speed is " + oten.windSpeed() + " mph");
		System.out.println("The evening temp is "+ ofive.temperature() +  "° and wind speed is " + ofive.windSpeed() + " mph \n");
	}
}

