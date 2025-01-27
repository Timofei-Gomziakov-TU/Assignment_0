class Circle(name : String) : Shape(name) {
    var radius : Double = 0.0;
    fun setDimensions(radius : Double){
        this.radius = radius;
    }
    override fun printDimensions(){
        println("The radius is: " + radius);
    }

    override fun getArea(): Double {
        val area = Math.PI * (radius * radius);
        return area;
    }
}