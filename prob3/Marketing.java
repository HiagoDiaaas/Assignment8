package prob3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Marketing {
    private String employeeName;
    private String productName;
    private double salesAmount;

    public Marketing(String employeeName, String productName, double salesAmount) {
        this.employeeName = employeeName;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName='" + employeeName + '\'' +
                ", productName='" + productName + '\'' +
                ", salesAmount=" + salesAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marketing marketing = (Marketing) o;

        if (Double.compare(marketing.salesAmount, salesAmount) != 0) return false;
        if (!employeeName.equals(marketing.employeeName)) return false;
        return productName.equals(marketing.productName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = employeeName.hashCode();
        result = 31 * result + productName.hashCode();
        temp = Double.doubleToLongBits(salesAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
