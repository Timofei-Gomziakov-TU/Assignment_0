class Square(name : String) : Shape(name) {
    var length = 0.0;
    var height = 0.0;
    fun setDimensions(length : Double, height : Double){
        this.length = length;
        this.height = height;
    }
    override fun printDimensions(){
        println("The length is: ${length} and height is: ${height}")
    }
    override fun getArea(): Double {
        val area = length * height;
        return area;
    }
}