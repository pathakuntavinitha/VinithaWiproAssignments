package assignment;
import java.util.Scanner;
/*
 * 24.Five Bikers Compete in a race such that they drive at a constant speed which may or may
not be the same as the other. To qualify the race, the speed of a racer must be more than the
average speed of all 5 racers. Take as input the speed of each racer and print back the speed
of qualifying racers. 
 */
public class Task24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int bikers=5;
		double arr[]=new double[bikers];
		int i=0;
		double sum=0;
		while(i<bikers)
		{
			System.out.println("Enter speed of biker"+(i+1));
			double b1=sc.nextDouble();
			arr[i]=b1;
			sum+=b1;
			i++;
		}
		double avg=sum/bikers;
		System.out.println("Average speed:"+avg);
		System.out.println("Qualifying racers are");
		for(Double speed:arr)
		{
			if(speed>avg)
			{
				System.out.println(speed);
			}
		}
			
	}

}
