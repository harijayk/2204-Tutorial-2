object Question4b{
    def attendees(ticketPrice:Int):Int = 120 + (15-ticketPrice)/5*20;

    def revenue(ticketPrice:Int):Int = attendees(ticketPrice) * ticketPrice;

    def cost(ticketPrice:Int):Int = 500 + attendees(ticketPrice) * 3;

    def profit(ticketPrice:Int):Int = revenue(ticketPrice) - cost(ticketPrice);

    def main(args: Array[String]):Unit = {
        println(profit(10));   //480
        println(profit(15));   //940
        println(profit(20));   //1200
        println(profit(25));   //1260 highest profit
        println(profit(30));   //1120
        println(profit(35));   //780
        println(profit(40));   //240
        println(profit(45));   //-500
        println(profit(50));   //-1440

    }
}
