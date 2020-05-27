package MyAnswer

object ticket {
  def main(args:Array[String]){
    
    println("ticket price =5 -> Profit = Rs."+profit(5))
    println("ticket price =10 -> Profit = Rs."+profit(10))
    println("ticket price =15 -> Profit = Rs."+profit(15))
    println("ticket price =20 -> Profit = Rs."+profit(20))
    println("ticket price =25 -> Profit = Rs."+profit(25))
    println("ticket price =30 -> Profit = Rs."+profit(30))
    println("ticket price =35 -> Profit = Rs."+profit(35))
    println("ticket price =40 -> Profit = Rs."+profit(40))
    
  }
  
  def attendees(price:Int):Int={
    var numOfAttends = 120 + (15-price)/5 * 20
    return numOfAttends 
  }
  
  def revenue(price:Int):Int={
    var revenu = attendees(price) * price 
    return revenu
  }
  
  def cost(price:Int):Int={
    var x =500 + 3 * attendees(price)
    return x
  }
  def profit(price:Int):Int={
    var y = revenue(price:Int) - cost(price:Int)
    return y
    
  }
  
  
  
  
}