package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.MotorSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class RunMotor extends CommandBase {

    public final MotorSubsystem m_motorSubsystem;
    
    public RunMotor() { // dependency injection
        m_motorSubsystem = RobotContainer.m_motorSubsystem;
        addRequirements(m_motorSubsystem);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        m_motorSubsystem.move();
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        m_motorSubsystem.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}