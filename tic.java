import java.util.*;
class A
{

public static void main(String []args)
{
	Scanner hi = new Scanner(System.in);
System.out.print("Welcome to play Tic Tac Toe\n	Rules : \n1.Two player game\n2.First player gets to choose X or O\n3.Enter number (1-9 No repetitions allowed) to place X or O\n4.Any WRONG input given -> EXIT.\n\nStart the Game by entering your names\n	");

	System.out.print("Player1 : Enter Name\n");
		String w = hi.nextLine();
	System.out.println("	Player2 : Enter Name");
		String y = hi.nextLine();
	System.out.println("	Player 1 : Choose X or O");
		char v = hi.next().charAt(0);
	char u='0';

	if(v=='x'||v=='X')
	{
		u = 'O';	
	}
	else if(v=='o'||v=='O')
	{
		u = 'X';	
	}
	else
	{
		System.out.print("You have entered wrong coin");
		System.exit(0);
	}

	String t ="";

	char p1 ='1'; 
	char p2 ='2';
	char p3 ='3';
	char p4 ='4';
	char p5 ='5';
	char p6 ='6';
	char p7 ='7';
	char p8 ='8';
	char p9 ='9';

while(t.length()<9)
{

System.out.print(w+" Enter Number : ");
	String c = hi.next();
	if(c.charAt(0)=='o'||c.charAt(0)=='O'||c.charAt(0)=='x'||c.charAt(0)=='X')
	{
		System.out.print("You cannot enter X or O instead of numbers");
		System.exit(0);
	}
	if(c.length()>1)
	{
		System.out.print("Sorry you have exceded the limit of entering a number");
		System.exit(0);
	}
	if(c.charAt(0)=='0')
	{
		System.out.print("\ncan't find 0th place");
		System.exit(0);
	}

	for(int i=0;i<=c.length()-1;i++)
	{
		for(int j =0;j<=t.length()-1;j++)
		{
			if(c.charAt(i)==t.charAt(j))
			{
				System.out.println("Invalid Input entered");
				System.exit(0);
			}
		}		

		if(p1==c.charAt(i))
		{
			p1=v;
		}
		else if(p2==c.charAt(i))
		{
			p2=v;
		}
		else if(p3==c.charAt(i))
		{
			p3=v;
		}
		else if(p4==c.charAt(i))
		{
			p4=v;
		}
		else if(p5==c.charAt(i))
		{
			p5=v;
		}
		else if(p6==c.charAt(i))
		{
			p6=v;
		}
		else if(p7==c.charAt(i))
		{
			p7=v;
		}
		else if(p8==c.charAt(i))
		{
			p8=v;
		}
		else if(p9==c.charAt(i))
		{
			p9=v;
		}
		else
		{
			System.out.print("\nCannot find Symbol you have entered");
			System.exit(0);
		}
	}

		System.out.print(" "+p1+" ");
		System.out.print("| "+p2+" |");
		System.out.print(" "+p3+" ");
		System.out.print("\n");
		System.out.print("--- --- ---");
		System.out.print("\n");

		System.out.print(" "+p4+" ");
		System.out.print("| "+p5+" |");
		System.out.print(" "+p6+" ");
		System.out.print("\n");
		System.out.print("--- --- ---");
		System.out.print("\n");

		System.out.print(" "+p7+" ");
		System.out.print("| "+p8+" |");
		System.out.print(" "+p9+" ");
		System.out.print("\n");

	if((p1==p2&&p1==p3)||(p1==p4&&p1==p7)||(p1==p5&&p1==p9)||(p2==p5&&p2==p8)||(p3==p5&&p3==p7)||(p3==p6&&p3==p9)||(p4==p5&&p4==p6)||(p7==p8&&p7==p9))
	{
		System.out.print(w+" is winner");
		System.exit(0);
	}

	t = t+c;

	if(t.length()==9)
	{
	  if((p1==p2&&p1==p3)||(p1==p4&&p1==p7)||(p1==p5&&p1==p9)||(p2==p5&&p2==p8)||(p3==p5&&p3==p7)||(p3==p6&&p3==p9)||(p4==p5&&p4==p6)||(p7==p8&&p7==p9))
		{
			System.out.print(w+" is winner");
			System.exit(0);
		}
		else
		{
			System.out.print("No one won the game\n	Alas it's a tie");
			System.exit(0);
		}
	}

	System.out.print(y+" Enter Number : ");
	String g = hi.next();

	if(g.charAt(0)=='o'||g.charAt(0)=='O'||g.charAt(0)=='x'||g.charAt(0)=='X')
	{
		System.out.print("You cannot enter X or O instead of numbers");
		System.exit(0);
	}
	if(g.length()>1)
	{
		System.out.print("\nSorry you have exceded the limit of entering a number");
		System.exit(0);
	}
	if(g.charAt(0)=='0')
	{
		System.out.print("\ncan't find 0th place");
		System.exit(0);
	}

	for(int i=0;i<=g.length()-1;i++)
	{
		for(int j =0;j<=t.length()-1;j++)
		{
			if(g.charAt(i)==t.charAt(j))
			{
				System.out.println("Invalid Input entered");
				System.exit(0);
			}
		}

		if(p1==g.charAt(i))
		{
			p1=u;
		}
		else if(p2==g.charAt(i))
		{
			p2=u;
		}
		else if(p3==g.charAt(i))
		{
			p3=u;
		}
		else if(p4==g.charAt(i))
		{
			p4=u;
		}
		else if(p5==g.charAt(i))
		{
			p5=u;
		}
		else if(p6==g.charAt(i))
		{
			p6=u;
		}
		else if(p7==g.charAt(i))
		{
			p7=u;
		}
		else if(p8==g.charAt(i))
		{
			p8=u;
		}
		else if(p9==g.charAt(i))
		{
			p9=u;
		}
		else
		{
			System.out.print("\nCannot find Symbol you have entered");
			System.exit(0);
		}
	}

		System.out.print(" "+p1+" ");
		System.out.print("| "+p2+" |");
		System.out.print(" "+p3+" ");
		System.out.print("\n");
		System.out.print("--- --- ---");
		System.out.print("\n");

		System.out.print(" "+p4+" ");
		System.out.print("| "+p5+" |");
		System.out.print(" "+p6+" ");
		System.out.print("\n");
		System.out.print("--- --- ---");
		System.out.print("\n");

		System.out.print(" "+p7+" ");
		System.out.print("| "+p8+" |");
		System.out.print(" "+p9+" ");
		System.out.print("\n");

	if((p1==p2&&p1==p3)||(p1==p4&&p1==p7)||(p1==p5&&p1==p9)||(p2==p5&&p2==p8)||(p3==p5&&p3==p7)||(p3==p6&&p3==p9)||(p4==p5&&p4==p6)||(p7==p8&&p7==p9))
	{
		System.out.println(y+" is winner");
		System.exit(0);
	}
	t = t+g;
}
}
}