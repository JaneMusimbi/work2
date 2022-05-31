fun main(){

    name(arrayOf("Respah","Jane","Lona","Laura","Anena"))

}
fun name(name:Array<String>){
   println(name.contentToString())
}
fun capital(){
  var cities = arrayOf("harare", "Mumbai", "dodoma", "jakarta")
  cities.forEach { city->
       println(city.capitalize())
   }

}
fun capitalized(){
     var cities = arrayOf("harare", "Mumbai", "dodoma", "jakarta")
    for (city in cities) {
        println(city.capitalize())
    }

}



//
//Create a function that takes in 4 strings  and creates an array out of them
//then prints out the array