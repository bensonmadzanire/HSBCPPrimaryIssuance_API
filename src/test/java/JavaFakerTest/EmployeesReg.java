package JavaFakerTest;

import com.github.javafaker.Faker;
import org.junit.Before;

public class EmployeesReg {
    EmployeeTest employeeTest = new EmployeeTest();

    @Before

    public void generateDate(){
        Faker fakeData = new Faker();
        employeeTest.setFirstName(fakeData.name().firstName());
        employeeTest.setLastName(fakeData.name().lastName());
        employeeTest.setInterests(fakeData.internet().domainWord());
        employeeTest.setPhonenumber(fakeData.phoneNumber().cellPhone());
        employeeTest.setEmail(fakeData.internet().emailAddress());
        employeeTest.setDesignation(fakeData.job().position());

    }
}
