import java.util.Scanner;

public class KullaniciAdiSifre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //kayıt olma
        System.out.println("Kayıt Ol");
        String users, passwords, question;
        System.out.print("Kullanıcı adı: ");
        users = input.nextLine();
        System.out.print("Şifre: ");
        passwords = input.nextLine();
        System.out.print("Güvenlik sorusu(baba adı): ");
        question = input.nextLine();
        //Giriş yapma
        System.out.println("Giriş Yap");
        String userName, yourPassword, answer;
        System.out.print("Kullanıcı adını gir: ");
        userName = input.nextLine();
        System.out.print("Şifreni gir: ");
        yourPassword = input.nextLine();
        if (users.equals(userName)) {
            if (passwords.equals(yourPassword)) {
                System.out.println("Hoş Geldin " + userName);
            } else {
                System.out.print("Şifre hatalı!\tYenilemek ister misin?(evt/hyr): ");
                answer = input.nextLine();
                if (answer.equals("evt")) {
                    System.out.print("Baba adı: ");
                    answer = input.nextLine();
                    if (question.equals(answer)) {
                        System.out.print("Yeni Şifre: ");
                        yourPassword = input.nextLine();
                        if (yourPassword.equals(passwords)) {
                            System.out.println("Şifre oluşturulamadı");
                        } else {
                            System.out.println("Şifre başarıyla oluşturuldu");
                        }
                    }else{
                        System.out.println("Kimlik doğrulanamadı");
                    }
                }
            }
        } else {
            System.out.println("Bu isimde bir kullanıcı yok!!!");
        }
    }
}

