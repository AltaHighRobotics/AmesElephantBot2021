// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.*;
import frc.robot.commands.*;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  private final XboxController driveController = new XboxController(Constants.DRIVER_CONTROLLER);
  
  //Subsytems
  private final ShooterSub m_shooterSub = new ShooterSub();
  private final FeederSub m_feedSub = new FeederSub();
  private final IntakeSub m_intakeSub = new IntakeSub();
  private final DriveTrainSub m_driveTrainSub = new DriveTrainSub();
  private final BottleGrabberSub m_grabSub = new BottleGrabberSub();

  //Commands
  private final FeedCommand m_feedCommand = new FeedCommand(m_feedSub);
  private final ShootCommand m_shootCommand = new ShootCommand(m_shooterSub);
  private final DriveCommand m_driveCommand = new DriveCommand(m_driveTrainSub, driveController);
  private final AutonomousCommand m_autonomousCommand = new AutonomousCommand(m_driveTrainSub);
  private final IntakeCommand m_intakeCommand = new IntakeCommand(m_intakeSub);
  private final BottleGrabberCommand m_grabCommand = new BottleGrabberCommand(m_grabSub);

  private final ForwardCommand m_forwardCommand = new ForwardCommand(m_driveTrainSub);

  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    CommandScheduler.getInstance().setDefaultCommand(m_driveTrainSub, m_driveCommand);

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //driving controller
    final JoystickButton shootButton = new JoystickButton(driveController, Constants.XBOX_A_BUTTON);
    final JoystickButton intakeButton = new JoystickButton(driveController, Constants.XBOX_Y_BUTTON);
    final JoystickButton feedButton = new JoystickButton(driveController, Constants.XBOX_B_BUTTON);
    final JoystickButton grabButton = new JoystickButton(driveController, Constants.XBOX_X_BUTTON);

    shootButton.toggleWhenPressed(m_shootCommand);
    intakeButton.toggleWhenPressed(m_intakeCommand);
    feedButton.toggleWhenPressed(m_feedCommand);
    grabButton.whenPressed(m_grabCommand);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {

    // An ExampleCommand will run in autonomous
    return m_autonomousCommand;
  }
}