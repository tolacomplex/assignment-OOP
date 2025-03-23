public class vehicle_parking_implement implements vehicle_parking{
    @Override
    public void parking(String type, int number) {
        System.out.println("Model of vehicle is: "+ type);
        System.out.println("Number of vehicle is: "+ number);
    }
}
