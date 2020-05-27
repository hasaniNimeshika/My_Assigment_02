package MyAnswer

object salary {
  def main(args:Array[String])
  {
   
    var workHours:Int = 40
   
    var otHours:Int = 20
    var takeHomeSalary = takeHome(workHours,otHours)
    println("Take home salary = Rs."+takeHomeSalary)
  }
  
  def wage(hours:Int):Int={
    var Hours = hours * 150
    return Hours
    
  }
  
  def ot(hours:Int):Int={
    var Hours = hours * 75
    return Hours
    
  }
  
  def income(h1:Int, h2:Int):Int={
   var incom = wage(h1) + ot(h2)
   return incom
  }
  def Tax(incom:Int):Double={
    var tax = incom * 0.1
    return tax
  }
  def takeHome(h1:Int,h2:Int):Double={
    var tms = income(h1,h2) - Tax(income(h1,h2))
    return tms
  }
}