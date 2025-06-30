package challenge 7;
public class MainApplication {

    public static void main(String[] args) {
        Admin curAdmin = new Admin(189806, "Ronel", "134*");
        User curUser = new User(331, "Meli");
        curAdmin.performOperation(new Update()); // Admin Updates the data.
        curUser.performOperation(new View()); // User can view the data

}
}