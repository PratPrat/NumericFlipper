import java.util.Scanner;

public class flipper {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int gameFlip[][] = new int[6][6];				
		int columnNum = -1;
		int rowNum = -1;

		for (int i = 0; i < 6; i ++)
		{
			for (int j = 0; j < 6; j ++)
			{
				// System.out.println("input grid below");
				gameFlip[i][j] = input.nextInt();
			}
		}

		for ( int row = 0; row < 6; row ++){

			int numOnes = 0;

			for (int col = 0; col < 6; col++)
			{

				if (gameFlip[row][col] == 1)
					numOnes += 1;

			}// end j loop

			if (numOnes%2 != 0){
				rowNum = row + 1;
			}
		}

      
      for ( int col = 0; col < 6; col ++){

			int numOnes = 0;

			for (int row = 0; row < 6; row++)
			{

				if (gameFlip[row][col] == 1)
					numOnes += 1;

			}// end j loop

			if (numOnes%2 != 0){
				
			columnNum = col + 1;
			}
		}
      
      
      
      System.out.println("The flipped cell is at (" + rowNum + ", " + columnNum + ")");


	}
}