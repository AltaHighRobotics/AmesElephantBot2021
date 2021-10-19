// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainSub extends SubsystemBase      
 {
  /** Creates a new DriveTrainSub. */
  private Victor leftDrive1;
  private Victor leftDrive2;
  private Talon rightDrive1;
  private Talon rightDrive2;
  
  public DriveTrainSub()                               
  {
    leftDrive1  = new Victor(Constants.LEFT_DRIVE_4);
    leftDrive2  = new Victor(Constants.LEFT_DRIVE_5);
    rightDrive1 = new Talon (Constants.RIGHT_DRIVE_0);
    rightDrive2 = new Talon (Constants.RIGHT_DRIVE_1);

  }

  public void setRightMotors(double speed)            
   {
    rightDrive1.set(speed * Constants.DRIVE_SPEED);
    rightDrive2.set(speed * Constants.DRIVE_SPEED);
   }

  public void setLeftMotors(double speed)              
  {
    leftDrive1.set(speed * Constants.DRIVE_SPEED);
    leftDrive2.set(speed * Constants.DRIVE_SPEED);
  }

  public void motorGoForward()
  {
    leftDrive1.set(-Constants.AUTONOMOUS_SPEED);
    leftDrive2.set(-Constants.AUTONOMOUS_SPEED);
    rightDrive1.set(Constants.AUTONOMOUS_SPEED);
    rightDrive2.set(Constants.AUTONOMOUS_SPEED);
  }

  public void motorStop()
  {
    leftDrive1.set(Constants.AUTONOMOUS_STOP);
    leftDrive2.set(Constants.AUTONOMOUS_STOP);
    rightDrive1.set(Constants.AUTONOMOUS_STOP);
    rightDrive2.set(Constants.AUTONOMOUS_STOP);
  }

  @Override
  public void periodic()                            
  {
    // This method will be called once per scheduler run
  }
}
