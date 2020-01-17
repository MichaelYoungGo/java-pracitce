public class RandomStr {
	public static void main(String[] args){
		var result = "";
		for (var i = 0; i < 6; i++) {
			var intVal = (int) (Math.random()*26+97);
			result = result + (char) intVal;
		}
		System.out.println(result);
	}
}
