import java.io.PushbackReader;
import java.io.FileReader;
import java.io.IOException;

public class PushbackTest
{
	public static void main(String[] args)
	{
		try(var pr = new PushbackReader(new FileReader("PushbackTest.java"), 64))
		{
			var buf = new char[32];
			var lastContent = "";
			var hasRead = 0;
			while ((hasRead = pr.read(buf)) > 0 )
			{
				var content = new String(buf, 0, hasRead);
				var targetIndex = 0;
				System.out.print("查看索引值：");
				System.out.print((lastContent + content).indexOf("new PushbackReader"));
				if ((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0)
				{
					pr.unread((lastContent + content).toCharArray());
					if (targetIndex > 32)
					{
						buf = new char[targetIndex];
					}
					pr.read(buf, 0, targetIndex);
					System.out.print("AAAAAAAAAAAAAAAAAAAAAa");
					System.out.print(new String(buf, 0, targetIndex));
					System.exit(0);
				
				}
				else
				{
					System.out.print("---------------");
					System.out.print(lastContent);
					lastContent = content;
				}
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
