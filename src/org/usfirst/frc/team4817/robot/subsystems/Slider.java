package org.usfirst.frc.team4817.robot.subsystems;

import org.usfirst.frc.team4817.robot.RobotMap;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Slider extends Subsystem {

	Spark slider;

	public Slider() {
		super("slider");
		slider = new Spark(RobotMap.sliderMotor);
	}
	
	public void slideOut() {
		slider.set(1);
	}
	
	public void slideIn() {
		slider.set(-1);
	}
	
	public void slideStop() {
		slider.set(0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

