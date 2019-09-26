import java.util.*

/*
 * Copyright (c) 2019. Muhamad Fachrul Zaini
 */
fun main(args: Array<String>) {
    print("this is ${args[0]}")
}

fun dayOfWeek(){
    print("what day is it today?\n")

    var dayInString = "sunday"
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> dayInString = "sunday"
        2 -> dayInString = "monday"
        3 -> dayInString = "tuesday"
        4 -> dayInString = "wednesday"
        5 -> dayInString = "thursday"
        6 -> dayInString = "friday"
        7 -> dayInString = "saturday"
    }

    print(dayInString)
}