package backtracking;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board= {{'A','B','C', 'E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		for(int i=0; i<board.length; i++)
			for(int j=0; j<board[0].length; j++)
			{
				if(board[i][j] == word.charAt(0))
				{
					boolean ans= searchWord(board, word, i, j, 0);
					if(ans==true)
					{
						System.out.println(ans);
						return;
					}
				}
			}
		System.out.println("FALSE");
	}
	private static boolean searchWord(char[][] board, String word, int cc, int cr, int idx)
	{
		if(idx== word.length())
			return true;
		if(cr<0 || cc<0 || cr>=board.length || cc >=board[0].length || board[cr][cc]!=word.charAt(idx))
			return false;
		board[cr][cc]= '*';
		int r[]= {-1,1,0,0};
		int c[]= {0,0,-1,1};
		for(int i =0; i<c.length; i++)
		{
			boolean ans = searchWord(board, word, cc+c[i], cr+r[i], idx+1);
			if(ans==true)
				return true;
		}
		board[cr][cc]= word.charAt(idx);
		return false;
	}

}
