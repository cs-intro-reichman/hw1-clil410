
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double ratePrecent = rate / 100; 
		double futureValue= currentValue * (Math.pow((1+ ratePrecent),n));
		int futureValueInt = (int) futureValue;
		System.out.println("after " + n + " years, a " + currentValue + "$ saved at " + rate +
						 "% will yield " + futureValueInt + "$");
	}
}

