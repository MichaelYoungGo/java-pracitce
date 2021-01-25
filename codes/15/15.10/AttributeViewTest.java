import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;
import java.nio.file.attribute.FileOwnerAttributeView;

public class AttributeViewTest
{
	public static void main(String[] args) throws Exception
	{
		//获取将要操作的文件
		Path testPath = Paths.get("AttributeViewTest.java");
		//获取访问基本属性和BasicFileAttributeView
		BasicFileAttributeView basicView = Files.getFileAttributeView(testPath, BasicFileAttributeView.class);
		//获取访问基本属性的BasicFileAttributes
		BasicFileAttributes basicAttribs = basicView.readAttributes();
		//访问文件的基本属性
		System.out.println("创建时间：" + new Date(basicAttribs.creationTime().toMillis()));
		System.out.println("最后访问时间：" + new Date(basicAttribs.lastAccessTime().toMillis ()));
		System.out.println("最后修改时间：" + new Date(basicAttribs.lastModifiedTime().toMillis()));
		System.out.println("文件大小：" + basicAttribs.size());
		//获取访问文件属主信息的FileOwnerAttributeView
		FileOwnerAttributeView ownerView = Files.getFileAttributeView(testPath, FileOwnerAttributeView.class);
		//获取该文件所属我的用户
	}
}
