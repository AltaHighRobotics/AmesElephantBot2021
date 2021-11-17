// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.autonomous;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSub;

public class AutoIntakeCommand extends CommandBase {
  /** Creates a new AutoIntakeCommand. */
  private IntakeSub m_intakeSub;
  private int timeCounter;

  public AutoIntakeCommand(IntakeSub intakeSub) {
    m_intakeSub = intakeSub;
    addRequirements(m_intakeSub);
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
    m_intakeSub.startIntakeMotor();
    timeCounter++;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intakeSub.stopIntakeMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (timeCounter >= 100) {
      return true;
    }

    return false;
  }
}
