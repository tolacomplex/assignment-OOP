public class vehicle_parking_implement implements vehicle_parking{
    @Override
    public void parking(String type, int number_1, String number_2) {
        System.out.println("Model : "+ type);
        System.out.println("Slot Number : "+ number_1);
        System.out.println("number : "+ number_2);
    }
}
