package package1.app;

import package1.data.Application;
import package1.data.Constant;
import package1.data.Country;
import package1.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5,6,7,8,9));

        Country.City city = new Country.City(); 
        city.setName("mantingan");

        System.out.println(city.getName());
        System.out.println(Application.PROCESSORS);

        
    }
    
}
