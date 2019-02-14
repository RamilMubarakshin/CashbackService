public class CashbackService {
    public int calculate(int monthCostsRegular, int monthCostsHigh, int monthCostsExtra) {
        if (monthCostsRegular <= 0 && monthCostsHigh <=0 && monthCostsExtra <=0) {
            return 0; // Early Exit
        }

        int percentRegular = 1;
        int percentHigh = 5;
        int percentExtra = 30;
        int resultRegular = monthCostsRegular * percentRegular / 100;
        int resultHigh = monthCostsHigh * percentHigh / 100;
        int resultExtra = monthCostsExtra * percentExtra / 100;
        int result = resultRegular + resultHigh + resultExtra;

        int limit = 3_000;
        if (result > limit) {
            return limit;
        }

        return result;
    }
}
