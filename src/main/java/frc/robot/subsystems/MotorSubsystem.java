package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.MotorConstants;
import frc.robot.commands.RunMotor;

public class MotorSubsystem extends SubsystemBase {

    public static double speed;
    private final WPI_TalonSRX m_motor = new WPI_TalonSRX(MotorConstants.testMotorPort);
    
    public MotorSubsystem() {
        setDefaultCommand(new RunMotor());
    }

    public void move() {
        speed = 0.8;
        m_motor.set(speed);
    }

    public void stop() {
        speed = 0.0;
        m_motor.set(speed);
       
    }
    public static double getSpeed(){
        return speed;
    }
}
