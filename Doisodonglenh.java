package Buoi1;
public class Doisodonglenh {
	public static void main(String [] args){
		double d, sum=0, max = Double.MIN_VALUE ;
		for (int i = 0; i < args.length; i++){
			try{
				d = Double.parseDouble(args[i]);
			} catch (NumberFormatException e){
				d = 0;
			}
			sum += d;
			max = max < d ? d : max;
		}
		System.out.println("Max:" + max + " " + sum);
	}
}
