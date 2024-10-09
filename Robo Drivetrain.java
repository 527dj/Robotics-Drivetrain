package frc.robot;
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  TalonSRX _talon0 = new TalonSRX(0);
  TalonSRX _talon1 = new TalonSRX(1);
  TalonSRX _talon2 = new TalonSRX(2);
  TalonSRX _talon3 = new TalonSRX(3);
  Joystick _joystick = new Joystick(0);

  @Override
  public void teleopInit() {
    _talon0.setInverted(false); // pick CW versus CCW when motor controller is positive/green
  }
  talon.setNeutralMode(NeutralMode.Brake);

  @Override
  public void teleopPeriodic() {
    double stick = _joystick.getRawAxis(1) * -1; // make forward stick positive
    System.out.println("stick:" + stick);
    _talon0.set(ControlMode.PercentOutput, stick);
    _talon1.set(ControlMode.PercentOutput, stick);
    _talon2.set(ControlMode.PercentOutput, stick);
    _talon3.set(ControlMode.PercentOutput, stick);
  }
}