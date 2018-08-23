import java.util.Scanner;

public class Main{
   
 public static void main(String args[])
 
{
      
  Scanner sc=new Scanner(System.in);
  
      int row=sc.nextInt();
  
      int col=sc.nextInt();
  
      int a[][]=new int[row][];
 
       for(int i=0;i<row;i++)
       
         {
    
           for(int j=0;j<col;j++)
            
             {
               
                 a[i][j]=sc.nextInt();
      
             }

        }
      
  for(int i=0;i<row;i++)
 
       {
     
       for(int j=0;j<col;j++)
   
         {
       
         if(a[i][j]==0)
  
              {
  
                  int A=i;
 
                   int B=j;

                }
  
          }
  
      }
  
      for(int i=0;i<row;i++)
 
       {
  
          for(int j=0;j<col;j++)
 
           {
  
           if(a[i]==A || a[j]==B)

             {
 
                a[i][j]=0;

                 System.out.print(a[i][j]+" ");

             }
   
          else{
   
              
                System.out.print(a[i][j]+" ");
 
            }
  
          }
             System.out.println();
  
               }

        


    }

}