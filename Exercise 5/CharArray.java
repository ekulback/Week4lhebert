import java.io.*;

/* 
 * Character Array
 * author @Elliott Kulback
 */

public class CharArray {
	public static void main(String[] args){

	    char[][] receptor = null;   
	    char[] lineArray = null;  

	    FileReader fr = null;
	    BufferedReader br = null;
	    String line = " ";

	    try{
	    fr = new FileReader("test.txt");
	    br = new BufferedReader(fr);

	        line = br.readLine();
	        int i = (int) (line.toCharArray()[0]-48); 
	        int j = (int)(line.toCharArray()[1]-48); 

	        receptor = new char[i][j];  

	        for(i=0; i<receptor.length;i++){
	                line = br.readLine(); 
	                lineArray = line.toCharArray(); 
	            for(j=0; j<receptor[0].length; j++){ 
	                receptor[i][j]=lineArray[j];  
	            }
	        }

	    }catch(IOException e){
	        System.out.println("I/O error");
	    }finally{
	        try {
	            if(fr !=null){
	            br.close();
	            fr.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    } 
	}

}
