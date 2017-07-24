/**
 * Created by Grand Circus Student on 7/21/2017.
 */
public class UsedCar extends Car {

    private double mileage;

    public UsedCar(String manufacturer, String type, int yr, double cost, double miles) {
        super(manufacturer, type, yr, cost);
        mileage = miles;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double miles) {
        mileage = miles;
    }

    @Override
    public String toString (){
        return super.toString() + "\t" + mileage;

    }
}

