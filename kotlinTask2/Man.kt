open class Man(override var name: String, override var age: Int, override var sex: Human.Sex) : Human {
    open var occupation: String? = null

    override fun say() {
    }

    override fun eat() {
    }

    override fun work() {
    }
}