import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchesTest {
	public static void main(String[] args){
		String[] mails = {
			"kongyueku@163.com",
			"kongyejy@gmail.com",
			"liang@crazyit.org",
			"wawa@abc.xx"
		};
		var mailRegEX = "\\w{3,20}@\\w+\\.(com|org|cn|gov)";
		var mailPattern = Pattern.compile(mailRegEX);
	        Matcher	matcher = null;
		for (var mail : mails){
			if (matcher == null){
				matcher = mailPattern.matcher(mail);
			} else {
				matcher.reset(mail);
			}
		
		String result = mail + (matcher.matches() ? "是" :"不是") + "一个有效的邮件地址！！";
		System.out.println(result);
		}
	}
}
