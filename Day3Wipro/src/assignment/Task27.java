package assignment;
/*
 * 27.Create an enum of the six types of paper currency.
 *  Loop through the values( ) and print each value. Write a switch statement for the enum.  For each
   case, output a description of that particular currency.

 */
enum currency {ten,twenty,fifty,hundred,two_hundred,five_hundred}
public class Task27 {

	public static void main(String[] args) {
		System.out.println("Currencies are:");
		for(currency c:currency.values())
		{
			System.out.println(c);
		}
		System.out.println("Description of Particular Curreny:");
		for(currency c:currency.values())
		{
			switch(c)
			{
			case ten:
				System.out.println("₹10:Smallest paper currency note in use. Usually brown or orange. Often used for small purchases like snacks, bus tickets");
				break;
			case twenty:
				System.out.println("₹20:Slightly larger than ₹10.Yellow-green or reddish-orange. Common for small expenses like tea, small groceries");
				break;
			case fifty:
				System.out.println("₹50:SBright purple in color.Used frequently for daily purchases, auto fare");
				break;
			case hundred:
				System.out.println("₹100:Light blue/lavender.One of the most commonly circulated notes. Handy for shopping, food, travel.");
				break;
			case two_hundred:
				System.out.println("₹200:Bright yellow.Introduced in recent years for convenience between ₹100 and ₹500. Often used in shops, transport, ");
				break;
			case five_hundred:
				System.out.println("₹500:Gray-green color.A higher denomination used for bigger purchases—clothes, bills, groceries.");
				break;
			default:
                System.out.println("Unknown currency");
			}
			
		}
		// TODO Auto-generated method stub

	}

}
