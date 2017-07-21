
//creating 'Car' class

public class Car {

    private String make;
    private String model;
    private int year;
    private double price;

    //creating non argument constructor (which has blank values)
    public Car() {
        make = "";
        model = "";
        year = 0;
        price = 0.0;
    }

    //creating argument constructor which stores all argument values in instance variables

    public Car (String manufacturer, String type, int yr, double cost){
        make = manufacturer;
        model = type;
        year = yr;
        price = cost;
    }

    //making the getters

    public String getMake (){
        return make;
    }

    public String getModel (){
        return model;
    }

    public int getYear (){
        return year;
    }

    public double getPrice (){
        return price;
    }

    //making the setters

    public void setMake (String manufacturer){
        make = manufacturer;
    }

    public void setModel (String type){
        model = type;
    }

    public void setYear (int yr){
        year = yr;
    }

    public void setPrice (double cost){
        price = cost;
    }

        }