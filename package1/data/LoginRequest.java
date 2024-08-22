package package1.data;

public record LoginRequest (String Username, String Password){
    public LoginRequest{
        System.out.println("Constructor utama dipanggi");
    }

    public LoginRequest(String username){
        this(username, null);
    }

    public LoginRequest(){
        this(null);
    }
    
}
