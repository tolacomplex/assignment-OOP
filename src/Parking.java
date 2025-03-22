public class Parking extends setParking {
    @Override
    double count(int time) {
        double price = 0;
        if (time == 1){
            price = 2000;
        } else if(time == 2){
            price = 2000 + 500;
        } else if (time == 3) {
            price = 2000 + (500 * 2);
        } else if (time == 4) {
            price = 2000 + (500 * 3);
        } else if (time == 5) {
            price = 2000 + (500 * 4);
        } else if (time == 6) {
            price = 2000 + (500 * 5);
        } else if (time == 7) {
            price = 2000 + (500 * 6);
        }  else if (time == 8) {
            price = 2000 + (500 * 7);
        }  else if (time == 9) {
            price = 2000 + (500 * 8);
        }   else if (time == 10) {
            price = 2000 + (500 * 9);
        }  else if (time == 11) {
            price = 2000 + (500 * 10);
        }  else if (time == 12) {
            price = 2000 + (500 * 11);
        } else if (time > 12) {
            price = 2000  + (500 * 12);
        }
        return price;
    }
}
