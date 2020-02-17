open class Father(name: String, age: Int, sex: Human.Sex) : Man(name, age, sex) {
    open var hasCar: Boolean = false

    constructor(name: String, age: Int, sex: Human.Sex, occup: String) : this(name, age, sex) {
        occupation = occup
    }

    constructor(name: String, age: Int, sex: Human.Sex, occupation: String, hasCar: Boolean) : this(
        name,
        age,
        sex,
        occupation
    ) {
        this.hasCar = hasCar
    }

    override fun say() {
        println(
            "Меня зовут $name, мой возраст - $age лет, я $sex, сейчас моя дятельность - $occupation, а ещё у меня ${
            if (hasCar) {
                "есть машина"
            } else {
                "нет машины"
            }}"
        )
    }
}