class Human {
    var name: String? = null

    class Student {
        var studentId: Int? = null

        fun sayId() {
            println("My id is $studentId")
        }
    }

    inner class Teacher {
        var homeworkId: Int? = null

        fun sayHello() {
            name = "Alex"
            println("My name is $name")
        }

        fun giveHomework() {
            println("Homework id is ${homeworkId ?: 14}")
        }
    }
}