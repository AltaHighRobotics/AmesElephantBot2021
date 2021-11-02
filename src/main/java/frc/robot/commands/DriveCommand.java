/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrainSub;

public class DriveCommand extends CommandBase {
  //getters
  private final DriveTrainSub m_driveTrain;
  private final XboxController drivController;
  private double rightStickY;
  private double rightStickX;

  public DriveCommand(DriveTrainSub driveSub, XboxController Xbox) {
    //setters
    m_driveTrain = driveSub;
    drivController = Xbox;
    //subsystem dependencies
    addRequirements(m_driveTrain);

  }


  public double GetDriverRawAxisX(final int axis) {
    return drivController.getRawAxis(axis);
  }

  public double GetDriverRawAxisY(final int axis) {
    return drivController.getRawAxis(axis);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("Drive Train Worky");
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (Constants.TELEOP_DRIVE == true)
    {
      //rightStickY = Constants.TELEOP_SPEED * GetDriverRawAxisY(Constants.RIGHT_STICK_Y);
      //rightStickX = Constants.TELEOP_SPEED * GetDriverRawAxisX(Constants.RIGHT_STICK_X);
      m_driveTrain.arcadeDrive(rightStickY, rightStickX);
    }
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
    m_driveTrain.testMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}