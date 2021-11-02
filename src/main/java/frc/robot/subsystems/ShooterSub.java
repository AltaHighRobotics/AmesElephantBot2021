// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSub extends SubsystemBase 
{
  private TalonFX shooterMotor;
  private TalonSRX feedMotor;
  /** Creates a new ShooterSub. */
  public ShooterSub()
   {
    shooterMotor = new TalonFX(Constants.SHOOTER_MOTOR);
    feedMotor = new TalonSRX(Constants.FEED_MOTOR);
   }

  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
  }

  public void stopShooterMotor()
  {
    shooterMotor.set(ControlMode.PercentOutput, Constants.STOP_SHOOTER);
  }

  public void startShooterMotor()
  {
    shooterMotor.set(ControlMode.PercentOutput ,Constants.START_SHOOTER);
  }

  public void stopFeedMotor()
  {
    feedMotor.set(ControlMode.PercentOutput, Constants.STOP_FEED);
  }
  
  public void  startFeedMotor()
  {
    feedMotor.set(ControlMode.PercentOutput, Constants.START_FEED);
  }


}
