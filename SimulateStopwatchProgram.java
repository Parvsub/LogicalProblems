package com.LogicalProblems;

public class SimulateStopwatchProgram
{
       long startTimer = 0 ;

       long stopTimer = 0 ;
       long elapsed;

       public  void StartTimer(){
           startTimer = System.currentTimeMillis();
           System.out.println("start time: "+ startTimer);
       }
    public  void StopTimer(){
        startTimer = System.currentTimeMillis();
        System.out.println("stop time: "+ stopTimer);
    }

    public  long elapsedTime(){
           elapsed = stopTimer - startTimer ;
           return elapsed ;
    }

    public static void main(String[] args) {

        SimulateStopwatchProgram scan=new SimulateStopwatchProgram();
        System.out.println("Press '1' to Start Time: ");
        scan.StartTimer();

        System.out.println();
        System.out.println("Press '2' to Stop Time: ");
        scan.StopTimer();

        long l=scan.elapsedTime();
        System.out.println();
        System.out.println("Total Time Elapsed(in millisec) is:"+l);
        System.out.println();
        System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
    }
}




