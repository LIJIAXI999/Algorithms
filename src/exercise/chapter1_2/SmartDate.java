package exercise.chapter1_2;

/**
 * Created by 94760 on 2017/1/21.
 */

/*public class SmartDate {
    private final int day;
    private final int month;
    private final int year;

    public SmartDate(int month,int day,int year){
        if(month<1||month>12)
            throw new IllegalArgumentException("invalid month value.");
        if(day<1||day>31)
            throw new IllegalArgumentException("invalid day value.");
        if(year<0)
            throw new IllegalArgumentException("invalid year value.");
        this.month=month;
        this.day=day;
        this.year=year;
    }
    public int getMonth(){return month;}
    public int getDay(){return day;}
    public int getYear(){return year;}

    public String toString(){
        return month+"/"+day+"/"+year;
    }
    public boolean equals(Object x){
        if(this==x) return true;
        if(x==null) return false;
        if(x.getClass()!=this.getClass()) return false;
        SmartDate s=(SmartDate) x;
        if(s.year!=this.year) return false;
        if(s.month!=this.month) return false;
        if (s.day!=this.day) return false;
        return true;
    }

    public static void main(String[] args){
        int m=5;
        int d=122;
        int y=2012;
        SmartDate date=new SmartDate(m,d,y);
        StdOut.println(date);
    }
}*/

//a better implementation
public class SmartDate{
    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int m,int d,int y){
        switch(m){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(d>0 && d<=31){
                    month=m;
                    day=d;
                    year=y;
                }else {
                    throw new IllegalArgumentException("Illegal date");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(d>0 && d<=30){
                    month =m;
                    day=d;
                    year=y;
                }else {
                    throw new IllegalArgumentException("Illegal date");
                }
                break;
            case 2:
                if(y%4==0 && y%100!=0||y%400==0){
                    if(d>0 && d<29){
                        month=m;
                        day=d;
                        year=y;
                    }else {
                        throw new IllegalArgumentException("Illegal date");
                    }
                }else {
                    if(d>0 && d<=28){
                        month=m;
                        day=d;
                        year=y;
                    }else {
                        throw new IllegalArgumentException("Illegal date");
                    }
                }
                break;
            default:
                throw new IllegalArgumentException("Illegal date");
        }
    }

    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    /**
     * Exercise 1.2.12
     *
     * @return day of the week
     */
    public String dayOfTheWeek(){
        //Zeller formula,assume this is 21 century.
        int xMonth=month;
        int xYear=year;
        if(month<=2) {
            xMonth = month + 12;
            xYear=year-1;
        }
        int c=year/100;
        int y=xYear-100*c;
        int week = (y+y/4+c/4-2*c+(26*(xMonth+1)/10)+day-1)%7;
        System.out.println(week);
        switch (week){
                    case 1:
                        return "Monday";
                    case 2:
                        return "Tuesday";
                    case 3:
                        return "Wednesday";
                    case 4:
                        return "Thursday";
                    case 5:
                        return "Friday";
                    case 6:
                        return "Saturday";
                    case 0:
                        return "Sunday";
                    default:
                return null;
        }
    }

    @Override
    public String toString(){
        return month+"/"+day+"/"+year;
    }
    @Override
    public boolean equals(Object x){
        if(this==x) return true;
        if(this.getClass()!=x.getClass()) return false;
        if(x==null) return false;
        SmartDate s=(SmartDate) x;
        if(s.year!=this.year) return false;
        if(s.day!=this.day) return false;
        if(s.month!=this.month) return false;
        return true;
    }

    public static void main(String[] args){
        int m=1;
        int d=22;
        int y=2017;
        try {
            SmartDate date=new SmartDate(m,d,y);
            System.out.println(date);
            System.out.println(date.dayOfTheWeek());
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}