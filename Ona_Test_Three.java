import java.io.*;
import java.util.*;
/*
 
 * @author: Kennedy Alex Omondi Owiro

  * @Email: jambotechsolutions@gmail.com

*/ 
public class myCode
{
    public static BufferedReader br;
    
  public static void main (String[] args) throws java.lang.Exception
  {
    try{    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input;
    int count = 0;
    int dataSize = 0;
    int transferSpeed = -1;
    int processingSpeed1 = -1;
    int compressionRate1 = -1;
    int processingSpeed2 = 0;
    int compressionRate2 = 0;
    
    while((input= br.readLine())!= null) {
        System.out.println(input);
        switch(count){
            case 0://file size 
                dataSize = Integer.parseInt(input);
            break;
            case 1:
                transferSpeed = Integer.parseInt(input);
            break;
            case 2:
                transferSpeed = Integer.parseInt(input);
            break;
            case 3:
            StringTokenizer st = new StringTokenizer(input, " ");
            processingSpeed1 = Integer.parseInt(st.nextToken());
            compressionRate1 = Integer.parseInt(st.nextToken());
            break;
            case 4:
            StringTokenizer st2 = new StringTokenizer(input, " ");
            processingSpeed2 = Integer.parseInt(st2.nextToken());
            compressionRate2 = Integer.parseInt(st2.nextToken());
            break;
        }
    }
    int sendTime = ((dataSize / compressionRate1 )/transferSpeed) + (dataSize / processingSpeed1);
    if (count==4)
    {
        int sendTime2 = ((dataSize / compressionRate2 )/transferSpeed) + (dataSize / processingSpeed2);
        if (sendTime2 < sendTime)
        {
            sendTime = sendTime2;
        }
    }
    System.out.println( " Minimum send time " + sendTime + " Seconds");
  }      
       catch (IOException ioe) 
       {
       ioe.printStackTrace();
       } 
       finally 
       {
       try {
          if (br != null)
         br.close();
         
       } 
       catch (IOException ioe) 
           {
        System.out.println("Error in closing the BufferedReader");
       }
    }
   }
}