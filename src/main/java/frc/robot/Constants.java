// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {     
        public static final int DRIVER_CONTROLLER = 0;

        //Motor Assignment
        public static final int LEFT_DRIVE_4 = 10;
        public static final int LEFT_DRIVE_5 = 2;
        public static final int RIGHT_DRIVE_0 = 3;
        public static final int RIGHT_DRIVE_1 = 5;

        public static final int INTAKE_MOTOR = 1;
        public static final int FEED_MOTOR = 4;
        public static final int SHOOTER_MOTOR = 6;
        public static final int GRAB_SERVO = 0;
        
        //Speed Values
        public static final double TELEOP_SPEED = 1.0;
        public static final double DRIVE_SPEED = 1.0;
        public static final double AUTONOMOUS_SPEED = 1.0;
        public static final double AUTONOMOUS_STOP = 0.0;

        public static final double STOP_INTAKE = 0.0;
        public static final double START_INTAKE = 0.5;
        public static final double START_SHOOTER = -1.0;
        public static final double STOP_SHOOTER = 0.0;
        public static final double STOP_FEED = 0.0;
        public static final double START_FEED = -0.1;

        public static final double CLAW_OPEN = 0.0;
        public static final double CLAW_CLOSE = 1.0;

        //Xbox buttons
        public static final int RIGHT_STICK_Y = 5;
        public static final int RIGHT_STICK_X = 4;
        public static final int LEFT_STICK_Y = 2;
        public static final int LEFT_STICK_X = 1;
 
        public static final int XBOX_A_BUTTON = 1; 
        public static final int XBOX_B_BUTTON = 2;
        public static final int XBOX_X_BUTTON = 3;
        public static final int XBOX_Y_BUTTON = 4;
 
        public static final int XBOX_LEFT_BUMPER = 5; 
        public static final int XBOX_RIGHT_BUMPER = 6;
 
        public static final int XBOX_LEFT_STICK_BUTTON = 9;
        public static final int XBOX_RIGHT_STICK_BUTTON = 10;
        public static final int RIGHT_Y_AXIS = 0;
        public static final int LEFT_Y_AXIS = 0;


        public static final boolean TELEOP_DRIVE = true;

}