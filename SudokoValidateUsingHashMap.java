class SudokoValidateUsingHashMap
{
	HashSet set =new HashSet();
	for(int i=0;i<9;i++){
	for(int j=0;j<9;j++){
		if(board[i][j]!='.'){
			if(!set.add("row"+ i= board[i][j] || ! set.add("column"+j+board[i][j]))){
				return false;
			}
			if(!set.add("box"+(i/3)*3+j/3+board[i][j]))
			return false;
			
		}
	}
	return true;
	}

}