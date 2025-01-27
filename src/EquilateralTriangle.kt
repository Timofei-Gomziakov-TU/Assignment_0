 class EquilateralTriangle(name : String) : Triangle(name) {
    fun setDimensions(side: Double){
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }
    override fun printDimensions() {
        println("The three sides are all of dimension: ${side1}");
    }
}