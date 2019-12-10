// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.


import java.util.Scanner;


public class Lab09avst
{
	private static int firstNum, firstDen;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Rational r = new Rational(firstNum,firstDen);
		r.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the numerator ----> ");
		firstNum = input.nextInt();
		System.out.print("\nEnter the denominator --> ");
		firstDen = input.nextInt();
	}
}
class Rational
{
	//added!
	private int reducedNum, reducedDen, gcf, firstNum, firstDen;

	public Rational(int firstNum, int firstDen){
		this.firstNum = firstNum;
		this.firstDen= firstDen;
	}

	public void displayData(){
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println(" and reduces to " + getReduced());
		System.out.println();
	}
//added!
	public int getNum(){
		return firstNum;
	}
	public int getDen(){
		return firstDen;
	}
	public double getDecimal(){
		double decimal = (double) firstNum / firstDen;
		return decimal;
	}
	public String getOriginal(){
		String original = "" + firstNum + "/" + firstDen;
		return original;
	}

	public void reduce(){
		getGCF(firstNum, firstDen);
		reducedNum = firstNum / gcf;
		reducedDen = firstDen / gcf;
	}
	public String getReduced(){
		reduce();
		String reducedFraction = "" + reducedNum + "/" + reducedDen;
		return reducedFraction;
	}
	private void getGCF(int n1,int n2)
	{
		int rem = 0;
		do
		{
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else
			{
				n1 = n2;
				n2 = rem;
			}
		}
		while (rem != 0);
	}
}
