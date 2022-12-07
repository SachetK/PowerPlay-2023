package org.firstinspires.ftc.teamcode.commands.slides

import com.arcrobotics.ftclib.command.CommandBase
import org.firstinspires.ftc.teamcode.subsystems.SlidesSubsystem
import java.util.function.DoubleSupplier

class HeightCommand(
    private val subsystem: SlidesSubsystem,
    private val increase: DoubleSupplier
): CommandBase() {
    init {
        addRequirements(subsystem)
    }

    override fun execute() {
        subsystem.increaseTargetPosition(increase.asDouble * 5)
        subsystem.operateSlides()
    }
}