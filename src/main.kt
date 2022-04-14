


fun main() {
    var account = CurrentAccount(234879,"KCB24",2000)
    var saving = SavingAccount(234879,"KCB24",2000, 300)
    account.deposit(5500.00)
    println(account.balance)
    account.withdraw(230.50)
    println(account.balance)
    println(account.details())
    givenString()


}

open class Accounts(var accountNumber:Int, var accountName:String, var balance:Int){
     open fun deposit(amount:Double){
         balance+=5500




    }
    open fun withdraw(amount: Double){
        balance-=230


    }
    open fun details(){
        println("Account 234879 with $balance is operated by Shanaya")

    }

}



class CurrentAccount(accountNumber:Int, accountName:String,balance:Int): Accounts(accountNumber,accountName,balance) {

}
class SavingAccount(accountNumber:Int, accountName:String, balance:Int, withdrawals:Int):Accounts(accountNumber,accountName,balance){

    override fun withdraw(amount: Double) {


    }

}

data class Product(var name:String, var weight:Int, var price:Int, var groceries:String,)
fun category(groceries: String){
    when (groceries) {
        "Banana" -> println(groceries)
        "Mango" -> println(groceries)
        "name" -> println()








    }
    }


fun givenString(): String {
    var name = "banana"
    var char = (name[0])
    var char1 = (name[2])
    var char2 = (name[4])
    var result = "$char$char1$char2"


    return result



}