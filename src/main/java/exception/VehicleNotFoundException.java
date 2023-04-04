package exception;

/**
 * @author Happy Bhalla
 */
public class VehicleNotFoundException extends RuntimeException {
    public VehicleNotFoundException(String format) {
        super(format);
    }
}
