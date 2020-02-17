open class Mother(name: String, age: Int, sex: Human.Sex) : Woman(name, age, sex) {
    open var numberOfChildren = 0

    constructor(name: String, age: Int, sex: Human.Sex, hairLength: Int) : this(name, age, sex) {
        this.hairLength = hairLength
    }

    constructor(name: String, age: Int, sex: Human.Sex, hairLength: Int, numberOfChildren: Int) : this(
        name,
        age,
        sex,
        hairLength
    ) {
        this.numberOfChildren = numberOfChildren
    }

    override fun say() {
        println(
            "Меня зовут $name, мой возраст - $age лет, я $sex, сейчас длина моих волос $hairLength см, а ещё у меня $numberOfChildren детей"
        )
    }
}