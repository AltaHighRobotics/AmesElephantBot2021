/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import org.graalvm.compiler.core.common.calc.Condition;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrainSub;

public class DriveCommand extends CommandBase {
  //getters
  private final DriveTrainSub m_driveTrainSub;
  private final XboxController m_driveController;
  private double rightStickY;
  private double rightStickX;
  private double leftStickY;
  private double leftStickX;
  private double stickZ;

  //private boolean currentRunVariable;
  private double rightSpeed;
  private double leftSpeed;

  public DriveCommand(DriveTrainSub subsystem, XboxController driveController) {
    //setters
    m_driveTrainSub = subsystem;
    m_driveController = driveController;
    //subsystem dependencies
    addRequirements(m_driveTrainSub);
  }

  // public double GetDriverRawAxisX(final int axis) {
  //   return driveController.getRawAxis(axis);
  // }

  // public double GetDriverRawAxisY(final int axis) {
  //   return driveController.getRawAxis(axis);
  // }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}


  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    /*
    if (currentRunVariable) {
      currentRunVariable = false;
      m_driveTrainSub.setMotorForward(leftStickY);
    } else {
      currentRunVariable = true;
      m_driveTrainSub.setMotorDirec(rightStickX);
    }
    */

    rightStickY = m_driveController.getRawAxis(Constants.RIGHT_STICK_Y);
    rightStickX = m_driveController.getRawAxis(Constants.RIGHT_STICK_X);
    leftStickX = m_driveController.getRawAxis(Constants.LEFT_STICK_X);
    leftStickY = m_driveController.getRawAxis(Constants.LEFT_STICK_Y);
    stickZ = m_driveController.getRawAxis(Constants.STICK_Z);

    rightSpeed = leftStickY - ((leftStickX + stickZ) / Constants.TURN_RAD);
    leftSpeed = leftStickY + ((leftStickX + stickZ) / Constants.TURN_RAD);

    m_driveTrainSub.setRightMotors(rightSpeed, speedMultiplier(rightStickY)); //Second argument should be 1 if not using flight stick
    m_driveTrainSub.setLeftMotors(leftSpeed, speedMultiplier(rightStickY));

      //rightStickY = Constants.TELEOP_SPEED * GetDriverRawAxisY(Constants.RIGHT_STICK_Y);
      //rightStickX = Constants.TELEOP_SPEED * GetDriverRawAxisX(Constants.RIGHT_STICK_X);
  }

 private double speedMultiplier(double stick) {
  return (stick - 1.0) / -2.0 + 0.5;
 }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
   // m_driveTrain.testMotors(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}