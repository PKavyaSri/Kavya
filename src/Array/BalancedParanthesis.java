package Array;

import java.util.*;

public class BalancedParanthesis 
{
	public static void balancedPar(String par)
	{
		char c;
		Stack<Character> st= new Stack<Character>();
		for(int i=0;i<par.length();i++)
		{
			if((par.charAt(i)=='(')||(par.charAt(i)=='{')||(par.charAt(i)=='['))
			{
				st.push(par.charAt(i));
			}
			else if(st.isEmpty())
			{
				System.out.println("false");
				return;
			}
			else if(((par.charAt(i)==')')||(par.charAt(i)=='}')||(par.charAt(i)==']')))
				{
				   c= st.peek();
				 if((par.charAt(i)==')')&& c=='('||
		     		(par.charAt(i)==']')&& c=='['||
					(par.charAt(i)=='}')&& c=='{')
					{
						st.pop();
					}
				}
		}
		if(!st.isEmpty())
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	}
	public static void main(String[] args) {
		String par = "(}";
		balancedPar(par);
    }
}
