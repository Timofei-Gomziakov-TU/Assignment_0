import kotlin.math.sqrt

open class Triangle(name : String): Shape(name) {
    var side1 = 0.0;
    var side2 = 0.0;
    var side3 = 0.0;
    fun setDimensions(side1 : Double, side2 : Double, side3 : Double){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    override fun printDimensions(){
        println("First side: ${side1}, second side: ${side2}, third side: ${side3}");
    }
    override fun getArea(): Double {
        val s = (side1 + side2 + side3)/2;
        val area = sqrt((s)*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}