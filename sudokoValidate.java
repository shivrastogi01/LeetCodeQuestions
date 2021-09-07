class sudokoValidate {
public boolean isValidSudoku(char[][] board) {
for(int i=0;i<9;i++)
{
for(int j=0;j<9;j++)
{
if(board[i][j]=='.') continue;
else
{
for(int k=j+1;k<9;k++)
{
if(board[i][j]==board[i][k]) return false;
}
for(int k=i+1;k<9;k++)
{
if(board[i][j]==board[k][j]) return false;
}
int inew= ((int)i/3)*3;
int jnew = ((int)j/3)*3;
for(int i1=inew;i1<=(((int)i/3)*3)+2;i1++)
{
for(int j1=jnew;j1<=(((int)j/3)*3)+2;j1++)
{
if(j1==j && i1==i) continue;
else
{
if(board[i][j]==board[i1][j1]) return false;
}
}
}
}
}
}
return true;
}
}