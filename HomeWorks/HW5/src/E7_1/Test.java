package E7_1;


import java.util.Date;

public class Test {

    Visit visit;
    public Test(){
        Date date = new Date();
        visit = new Visit("gantugs",date);
        visit.getCustomer().setMemberType("Premium");
        visit.setServiceExpense(100);
        visit.setProductExpense(100);
        System.out.println("Name = " + visit.getCustomer().getName()+
                "\nMember type = "+visit.getCustomer().getMemberType()+
                "\nServiceExpense = "+visit.getServiceExpense()
                +"\nProductExpense = "+visit.getProductExpense()
                +"\nTotal expense = "+visit.getTotalExpense());

    }
    public static void main(String[] args) {
        new Test();
    }
}
