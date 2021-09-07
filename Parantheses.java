class Parantheses {
List list=new ArrayList<>();
public List generateParenthesis(int n) {
StringBuilder s= new StringBuilder();
pass(n,0,s);
return list;
}
public List pass(int n,int j,StringBuilder s) {
if(n==0 && j==0 )
{
list.add(s.toString());
}
if(n!=0)
{
s.append('(');
pass(n-1,j+1,s);
s.deleteCharAt( s.length() - 1 );
}
if(j!=0)
{
s.append(')');
pass(n,j-1,s);
s.deleteCharAt( s.length() - 1 );

     }
     return list;
 }
}