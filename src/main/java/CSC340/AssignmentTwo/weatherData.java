package CSC340.AssignmentTwo;

public class weatherData {
    private String cityName;
    private String dayOfTheWeek;
    private double temprature;
    private double highTemp;
    private double lowTemp;
    private double realFeel;
    private int windSpeed;


    public weatherData(String cityName,String dayOfTheWeek, double temprature, double highTemp, double lowTemp,
    int windSpeed, int realFeel){
        this.cityName = cityName;
        this.dayOfTheWeek = dayOfTheWeek;
        this.temprature = temprature;
        this.highTemp = highTemp;
        this.lowTemp = lowTemp;
        this.windSpeed = windSpeed;
        this.realFeel = realFeel;



    }
}
