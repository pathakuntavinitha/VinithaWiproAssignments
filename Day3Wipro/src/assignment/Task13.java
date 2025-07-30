package assignment;
class Worker 
{
    protected String name;
    protected double salaryRate;
    public Worker(String name,double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    public double pay(int hours) {
        return 0.0;
    }
    public void displayPay(int hours) {
        System.out.println("Name:"+name+"Weekly Pay:₹"+pay(hours));
    }
}
class DailyWorker extends Worker {
    public DailyWorker(String name,double salaryRate) {
        super(name,salaryRate);
    }
    @Override
    public double pay(int hours) {
        return hours*salaryRate;
    }
}
class SalariedWorker extends Worker 
{
    public SalariedWorker(String name,double salaryRate) {
        super(name,salaryRate);
    }

    @Override
    public double pay(int hours) {
        return 40*salaryRate; 
    }
}
public class Task13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	DailyWorker d1=new DailyWorker("Vinitha", 500);
	        SalariedWorker s1=new SalariedWorker("Ravi", 400); 
	        System.out.println("Daily Worker Pay");
	        d1.displayPay(6);
	        System.out.println("Salaried Worker Pay");
	        s1.displayPay(30);
	}
}
