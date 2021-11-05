// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrainSub extends SubsystemBase      
 {
  /** Creates a new DriveTrainSub. */
  private VictorSPX leftDrive1;
  private VictorSPX leftDrive2;
  private VictorSPX rightDrive1;
  private VictorSPX rightDrive2;
  
  public DriveTrainSub()                               
  {
    leftDrive1  = new VictorSPX(Constants.LEFT_DRIVE_4);
    leftDrive2  = new VictorSPX(Constants.LEFT_DRIVE_5);
    rightDrive1 = new VictorSPX (Constants.RIGHT_DRIVE_0);
    rightDrive2 = new VictorSPX (Constants.RIGHT_DRIVE_1);
  }

  public void setMotorForward(double speed){
    rightDrive1.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
    rightDrive2.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);

    leftDrive1.set(ControlMode.PercentOutput, - speed*Constants.DRIVE_SPEED);
    leftDrive2.set(ControlMode.PercentOutput, - speed*Constants.DRIVE_SPEED);
  }

  public void setMotorDirec(double speed){ //Pos X axis = left
    rightDrive1.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
    rightDrive2.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);

    leftDrive1.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
    leftDrive2.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
  }

  //  public void setRightMotors(double speed){
  //    rightDrive1.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
  //    rightDrive2.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
  //  }

  //  public void setLeftMotors(double speed){
  //    leftDrive1.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
  //    leftDrive2.set(ControlMode.PercentOutput, speed*Constants.DRIVE_SPEED);
  //  }

  //  public void arcadeDrive( double driveSpeed, double turn)
  //  {
  //    differentialDrive.arcadeDrive(-driveSpeed, turn);
  //    // System.out.println(leftSideDrive);
  // }

  // public void testMotors(double speed)
  // {
  //   leftSideDrive.set(speed);
  //   rightSideDrive.set(speed);
  //   System.out.println(speed);
  // }

  public void motorGoForward()
  {
    leftDrive1.set(ControlMode.PercentOutput, -Constants.AUTONOMOUS_SPEED);
    leftDrive2.set(ControlMode.PercentOutput, -Constants.AUTONOMOUS_SPEED);
    rightDrive1.set(ControlMode.PercentOutput, Constants.AUTONOMOUS_SPEED);
    rightDrive2.set(ControlMode.PercentOutput, Constants.AUTONOMOUS_SPEED);
  }

  public void motorStop()
  {
    leftDrive1.set(ControlMode.PercentOutput, Constants.AUTONOMOUS_STOP);
    leftDrive2.set(ControlMode.PercentOutput, Constants.AUTONOMOUS_STOP);
    rightDrive1.set(ControlMode.PercentOutput, Constants.AUTONOMOUS_STOP);
    rightDrive2.set(ControlMode.PercentOutput, Constants.AUTONOMOUS_STOP);
  }

  @Override
  public void periodic()                            
  {
    // This method will be called once per scheduler run
  }
}