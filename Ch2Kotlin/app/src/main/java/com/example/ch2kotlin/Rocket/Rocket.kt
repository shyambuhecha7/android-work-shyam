package com.example.ch2kotlin.Rocket


class Rocket(
    private val rocketDetails: RocketDetailsInterface,
    private val rocketStructureInterface: RocketStructureInterface,
    private val rocketController: RocketControllerInterface
) : RocketDetailsInterface by rocketDetails,
    RocketStructureInterface by rocketStructureInterface,
    RocketControllerInterface by rocketController {

}
fun main() {
    val rocketDetails = RocketDetailsImpl()
    val rocketController = RocketController()
    val rocketStructure = RocketStructureInterfaceImpl()

    val rocket = Rocket(
        rocketDetails,
        rocketStructure,
        rocketController
    )
    rocket.showRocketDetails("SS-1", "SS-2023", "1 March,2023")
    rocket.presentRocketStructure()
    val launch = Launch()
    rocket.hasLaunch(launch)
    rocket.hasSuperMode()
    rocket.targetReach(true)
}