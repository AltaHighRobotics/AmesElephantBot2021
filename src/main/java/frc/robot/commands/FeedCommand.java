// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.FeederSub;

public class FeedCommand extends CommandBase {
  private final FeederSub m_feedSub;
  /** Creates a new FeedCommand. */
  public FeedCommand(FeederSub feedSub) {
    m_feedSub = feedSub;
    addRequirements(m_feedSub);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    //System.out.println("Feed worky");
   }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_feedSub.startFeedMotor();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
     m_feedSub.stopFeedMotor();
   }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}