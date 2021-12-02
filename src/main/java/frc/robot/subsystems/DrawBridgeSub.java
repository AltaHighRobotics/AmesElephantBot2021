// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.Constants;

public class DrawBridgeSub extends SubsystemBase {
  private VictorSPX drawBridgeMotor;
  /** Creates a new DrawBridgeSub. */
  public DrawBridgeSub() {
    drawBridgeMotor = new VictorSPX(Constants.DRAWBRIDGE_MOTOR);
    drawBridgeMotor.configFactoryDefault();
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void stopDrawBridgeMotor() {
    drawBridgeMotor.set(ControlMode.PercentOutput, Constants.STOP_BRIDGE);
  }

  public void upDrawBridgeMotor() {
    drawBridgeMotor.set(ControlMode.PercentOutput, Constants.UP_BRIDGE);
  }

  public void downDrawBridgeMotor() {
    drawBridgeMotor.set(ControlMode.PercentOutput, Constants.DOWN_BRIDGE);
  }
}
