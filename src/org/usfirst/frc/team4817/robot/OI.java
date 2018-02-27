/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4817.robot;

import org.usfirst.frc.team4817.robot.commands.IntakeCommand;
import org.usfirst.frc.team4817.robot.commands.SliderCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	// joysticks
	Joystick stick1 = new Joystick(0);
	Joystick stick2 = new Joystick(1);
	// arm buttons
	//Button armUp = new JoystickButton(stick1, 4);
	//Button armDown = new JoystickButton(stick2, 3);
	// intake buttons
	Button intakeIn = new JoystickButton(stick1, 1);
	Button intakeOut = new JoystickButton(stick2, 1);
	// climber buttons
	Button sliderIn = new JoystickButton(stick1, 4);
	Button sliderOut = new JoystickButton(stick2, 4);

	// read joystick
	public double getLeftStick() {
		if (Math.abs(stick1.getY()) < 0.05)
			return 0;
		return -(stick1.getY());
	}

	public double getRightStick() {
		if (Math.abs(stick2.getY()) < 0.05)
			return 0;
		return -(stick2.getY());
	}
	
	public OI() {
		//intake in
		intakeIn.whenPressed(new IntakeCommand(2));
		intakeIn.whenReleased(new IntakeCommand(0));
		//intake out
		intakeOut.whenPressed(new IntakeCommand(1));
		intakeOut.whenReleased(new IntakeCommand(0));
		//control slider
		sliderIn.whenPressed(new SliderCommand(2));
		sliderOut.whenPressed(new SliderCommand(1));
		//stop slider
		sliderIn.whenReleased(new SliderCommand(0));
		sliderOut.whenReleased(new SliderCommand(0));
	}
	
	
}
