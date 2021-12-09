// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSub;

public class ForwardCommand1 extends CommandBase {
  /** Creates a new ForwardCommand1. */
  private DriveTrainSub m_driveTrainSub;
  private int timeCounter;

  public ForwardCommand1(DriveTrainSub driveTrain) {
    m_driveTrainSub = driveTrain;
    addRequirements(m_driveTrainSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timeCounter = 0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrainSub.motorGoForward();
    timeCounter++;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_driveTrainSub.motorStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (timeCounter >= 110) { //value to 135 when???
      return true;
    }

    return false;
  }
}
