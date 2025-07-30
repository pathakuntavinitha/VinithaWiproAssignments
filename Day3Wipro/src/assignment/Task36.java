package assignment;
/*
 * 36.Create a class called Tank that can be filled and emptied, and has a
termination condition that it must be releaseTank when the object is cleaned up. Write a
finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
that can occur when your Tank is used.

 */
public class Task36 {
	private boolean isReleased = false;
    public void fillTank() 
    {
        System.out.println("Tank is filled.");
    }
    public void emptyTank() {
        System.out.println("Tank is emptied.");
    }
    public void releaseTank() {
        isReleased = true;
        System.out.println("Tank is released properly.");
    }
    @Override
    protected void finalize() throws Throwable 
    {
        try 
        {
            if (!isReleased)
            {
                System.out.println("Warning: Tank was not released before garbage collection!");
            } else
            {
                System.out.println("Tank finalized properly after release.");
            }
        }
        finally {
            super.finalize();
        }
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task36 t1 = new Task36();
        t1.fillTank();
        t1.emptyTank();
        t1.releaseTank();
        t1 = null;
        Task36 t2 = new Task36();
        t2.fillTank();
        t2.emptyTank();
        t2 = null; 
        System.gc();
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}

}
