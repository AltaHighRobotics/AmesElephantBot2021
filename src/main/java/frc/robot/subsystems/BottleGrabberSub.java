// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Servo;
import frc.robot.Constants;


public class BottleGrabberSub extends SubsystemBase {
  /** Creates a new BottleGrabberSub. */
  private Servo grabServo;

  public BottleGrabberSub() {
    grabServo = new Servo(Constants.GRAB_SERVO);
  }

  public void openClaw() {
    grabServo.set(Constants.CLAW_OPEN);
  }

  public void closeClaw() {
    grabServo.set(Constants.CLAW_CLOSE);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}