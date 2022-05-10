
public class challenges
	{

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
				challengeThree();
			}

		public static void challengeOne()
			{
				int number = 0;
				int[][] matrix = new int[3][2];
				for (int row = 0; row < matrix.length; row++)
					{
						for (int col = 0; col < matrix[0].length; col++)
							{
								number += 10;
								matrix[row][col] = number;
							}
					}
				System.out.println(matrix[2][1]);
			}

		public static void challengeTwo()
			{
				String[][] mhsGrid = new String[4][3];
				for (int row = 0; row < mhsGrid.length; row++)
					{
						for (int col = 0; col < mhsGrid[0].length; col++)
							{
								mhsGrid[row][col] = "MHS";
								System.out.print(mhsGrid[row][col] + " ");
							}
						System.out.println();
					}
			}

		public static void challengeThree()
			{
				int number = 1;
				int[][] numArray = new int [3][3];
					for(int row = 0; row < numArray.length; row++)
						{
							for(int col = 0; col < numArray[0].length; col ++)
								{
									numArray [row][col] = number++;
									System.out.print(numArray [row][col] + " ");
								}
							System.out.println();
						}
					System.out.println("The sum of the four values in each corner is " + (numArray[0][0] + numArray[2][2] + numArray[0][2] + numArray[2][0]));
			}
	}
