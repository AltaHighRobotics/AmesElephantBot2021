// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrawBridgeSub;

public class DrawBridgeUpCommand extends CommandBase {
  private final DrawBridgeSub m_upDrawBridgeSub;
  /** Creates a new DrawBridgeCommand. */
  public DrawBridgeUpCommand(DrawBridgeSub drawBridgeSub) {
    m_upDrawBridgeSub = drawBridgeSub;
    addRequirements(m_upDrawBridgeSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_upDrawBridgeSub.upDrawBridgeMotor();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_upDrawBridgeSub.stopDrawBridgeMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
