package org.usfirst.frc.team6995.robot.subsystems;

import org.usfirst.frc.team6995.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LifterS extends Subsystem {

    private static Spark liftUpDown = null;
    private static Solenoid lifterBrake = null;
    
    public LifterS (){
    	liftUpDown = new Spark(RobotMap.LIFTER_CAN_ID);
    	lifterBrake = new Solenoid(RobotMap.LIFTER_BRAKE_PCM_ID,RobotMap.LIFTER_BRAKE_PORT); 	
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setSpeed(double speed) {
    	liftUpDown.set(speed);
    }
    
    public void setBrake(boolean setBrake) {
    	lifterBrake.set(setBrake);
    }
}

