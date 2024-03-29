// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BottleGrabberSub;

public class CloseClawCommand extends CommandBase {
  /** Creates a new CloseClawCommand. */
  private BottleGrabberSub m_bottleGrabberSub;
  private int timeCounter;

  public CloseClawCommand(BottleGrabberSub bottleGrabberSub) {
    m_bottleGrabberSub = bottleGrabberSub;
    addRequirements(m_bottleGrabberSub);
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
    m_bottleGrabberSub.closeClaw();
    timeCounter++;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (timeCounter <= 10) {
      return false;
    }

    return true;
  }
}