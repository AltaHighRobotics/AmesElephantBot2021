// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainSub extends SubsystemBase      
 {
  /** Creates a new DriveTrainSub. */
  private Victor leftDrive1;
  private Victor leftDrive2;
  private Victor rightDrive1;
  private Victor rightDrive2;
  private SpeedControllerGroup leftSideDrive;
  private SpeedControllerGroup rightSideDrive;
  private DifferentialDrive differentialDrive;
  
  public DriveTrainSub()                               
  {
    leftDrive1  = new Victor(Constants.LEFT_DRIVE_4);
    leftDrive2  = new Victor(Constants.LEFT_DRIVE_5);
    rightDrive1 = new Victor (Constants.RIGHT_DRIVE_0);
    rightDrive2 = new Victor (Constants.RIGHT_DRIVE_1);
    leftSideDrive = new SpeedControllerGroup(leftDrive1, leftDrive2);
    rightSideDrive = new SpeedControllerGroup(rightDrive1, rightDrive2);
    differentialDrive = new DifferentialDrive(leftSideDrive, rightSideDrive);
  }

  public void arcadeDrive( double driveSpeed, double turn)
  {
    differentialDrive.arcadeDrive(-driveSpeed, turn);
    // System.out.println(leftSideDrive);
  }

  public void testMotors(double speed)
  {
    leftSideDrive.set(speed);
    rightSideDrive.set(speed);
    System.out.println(speed);
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
