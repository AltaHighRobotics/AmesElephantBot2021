// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSub extends SubsystemBase 
{
  private Victor shooterMotor;
  private Victor feedMotor;
  /** Creates a new ShooterSub. */
  public ShooterSub()
   {
    shooterMotor = new Victor(Constants.SHOOTER_MOTOR);
    feedMotor = new Victor(Constants.FEED_MOTOR);
   }

  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
  }

  public void stopShooterMotor()
  {
    shooterMotor.set(Constants.STOP_SHOOTER);
  }

  public void startShooterMotor()
  {
    shooterMotor.set(Constants.START_SHOOTER);
  }

  public void stopFeedMotor()
  {
    feedMotor.set(Constants.STOP_FEED);
  }
  
  public void  startFeedMotor()
  {
    feedMotor.set(Constants.START_FEED);
  }


}
