import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest
{
	public static void main(String[] args)
	{
		try(
			//创建字节输入流
			var fis = new FileInputStream("FileOutputStreamTest.java");
			//创建字节输出流
			var fos = new FileOutputStream("newFile.txt"))
		{
			var bbuf = new byte[32];
			var hasRead = 0;
			while((hasRead = fis.read(bbuf))>0)
			{
				fos.write(bbuf, 0, hasRead);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
