fun main() {
// Bytes
    val bigByte:Byte = Byte.MAX_VALUE;
    val smallByte:Byte = Byte.MIN_VALUE;
    println("Byte highest value is $bigByte");
    println("Byte lowest value is $smallByte");
// Shorts
    val smallShort: Short = Short.MIN_VALUE;
    val notSmallShort: Short = Short.MAX_VALUE;
    println("Min short value: $smallShort");
    println("Max short value: $notSmallShort");
// Ints
    val bigInt: Int = Int.MIN_VALUE;
    val smallInt: Int = Int.MAX_VALUE;
    println("Min integer value: $bigInt");
    println("Max integer value: $smallInt");
// Long int
    val longLong: Long = Long.MIN_VALUE;
    val shortLong: Long = Long.MAX_VALUE;
    println("Min long integer value: $longLong");
    println("Max long integer value: $shortLong");
// Floats
    val speed: Float;

    val distance = 0.1f;
    val time: Float = 9.87f / 3600;

    speed = distance / time;

    println("The average speed of a sprinter is $speed km/h");
}