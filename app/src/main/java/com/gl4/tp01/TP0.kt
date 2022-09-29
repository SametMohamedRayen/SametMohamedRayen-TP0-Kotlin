package com.gl4.tp01

import kotlin.math.abs

//3
data class Point(var x:Int , var y:Int)

//4
fun distance(p:Point,q:Point): Int {
    return abs(p.x - q.x)+ abs(p.y - q.y)
}

//5
class Rectangle(val p: Point = Point(0,0),val q:Point = Point(1,1)) {
    override fun toString():String {
        return "p=$p,q=$q"
    }
    fun surface():Int = distance(p,Point(q.x,p.y)) * distance(Point(q.x,p.y),q)
}
fun main(argv : Array<String>) {
    //2
    println("Hello")
    //5
    val listOfRectangles: List<Rectangle> = listOf(
        Rectangle(),
        Rectangle(Point(2,4)),
        Rectangle(q=Point(5,2)),
        Rectangle(Point(1,8),Point(5,7))
    )

    for(r in listOfRectangles){
        println(r.surface())
    }
}