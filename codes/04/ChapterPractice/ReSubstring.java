public class ReSubstring {
		public static String bSubstring(String s, int length) throws Exception {
			byte[] bytes = s.getBytes("Unicode");
			int n = 0;
			int i = 2;
			for(;i < bytes.length && n < length; i++){
				if (i % 2 == 1){
					n++;
				}
				else{
					if(bytes[i] != 0){
						n++;
					}
				}
			}

			if (i % 2 == 1){
				if (bytes[i - 1] != 0){
					i -= 1;
				}
				else{
					i += 1; 
				}
			}
			return new String(bytes, 0, i, "Unicode");
		}
		public static void main(String[] args) throws Exception{
		var str = new ReSubstring();
		String s = "a加b等于c,如果a等于1,b等于2,那么c等于3";
		System.out.println(str.bSubstring(s,6));
	}
}
