// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BottleGrabberSub;

public class BottleGrabberCommand extends CommandBase {
  /** Creates a new BottleGrabberCommand. */
  BottleGrabberSub m_grabSub;

  public BottleGrabberCommand(BottleGrabberSub grabSub) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_grabSub = grabSub;
    addRequirements(m_grabSub);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_grabSub.openClaw();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_grabSub.closeClaw();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}