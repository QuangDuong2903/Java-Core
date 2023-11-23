import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String inputString = "NzFmZWFkOGY2ZTY4NGVjYWFiNzcyZTY5NGE1Y2M4MzM=<shops><shop><username>SB_AFFINA</username><shop_id>11674</shop_id><session>007120170526</session><shop_title>AFFINA</shop_title><shop_domain>https://affina.com.vn/</shop_domain><shop_back_url>https://affina.com.vn/</shop_back_url><order_no>ODR_123456789</order_no><order_cash_amount>10000</order_cash_amount><order_ship_date></order_ship_date><order_ship_days>0</order_ship_days><order_description>product desc desc desc desc desc desc desc desc desc desc desc desc</order_description><notify_url>https://affina.com.vn/</notify_url><validity_time>20231201111111</validity_time><JsonResponse>TRUE</JsonResponse><customer><name>Nguyen Van Hieu</name><phone>0905775888</phone><address>35 Nguyễn Huệ, p. Bến Nghé, Hồ Chí Minh</address><email>Hieu@gmail.com</email></customer><installment><tenors>3,6</tenors></installment><MDD1>A-123456</MDD1><MDD2>M-910-12345</MDD2></shop></shops>";

//        try {
//            // Tạo một đối tượng MessageDigest với thuật toán SHA-512
//            MessageDigest md = MessageDigest.getInstance("SHA-512");
//
//            // Cập nhật dữ liệu đầu vào của bộ băm
//            md.update(inputString.getBytes());
//
//            // Lấy giá trị băm dưới dạng mảng byte
//            byte[] byteData = md.digest();
//
//            // Chuyển đổi mảng byte thành định dạng hex
//            BigInteger number = new BigInteger(1, byteData);
//            String hashedText = number.toString(16);
//
//            // Đảm bảo rằng chuỗi băm có đủ 128 bit (32 ký tự hex)
//            while (hashedText.length() < 32) {
//                hashedText = "0" + hashedText;
//            }
//
//            System.out.println("Input String: " + inputString);
//            System.out.println("SHA-512 Hash: " + hashedText);
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//        try {
//            MessageDigest digest = MessageDigest.getInstance("SHA-512");
//            byte[] hash = digest.digest(inputString.getBytes("UTF-8"));
//            StringBuffer hexString = new StringBuffer();
//
//            for (int i = 0; i < hash.length; i++) {
//                String hex = Integer.toHexString(0xff & hash[i]);
//                if (hex.length() == 1) hexString.append('0');
//                hexString.append(hex);
//            }
//
//            System.out.println(hexString);
//        } catch (Exception ex) {
//            throw new RuntimeException(ex);
//        }
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
