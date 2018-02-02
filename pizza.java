import java.io.*;

public class pizza {



	/*String to int array*/
	public static int[] stringArrayToIntArray(String intString) {
    String[] intStringSplit = intString.split(" "); //Split by spaces
    int[] result = new int[intStringSplit.length]; //Used to store our ints

    for (int i = 0; i < intStringSplit.length; i++) {
        //parse and store each value into int[] to be returned
        result[i] = Integer.parseInt(intStringSplit[i]); 
    }
    return result;
	}

	/*  0: rows
		1: columns
		2: min of each T M
		3: cells per slice
	*/


	public static String line;
	public static int[] info = new int[4];
	public static char[][] pizza;

	public static void main(String[] args) {


	    try {



	    	/*Read file data and put them in pizza array*/
	        BufferedReader bufferreader = new BufferedReader(new FileReader("small.in"));
	        line = bufferreader.readLine();
	        info = stringArrayToIntArray(line);
	        pizza = new char[info[0]][info[1]];
	        int numLine = 0;

	        System.out.println("rows : " + info[0] + "  columns : " + info[1]);
	        System.out.println("Max Slice : " + info[3]);
	        System.out.println("Min of each : " + info[2]);
	        
	        while (true) {

				if((line = bufferreader.readLine() ) == null) {
					break;
				}

				for(int i = 0; i < info[1]; i++) {
					pizza[numLine][i] = line.charAt(i);
				}

				numLine++;
	        }




	    } catch (FileNotFoundException ex) {
	        ex.printStackTrace();
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    }






	    /*Visualize data*/
	    for(int i = 0; i < pizza.length; i++) {
	        	for(int j = 0; j < pizza[i].length; j++) {
	        		System.out.print(pizza[i][j]);
	        	}
	        	System.out.println();
	    }

	}

}