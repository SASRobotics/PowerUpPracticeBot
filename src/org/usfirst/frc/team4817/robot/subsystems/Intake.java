package org.usfirst.frc.team4817.robot.subsystems;

import org.usfirst.frc.team4817.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
/**
*
*/
public class Intake extends Subsystem {
	
	Talon intakeL;
	VictorSP intakeR;
	
	public Intake(){
		super ("Intake"); 
		intakeL= new Talon(RobotMap.intakeMotorLeft);
		intakeR = new VictorSP(RobotMap.intakeMotorRight);
	}
	
	public void intakeForward() {
//		shooter.set(Relay.Value.kOn);					
		intakeL.set(1);
		intakeR.set(1);
	}
	
	public void intakeBackward() {
//		shooter.set(Relay.Value.kOn);
		intakeL.set(-1);
		intakeR.set(-1);
	}
	
	public void intakeOff() {
		intakeL.set(0);
		intakeR.set(0);
	}
		
   // Put methods for controlling this subsystem
   // here. Call these from Commands.

   public void initDefaultCommand() {
       // Set the default command for a subsystem here.
       //setDefaultCommand(new MySpecialCommand());
   }
}

