// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrainSub;

public class DriveCommand extends CommandBase {
  /** Creates a new DriveCommand. */
  private DriveTrainSub m_driveTrainSub;
  private XboxController m_driveController;
  private double leftStickY;
  private double rightStickY;
  
  public DriveCommand(DriveTrainSub subsystem, XboxController driveController) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_driveTrainSub = subsystem;
    m_driveController = driveController;
    addRequirements(m_driveTrainSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    rightStickY = m_driveController.getRawAxis(Constants.RIGHT_STICK_Y);
    leftStickY = m_driveController.getRawAxis(Constants.RIGHT_STICK_X);
    m_driveTrainSub.setRightMotors(-rightStickY);
    m_driveTrainSub.setLeftMotors(-leftStickY);


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
