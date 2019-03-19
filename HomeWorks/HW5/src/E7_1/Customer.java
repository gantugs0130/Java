package E7_1;

public class Customer {
    protected String name;
    protected boolean member;
    protected String memberType;
    public Customer(){
        setMember(false);
        setName("Customer");
        setMemberType("Member");
    }
    public Customer(String name, boolean member, String memberType){
        setMemberType(memberType);
        setMember(member);
        setName(name);
    }
    public boolean isMember(){
        return this.member;
    }
    public String getMemberType() {
        return this.memberType;
    }

    public String getName() {
        return this.name;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + "\nName = "+getName()
                +"\nIsMember = "+isMember()+"\nMemberType = "+getMemberType();
    }
}
