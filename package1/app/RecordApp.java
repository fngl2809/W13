package package1.app;

import package1.data.LoginRequest;

public class RecordApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("fulan", "password");
        System.out.println(loginRequest);
        System.out.println(loginRequest.Username());
        System.out.println(loginRequest.Password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("nuh"));
        System.out.println(new LoginRequest("nuh","bahtera"));
        
    }
    
}
