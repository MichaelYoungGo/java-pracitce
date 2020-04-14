public class AuctionTest {
	private double initPrice  = 30.0;
	public void bid(String bidPrice) throws AuctionException{
		var d = 0.0;
		try 
		{
			d = Double.parseDouble(bidPrice);
		}
		catch (Exception e)
		{
			e.printStackTrace();
			throw new AuctionException("竞拍价格必须是浮点型");
		}
	}
	public static void main(String[] args){
		var at = new AuctionTest();
		try 
		{
			at.bid("df");
		}
		catch (AuctionException ae) 
		{
			System.err.println(ae.getMessage());
		}
	}
}
