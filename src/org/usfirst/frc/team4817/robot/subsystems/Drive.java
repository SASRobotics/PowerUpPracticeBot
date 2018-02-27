package org.usfirst.frc.team4817.robot.subsystems;

import org.usfirst.frc.team4817.robot.RobotMap;
import org.usfirst.frc.team4817.robot.commands.JoystickDrive;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drive extends Subsystem {

	DifferentialDrive drive;
	
	//left side mc's
	WPI_TalonSRX left = new WPI_TalonSRX(RobotMap.driveLeftMotor);
	
	//right side mc's
	WPI_TalonSRX right = new WPI_TalonSRX(RobotMap.driveRightMotor);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Drive() {
		super("Drive");
		
		//drive
		drive = new DifferentialDrive(left, right);
		drive.setSafetyEnabled(false);
    
	}
	
	public void tankDrive(double left, double right){
		drive.tankDrive((left),(right));
	}
	
	public void driveStraight(double speed){
		drive.tankDrive(speed,speed);
		
	}

    public void initDefaultCommand() {
    	//joystick pair
    	setDefaultCommand(new JoystickDrive());
    }


}

