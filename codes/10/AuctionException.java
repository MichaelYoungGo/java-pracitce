import java.lang.Exception;

public class AuctionException extends Exception
{
	public AuctionException(){}
	public AuctionException(String msg){
		super(msg);
	}
}
