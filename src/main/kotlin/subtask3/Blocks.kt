package subtask3

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when(blockB){
                String::class       -> {  blockA.filterIsInstance<String>().joinToString("")}
                Int::class          -> {  blockA.filterIsInstance<Int>().sum()}
                LocalDate::class    -> {
                                        var dataArray = blockA.filterIsInstance<LocalDate>().max()
                                        val formater = DateTimeFormatter.ofPattern("dd.MM.y")
                                        return formater.format(dataArray)
                                    }
            else                    -> ""
        }
    }
}
