// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.FeederSub;
import frc.robot.subsystems.ShooterSub;

public class FeedShootCommand extends CommandBase {
  /** Creates a new intakeShoot. */
  private FeederSub m_feederSub;
  private ShooterSub m_shooterSub;
  private int timeCounter;
  
  public FeedShootCommand(FeederSub feederSub, ShooterSub shooterSub) {
    m_feederSub = feederSub;
    m_shooterSub = shooterSub;
    
    addRequirements(m_feederSub, m_shooterSub);
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
    m_shooterSub.startShooterMotor();

    if (timeCounter >= 100) {
      m_feederSub.startFeedMotor();
    }

    timeCounter++;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_shooterSub.startShooterMotor();
    m_feederSub.stopFeedMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (timeCounter >= 600) {
      return true;
    }

    return false;
  }
}
