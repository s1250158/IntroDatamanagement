import java.util.Random;
import java.io.*;

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

	System.out.println("What is your name?\n> ");


	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
	
	
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	
        System.out.println("Hello, " + str + "!");
 

	
	
	System.out.println("Rolling the dice...");

	Dice d1=new Dice(1);
	System.out.println("Die 1:"+d1.shake());

	
    }
}
