package oops

import java.awt.Color

fun main(args: Array<String>) {

    var Emp=Employee(1,"Revathi",30000,20)
    println(Emp.totalSalaryEarned())
    println(Emp.calculatePerDaySalary())


}

class Employee
{

    var id:Int=0
    var name:String=""
    var salary:Int=0
    var noOfDaysPresent=0
    constructor(id:Int,name:String,salary:Int,noOfDaysPresent:Int)
    {
        this.id=id
        this.name=name
        this.salary=salary
        this.noOfDaysPresent=noOfDaysPresent
    }

    fun calculatePerDaySalary():Int
    {
        return salary/30
    }

    fun totalSalaryEarned():String
    {
        var perdaysal=calculatePerDaySalary()
        return "$noOfDaysPresent * $perdaysal"
    }

}
