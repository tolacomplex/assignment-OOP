
public class Parking extends setParking {

    @Override
    double Car_counting(int time, double price) {
        double result = 0;
        if (time == 1) {
            result = price;
        } else if (time == 2) {
            result = price + 500;
        } else if (time == 3) {
            result = price + (500 * 2);
        } else if (time == 4) {
            result = price + (500 * 3);
        } else if (time == 5) {
            result = price + (500 * 4);
        } else if (time == 6) {
            result = price + (500 * 5);
        } else if (time == 7) {
            result = price + (500 * 6);
        } else if (time == 8) {
            result = price + (500 * 7);
        } else if (time == 9) {
            result = price + (500 * 8);
        } else if (time == 10) {
            result = price + (500 * 9);
        } else if (time == 11) {
            result = price + (500 * 10);
        } else if (time == 12) {
            result = price + (500 * 11);
        } else if (time > 12 && time <= 24) {
            result = price + (1000 * 12);
        }
        return result;
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
