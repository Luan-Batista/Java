package classe;

public class EqualsHashcode {
    public static void main(String[] args) {
        usuario u1 = new usuario();
        usuario u2 = new usuario();
        u1.nome = "Luan";
        u1.email = "luan.batist028@gmail.com";

        u2.nome = "Luan";
        u2.email = "luan.batist028@gmail.com";
        
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(new Data()));
        
        
    }
}
