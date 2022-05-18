class Lamp {
    //states
    private var isOn: Boolean = false

    //behaviors
    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun displayData(lamp: String) {
        if(isOn) {
            println("$lamp is ON")
        } else {
            println("$lamp is OFF")
        }
    }
}

fun main() {
    //lamp object
    val roomLamp = Lamp()
    roomLamp.turnOn()
    roomLamp.displayData("Room Lamp")

    val bathroomLamp = Lamp()
    bathroomLamp.turnOff()
    bathroomLamp.displayData("Bathroom Lamp")
}