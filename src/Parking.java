public class Parking extends setParking {

    @Override
    double Car_counting(int time , double price) {
        if (time == 1){
            price = 5000;
        } else if(time == 2){
            price = 5000 + 500;
        } else if (time == 3) {
            price = 5000 + (500 * 2);
        } else if (time == 4) {
            price = 5000 + (500 * 3);
        } else if (time == 5) {
            price = 5000 + (500 * 4);
        } else if (time == 6) {
            price = 5000 + (500 * 5);
        } else if (time == 7) {
            price = 5000 + (500 * 6);
        }  else if (time == 8) {
            price = 5000 + (500 * 7);
        }  else if (time == 9) {
            price = 5000 + (500 * 8);
        }   else if (time == 10) {
            price = 5000 + (500 * 9);
        }  else if (time == 11) {
            price = 5000 + (500 * 10);
        }  else if (time == 12) {
            price = 5000 + (500 * 11);
        } else if (time > 12 && time <= 24) {
            price = 5000  + (1000 * 12);
        }
        return price;
    }

    @Override
    double Bike_counting(double price) {
        return price;
    }

    @Override
    double Car_parking(double Car_counting, double price_dollars) {
        return Car_counting / price_dollars;
    }

    @Override
    double Bike_parking(double Bike_counting, double price_dollars) {
        return Bike_counting / price_dollars;
    }
}
