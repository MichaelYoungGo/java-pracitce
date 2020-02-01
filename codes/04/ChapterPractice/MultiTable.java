public class MultiTable {
	private String[][] table;
	private static int SIZE = 9;
	public void initTable(){
                        for(var i = 0; i < SIZE; i++){
                                for(var j = 0; j <= i; j++){
                                        table[i][j] = "*";
                                }
                        }
                }
	public void printTable(){
		for (var i = 0; i < SIZE; i++){
			for (var j = 0; j <= i; j++){
				System.out.print(table[i][j]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) throws Exception{
		var mt = new MultiTable();
		mt.initTable();
		mt.printTable();
	}
}
