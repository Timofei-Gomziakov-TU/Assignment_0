import java.util.*

fun main(args: Array<String>){
    val reader = Scanner(System.`in`);
    // circle inputs
    val circle : Shape = Circle("Circle");
    println("Enter circle radius: ");
    val circleRadius = reader.nextDouble();
    (circle as Circle).setDimensions(circleRadius);

    // triangle inputs
    val triangle : Shape = Triangle("Triangle");
    println("Enter triangle side 1: ");
    val triangleSide1 = reader.nextDouble();
    println("Enter triangle side 2: ");
    val triangleSide2 = reader.nextDouble();
    println("Enter triangle side 3: ");
    val triangleSide3 = reader.nextDouble();
    (triangle as Triangle).setDimensions(triangleSide1, triangleSide2, triangleSide3);

    // square inputs
    val square : Shape = Square("Square");
    println("Enter square length: ");
    val squareLength = reader.nextDouble();
    println("Enter square height: ");
    val squareHeight = reader.nextDouble();
    (square as Square).setDimensions(squareHeight, squareLength);


    printData(square);
    printData(circle);
    printData(triangle);
}

// the function that prints the separator
fun printSep(){
    println("--------------------------")
}

// function that prints the data stored in the Shape object
fun printData(shape : Shape){
    println(shape.name);
    shape.printDimensions();
    println("Area: ${shape.getArea()}");
    printSep();
}