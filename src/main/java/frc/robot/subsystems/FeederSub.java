// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;

public class FeederSub extends SubsystemBase 
{
  private TalonSRX feedMotor;
  /** Creates a new ShooterSub. */
  public FeederSub()
   {
    feedMotor = new TalonSRX(Constants.FEED_MOTOR);
   }

  @Override
  public void periodic() 
  {
    // This method will be called once per scheduler run
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