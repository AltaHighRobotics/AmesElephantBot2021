// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSub extends SubsystemBase {
  private TalonSRX intakeMotor;
  /** Creates a new IntakeSub. */
  public IntakeSub() {
    intakeMotor = new TalonSRX(Constants.INTAKE_MOTOR);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void stopIntakeMotor() {
    intakeMotor.set(ControlMode.PercentOutput, Constants.STOP_INTAKE);
  }

  public void startIntakeMotor() {
    intakeMotor.set(ControlMode.PercentOutput, Constants.START_INTAKE);
  }
}