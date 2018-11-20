public class UnsignedException extends Exception {
    @Override
    public String getMessage()
    {
        return "number cant be negative";
    }
}
