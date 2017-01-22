package exercise.chapter2_2;

/**
 * Created by 94760 on 2017/1/22.
 */

/**
 *                          The API of Transaction
 *---------------------------------------------------------------------------
 *           TransAction(String who,Date when,
 *           double amount)
 *           TransAction(String transaction)     create a transaction.
 *  String   who()                               the client's name.
 *  Date     when()                              the date of transaction.
 *  double   amount()                            the amount of transaction.
 *  String   toString()                          the string representation of object.
 *  boolean  equals(Object that)                 compare the two transaction.If they are same,
 *                                               return true;otherwise return false.
 *
 */
public class TransAction{
    private String name;
    private Date date;
    private double amount;

    public TransAction(String who,Date when,double amount){
        name=who;
        date=when;
        this.amount=amount;
    }

    public TransAction(String transaction){
        String[] fields=transaction.split("\\s+");
        name=fields[0];
        date=new Date(fields[1]);
        amount=Double.parseDouble(fields[2]);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date=date;
    }
    public double getAmount(){
        return amount;
    }
    public void setAmount(){
        this.amount=amount;
    }

    public String toString(){
        return "Who:"+name+
                "\nWhen:"+date.toString()+
                "\nAmount"+amount;
    }


    @Override
    public boolean equals(Object o){
        if(this ==o) return true;
        if(o==null) return false;
        if(o.getClass()!=this.getClass()) return false;
        TransAction t=(TransAction) o;
        if(!this.name.equals(t.name)) return false;
        if (this.amount!=t.amount) return false;
        if(!this.date.equals(t.date)) return false;
        return true;
    }


    public static void main(String[] args){
        TransAction transAction1=new TransAction("Turing",new Date(1,22,2017),11.99);
        TransAction transAction2=new TransAction("Turing 1/22/2017 11.99");
        System.out.print(transAction1.equals(transAction2));
    }

}
