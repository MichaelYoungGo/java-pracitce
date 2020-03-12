import java.util.Locale;
import java.util.ResourceBundle;
import java.text.MessageFormat;
import java.util.Date;

public class HelloArg {
	public static void main(String[] args){
		Locale currentLocale = null;
		if (args.length == 2){
			currentLocale = new Locale(args[0], args[1]);
		}else{
			currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		var bundle = ResourceBundle.getBundle("myMess", currentLocale);
		var msg = bundle.getString("msg");
		System.out.println(MessageFormat.format(msg, "yeeku", new Date()));
	}
}
