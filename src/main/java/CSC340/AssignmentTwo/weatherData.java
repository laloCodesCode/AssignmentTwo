package CSC340.AssignmentTwo;





public class weatherData {

    /**
     * Data Declarion block
     */
    private String cityName;
    private String dayOfTheWeek;
    private double temprature;
    private double highTemp;
    private double lowTemp;
    private double realFeel;
    private int windSpeed;


    /**
     *
     * Argumented constructor that initalizes data.
     */
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


    /**
     *
     * Get method block
     */
    public String getCityName() {
        return cityName;
    }
    public String getdayOfTheWeek(){
        return dayOfTheWeek;
    }
    public double getTemprature(){
        return temprature;
    }
    public double getHighTemp(){
        return highTemp;
    }
    public double getLowTemp(){
        return lowTemp;
    }
    public double getRealFeel(){
        return realFeel;
    }
    public int getWindSpeed(){
        return windSpeed;
    }
}
