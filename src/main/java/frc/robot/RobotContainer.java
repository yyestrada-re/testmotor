package frc.robot;

import frc.robot.subsystems.*;
import frc.robot.commands.*;

import edu.wpi.first.wpilibj2.command.Command;

/**
 * The structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */

public class RobotContainer {

  // robot subsystems
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  public static MotorSubsystem m_motorSubsystem = new MotorSubsystem(); 

  // robot commands
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem); 
  //private final RunMotor runMotorCommand = new RunMotor(motorSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
  }

  private void configureButtonBindings() {}

  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
