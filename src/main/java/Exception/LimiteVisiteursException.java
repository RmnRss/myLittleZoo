package Exception;

public class LimiteVisiteursException extends Exception
{
	  public LimiteVisiteursException() { super(); }
	  public LimiteVisiteursException(String message) { super(message); }
	  public LimiteVisiteursException(String message, Throwable cause) { super(message, cause); }
	  public LimiteVisiteursException(Throwable cause) { super(cause); }
}
