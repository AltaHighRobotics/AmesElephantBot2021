// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSub;
import frc.robot.Constants;

public class TurnLeftCommand extends CommandBase {
  /** Creates a new TurnLeftCommand. */
  private DriveTrainSub m_driveTrainSub;
  private int time_count;

  public TurnLeftCommand(DriveTrainSub driveTrainSub) {
    m_driveTrainSub = driveTrainSub;
    addRequirements(m_driveTrainSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    time_count = 0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_driveTrainSub.setRightMotors(Constants.AUTON_TURN_SPEED, 1.0);
    m_driveTrainSub.setLeftMotors(Constants.AUTON_TURN_SPEED, -1.0);
    time_count++;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_driveTrainSub.motorStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (time_count >= 50) {
      return true;
    }

    return false;
  }
}
