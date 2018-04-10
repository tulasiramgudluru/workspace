public class Die{
    static int dieCount = 0;
                                                    //to get the count of objects
    public Die(){
        dieCount++;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die();
	    Die die2 = new Die();
	    Die die3 = new Die();
	    Die die4 = new Die();
	    int count = Die.dieCount;
	    System.out.println(count);

	}

}
