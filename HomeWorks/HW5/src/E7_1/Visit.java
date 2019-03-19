package E7_1;

import java.security.ProtectionDomain;
import java.util.Date;

public class Visit {
    protected Customer customer;
    protected Date date;
    protected double serviceExpense;
    protected double productExpense;

    public Visit(String name, Date date){
        this.customer = new Customer();
        this.customer.setName(name);
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getName(){
        return this.customer.getName();
    }

    public double getServiceExpense() {
        return this.serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense *( 1- DiscountRate.getServiceDiscountRate(this.customer.memberType));
    }

    public double getProductExpense() {
        return this.productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense*(1 - DiscountRate.getProductDiscountRate(this.customer.memberType));
    }
    public double getTotalExpense(){
        return getProductExpense()+getServiceExpense();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

