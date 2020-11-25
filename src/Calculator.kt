class Calculator() {
    fun arithmetic() {
        var input: String? = readLine()
        while (input != null && input.isNotBlank()) {

            var fNumber = ""
            var sNumber = ""

            // check for operators
            when {
                (input.contains("+")) -> {
                    var values = input.split("+")
                    fNumber = values[0]
                    sNumber = values[1]
                    addition(fNumber, sNumber)
                }
                (input.contains("*")) -> {
                    var values = input.split("*")
                    fNumber = values[0]
                    sNumber = values[1]
                    multiplication(fNumber, sNumber)
                }
                (input.contains("-")) -> {
                    var values = input.split("-")
                    fNumber = values[0]
                    sNumber = values[1]
                    subtraction(fNumber, sNumber)
                }
                (input.contains("/")) -> {
                    var values = input.split("/")
                    fNumber = values[0]
                    sNumber = values[1]
                    division(fNumber, sNumber)
                }

                else ->  {
                    println("invalid operator")
                }
            }

            input = readLine()
        }
    }

    private fun subtraction(firstNumber: String, secondNumber: String) {
        println("Subtraction: ${firstNumber.toFloat() - secondNumber.toFloat()}")
    }
    private fun division(firstNumber: String,secondNumber: String){
        println("Division: ${firstNumber.toFloat()/secondNumber.toFloat()}")
    }

    private fun addition(firstNumber: String, secondNumber: String) {
        val sumValue = firstNumber.toFloat() + secondNumber.toFloat()
        println("Addition : $sumValue")
    }

    private fun multiplication(firstNumber: String, secondNumber: String) {
        println("Multiplication: ${firstNumber.toFloat() * secondNumber.toFloat()}")
    }
}

fun main() {
    Calculator().arithmetic()
}