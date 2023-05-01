import java.util.Date
import java.text.SimpleDateFormat

fun main() {
    val currentDate = Date()
    val dateFormat = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
    val formattedDate = dateFormat.format(currentDate)
    println("Current date and time: $formattedDate")
}
