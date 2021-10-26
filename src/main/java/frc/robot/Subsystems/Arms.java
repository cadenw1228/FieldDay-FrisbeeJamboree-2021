package frc.robot.Subsystems;
<<<<<<< HEAD
=======

>>>>>>> 93f4f730f02102f34dcb827cd180bc54596eab85
import frc.robot.Framework.Subsystem;
import frc.robot.Framework.IO.In.In;
import frc.robot.Framework.IO.Out.Out;

public class Arms implements Subsystem{
    private In input = new In(SubsystemID.ARMS);
    private Out output = new Out(SubsystemID.ARMS);

    public void robotInit(){
        System.out.println("Arms init");
    }

    public void robotPeriodic(){

    }

    public void autonomousInit(){

    }
    public void autonomousPeriodic(){
        
    }

    public void teleopInit(){

    }

    public void teleopPeriodic(){
        
    }
}