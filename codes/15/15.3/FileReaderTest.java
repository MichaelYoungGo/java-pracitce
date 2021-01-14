import java.io.IOException;
import java.io.FileReader;

public class FileReaderTest
{
	public static void main(String[] args) throws IOException
	{
	    try (
		//创建字节输入流
		var fr = new FileReader("FileInputStreamTest.java"))
	    {
		var cbuf = new char[32];
		var hasRead = 0;
		while ((hasRead = fr.read(cbuf)) > 0)
		{
			System.out.print(new String(cbuf, 0, hasRead));
		}
	    }
	    catch (IOException ex)
	    {
	    	ex.printStackTrace();
	    }
	}
}
