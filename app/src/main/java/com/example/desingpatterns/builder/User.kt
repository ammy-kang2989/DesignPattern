package com.example.desingpatterns.builder

//TODO ::--> In this example, we have a Person class with private constructor and a Builder class.
// The Person class has three properties: name, age, and city.
// The Builder class has three methods to set the properties and a build()
// method to create a new instance of the Person class.
//*********************
//TODO ::--> In the main() function, we create a new instance of Person using the builder pattern.
// We set the properties using the builder methods and call build() method to get a new Person instance.
// Finally, we print the values of the properties of the new Person instance.

class Person private constructor(builder: Builder) {
    val name: String?
    val age: Int?
    val city: String?

    init {
        name = builder.name
        age = builder.age
        city = builder.city
    }

    class Builder {
        var name: String? = null
        var age: Int? = null
        var city: String? = null

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setAge(age: Int): Builder {
            this.age = age
            return this
        }

        fun setCity(city: String): Builder {
            this.city = city
            return this
        }

        fun build(): Person {
            return Person(this)
        }
    }
}

fun main() {
    val person = Person.Builder()
        .setName("John Doe")
        .setAge(30)
        .setCity("New York")
        .build()

    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("City: ${person.city}")
}
