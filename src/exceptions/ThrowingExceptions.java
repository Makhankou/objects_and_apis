package exceptions;

public class ThrowingExceptions {
    public static double calculatePau(double hours, double payRate) throws NegativeInpitException{

        if(hours > 40) {
            throw IllegalArgumentException("Hours must be less than or equal to 40");
        }

        if (hours < 0 || payRate < 0) {
            throw new NegativeInpitException();
        }
        return hours * payRate;
    }
}
