import java.util.ListResourceBundle;

public class myMess_zh_CN extends ListResourceBundle {
	private final Object myData[][] = {
		{"msg", "{0}, 您好！今天的日期是{1}"}
	};
	public Object[][] getContents(){
		return myData;
	}
}
