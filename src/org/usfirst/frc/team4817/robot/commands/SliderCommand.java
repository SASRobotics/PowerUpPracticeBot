package org.usfirst.frc.team4817.robot.commands;

import org.usfirst.frc.team4817.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SliderCommand extends Command {

    int direction;
	public SliderCommand(int x) {
    	requires(Robot.slider);
    	direction = x;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(direction == 1) {
    		Robot.slider.slideOut();
    	} 
    	else if (direction == 2) {
    		Robot.slider.slideIn();
    	} 
    	else {
    		Robot.slider.slideStop();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
