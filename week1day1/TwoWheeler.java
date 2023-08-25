package homeassingments.weekday1;

public class TwoWheeler {
    int noOfWheels = 2;
    short noOfMirrors = 2;
    long chassisNumber = 1234567890L;
    boolean isPunctured = false;
    String bikeName = "MyBike";
    double runningKM = 1500.5;

    public static void main(String[] args) {
        TwoWheeler myBike = new TwoWheeler();

        System.out.println("Number of Wheels: " + myBike.noOfWheels);
        System.out.println("Number of Mirrors: " + myBike.noOfMirrors);
        System.out.println("Chassis Number: " + myBike.chassisNumber);
        System.out.println("Is Punctured: " + myBike.isPunctured);
        System.out.println("Bike Name: " + myBike.bikeName);
        System.out.println("Running KM: " + myBike.runningKM);
    }
}

