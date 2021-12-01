
/**
 * Bouncy Ball
 *
 * @author Oliver Richardson
 * @version 29/9/2021
 */
public class Ball
{
    //Fields
    private double Height;
    private double CurrentVelocity;
    private double FinalVelocity;
    private double AccelerationDueToGravity;
    private double FrameLength;
    private int TimeToSimulate;
    private double ElasticityPercent;
    private double print;
    private String printTime;
    private double Time;

    //Constructors
    public Ball()
    {
        Height = 1000.0;
        FinalVelocity = 0.0;
        CurrentVelocity = 0.0;
        AccelerationDueToGravity = -9.81;
        FrameLength = 0.1;
        ElasticityPercent = 0.6;
        TimeToSimulate = 55;
    }
    
    //Methods
    // --Functions--
    private void simulate(){
        CurrentVelocity = FinalVelocity;
        
        if(Height > 0.1){
            updatePosition();
        }
        
        if(Height <= 0.1){
            Height = 0.0;
    
            if(CurrentVelocity > 1 || CurrentVelocity < -1 ){
                bounce();
                updatePosition();
            }

            if(CurrentVelocity < 1 && CurrentVelocity > -1 ){
                Height = 0.0;
                CurrentVelocity = 0.0;
            }
        }
    }

    private void bounce(){
        CurrentVelocity = -1.0 * ElasticityPercent * CurrentVelocity;
    }

    private void updatePosition(){
        Height = Height + ((CurrentVelocity * FrameLength) + (0.5 * AccelerationDueToGravity * FrameLength * FrameLength));
        FinalVelocity = CurrentVelocity + (AccelerationDueToGravity * FrameLength);
    }
    
    // --Main Function--
    public void dropBall(){
        print = getHeight();
        System.out.println(print);
        for(int i = 1; i < (TimeToSimulate*10 + 1); i++){
            simulate();
            print = getHeight();
            Time = i * FrameLength;
            Time = Maths.truncateNumber(Time, 1);
            printTime = String.valueOf(Time)+": ";
            System.out.print(printTime);
            System.out.println(print);
        }
    }
    
    // --Getters--
    private double getHeight(){
        return Height;
    }
    
    // --Setters--
    public void setHeight(double NewHeight){
        Height = NewHeight;
    }

    public void setElasticityPercent(double NewElasticityPercent){
        ElasticityPercent = NewElasticityPercent;
    }

    public void setTimeToSimulate(int NewTimeToSimulate){
        TimeToSimulate = NewTimeToSimulate;
    }

}
