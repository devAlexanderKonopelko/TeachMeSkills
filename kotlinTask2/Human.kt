

interface Human {
    enum class Sex {
        MALE,
        FEMALE
    }

    var name: String
    var age: Int
    var sex: Sex

    fun say()
    fun eat()
    fun work()
}