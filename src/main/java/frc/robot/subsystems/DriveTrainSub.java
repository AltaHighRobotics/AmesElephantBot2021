// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems                           ;

import edu.wpi.first.wpilibj.Talon                     ;
import edu.wpi.first.wpilibj.Victor                    ;
import edu.wpi.first.wpilibj2.command.SubsystemBase    ;
import frc.robot.Constants                             ;

public class DriveTrainSub extends SubsystemBase       {
  /** Creates a new DriveTrainSub. */
  private Victor leftDrive4                            ;
  private Victor leftDrive5                            ;
  private Talon rightDrive0                            ;
  private Talon rightDrive1                            ;
  
  public DriveTrainSub()                               {
    leftDrive4  = new Victor(Constants.LEFT_DRIVE_4)   ;
    leftDrive5  = new Victor(Constants.LEFT_DRIVE_5)   ;
    rightDrive0 = new Talon (Constants.RIGHT_DRIVE_0)  ;
    rightDrive1 = new Talon (Constants.RIGHT_DRIVE_1)  ;

                                                       }

  public void setRightMotors(double speed)             {
    rightDrive1.set(speed * Constants.DRIVE_SPEED)     ;
    rightDrive0.set(speed * Constants.DRIVE_SPEED)     ;
                                                       }

  public void setLeftMotors(double speed)              {
    leftDrive4.set(speed * Constants.DRIVE_SPEED)      ;
    leftDrive5.set(speed * Constants.DRIVE_SPEED)      ;
                                                       }

  @Override
  public void periodic()                               {
    // This method will be called once per scheduler run
                                                       }
                                                       }
