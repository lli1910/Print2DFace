package print2Dface;

public class Face {
	public static void main(String[] args)
	{
		String[][] face = new String[5][5];
		
		face[1][1]= "O";
		face[1][3]= "O";
		face[2][2]= "C";
		face[3][1]= ")";
		face[3][2]= "-";
		face[3][3]= "(";
		
		for(String[] i: face) {
			for(String j : i) {
			    if(j == null) { 
					System.out.print(" ");
			    }
			    else
			    	System.out.print(j);
			}
			System.out.println();
		}
	}
}
