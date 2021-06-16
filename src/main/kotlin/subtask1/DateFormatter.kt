package subtask1

import java.text.SimpleDateFormat
import java.util.*


class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val calendar: Calendar = GregorianCalendar(year.toInt(), month.toInt()-1, day.toInt())
        if( calendar.get(Calendar.DAY_OF_MONTH).toString()==day && calendar.get(Calendar.MONTH)+1==month.toInt() &&calendar.get(Calendar.YEAR).toString()==year) {
            val formater = SimpleDateFormat("d MMMM, EEEE")
            val date = calendar.time
            return formater.format(date)
        }else{
            return "Такого дня не существует"
        }
    }

}
