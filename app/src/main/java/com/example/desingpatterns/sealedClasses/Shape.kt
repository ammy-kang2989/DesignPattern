package com.example.desingpatterns.sealedClasses

sealed class Shape{
    class Circle(var radius : Float) : Shape()

    class Rectangle(var length : Int, var height : Int) : Shape()


    object NotAShape: Shape()

    sealed class Line : Shape()

    sealed interface Draw
}

class Square(var side : Int) : Shape()