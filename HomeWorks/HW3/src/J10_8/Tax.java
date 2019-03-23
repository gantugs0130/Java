package J10_8;

public class Tax {

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    Tax() {
        filingStatus = 0;
        double[] year2009Rates = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
        setRates(year2009Rates);
        int[][] year2009Brackets = {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 208850, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };
        setBrackets(year2009Brackets);
        taxableIncome = 0;
    }

    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        setFilingStatus(filingStatus);
        setBrackets(brackets);
        setRates(rates);
        setTaxableIncome(taxableIncome);
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = new int[brackets.length][brackets[0].length];
        for (int i = 0; i < brackets.length; i++) {
            for (int j = 0; j < brackets[i].length; j++)
                this.brackets[i][j] = brackets[i][j];
        }
    }

    public void setRates(double[] rates) {
        this.rates = new double[rates.length];
        for (int i = 0; i < rates.length; i++)
            this.rates[i] = rates[i];
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax =0;
        if(taxableIncome < brackets[filingStatus][0])
            tax = taxableIncome *rates[0];
        else if(taxableIncome < brackets[filingStatus][1])
            tax = brackets[filingStatus][0]*rates[0] + (taxableIncome - brackets[filingStatus][0])*rates[1];
        else if(taxableIncome < brackets[filingStatus][2])
            tax = brackets[this.filingStatus][0]*rates[0] +
                    (brackets[this.filingStatus][1] - brackets[this.filingStatus][0]) * rates[1]+
                    (taxableIncome - brackets[filingStatus][1])*rates[2];
        else if(taxableIncome < brackets[filingStatus][3])
            tax = brackets[this.filingStatus][0]*rates[0] +
                    (brackets[this.filingStatus][1] - brackets[this.filingStatus][0]) * rates[1]+
                    (brackets[this.filingStatus][2] - brackets[this.filingStatus][1]) * rates[2] +
                    (taxableIncome - brackets[filingStatus][2])*rates[3];
        else if(taxableIncome < brackets[filingStatus][4])
            tax = brackets[this.filingStatus][0]*rates[0] +
                    (brackets[this.filingStatus][1] - brackets[this.filingStatus][0]) * rates[1] +
                    (brackets[this.filingStatus][2] - brackets[this.filingStatus][1]) * rates[2] +
                    (brackets[this.filingStatus][3] - brackets[this.filingStatus][2]) * rates[3] +
                    (taxableIncome - brackets[filingStatus][3])*rates[4];
        else
         tax = brackets[this.filingStatus][0]*rates[0] +
                (brackets[this.filingStatus][1] - brackets[this.filingStatus][0]) * rates[1] +
                (brackets[this.filingStatus][2] - brackets[this.filingStatus][1]) * rates[2] +
                (brackets[this.filingStatus][3] - brackets[this.filingStatus][2]) * rates[3] +
                (brackets[this.filingStatus][4] - brackets[this.filingStatus][3]) * rates[4] +
                (this.taxableIncome - brackets[this.filingStatus][4]) * rates[5];
         return tax;
    }

    public static void main(String args[]) {
        Tax t2009 = new Tax();
        System.out.println("2009");
        printTax(t2009);
        System.out.println();


        double[] r2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] b2001 = {
                {27050, 65550, 136750, 297350},
                {45200, 109250, 166500, 297350},
                {22600, 54625, 83250, 148675},
                {36250, 93650, 151650, 297350}
        };
        Tax t2001 = new Tax();
        t2001.setRates(r2001);
        t2001.setBrackets(b2001);
        System.out.println("2001");
        printTax(t2001);
    }

    public static void printTax(Tax tax) {
        System.out.printf("%20s %20s %20s %20s %15s", "Income","Single", "Married Joint", "Married Separate", "Head of");
        System.out.println();
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%20d", i);
            tax.setTaxableIncome(i);
            for (int j = 0; j < 4; j++) {
                tax.setFilingStatus(j);
                System.out.printf("%20d", Math.round(tax.getTax()));
            }
            System.out.println();
        }
    }
}