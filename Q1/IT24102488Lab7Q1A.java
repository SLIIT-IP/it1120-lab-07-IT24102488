import java.util.Scanner;
public class IT24102488Lab7Q1A{
    public static void main(String[] args) {int i;
        String grade;
        int total=0;
    int mark[]=new int [4];
    Scanner input=new Scanner(System.in);

    for(i=0;i<mark.length;i++){
        System.out.print("Enter subject mark : ");
        mark[i]=input.nextInt();

    }
        for(i=0;i<mark.length;i++){
        total=total+mark[i];


}
        int avg=total/4;
        if(avg>74){
            grade = "destinction";}
        else if ((75>avg)&&(avg>49)){
             grade = "credit";
        }
        else{
                     grade = "fail";
                }
        System.out.println("avarage is : "+avg);
        System.out.print("Grade is : "+grade);
            }
        }


