import java.util.Random;


    class Dice{

	int number;
	int spot;

	
	Dice(int i){
	    number=i;
	}


	int shake(){
	    Random r=new Random();
	    spot=r.nextInt(6);
	    spot=spot+1;
	    return spot;
	}

    }

class DiceGame{


    public static void main (String[] args){


	System.out.println("Rolling the dice...");

	Dice d1=new Dice(1);
	System.out.println("Die 1:"+d1.shake());

	
    }
}
