fun main() {
    var myList= listOf("haytham","waheeb","omar","samar","wafa")
    var myArray= arrayOf("abdallah","rasheed","roqia","maimona")
    var myMutableList= mutableListOf("mokhtar  ghaleb","haitham ameen","eman maktari")
    println("*****************____________________________________________________**********************")
    for( (index,value) in myArray.withIndex()){
        println("in the index :"+"$index"+"the name is "+"$value")
    }
    println("*****************____________________________________________________**********************")
    for( item in myList.iterator()){
        println("$item")
    }
    println("*****************____________________________________________________**********************")
    for( element in myMutableList.indices){
        println(myMutableList[element])
    }

}