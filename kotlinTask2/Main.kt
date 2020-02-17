fun main() {
    val father = Father("Nikola", 28, Human.Sex.MALE, "Инженер", true)
    father.say()

    val mother = Mother("Maria", 27, Human.Sex.FEMALE, 30, 2)
    mother.say()

    val son = Son("Peter", 14, Human.Sex.MALE, "Школьник", false)
    son.say()

    val daughter = Daughter("Ann", 17, Human.Sex.FEMALE, 25, 0)
    daughter.say()

    val family = ArrayList<Human>()
    family.add(father)
    family.add(mother)
    family.add(son)
    family.add(daughter)
    family.sortByDescending {
        it.age
    }

    for (member in family) {
        println(member.name + " " + member.age)
    }
}