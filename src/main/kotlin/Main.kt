fun main() {
    print("Введите количество лайков: ")
    val likes = readLine().toString()
    val lastDigit = likes[likes.length - 1]
    var personsToCall = if(lastDigit === '1' && likes[likes.length - 2] !== '1') "человеку" else "человекам"

    print("""Понравилось $likes $personsToCall""")
}