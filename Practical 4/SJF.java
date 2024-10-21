import java.util.Scanner;

public class SJF{
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args){

        // Declare
        int i,j,n;       
        int BT[],TAT[],WT[];
        float AvgWT=0;
        float AvgTAT=0;

        // Initialize
        BT = new int[10];
        TAT = new int[10];
        WT = new int[10];
        WT[0]=0;

        Scanner st = new Scanner(System.in);

        // Inputs

        System.out.print("Enter the number of processes :");
        n = st.nextInt();
        
        System.out.println("Enter Burst Time for processes:");
        for(i=0;i<n;i++)
        {
			System.out.print("P"+(i+1)+" : ");
			BT[i]=st.nextInt();
		}

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if (BT[i] > BT[j]) {
                    int temp = BT[i];
                    BT[i] = BT[j];
                    BT[j] = temp;
                }
            }
        }
        

        for(i=1;i<n;i++){
            WT[i] = WT[i-1] + BT[i-1];
            AvgWT = AvgWT + WT[i];
        }
        AvgWT = AvgWT / n;
        System.out.println(AvgWT);

        for(i=0;i<n;i++){
            TAT[i] = WT[i] + BT[i];
            AvgTAT = AvgTAT + TAT[i];
        }
        AvgTAT = AvgTAT / n;
        System.out.println(AvgTAT);




        System.out.println("\n****************************************************************");
		System.out.println("\tProcesses:");
		System.out.println("****************************************************************");
		System.out.println("    Process\tBurst Time\tWaiting Time\tTurn Around Time");
		for(i=0;i<n;i++)
		{
			System.out.println("\tP"+(i+1)+"\t  "+BT[i]+"\t\t  "+WT[i]+"\t\t "+TAT[i]);
			
		}
		System.out.println("\n----------------------------------------------------------------");
		System.out.println("\nAverage waiting time : "+AvgWT);
		System.out.println("\nAverage Turn Around time : "+AvgTAT+"\n");
    }
}










