package house;

import java.util.Arrays;

public class Kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String appliances[]= {"Fridge","Microwave","Gas stove","Mixer","Oven"};
		System.out.println("Kitchen appliances are:");
		for (String app:appliances)
		{
			System.out.println(app);
		}
		String[] copiedappliances=Arrays.copyOf(appliances,appliances.length);
		System.out.println("Copied Kitchen appliances are:");
		for (String app:copiedappliances)
		{
			System.out.println(app);
		}
	}

}
